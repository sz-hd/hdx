package com.twis.biz.dao.baseInfo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.twis.common.dao.impl.BaseExDaoOfMysqlImpl;
import com.twis.model.JaSystemEnvModel;
import com.twis.model.vo.JaSystemEnvModelVo;

@Repository
public class RoomOfMysqlDaoImpl extends BaseExDaoOfMysqlImpl<JaSystemEnvModel> implements RoomOfMysqlDao {

	@Override
	public List<Object> getRoomIp(String ip) throws Exception {
		String sql = "select a.*,b.standbyname as orgname from ja_system_env a left join k_organ b on a.organid_ = b.departid where a.roomip = ? and a.roomtype = ?";
		return this.query(sql, new Object[]{ip,"审讯室"}, JaSystemEnvModelVo.class);
	}	

}
