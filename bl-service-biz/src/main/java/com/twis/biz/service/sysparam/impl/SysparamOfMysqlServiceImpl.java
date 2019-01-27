/*
 * Copyright 2018-2028 Twis.Inc All Rights Reserved.
 */
package com.twis.biz.service.sysparam.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twis.biz.dao.sysparam.SysparamOfMysqlDao;
import com.twis.biz.service.sysparam.SysparamOfMysqlService;
import com.twis.common.utils.DateTimeUtil;
import com.twis.common.utils.JsonResult;
import com.twis.model.SysparamModel;

@Service
public class SysparamOfMysqlServiceImpl implements SysparamOfMysqlService {

	@Autowired
	private SysparamOfMysqlDao sysparamOfMysqlDao;
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
		SysparamModel sysparam = new SysparamModel();
		if (parameter.containsKey("paramKey")) {
			sysparam.setParamKey(parameter.get("paramKey").toString());
		}
		if (parameter.containsKey("paramName")) {
			sysparam.setParamKey(parameter.get("paramName").toString());
		}
		map.put("data",sysparamOfMysqlDao.query(sysparam, parameter));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult testServer(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		jsonResult.setData(new HashMap<String,Object>());
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult getTimeStamp(Map<String,Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("value", DateTimeUtil.getTimeStampOfSecond());
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult queryNavigator(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		SysparamModel model = new SysparamModel();
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
		map.put("data",sysparamOfMysqlDao.queryNavigator(model, parameter,currentPage,pageSize));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

}
