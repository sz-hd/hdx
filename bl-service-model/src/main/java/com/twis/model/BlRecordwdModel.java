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
 * 笔录模板问答表(BL_RECORDWD)
 */
@Table(name = "BL_RECORDWD")
public class BlRecordwdModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = 4657833019986909297L;
    
    /**  */
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    @Column(name = "ID")
    private Long id;
    
    /**  */
    @Column(name = "UUID",isId="true")
    private String uuid;
    
    /**  */
    @Column(name = "modelId")
    private String modelId;
    
    /**  */
    @Column(name = "questionId")
    private String questionId;
   
    /**  */
    @Column(name = "ANSWER")
    private String answer;
    
    /**  */
    @Column(name = "REMARK")
    private String remark;
    
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
    public String getModelId() {
        return this.modelId;
    }
     
    /**
     * 设置
     * 
     * @param modelId
     *          
     */
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getQuestionId() {
        return this.questionId;
    }
     
    /**
     * 设置
     * 
     * @param questionId
     *          
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getAnswer() {
        return this.answer;
    }
     
    /**
     * 设置
     * 
     * @param answer
     *          
     */
    public void setAnswer(String answer) {
        this.answer = answer;
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