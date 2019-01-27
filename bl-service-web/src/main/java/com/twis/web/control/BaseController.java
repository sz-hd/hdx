package com.twis.web.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.twis.biz.service.baseInfo.RoomOfMysqlService;
import com.twis.common.utils.JsonResult;
import com.twis.common.utils.MapUtil;
import com.twis.model.vo.JaSystemEnvModelVo;
import com.twis.web.util.uri.URLBrokerFactory;

/**
 * @author yxm
 * @since 2018/3/18
 */
@Service
public class BaseController extends URLBrokerFactory{
	@Autowired
	private RoomOfMysqlService roomOfMysqlService;
	
	private Map<String,Object> getOrgId(String ip) throws Exception {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ip", ip);
		Map<String,Object> map_ = new HashMap<String,Object>();
		JsonResult jsonResult = roomOfMysqlService.getRoomIp(map);
		if (jsonResult.isSuccess()) {
			Map<String,Object> _map = jsonResult.getData();
			@SuppressWarnings("unchecked")
			List<Object> list = (List<Object>)_map.get("data");
			if (list.size()>0) {
				JaSystemEnvModelVo model = (JaSystemEnvModelVo)list.get(0);
				map_.put("orgid", model.getOrganid());
				map_.put("orgname", model.getOrgname());
				return map_;
			}
		}
		return null;
	}
	
	public JsonResult getOrgInfo(String ip) throws Exception {
		Map<String,Object> map_ = getOrgId(ip);
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		jsonResult.setSuccess(true);
		if (map_==null) {
			jsonResult.setSuccess(false);
			jsonResult.setMsg("该审讯室IP还没设置单位");
		} else {
			map.put("orgid", map_.get("orgid").toString());
			map.put("ip", ip);
			map.put("orgname", map_.get("orgname").toString());
			jsonResult.setData(map);
			jsonResult.setSuccess(true);
		}
		return jsonResult;
	}
	
	public Map<String,Object> parseMap(String data) {
		return MapUtil.JSONObject2Map2(data);
	}
	
	public Map<String,Object> parseMapList(String data) {
		return MapUtil.JSONObject2MapList(data);
	}
	
	
	
}
