package com.twis.biz.dao.record;

import java.util.List;

import com.twis.common.dao.BaseDao;

public interface RecordOfMysqlDao extends BaseDao{
	/**
	 * 按照单位和时间增量获取数据
	 * @param times
	 * @param orgid
	 * @return
	 * @throws Exception
	 */
	public List<Object> queryRecordByTimes(String times,String orgid) throws Exception;
	/**
	 * 查询审讯记录
	 * @param times
	 * @param orgid
	 * @return
	 * @throws Exception
	 */
	public List<Object> querysx(String begintime,String endtime, String key,String orgid) throws Exception;
	
}
