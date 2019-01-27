package com.twis.biz.dao.baseInfo;

import java.util.List;

import com.twis.common.dao.BaseDao;

public interface RoomOfMysqlDao extends BaseDao{
	List<Object> getRoomIp(String ip) throws Exception;
}
