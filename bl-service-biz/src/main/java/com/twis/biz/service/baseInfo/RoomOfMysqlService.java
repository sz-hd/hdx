package com.twis.biz.service.baseInfo;

import java.util.Map;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.twis.common.service.BaseService;
import com.twis.common.utils.JsonResult;

public interface RoomOfMysqlService extends BaseService{
	@Transactional(propagation=Propagation.SUPPORTS, timeout=5)
	public JsonResult getRoomIp(Map<String,Object> parameter) throws Exception;
}

