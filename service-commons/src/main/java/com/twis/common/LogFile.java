package com.twis.common;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.twis.common.utils.DateTimeUtil;
import com.twis.common.utils.JsonResult;
import com.twis.common.utils.RedisPoolUtils;

public class LogFile implements Log {
	private static Logger log = LoggerFactory.getLogger(LogFile.class);
	@Override
	public void sysLog(ProceedingJoinPoint pjp,Twis twis,Throwable e,Long sTime,JsonResult jsonResult) {
		try {
			LogData logData = new LogData();
			
			logData.setIsException(false);
			logData.setServiceName(twis.logName());
			logData.setUrl(twis.url());
			logData.setController(twis.controller());
			
			Object obj[] = pjp.getArgs();
			if ((obj != null) && (obj.length > 0)) {
				if(obj[0] instanceof Map) {
					@SuppressWarnings("unchecked")
					Map<String, String> parameter = (Map<String, String>)obj[0];
					logData.setParameter(parameter);
				} else if(obj[0] instanceof String) {
					String parameter = (String)obj[0];
					logData.setParameter(parameter);
				}
				
			}
			if (obj != null) {
				if (obj[0]!=null) {
					if(obj[0].getClass().equals(LinkedHashMap.class)){
						@SuppressWarnings("rawtypes")
						LinkedHashMap linkedHashMap = (LinkedHashMap) obj[0];
						Object token = linkedHashMap.get("token");
						if(token!=null){
							//logData.setUser(new RedisPoolUtils().get(token.toString()));
						}
					}
				}
			}
			if (e != null) {
				logData.setIsException(true);
				logData.setExceptionMsg(e.getMessage());
				logData.setExceptionStackTrace(e.getStackTrace());
				//e.printStackTrace();
			}
			
			if(jsonResult!=null){
				logData.setJsonResult(jsonResult);
			}
			
			logData.setExecuteTime(new Date().getTime() - sTime);
			System.out.println();
			System.out.println();
			log.debug("{}---{}---{}=====>", "接口信息拦截","["+logData.getUrl()+"]",logData.getExecuteTime());
			System.out.println();
			log.debug("{}", JSON.toJSONString(logData));
			log.debug("=======================================================INTERFACE=======================================================");
		} catch ( Exception ex) {
			try {
				Object[] args = pjp.getArgs();
				log.error("sysLog: " + DateTimeUtil.getCurrentDateStr(DateTimeUtil.TIME_PATTERN_DEFAULT));
				if (args != null) {
					for(int i = 0; i< args.length; i++)
						if (args[i] != null) {
					          if ((args[i] instanceof Map)) {
					        	 log.error("LogFile异常,{}",JSONObject.toJSONString(args[i]),e);
					          } else if ((args[i] instanceof String)) {
					        	  log.error("LogFile异常,{}",args[i],e);
					          } else if (args[i].getClass().equals(Object.class)){
					        	  log.error("LogFile异常,{}",args[i].getClass(),e);
					    	  }
						} 
				}
			} catch(Exception eee) {
				
			}
			
			ex.printStackTrace();
		} finally {

		}

	}

}
