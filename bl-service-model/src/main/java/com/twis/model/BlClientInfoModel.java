package com.twis.model;

@Table(name="BL_CLIENTINFO")
public class BlClientInfoModel extends com.twis.model.BaseObject {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 7960498976594865390L;
	/**  */
    @Column(name = "ID",isId="true")
    private Integer id;
    @Column(name = "CLIENTIP")
    private String clientip;

    @Column(name = "ORGID")
    private String orgid;
    
    @Column(name = "VERSION")
    private Integer version;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClientip() {
		return clientip;
	}

	public void setClientip(String clientip) {
		this.clientip = clientip;
	}

	public String getOrgid() {
		return orgid;
	}

	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
    
    
}
