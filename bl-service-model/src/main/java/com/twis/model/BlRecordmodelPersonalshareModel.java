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
 * 笔录模板分享表(BL_RECORDMODEL_PERSONALSHARE)
 */
@Table(name = "BL_RECORDMODEL_PERSONALSHARE")
public class BlRecordmodelPersonalshareModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = -4639694065305383184L;
    
    /**  */
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    @Column(name = "ID")
    private Long id;
    
    /**  */
    @Column(name = "UUID",isId="true")
    private String uuid;
    
    /**  */
    @Column(name = "LOGINID")
    private String loginid;
    
    /**  */
    @Column(name = "MODELID")
    private String modelid;
    
    /**  */
    @Column(name = "shareUserId")
    private String shareUserId;
    
    /**  */
    @Column(name = "REMARK")
    private String remark;
    
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
    public String getLoginid() {
        return this.loginid;
    }
     
    /**
     * 设置
     * 
     * @param loginid
     *          
     */
    public void setLoginid(String loginid) {
        this.loginid = loginid;
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
    public String getShareUserId() {
        return this.shareUserId;
    }
     
    /**
     * 设置
     * 
     * @param shareUserId
     *          
     */
    public void setShareUserId(String shareUserId) {
        this.shareUserId = shareUserId;
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