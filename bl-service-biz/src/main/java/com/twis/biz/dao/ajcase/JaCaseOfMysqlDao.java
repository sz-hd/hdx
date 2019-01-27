package com.twis.biz.dao.ajcase;

import java.util.List;

import com.twis.common.dao.BaseDao;

public interface JaCaseOfMysqlDao extends BaseDao{
	public List<Object> queryCaseInfo(String orgid) throws Exception;
	public List<Object> getCaseByTimes(String times,String orgid) throws Exception;
	
}
