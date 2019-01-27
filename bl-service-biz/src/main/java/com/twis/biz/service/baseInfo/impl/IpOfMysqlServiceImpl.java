package com.twis.biz.service.baseInfo.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twis.biz.dao.baseInfo.IpOfMysqlDao;
import com.twis.biz.service.baseInfo.IpOfMysqlService;
import com.twis.common.utils.JsonResult;
import com.twis.model.OaVisitModel;

@Service
public class IpOfMysqlServiceImpl implements IpOfMysqlService {

	@Autowired
	private IpOfMysqlDao IpOfMysqlDao;
	
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
		OaVisitModel model = new OaVisitModel();
		if (parameter.containsKey("ip"))
			model.setLoginIp(parameter.get("ip").toString());
		map.put("data",IpOfMysqlDao.query(model));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult queryNavigator(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		OaVisitModel model = new OaVisitModel();
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
		map.put("data",IpOfMysqlDao.queryNavigator(model, parameter,currentPage,pageSize));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult getVisitIp(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		OaVisitModel model = new OaVisitModel();
		if (parameter.containsKey("ip"))
			model.setLoginIp(parameter.get("ip").toString());
		map.put("data",IpOfMysqlDao.getVisitIp(parameter.get("ip").toString()));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

}
