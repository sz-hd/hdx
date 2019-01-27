package com.twis.biz.dao.baseInfo;

import java.util.List;

import com.twis.common.dao.BaseDao;

public interface IpOfMysqlDao extends BaseDao{
	public List<Object> getVisitIp(String ip) throws Exception; 
}
