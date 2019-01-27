package com.twis.biz.dao.dataSyn;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.twis.common.dao.impl.BaseExDaoOfMysqlImpl;
import com.twis.model.BlLawModel;

@Repository
public class DataSynOfMysqlDaoImpl extends BaseExDaoOfMysqlImpl<BlLawModel> implements DataSynOfMysqlDao {	
	
	//通用查询程序
		public List<Object> queryDataByTimes(Class modelClass,  String tableName,  String uuid) throws Exception {
			String sql = "select * from "+tableName+" where uuid= ?";
			return this.query(sql, new Object[]{uuid}, modelClass);
		}

}
