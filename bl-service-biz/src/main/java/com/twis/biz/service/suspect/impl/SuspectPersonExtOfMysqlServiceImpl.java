/*
 * Copyright 2018-2028 Twis.Inc All Rights Reserved.
 */
package com.twis.biz.service.suspect.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twis.biz.dao.suspect.SuspectPersonExtOfMysqlDao;
import com.twis.biz.service.suspect.SuspectPersonExtOfMysqlService;
import com.twis.biz.utils.SqlUids;
import com.twis.common.utils.JsonResult;
import com.twis.model.BlCasepersonextModel;
import com.twis.model.KUserroleModel;

@Service
public class SuspectPersonExtOfMysqlServiceImpl implements SuspectPersonExtOfMysqlService {

	@Autowired
	private SuspectPersonExtOfMysqlDao suspectPersonExtOfMysqlDao;
	@Override
	public JsonResult insert(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlCasepersonextModel model = new BlCasepersonextModel();
		if (parameter.containsKey("id")) {
			model.setId(SqlUids.nextId());
		}
		int value = suspectPersonExtOfMysqlDao.insert(model, parameter);
		map.put("data",value);
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult update(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlCasepersonextModel model = new BlCasepersonextModel();
		int value = suspectPersonExtOfMysqlDao.update(model, parameter);
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
	public JsonResult query(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlCasepersonextModel model = new BlCasepersonextModel();
		if (parameter.containsKey("orgid")){
			model.setOrgid(parameter.get("orgid").toString());
		}
		if (parameter.containsKey("uuid")){
			model.setUuid(parameter.get("uuid").toString());
		}
		if (parameter.containsKey("casepersonId")){
			model.setCasepersonId(parameter.get("casepersonId").toString());
		}
		if (parameter.containsKey("idcard")){
			model.setIdentitynumber(parameter.get("idcard").toString());
		}
		map.put("data",suspectPersonExtOfMysqlDao.query(model));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult queryNavigator(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlCasepersonextModel model = new BlCasepersonextModel();
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
		map.put("data",suspectPersonExtOfMysqlDao.queryNavigator(model, parameter,currentPage,pageSize));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}



}
