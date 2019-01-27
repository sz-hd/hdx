package com.twis.biz.dao.ajcase;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.twis.common.dao.impl.BaseExDaoOfMysqlImpl;
import com.twis.model.JaCaseModel;

@Repository
public class JaCaseOfMysqlDaoImpl extends BaseExDaoOfMysqlImpl<JaCaseModel> implements JaCaseOfMysqlDao {	
	public List<Object> queryCaseInfo(String orgid) throws Exception {
		String sql = "select a.*,b.loginid as ajzbry from ja_case a left join k_user b on a.curuserid = b.id where a.organid_= ?";
		return this.query(sql, new Object[]{orgid}, JaCaseModel.class);
	}
	
	public List<Object> getCaseByTimes(String times, String orgid) throws Exception {
		String sql = "select a.*,b.loginid as ajzbry from ja_case a left join k_user b on a.curuserid = b.id where substr(UNIX_TIMESTAMP(a.update_time_),1,10)+0 > ? and a.organid_=?";
		return this.query(sql, new Object[]{times,orgid}, JaCaseModel.class);
	}
}
