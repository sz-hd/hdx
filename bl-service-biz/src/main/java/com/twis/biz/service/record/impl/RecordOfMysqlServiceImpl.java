/*
 * Copyright 2018-2028 Twis.Inc All Rights Reserved.
 */
package com.twis.biz.service.record.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twis.biz.dao.record.RecordOfMysqlDao;
import com.twis.biz.service.record.RecordOfMysqlService;
import com.twis.biz.utils.SqlUids;
import com.twis.common.utils.DateTimeUtil;
import com.twis.common.utils.JsonResult;
import com.twis.model.BlRecordModel;
import com.twis.model.vo.BlRecordModelVo;

@Service
public class RecordOfMysqlServiceImpl implements RecordOfMysqlService {

	@Autowired
	private RecordOfMysqlDao recordOfMysqlDao;
	@Override
	public JsonResult insert(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlRecordModel model = new BlRecordModel();
		if (parameter.containsKey("id")) {
			parameter.put("id",SqlUids.nextId());
		}
		int value = recordOfMysqlDao.insert(model, parameter);
		map.put("data",value);
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult update(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlRecordModel model = new BlRecordModel();
		int value = recordOfMysqlDao.update(model, parameter);
		map.put("data",value);
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}
	
	

	@Override
	public JsonResult delete(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlRecordModel model = new BlRecordModel();
		int value = recordOfMysqlDao.delete(model, parameter);
		map.put("data",value);
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult query(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlRecordModel model = new BlRecordModel();
		if (parameter.containsKey("orgid")) {
			model.setOrgid(parameter.get("orgid").toString());
		}
		if (parameter.containsKey("uuid")) {
			model.setUuid(parameter.get("uuid").toString());
		}
		if (parameter.containsKey("datetime")){
			//增量取数下载
			map.put("data",recordOfMysqlDao.queryRecordByTimes(parameter.get("orgid").toString(),parameter.get("datetime").toString()));
			jsonResult.setData(map);
			jsonResult.setSuccess(true);
			return jsonResult;
		}
		map.put("data",recordOfMysqlDao.query(model));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}
	
	@Override
	public JsonResult queryNavigator(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlRecordModel model = new BlRecordModel();
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
		map.put("data",recordOfMysqlDao.queryNavigator(model, parameter,currentPage,pageSize));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult insertRecord(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		@SuppressWarnings("unchecked")
		List<Map<String,Object>> list = (List<Map<String,Object>>)parameter.get("data");
		for(int i=0;i<list.size();i++) {
			Map<String,Object> _map = (Map<String,Object>)list.get(i);
			String orgid=_map.get("orgid").toString();
			String uid=_map.get("uuid").toString();
			Map<String,Object> map2 = new HashMap<String,Object>();
			BlRecordModel model = new BlRecordModel();
			map2.put("orgid", orgid);
			map2.put("uuid", uid);
			List<Object> list1 = recordOfMysqlDao.query(model, map2);
			if (list1.size()>0) {
				_map.put("updatedate", Long.parseLong(DateTimeUtil.getTimeStampOfSecond()));
				jsonResult = this.update(_map);
			} else {
				_map.put("updatedate", Long.parseLong(DateTimeUtil.getTimeStampOfSecond()));
				jsonResult = this.insert(_map);
			}
		}
		return jsonResult;
	}

	@Override
	public JsonResult querysx(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		BlRecordModelVo model = new BlRecordModelVo();
		if (parameter.containsKey("orgid")) {
			model.setOrgid(parameter.get("orgid").toString());
		}
		String begintime = parameter.get("begintime").toString();
		String endtime = parameter.get("endtime").toString();
		String key = parameter.get("key").toString();
		String orgid = parameter.get("orgid").toString();
		map.put("data",recordOfMysqlDao.querysx(begintime,endtime,key,orgid));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

}
