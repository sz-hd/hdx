package com.twis.biz.service.baseInfo.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twis.biz.dao.baseInfo.RoomOfMysqlDao;
import com.twis.biz.service.baseInfo.RoomOfMysqlService;
import com.twis.common.utils.JsonResult;
import com.twis.model.JaSystemEnvModel;

@Service
public class RoomOfMysqlServiceImpl implements RoomOfMysqlService {

	@Autowired
	private RoomOfMysqlDao roomOfMysqlDao;
	@Override
	public JsonResult insert(Map<String, Object> parameter) throws Exception {
		return null;
	}

	@Override
	public JsonResult update(Map<String, Object> parameter) throws Exception {
		return null;
	}

	@Override
	public JsonResult delete(Map<String, Object> parameter) throws Exception {
		return null;
	}

	@Override
	public JsonResult query(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		JaSystemEnvModel model = new JaSystemEnvModel();
		model.setOrganid(parameter.get("orgid").toString());
		if (parameter.containsKey("roomType")) {
			model.setRoomtype(parameter.get("roomType").toString());
		}
		map.put("data",roomOfMysqlDao.query(model));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult queryNavigator(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		JaSystemEnvModel model = new JaSystemEnvModel();
		if (!parameter.containsKey("currentPage")) {
			jsonResult.setMsg("没有传currentPage字段");
			jsonResult.setSuccess(false);
			return jsonResult;
		}
		if (!parameter.containsKey("pageSize")) {
			jsonResult.setMsg("没有传pageSize字段");
			jsonResult.setSuccess(false);
			return jsonResult;
		}
		int currentPage = Integer.parseInt(parameter.get("currentPage").toString());
		int pageSize = Integer.parseInt(parameter.get("pageSize").toString());
		map.put("data",roomOfMysqlDao.queryNavigator(model, parameter,currentPage,pageSize));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult getRoomIp(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("data",roomOfMysqlDao.getRoomIp(parameter.get("ip").toString()));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

}
