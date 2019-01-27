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
 * 笔录模板表(BL_RECORDMODEL)
 */
@Table(name = "BL_RECORDMODEL")
public class BlRecordmodelModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = 5642002466489649843L;
    
    /**  */
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    @Column(name = "ID")
    private Long id;
    
    /**  */
    @Column(name = "UUID",isId="true")
    private String uuid;
    
    /**  */
    @Column(name = "NAME")
    private String name;
    
    /**  */
    @Column(name = "RECORDTYPE")
    private String recordtype;
    
    /**  */
    @Column(name = "RECORDTYPEID")
    private String recordtypeid;
    
    /**  */
    @Column(name = "REMARK")
    private String remark;
    
    /**  */
    @Column(name = "loginId")
    private String loginId;
    
    /**  */
    @Column(name = "ISIMPORT")
    private Integer isimport;
    
    /**  */
    @Column(name = "ISDEFAULT")
    private Integer isdefault;
    
    /**  */
    @Column(name = "ORDERINDEX")
    private Integer orderindex;
    
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
    
    
    
    public String getRecordtypeid() {
		return recordtypeid;
	}

	public void setRecordtypeid(String recordtypeid) {
		this.recordtypeid = recordtypeid;
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
    public String getName() {
        return this.name;
    }
     
    /**
     * 设置
     * 
     * @param name
     *          
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getRecordtype() {
        return this.recordtype;
    }
     
    /**
     * 设置
     * 
     * @param recordtype
     *          
     */
    public void setRecordtype(String recordtype) {
        this.recordtype = recordtype;
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
    public String getLoginId() {
        return this.loginId;
    }
     
    /**
     * 设置
     * 
     * @param loginId
     *          
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getIsimport() {
        return this.isimport;
    }
     
    /**
     * 设置
     * 
     * @param isimport
     *          
     */
    public void setIsimport(Integer isimport) {
        this.isimport = isimport;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getIsdefault() {
        return this.isdefault;
    }
     
    /**
     * 设置
     * 
     * @param isdefault
     *          
     */
    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getOrderindex() {
        return this.orderindex;
    }
     
    /**
     * 设置
     * 
     * @param orderindex
     *          
     */
    public void setOrderindex(Integer orderindex) {
        this.orderindex = orderindex;
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