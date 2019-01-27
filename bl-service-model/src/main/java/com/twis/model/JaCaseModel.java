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


/**
 * (JA_CASE)
 * 
 * @author bianj
 * @version 1.0.0 2018-12-09
 */
@Table(name = "JA_CASE")
public class JaCaseModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = 8445941262812171359L;
    
    /**  */
    @Column(name = "UUID", isId="true")
    private String uuid;
    
    /** 办案民警 */
    @Column(name = "CURUSERID")
    private String curuserid;
    
    /** 办案民警 */
    @Column(name = "CURUSERNAME")
    private String curusername;
    
    /** 审核领导 */
    @Column(name = "CURLEADER")
    private String curleader;
    
    /** 审核领导 */
    @Column(name = "CURLEADERNAME")
    private String curleadername;
    
    /** 协办民警 */
    @Column(name = "CURUSERIDS_ASSIST")
    private String curuseridsAssist;
    
    /** 协办民警 */
    @Column(name = "CURUSERIDS_ASSISTNAME")
    private String curuseridsAssistname;
    
    /** 案由编号[案由编号] */
    @Column(name = "CASENUMBER")
    private String casenumber;
    
    /** 案件类型 */
    @Column(name = "CASETYPE")
    private String casetype;
    
    /** 案由 */
    @Column(name = "CAUSE")
    private String cause;
    
    /** 嫌疑来源 */
    @Column(name = "SUSPECTFROM")
    private String suspectfrom;
    
    /** 进入时间 */
    @Column(name = "ENTERTIME")
    private String entertime;
    
    /** 状态 */
    @Column(name = "STATUS")
    private String status;
    
    /** 状态名称 */
    @Column(name = "STATUSNAME")
    private String statusname;
    
    /** 审核时间 */
    @Column(name = "APPLYTIME")
    private String applytime;
    
    /** 备注 */
    @Column(name = "REMARK")
    private String remark;
    
    /** 操作人 */
    @Column(name = "OPER_USER_ID_")
    private String operUserId;
    
    /** 操作时间 */
    @Column(name = "OPER_TIME_")
    private String operTime;
    
    /** 更新人 */
    @Column(name = "UPDATE_USER_ID_")
    private String updateUserId;
    
    /** 更新时间 */
    @Column(name = "UPDATE_TIME_")
    private String updateTime;
    
    /** 所属机构 */
    @Column(name = "ORGANID_")
    private String organid;
    
    /** 警情编号 */
    @Column(name = "JQNUMBER")
    private String jqnumber;
    
    /** 案件编号 */
    @Column(name = "AJNUMBER")
    private String ajnumber;
    
    /** 案件名称 */
    @Column(name ="CASENAME")
    private String casename;
    
    /** 案件名称 */
    @Column(name ="AJZBRY")
    private String ajzbry;
    
    public String getCasename() {
		return casename;
	}

	public void setCasename(String casename) {
		this.casename = casename;
	}

	public String getAjzbry() {
		return ajzbry;
	}

	public void setAjzbry(String ajzbry) {
		this.ajzbry = ajzbry;
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
     * 获取办案民警
     * 
     * @return 办案民警
     */
    public String getCuruserid() {
        return this.curuserid;
    }
     
    /**
     * 设置办案民警
     * 
     * @param curuserid
     *          办案民警
     */
    public void setCuruserid(String curuserid) {
        this.curuserid = curuserid;
    }
    
    /**
     * 获取办案民警
     * 
     * @return 办案民警
     */
    public String getCurusername() {
        return this.curusername;
    }
     
    /**
     * 设置办案民警
     * 
     * @param curusername
     *          办案民警
     */
    public void setCurusername(String curusername) {
        this.curusername = curusername;
    }
    
    /**
     * 获取审核领导
     * 
     * @return 审核领导
     */
    public String getCurleader() {
        return this.curleader;
    }
     
    /**
     * 设置审核领导
     * 
     * @param curleader
     *          审核领导
     */
    public void setCurleader(String curleader) {
        this.curleader = curleader;
    }
    
    /**
     * 获取审核领导
     * 
     * @return 审核领导
     */
    public String getCurleadername() {
        return this.curleadername;
    }
     
    /**
     * 设置审核领导
     * 
     * @param curleadername
     *          审核领导
     */
    public void setCurleadername(String curleadername) {
        this.curleadername = curleadername;
    }
    
    /**
     * 获取协办民警
     * 
     * @return 协办民警
     */
    public String getCuruseridsAssist() {
        return this.curuseridsAssist;
    }
     
    /**
     * 设置协办民警
     * 
     * @param curuseridsAssist
     *          协办民警
     */
    public void setCuruseridsAssist(String curuseridsAssist) {
        this.curuseridsAssist = curuseridsAssist;
    }
    
    /**
     * 获取协办民警
     * 
     * @return 协办民警
     */
    public String getCuruseridsAssistname() {
        return this.curuseridsAssistname;
    }
     
    /**
     * 设置协办民警
     * 
     * @param curuseridsAssistname
     *          协办民警
     */
    public void setCuruseridsAssistname(String curuseridsAssistname) {
        this.curuseridsAssistname = curuseridsAssistname;
    }
    
    /**
     * 获取案由编号[案由编号]
     * 
     * @return 案由编号[案由编号]
     */
    public String getCasenumber() {
        return this.casenumber;
    }
     
    /**
     * 设置案由编号[案由编号]
     * 
     * @param casenumber
     *          案由编号[案由编号]
     */
    public void setCasenumber(String casenumber) {
        this.casenumber = casenumber;
    }
    
    /**
     * 获取案件类型
     * 
     * @return 案件类型
     */
    public String getCasetype() {
        return this.casetype;
    }
     
    /**
     * 设置案件类型
     * 
     * @param casetype
     *          案件类型
     */
    public void setCasetype(String casetype) {
        this.casetype = casetype;
    }
    
    /**
     * 获取案由
     * 
     * @return 案由
     */
    public String getCause() {
        return this.cause;
    }
     
    /**
     * 设置案由
     * 
     * @param cause
     *          案由
     */
    public void setCause(String cause) {
        this.cause = cause;
    }
    
    /**
     * 获取嫌疑来源
     * 
     * @return 嫌疑来源
     */
    public String getSuspectfrom() {
        return this.suspectfrom;
    }
     
    /**
     * 设置嫌疑来源
     * 
     * @param suspectfrom
     *          嫌疑来源
     */
    public void setSuspectfrom(String suspectfrom) {
        this.suspectfrom = suspectfrom;
    }
    
    /**
     * 获取进入时间
     * 
     * @return 进入时间
     */
    public String getEntertime() {
        return this.entertime;
    }
     
    /**
     * 设置进入时间
     * 
     * @param entertime
     *          进入时间
     */
    public void setEntertime(String entertime) {
        this.entertime = entertime;
    }
    
    /**
     * 获取状态
     * 
     * @return 状态
     */
    public String getStatus() {
        return this.status;
    }
     
    /**
     * 设置状态
     * 
     * @param status
     *          状态
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * 获取状态名称
     * 
     * @return 状态名称
     */
    public String getStatusname() {
        return this.statusname;
    }
     
    /**
     * 设置状态名称
     * 
     * @param statusname
     *          状态名称
     */
    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }
    
    /**
     * 获取审核时间
     * 
     * @return 审核时间
     */
    public String getApplytime() {
        return this.applytime;
    }
     
    /**
     * 设置审核时间
     * 
     * @param applytime
     *          审核时间
     */
    public void setApplytime(String applytime) {
        this.applytime = applytime;
    }
    
    /**
     * 获取备注
     * 
     * @return 备注
     */
    public String getRemark() {
        return this.remark;
    }
     
    /**
     * 设置备注
     * 
     * @param remark
     *          备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    /**
     * 获取操作人
     * 
     * @return 操作人
     */
    public String getOperUserId() {
        return this.operUserId;
    }
     
    /**
     * 设置操作人
     * 
     * @param operUserId
     *          操作人
     */
    public void setOperUserId(String operUserId) {
        this.operUserId = operUserId;
    }
    
    /**
     * 获取操作时间
     * 
     * @return 操作时间
     */
    public String getOperTime() {
        return this.operTime;
    }
     
    /**
     * 设置操作时间
     * 
     * @param operTime
     *          操作时间
     */
    public void setOperTime(String operTime) {
        this.operTime = operTime;
    }
    
    /**
     * 获取更新人
     * 
     * @return 更新人
     */
    public String getUpdateUserId() {
        return this.updateUserId;
    }
     
    /**
     * 设置更新人
     * 
     * @param updateUserId
     *          更新人
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }
    
    /**
     * 获取更新时间
     * 
     * @return 更新时间
     */
    public String getUpdateTime() {
        return this.updateTime;
    }
     
    /**
     * 设置更新时间
     * 
     * @param updateTime
     *          更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    
    /**
     * 获取所属机构
     * 
     * @return 所属机构
     */
    public String getOrganid() {
        return this.organid;
    }
     
    /**
     * 设置所属机构
     * 
     * @param organid
     *          所属机构
     */
    public void setOrganid(String organid) {
        this.organid = organid;
    }
    
    /**
     * 获取警情编号
     * 
     * @return 警情编号
     */
    public String getJqnumber() {
        return this.jqnumber;
    }
     
    /**
     * 设置警情编号
     * 
     * @param jqnumber
     *          警情编号
     */
    public void setJqnumber(String jqnumber) {
        this.jqnumber = jqnumber;
    }
    
    /**
     * 获取案件编号
     * 
     * @return 案件编号
     */
    public String getAjnumber() {
        return this.ajnumber;
    }
     
    /**
     * 设置案件编号
     * 
     * @param ajnumber
     *          案件编号
     */
    public void setAjnumber(String ajnumber) {
        this.ajnumber = ajnumber;
    }
}