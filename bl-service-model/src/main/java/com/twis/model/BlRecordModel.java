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
 * 笔录表(BL_RECORD)
 */
@Table(name = "BL_RECORD")
public class BlRecordModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = -118123012976120046L;
    
    /**  */
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    @Column(name = "ID")
    private Long id;
    
    /**  */
    @Column(name = "UUID",isId="true")
    private String uuid;
    
    /**  */
    @Column(name = "MAINFORMID")
    private String mainformid;
    
    /**  */
    @Column(name = "SUSPECTID")
    private String suspectid;
    
    /**  */
    @Column(name = "AJZBRY")
    private String ajzbry;
    
    /**  */
    @Column(name = "AJXBRY")
    private String ajxbry;
    
    /**  */
    @Column(name = "RECORDPERSON")
    private String recordperson;
    
    /**  */
    @Column(name = "WHADDRESS")
    private String whaddress;
    
    /**  */
    @Column(name = "TIMES")
    private Integer times;
    
    /**  */
    @Column(name = "XWDXTYPE")
    private String xwdxtype;
    
    /**  */
    @Column(name = "SUSPECTFROM")
    private String suspectfrom;
    
    /**  */
    @Column(name = "MODELID")
    private String modelid;
    
    /**  */
    @Column(name = "TYPEID")
    private String typeid;
    
    /**  */
    @Column(name = "ISENCRYPT")
    private Integer isencrypt;
    
    /**  */
    @Column(name = "PWD")
    private String pwd;
    /**  */
    @Column(name = "RECORDCONTENT")
    private String recordcontent;
    
    /**  */
    @Column(name = "REMARK")
    private String remark;
    
    /**  */
    @Column(name = "ORGID")
    private String orgid;
    
    /**  */
    @Column(name = "BEGINDATE")
    private String begindate;
    
    /**  */
    @Column(name = "ENDDATE")
    private String enddate;
    
    /**  */
    @JsonSerialize(using = JsonDateFormatFull.class)
    @Column(name = "CREATEDATE")
    private Date createdate;
    
    /**  */
    @Column(name = "UPDATEDATE")
    private Integer updatedate;
    
    /**  */
    @Column(name = "STATUS")
    private Integer status;
    
    /**  */
    @Column(name = "ISDELETE")
    private Integer isDelete;
    
    
    
    public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
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
    
    
     
    public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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
    public String getMainformid() {
        return this.mainformid;
    }
     
    /**
     * 设置
     * 
     * @param mainformid
     *          
     */
    public void setMainformid(String mainformid) {
        this.mainformid = mainformid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getSuspectid() {
        return this.suspectid;
    }
     
    /**
     * 设置
     * 
     * @param suspectid
     *          
     */
    public void setSuspectid(String suspectid) {
        this.suspectid = suspectid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getAjzbry() {
        return this.ajzbry;
    }
     
    /**
     * 设置
     * 
     * @param ajzbry
     *          
     */
    public void setAjzbry(String ajzbry) {
        this.ajzbry = ajzbry;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getAjxbry() {
        return this.ajxbry;
    }
     
    /**
     * 设置
     * 
     * @param ajxbry
     *          
     */
    public void setAjxbry(String ajxbry) {
        this.ajxbry = ajxbry;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getRecordperson() {
        return this.recordperson;
    }
     
    /**
     * 设置
     * 
     * @param recordperson
     *          
     */
    public void setRecordperson(String recordperson) {
        this.recordperson = recordperson;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getWhaddress() {
        return this.whaddress;
    }
     
    /**
     * 设置
     * 
     * @param whaddress
     *          
     */
    public void setWhaddress(String whaddress) {
        this.whaddress = whaddress;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getTimes() {
        return this.times;
    }
     
    /**
     * 设置
     * 
     * @param times
     *          
     */
    public void setTimes(Integer times) {
        this.times = times;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getXwdxtype() {
        return this.xwdxtype;
    }
     
    /**
     * 设置
     * 
     * @param xwdxtype
     *          
     */
    public void setXwdxtype(String xwdxtype) {
        this.xwdxtype = xwdxtype;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getSuspectfrom() {
        return this.suspectfrom;
    }
     
    /**
     * 设置
     * 
     * @param suspectfrom
     *          
     */
    public void setSuspectfrom(String suspectfrom) {
        this.suspectfrom = suspectfrom;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getModelid() {
        return this.modelid;
    }
     
    /**
     * 设置
     * 
     * @param modelid
     *          
     */
    public void setModelid(String modelid) {
        this.modelid = modelid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getTypeid() {
        return this.typeid;
    }
     
    /**
     * 设置
     * 
     * @param typeid
     *          
     */
    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getIsencrypt() {
        return this.isencrypt;
    }
     
    /**
     * 设置
     * 
     * @param isencrypt
     *          
     */
    public void setIsencrypt(Integer isencrypt) {
        this.isencrypt = isencrypt;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getRecordcontent() {
        return this.recordcontent;
    }
     
    /**
     * 设置
     * 
     * @param recordcontent
     *          
     */
    public void setRecordcontent(String recordcontent) {
        this.recordcontent = recordcontent;
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
    public String getBegindate() {
        return this.begindate;
    }
     
    /**
     * 设置
     * 
     * @param begindate
     *          
     */
    public void setBegindate(String begindate) {
        this.begindate = begindate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getEnddate() {
        return this.enddate;
    }
     
    /**
     * 设置
     * 
     * @param enddate
     *          
     */
    public void setEnddate(String enddate) {
        this.enddate = enddate;
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