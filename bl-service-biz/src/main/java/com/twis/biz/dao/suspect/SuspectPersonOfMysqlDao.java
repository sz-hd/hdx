package com.twis.biz.dao.suspect;

import java.util.List;

import com.twis.common.dao.BaseDao;

public interface SuspectPersonOfMysqlDao extends BaseDao{
	/**
	 * 获取时间增量的嫌疑人列表
	 * @param times
	 * @param orgid
	 * @return
	 * @throws Exception
	 */
	public List<Object> getSuspectByTimes(String times, String orgid) throws Exception;
}
