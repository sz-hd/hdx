package com.twis.biz.dao.baseInfo;

import java.util.List;

import com.twis.common.dao.BaseDao;

public interface UserRoleOfMysqlDao extends BaseDao{
	public List<Object> getRoleListByOrg(String orgid) throws Exception;
}
