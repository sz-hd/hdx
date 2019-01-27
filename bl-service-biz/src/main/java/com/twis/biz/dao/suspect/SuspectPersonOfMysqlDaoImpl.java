package com.twis.biz.dao.suspect;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.twis.common.dao.impl.BaseExDaoOfMysqlImpl;
import com.twis.model.JaCasepersonModel;

@Repository
public class SuspectPersonOfMysqlDaoImpl extends BaseExDaoOfMysqlImpl<JaCasepersonModel> implements SuspectPersonOfMysqlDao {
	@Override
	public List<Object> getSuspectByTimes(String times, String orgid) throws Exception {
		String sql = "select * from ja_caseperson where substr(UNIX_TIMESTAMP(update_time_),1,10)+0 > ? and isfinish = 0 and organid_=?";
		return this.query(sql, new Object[]{times,orgid}, JaCasepersonModel.class);
	}	

}
