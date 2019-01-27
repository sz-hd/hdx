package com.twis.biz.service.dataSyn.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twis.biz.dao.dataSyn.DataSynOfMysqlDao;
import com.twis.biz.dao.law.LawOfMysqlDao;
import com.twis.biz.dao.record.RecordOfMysqlDao;
import com.twis.biz.service.dataSyn.DataSynOfMysqlService;
import com.twis.biz.service.law.LawOfMysqlService;
import com.twis.common.dao.impl.BaseExDaoOfMysqlImpl;
import com.twis.common.utils.JsonResult;
import com.twis.model.BlLawModel;
import com.twis.model.BlMenuModel;
import com.twis.model.BlRecordModel;

@Service
public class DataSynOfMysqlServiceImpl extends BaseExDaoOfMysqlImpl<BlRecordModel> implements DataSynOfMysqlService {

	@Autowired
	private LawOfMysqlDao lawOfMysqlDao;
	
	@Autowired
	private RecordOfMysqlDao recordOfMysqlDao;
	
	
	@Autowired
	private  DataSynOfMysqlDao   dataSynOfMysqlDao;
	
	
	//同步数据到服务端，通用程序
		public JsonResult synUptoServer(String tableName,Map<String, Object> pp) throws Exception {
			JsonResult jsonResult = new JsonResult();
			Map<String,Object> map = new HashMap<String,Object>();
			int value=1;
			
			List list=(List)pp.get("data");
			for(int i=0;i<list.size();i++){
				Map<String, Object> parameter=(Map<String, Object>)list.get(i);

				if(tableName.equalsIgnoreCase("bl_record")){
					
					value=synUptoBLRecord(parameter);
				}else if(tableName.equalsIgnoreCase("bl_record")){
					
					value=synUptoBLRecord(parameter);
				}												
			}
			
			map.put("data",value);
			jsonResult.setData(map);
			jsonResult.setSuccess(true);
			return jsonResult;
		}

	
	//同步到BL_record表
		private int synUptoBLRecord(Map<String, Object> parameter)  {
			int flag=1;
			try {
				BlRecordModel model = new BlRecordModel();
				model.setUuid((String)parameter.get("UUID"));
				List rs=recordOfMysqlDao.query(model);
				if(rs.isEmpty()){
					//新增
					flag = recordOfMysqlDao.insert(model, parameter);
				}else{
					BlRecordModel model2=(BlRecordModel)rs.get(0) ;
					int updateTime1=Integer.parseInt((String)parameter.get("UPDATEDATE"));
					int updateTime2=model2.getUpdatedate();
					if(updateTime1>updateTime2){
						//修改
						flag = recordOfMysqlDao.update(model, parameter);
					}
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return flag;
		}
	
	
	@Override
	public JsonResult update(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		
		return jsonResult;
	}
	


	@Override
	public JsonResult insert(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonResult delete(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonResult query(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonResult queryNavigator(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	
	public JsonResult query(String sql) throws Exception {
		
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		
		map=dataSynOfMysqlDao.queryDataListByMap(sql);
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}


	public JsonResult excute(String sql) throws Exception {
		int value=0;
		
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		
		value=dataSynOfMysqlDao.update(sql);
		map.put("data",value);
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
		
		
		
	}


}
