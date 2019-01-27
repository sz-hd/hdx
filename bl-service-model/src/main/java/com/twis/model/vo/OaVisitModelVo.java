package com.twis.model.vo;

import com.twis.model.Column;
import com.twis.model.OaVisitModel;

public class OaVisitModelVo extends OaVisitModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7129867755741729328L;
	@Column(name = "ORGNAME")
	private String orgname;
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	 
	
}
