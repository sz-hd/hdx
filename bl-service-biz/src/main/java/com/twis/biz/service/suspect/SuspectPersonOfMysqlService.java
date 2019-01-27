package com.twis.biz.service.suspect;

import java.util.Map;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.twis.common.service.BaseService;
import com.twis.common.utils.JsonResult;

public interface SuspectPersonOfMysqlService extends BaseService{
	@Transactional(propagation=Propagation.SUPPORTS, timeout=5)
	public JsonResult getSuspectByTimes(Map<String,Object> parameter) throws Exception;
	@Transactional(propagation=Propagation.SUPPORTS, timeout=5)
	public JsonResult updateSuspectFinishStatus(Map<String,Object> parameter) throws Exception;
	
}
