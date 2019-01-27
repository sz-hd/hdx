package com.twis.biz.dao.baseInfo;

import org.springframework.stereotype.Repository;

import com.twis.common.dao.impl.BaseExDaoOfMysqlImpl;
import com.twis.model.KUserModel;

@Repository
public class UserOfMysqlDaoImpl extends BaseExDaoOfMysqlImpl<KUserModel> implements UserOfMysqlDao {	

}
