package com.twis.biz.dao.record;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.twis.common.dao.impl.BaseExDaoOfMysqlImpl;
import com.twis.model.BlRecordModel;
import com.twis.model.vo.BlRecordModelVo;

@Repository
public class RecordOfMysqlDaoImpl extends BaseExDaoOfMysqlImpl<BlRecordModel> implements RecordOfMysqlDao {

	@Override
	public List<Object> queryRecordByTimes(String times, String orgid) throws Exception {
		String sql = "select * from bl_record where orgid = ? and updatedate>= ?";
		return this.query(sql, new Object[]{orgid,times}, BlRecordModel.class);
	}

	@Override
	public List<Object> querysx(String begintime, String endtime, String key, String orgid) throws Exception {
		String sql = "select a.*,b.suspectsname,c.cause,b.gender as sexname,'' as yjsc,e.fphoto,d.name as loginname from bl_record a "
				+ " left join ja_caseperson b on a.suspectid = b.uuid left join ja_case c on a.mainformid = c.uuid "
				+ " left join k_user d on a.ajzbry = d.loginid  left join k_user_photo e on d.id = e.mainformid " 
				+ " where a.orgid = ? ";
		return this.query(sql, new Object[]{orgid}, BlRecordModelVo.class);
	}	

}
