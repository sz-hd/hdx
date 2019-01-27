package com.twis.biz.service.baseInfo.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twis.biz.dao.baseInfo.UserRoleOfMysqlDao;
import com.twis.biz.service.baseInfo.UserRoleOfMysqlService;
import com.twis.common.utils.JsonResult;
import com.twis.model.KUserPhotoModel;
import com.twis.model.KUserroleModel;

@Service
public class UserRoleOfMysqlServiceImpl implements UserRoleOfMysqlService {

	@Autowired
	private UserRoleOfMysqlDao userRoleOfMysqlDao;
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
		KUserroleModel model = new KUserroleModel();
		model.setUserid(Long.parseLong(parameter.get("userId").toString()));
		map.put("data",userRoleOfMysqlDao.query(model));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult queryNavigator(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		KUserroleModel model = new KUserroleModel();
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
		map.put("data",userRoleOfMysqlDao.queryNavigator(model, parameter,currentPage,pageSize));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult getRoleListByOrg(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("data",userRoleOfMysqlDao.getRoleListByOrg(parameter.get("orgid").toString()));
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

}
