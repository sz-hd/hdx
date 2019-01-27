package com.twis.model;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 笔录模板问答表(BL_RECORDQUSE)
 */
@Table(name = "BL_RECORDQUES")
public class BlRecordQuseModel extends BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1489084593353768722L;
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
    @Column(name = "QUESTION")
    private String question;
    
    /**  */
    @Column(name = "ISHAVEQK")
    private Integer ishaveqk;
    
    /**  */
    @Column(name = "ISHAVIDEO")
    private Integer ishavideo;
    
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Integer getIshaveqk() {
		return ishaveqk;
	}

	public void setIshaveqk(Integer ishaveqk) {
		this.ishaveqk = ishaveqk;
	}

	public Integer getIshavideo() {
		return ishavideo;
	}

	public void setIshavideo(Integer ishavideo) {
		this.ishavideo = ishavideo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getOrderindex() {
		return orderindex;
	}

	public void setOrderindex(Integer orderindex) {
		this.orderindex = orderindex;
	}

	public String getOrgid() {
		return orgid;
	}

	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Integer getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Integer updatedate) {
		this.updatedate = updatedate;
	}
    

}
