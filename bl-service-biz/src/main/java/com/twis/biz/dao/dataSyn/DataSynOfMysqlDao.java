package com.twis.biz.dao.dataSyn;

import java.util.List;

import com.twis.common.dao.BaseDao;

public interface DataSynOfMysqlDao extends BaseDao{
	
	public List<Object> queryDataByTimes(Class modelClass,  String tableName,  String uuid) throws Exception ;

}
