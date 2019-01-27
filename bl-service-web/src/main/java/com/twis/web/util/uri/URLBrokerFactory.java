package com.twis.web.util.uri;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.twis.biz.dao.sysparam.SysparamOfMysqlDao;
import com.twis.common.utils.RedisPoolUtils;
import com.twis.model.SysparamModel;


/**
 * URLBroker工厂类
 * @author yxm
 * @since 2018/3/18
 */
public class URLBrokerFactory {
	private static Logger log = LoggerFactory.getLogger(URLBrokerFactory.class);
	
	@Autowired
	private SysparamOfMysqlDao sysparamOfMysqlDao;

	private String urlConfigName;
	/**
	 * 版本号
	 */
	public static Long version = System.currentTimeMillis();

	public static Map<String, URLBroker> urlBrokers = new HashMap<String, URLBroker>();
	
	

	public static Map<String, URLBroker> getUrlBrokers() {
		return urlBrokers;
	}

	public static void setUrlBrokers(Map<String, URLBroker> urlBrokers) {
		URLBrokerFactory.urlBrokers = urlBrokers;
	}

	public String getUrlConfigName() {
		return urlConfigName;
	}

	public void init() {
		if (StringUtils.isBlank(urlConfigName)) {
			throw new RuntimeException("没有配置url.xml");
		}
		
//		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(urlConfigName);
		
		//兼容模式
		Resource resource = new ClassPathResource(urlConfigName);
		InputStream inputStream=null;
		try {
			inputStream = resource.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		urlBrokers = initUrlBroker(inputStream);
		initRedisConnectCfg();
	}
	
	private void initRedisConnectCfg(){
		System.out.println("initRedisConnectCfg......................");
		try {
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("paramKey", "redis_s");
			param.put("paramName", "sharded");
			List<Object> list = sysparamOfMysqlDao.query(new SysparamModel(),param);
			for(Object obj : list){
				SysparamModel sysParamModel = (SysparamModel)obj;
				String str = sysParamModel.getParamValue();
				
				RedisPoolUtils.redis_ip = str.split(":")[0];
				RedisPoolUtils.redis_port = Integer.parseInt(str.split(":")[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private Map<String, URLBroker> initUrlBroker(InputStream inputStream) {
		Map<String, URLBroker> urlBrokers = new HashMap<String, URLBroker>();
		SAXReader reader = new SAXReader();
		try {
			Document root = reader.read(inputStream);
			@SuppressWarnings("unchecked")
			List<Node> urls = (List<Node>) root.selectNodes("/urlConfig/url");
			for (Node url : urls) {

				String name = url.valueOf("@name");
				Node serverUrlNode = url.selectSingleNode("severUrl");
				if (serverUrlNode == null) {
					throw new RuntimeException("服务器URL必须配置");
				}
				String severUrl = serverUrlNode.getText();
				// path默认是空字符串
				String path = "";
				Node pathNode = url.selectSingleNode("path");
				if (pathNode != null) {
					path = pathNode.getText();
				}

				URLBroker urlBroker = new DefaultURLBroker();
				urlBroker.setServerUrl(severUrl);
				urlBroker.setPath(path);

				@SuppressWarnings("unchecked")
				List<Node> tokens = (List<Node>) url.selectNodes("tokens/token");
				for (Node token : tokens) {
					urlBroker.addToken(token.valueOf("@name"));
				}
				urlBrokers.put(name, urlBroker);
			}
		}
		catch (DocumentException e) {
			log.error("解析url.xml时发现异常:" + e);
			return urlBrokers;
		}
		return urlBrokers;
	}

	public URLBroker getUrl(String name) {
		URLBroker urlBroker = urlBrokers.get(name);
		if (urlBroker == null)
			return null;
		else
			return urlBroker.newInstance();
	}



	/**
	 * #=获取唯一码
     * 用于解决id冲突的问题
	 * getUniqueId   2016-03-28
	 * @return
     */
	public String getUniqueId() {
		String str = java.util.UUID.randomUUID().toString().replaceAll("-", "");
		return str;
	}


	/**
	 * #=获取当前服务器的时间
	 * currentDate   2016-07-01
	 * @return
     */
	public String currentDate(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat( format != null ? format : "yyyy/MM/dd hh:mm:ss");
		return sdf.format(new Date());
	}



	/**
	 * @param urlConfigName
	 *            the urlConfigName to set
	 */
	public void setUrlConfigName(String urlConfigName) {
		this.urlConfigName = urlConfigName;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
}
