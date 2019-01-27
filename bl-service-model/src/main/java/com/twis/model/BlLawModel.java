package com.twis.model;
/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:4.1.2
 */

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 笔录法律法规表(BL_LAW)
 */
@Table(name = "BL_LAW")
public class BlLawModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = -4569331843857280206L;
    
    /**  */
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    @Column(name = "ID",isId="true")
    private Long id;
    
    /**  */
    @Column(name = "UUID")
    private String uuid;
    
    /**  */
    @Column(name = "LAWNAME")
    private String lawname;
    
    /**  */
    @Column(name = "LAWCONTENT")
    private String lawcontent;
    
    /**  */
    @Column(name = "LAWCONTENT2")
    private String lawcontent2;
    
    /**  */
    @Column(name = "LAWCODE")
    private String lawcode;
    
    /**  */
    @Column(name = "LAWFWDW")
    private String lawfwdw;
    
    /**  */
    @Column(name = "REMARK")
    private String remark;
    
    /**  */
    @Column(name = "CTYPE")
    private Integer ctype;
    
    /**  */
    @Column(name = "ORGID")
    private String orgid;
    
    /**  */
    @JsonSerialize(using = JsonDateFormatFull.class)
    @Column(name = "CREATEDATE")
    private Date createdate;
    
    /**  */
    @Column(name = "UPDATEDATE")
    private Integer updatedate;
    
    
    public String getLawcontent2() {
		return lawcontent2;
	}

	public void setLawcontent2(String lawcontent2) {
		this.lawcontent2 = lawcontent2;
	}

	
	
	public Integer getCtype() {
		return ctype;
	}

	public void setCtype(Integer ctype) {
		this.ctype = ctype;
	}

	/**
     * 获取
     * 
     * @return 
     */
    public Long getId() {
        return this.id;
    }
     
    /**
     * 设置
     * 
     * @param id
     *          
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getUuid() {
        return this.uuid;
    }
     
    /**
     * 设置
     * 
     * @param uuid
     *          
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getLawname() {
        return this.lawname;
    }
     
    /**
     * 设置
     * 
     * @param lawname
     *          
     */
    public void setLawname(String lawname) {
        this.lawname = lawname;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getLawcontent() {
        return this.lawcontent;
    }
     
    /**
     * 设置
     * 
     * @param lawcontent
     *          
     */
    public void setLawcontent(String lawcontent) {
        this.lawcontent = lawcontent;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getLawcode() {
        return this.lawcode;
    }
     
    /**
     * 设置
     * 
     * @param lawcode
     *          
     */
    public void setLawcode(String lawcode) {
        this.lawcode = lawcode;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getLawfwdw() {
        return this.lawfwdw;
    }
     
    /**
     * 设置
     * 
     * @param lawfwdw
     *          
     */
    public void setLawfwdw(String lawfwdw) {
        this.lawfwdw = lawfwdw;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getRemark() {
        return this.remark;
    }
     
    /**
     * 设置
     * 
     * @param remark
     *          
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getOrgid() {
        return this.orgid;
    }
     
    /**
     * 设置
     * 
     * @param orgid
     *          
     */
    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Date getCreatedate() {
        return this.createdate;
    }
     
    /**
     * 设置
     * 
     * @param createdate
     *          
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getUpdatedate() {
        return this.updatedate;
    }
     
    /**
     * 设置
     * 
     * @param updatedate
     *          
     */
    public void setUpdatedate(Integer updatedate) {
        this.updatedate = updatedate;
    }
}