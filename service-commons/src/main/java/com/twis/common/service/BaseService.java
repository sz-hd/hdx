package com.twis.common.service;

import java.util.Map;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.twis.common.utils.JsonResult;


public interface BaseService {
	@Transactional(propagation=Propagation.REQUIRES_NEW,rollbackFor={Exception.class}, timeout=5)
	public JsonResult insert(Map<String, Object> parameter) throws Exception;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW,rollbackFor={Exception.class}, timeout=5)
	public JsonResult update(Map<String, Object> parameter) throws Exception;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW,rollbackFor={Exception.class}, timeout=5)
	public JsonResult delete(Map<String, Object> parameter) throws Exception;
	
	@Transactional(propagation=Propagation.SUPPORTS, timeout=5)
	public  JsonResult query(Map<String, Object> parameter) throws Exception;
	
	@Transactional(propagation=Propagation.SUPPORTS, timeout=5)
	public JsonResult queryNavigator(Map<String, Object> parameter)  throws Exception;
}
