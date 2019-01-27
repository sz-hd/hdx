/*
 * Copyright 2018-2028 Twis.Inc All Rights Reserved.
 */
package com.twis.biz.service.suspect.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twis.biz.dao.suspect.SuspectPersonPhototOfMysqlDao;
import com.twis.biz.service.suspect.SuspectPersonPhotoOfMysqlService;
import com.twis.common.utils.JsonResult;
import com.twis.model.JaCasepersonModel;
import com.twis.model.JaCasepersonPhotoModel;

@Service
public class SuspectPersonPhotoOfMysqlServiceImpl implements SuspectPersonPhotoOfMysqlService {

	@Autowired
	private SuspectPersonPhototOfMysqlDao suspectPersonPhototOfMysqlDao;
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
		JaCasepersonPhotoModel model = new JaCasepersonPhotoModel();
		if (parameter.containsKey("orgid")){
			model.setOrganid(parameter.get("orgid").toString());
		}
		if (parameter.containsKey("mainformid")){//嫌疑人Id
			model.setMainformid(parameter.get("mainformid").toString());
			model.setFtype(1);
		}
		List<Object> list = suspectPersonPhototOfMysqlDao.query(model);
		if (list.size()==0) {
			if (parameter.containsKey("mainformid")){//嫌疑人Id
				model.setMainformid(parameter.get("mainformid").toString());
				model.setFtype(0);
				list = suspectPersonPhototOfMysqlDao.query(model);
			}
		}
		map.put("data",list);
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult queryNavigator(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		JaCasepersonPhotoModel model = new JaCasepersonPhotoModel();
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
		map.put("data",suspectPersonPhototOfMysqlDao.queryNavigator(model, parameter,currentPage,pageSize));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}



}
