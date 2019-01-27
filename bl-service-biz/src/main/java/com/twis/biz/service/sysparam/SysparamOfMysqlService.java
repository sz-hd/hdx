/*
 * Copyright 2018-2028 Twis.Inc All Rights Reserved.
 */
package com.twis.biz.service.sysparam;

import java.util.Map;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.twis.common.service.BaseService;
import com.twis.common.utils.JsonResult;

public interface SysparamOfMysqlService extends BaseService{
	@Transactional(propagation=Propagation.SUPPORTS, timeout=5)
	public JsonResult testServer(Map<String,Object> parameter) throws Exception;
	@Transactional(propagation=Propagation.SUPPORTS, timeout=5)
	public JsonResult getTimeStamp(Map<String,Object> parameter) throws Exception;
}
