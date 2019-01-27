/*
 * Copyright 2018-2028 Twis.Inc All Rights Reserved.
 */
package com.twis.biz.service.record;

import java.util.Map;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.twis.common.service.BaseService;
import com.twis.common.utils.JsonResult;

public interface RecordOfMysqlService extends BaseService{
	/**
	 * 插入增量笔录
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	@Transactional(propagation=Propagation.REQUIRES_NEW, timeout=5)
	JsonResult insertRecord(Map<String,Object> parameter) throws Exception;
	
	/**
	 * 审讯记录查询
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	@Transactional(propagation=Propagation.REQUIRES_NEW, timeout=5)
	JsonResult querysx(Map<String,Object> parameter) throws Exception;
	
}
