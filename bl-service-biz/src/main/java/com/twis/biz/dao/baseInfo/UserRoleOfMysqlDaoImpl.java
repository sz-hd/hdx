package com.twis.biz.dao.baseInfo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.twis.common.dao.impl.BaseExDaoOfMysqlImpl;
import com.twis.model.KUserroleModel;

@Repository
public class UserRoleOfMysqlDaoImpl extends BaseExDaoOfMysqlImpl<KUserroleModel> implements UserRoleOfMysqlDao {
	@Override
	public List<Object> getRoleListByOrg(String orgid) throws Exception {
		String sql = "select a.* from k_userrole a join k_user b on a.userid = b.id where b.departid = ?";
		return this.query(sql, new Object[]{orgid}, KUserroleModel.class);
	}	

}
