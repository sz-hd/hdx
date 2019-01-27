package com.twis.biz.service.dataSyn;

import java.util.Map;

import com.twis.common.service.BaseService;
import com.twis.common.utils.JsonResult;

public interface DataSynOfMysqlService extends BaseService{
	
	public JsonResult synUptoServer(String tablename,Map<String, Object> pp) throws Exception;
	public JsonResult query(String sql) throws Exception;
	public JsonResult excute(String sql) throws Exception;
	
}
