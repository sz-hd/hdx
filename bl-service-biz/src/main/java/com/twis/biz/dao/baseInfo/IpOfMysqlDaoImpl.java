package com.twis.biz.dao.baseInfo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.twis.common.dao.impl.BaseExDaoOfMysqlImpl;
import com.twis.model.OaVisitModel;
import com.twis.model.vo.OaVisitModelVo;

@Repository
public class IpOfMysqlDaoImpl extends BaseExDaoOfMysqlImpl<OaVisitModel> implements IpOfMysqlDao {

	@Override
	public List<Object> getVisitIp(String ip) throws Exception {
		String sql = "select a.*,b.standbyname as orgname from oa_visitip a left join k_organ b on a.organid_ = b.departid where a.loginip = ?";
		return this.query(sql, new Object[]{ip}, OaVisitModelVo.class);
	}	

}
