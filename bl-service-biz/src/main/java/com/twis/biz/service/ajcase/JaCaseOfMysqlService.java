package com.twis.biz.service.ajcase;

import java.util.Map;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.twis.common.service.BaseService;
import com.twis.common.utils.JsonResult;

public interface JaCaseOfMysqlService extends BaseService{
	@Transactional(propagation=Propagation.SUPPORTS, timeout=5)
	public JsonResult queryCaseInfo(Map<String, Object> parameter) throws Exception;
	@Transactional(propagation=Propagation.SUPPORTS, timeout=5)
	public JsonResult getCaseByTimes(Map<String,Object> parameter) throws Exception;
}
