package com.twis.model.vo;

import com.twis.model.BlRecordModel;
import com.twis.model.Column;

public class BlRecordModelVo extends BlRecordModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3298217123047914534L;
	@Column(name = "LOGINNAME")
	private String loginname;
	@Column(name = "LOGINNAME2")
	private String loginname2;
	@Column(name = "CAUSE")
	private String cause;
	@Column(name = "SEXNAME")
	private String sexname;
	@Column(name = "XWROOM")
	private String xwroom;
	@Column(name = "YJSC")
	private String yjsc;
	@Column(name = "FPHOTO")
	private String fphoto;
	@Column(name = "SUSPECTSNAME")
	private String suspectsname;
	
	
	
	public String getSuspectsname() {
		return suspectsname;
	}
	public void setSuspectsname(String suspectsname) {
		this.suspectsname = suspectsname;
	}
	public String getFphoto() {
		return fphoto;
	}
	public void setFphoto(String fphoto) {
		this.fphoto = fphoto;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getLoginname2() {
		return loginname2;
	}
	public void setLoginname2(String loginname2) {
		this.loginname2 = loginname2;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getSexname() {
		return sexname;
	}
	public void setSexname(String sexname) {
		this.sexname = sexname;
	}
	public String getXwroom() {
		return xwroom;
	}
	public void setXwroom(String xwroom) {
		this.xwroom = xwroom;
	}
	public String getYjsc() {
		return yjsc;
	}
	public void setYjsc(String yjsc) {
		this.yjsc = yjsc;
	}
	
	

}
