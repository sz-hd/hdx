package com.twis.biz.service.ajcase.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twis.biz.dao.ajcase.JaCaseOfMysqlDao;
import com.twis.biz.service.ajcase.JaCaseOfMysqlService;
import com.twis.common.utils.JsonResult;
import com.twis.model.JaCaseModel;

@Service
public class JaCaseOfMysqlServiceImpl implements JaCaseOfMysqlService {

	@Autowired
	private JaCaseOfMysqlDao JaCaseOfMysqlDao;
	@Override
	public JsonResult insert(Map<String, Object> parameter) throws Exception {
		return null;
	}

	@Override
	public JsonResult update(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		JaCaseModel model = new JaCaseModel();
		int value = JaCaseOfMysqlDao.update(model, parameter);
		map.put("data",value);
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult delete(Map<String, Object> parameter) throws Exception {
		return null;
	}

	@Override
	public JsonResult queryCaseInfo(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		JaCaseModel model = new JaCaseModel();
		if (parameter.containsKey("orgid")) {
			model.setOrganid(parameter.get("orgid").toString());
		}
		map.put("data",JaCaseOfMysqlDao.queryCaseInfo(model.getOrganid()));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}
	
	@Override
	public JsonResult query(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		JaCaseModel model = new JaCaseModel();
		if (parameter.containsKey("orgid")) {
			model.setOrganid(parameter.get("orgid").toString());
		}
		if (parameter.containsKey("casenumber")) {
			model.setCasenumber(parameter.get("casenumber").toString());
		}
		map.put("data",JaCaseOfMysqlDao.query(model));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}
	
	@Override
	public JsonResult queryNavigator(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		JaCaseModel model = new JaCaseModel();
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
		map.put("data",JaCaseOfMysqlDao.queryNavigator(model, parameter,currentPage,pageSize));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult getCaseByTimes(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("data",JaCaseOfMysqlDao.getCaseByTimes(parameter.get("times").toString(), parameter.get("orgid").toString()));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

}
