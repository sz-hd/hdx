/*
 * Copyright 2018-2028 Twis.Inc All Rights Reserved.
 */
package com.twis.biz.service.suspect.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.twis.biz.dao.suspect.SuspectPersonOfMysqlDao;
import com.twis.biz.dao.sysparam.SysparamOfMysqlDao;
import com.twis.biz.service.suspect.SuspectPersonOfMysqlService;
import com.twis.common.utils.JsonResult;
import com.twis.common.utils.httpclient.HttpUtil;
import com.twis.model.JaCasepersonModel;

@Service
public class SuspectPersonOfMysqlServiceImpl implements SuspectPersonOfMysqlService {

	@Autowired
	private SuspectPersonOfMysqlDao suspectPersonOfMysqlDao;
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
		JaCasepersonModel model = new JaCasepersonModel();
		if (parameter.containsKey("orgid")){
			model.setOrganid(parameter.get("orgid").toString());
		}
		if (parameter.containsKey("uuid")){
			model.setMainformid(parameter.get("uuid").toString());
		}
		if (parameter.containsKey("idcard")){
			model.setIdentitynumber(parameter.get("idcard").toString());
		}
		model.setIsfinish("0");//获取未完成的
		map.put("data",suspectPersonOfMysqlDao.query(model));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult queryNavigator(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		JaCasepersonModel model = new JaCasepersonModel();
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
		map.put("data",suspectPersonOfMysqlDao.queryNavigator(model, parameter,currentPage,pageSize));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult getSuspectByTimes(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("data",suspectPersonOfMysqlDao.getSuspectByTimes(parameter.get("times").toString(), parameter.get("orgid").toString()));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult updateSuspectFinishStatus(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		String url = sysparamOfMysqlDao.getParamVal("SUSPECT", "FINISHSTATUS");
		if(!StringUtils.hasText(url)) {
			jsonResult.setData(map);
			jsonResult.setSuccess(false);
			jsonResult.setMsg("远程服务地址为空，请检查！");
			return jsonResult;
		}
		if(!parameter.containsKey("suspectid")) {
			jsonResult.setData(map);
			jsonResult.setSuccess(false);
			jsonResult.setMsg("没有传嫌疑人Id，请检查！");
			return jsonResult;
		}
		String result = HttpUtil.get(url+parameter.get("suspectid")==null?"":parameter.get("suspectid").toString());
		map.put("data",result);
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}



}
