package com.twis.model;

@Table(name = "OA_VISITIP")
public class OaVisitModel extends com.twis.model.BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8920791618799297217L;
	@Column(name = "UUID")
	private Integer uuid;
	@Column(name = "LOGINIP")
	private String loginIp;
	@Column(name = "STATE")
	private String state;
	@Column(name = "ORGANID_")
	private String organId_;
	public Integer getUuid() {
		return uuid;
	}
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getOrganId_() {
		return organId_;
	}
	public void setOrganId_(String organId_) {
		this.organId_ = organId_;
	}
	
	
	
	

}
