/*
 * Copyright 2018-2028 Twis.Inc All Rights Reserved.
 */
package com.twis.biz.service.record.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twis.biz.dao.record.RecordPersonShareOfMysqlDao;
import com.twis.biz.service.record.RecordPersonShareOfMysqlService;
import com.twis.biz.utils.SqlUids;
import com.twis.common.utils.JsonResult;
import com.twis.model.BlRecordmodelPersonalshareModel;

@Service
public class RecordPersonShareOfMysqlServiceImpl implements RecordPersonShareOfMysqlService {

	@Autowired
	private RecordPersonShareOfMysqlDao recordPersonShareOfMysqlDao;
	@Override
	public JsonResult insert(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlRecordmodelPersonalshareModel model = new BlRecordmodelPersonalshareModel();
		if (parameter.containsKey("id")) {
			model.setId(SqlUids.nextId());
		}
		int value = recordPersonShareOfMysqlDao.insert(model, parameter);
		map.put("data",value);
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult update(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlRecordmodelPersonalshareModel model = new BlRecordmodelPersonalshareModel();
		int value = recordPersonShareOfMysqlDao.update(model, parameter);
		map.put("data",value);
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult delete(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlRecordmodelPersonalshareModel model = new BlRecordmodelPersonalshareModel();
		int value = recordPersonShareOfMysqlDao.delete(model, parameter);
		map.put("data",value);
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult query(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlRecordmodelPersonalshareModel model = new BlRecordmodelPersonalshareModel();
		if (parameter.containsKey("orgid")) {
			model.setOrgid(parameter.get("orgid").toString());
		}
		if (parameter.containsKey("uuid")) {
			model.setUuid(parameter.get("uuid").toString());
		}
		map.put("data",recordPersonShareOfMysqlDao.query(model));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult queryNavigator(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlRecordmodelPersonalshareModel model = new BlRecordmodelPersonalshareModel();
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
		map.put("data",recordPersonShareOfMysqlDao.queryNavigator(model, parameter,currentPage,pageSize));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

}