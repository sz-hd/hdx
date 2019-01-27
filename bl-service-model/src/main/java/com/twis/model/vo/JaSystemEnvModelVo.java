package com.twis.model.vo;

import com.twis.model.Column;
import com.twis.model.JaSystemEnvModel;

public class JaSystemEnvModelVo extends JaSystemEnvModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3076527965828280011L;
	@Column(name = "ORGNAME")
	private String orgname;
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	
	

}
