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
 * (K_DEPARTMENT)
 * 
 * @author bianj
 * @version 1.0.0 2018-12-09
 */
@Table(name = "K_DEPARTMENT")
public class KDepartmentModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = -5073347105724413709L;
    
    /**  */
    @Column(name = "AUTOID")
    private Integer autoid;
    
    /**  */
    @Column(name = "DEPARTNAME")
    private String departname;
    
    /**  */
    @Column(name = "PARENTID")
    private String parentid;
    
    /**  */
    @Column(name = "PROPERTY")
    private String property;
    
    /**  */
    @Column(name = "POPEDOM")
    private String popedom;
    
    /**  */
    @Column(name = "LEVEL0")
    private Integer level0;
    
    /**  */
    @Column(name = "FULLPATH")
    private String fullpath;
    
    /**  */
    @Column(name = "URL")
    private String url;
    
    /** 1为分支机构 */
    @Column(name = "LTYPE")
    private String ltype;
    
    /**  */
    @Column(name = "TYPEID")
    private String typeid;
    
    /**  */
    @Column(name = "ADDRESS")
    private String address;
    
    /**  */
    @Column(name = "POSTALCODE")
    private String postalcode;
    
    /**  */
    @Column(name = "PROJECTPOPEDOM")
    private String projectpopedom;
    
    /** 区域ID */
    @Column(name = "AREAID")
    private String areaid;
    
    /**  */
    @Column(name = "ISLEAF")
    private String isleaf;
    
    /**  */
    @Column(name = "RAND0")
    private String rand0;
    
    /** 部门缩写 */
    @Column(name = "ENNAME")
    private String enname;
    
    /** 项目信息缺省审批人 */
    @Column(name = "PROJECTAPPROVE")
    private String projectapprove;
    
    /** 预算工时缺省审批人 */
    @Column(name = "SCHEDULINGAPPROVE")
    private String schedulingapprove;
    
    /** 预算费用缺省审批人 */
    @Column(name = "COSTAPPROVE")
    private String costapprove;
    
    /** 实际费用缺省审批人 */
    @Column(name = "REALITYAPPROVE")
    private String realityapprove;
    
    /** 是否有质控部 */
    @Column(name = "HASQC_RADIO")
    private String hasqcRadio;
    
    /** 是否经过分所质控 */
    @Column(name = "QCSELF_RADIO")
    private String qcselfRadio;
    
    /** 分所简称,部门可不填 */
    @Column(name = "SIMPLENAME")
    private String simplename;
    
    /**  */
    @Column(name = "ORDERCODE")
    private Integer ordercode;
    
    /**  */
    @Column(name = "INITFLAG")
    private String initflag;
    
    /**  */
    @Column(name = "TIMEFLAG")
    private String timeflag;
    
    /** 所属机构 */
    @Column(name = "ORGANID_")
    private String organid;
    
    /**  */
    @Column(name = "ISHASUSER")
    private String ishasuser;
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getAutoid() {
        return this.autoid;
    }
     
    /**
     * 设置
     * 
     * @param autoid
     *          
     */
    public void setAutoid(Integer autoid) {
        this.autoid = autoid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getDepartname() {
        return this.departname;
    }
     
    /**
     * 设置
     * 
     * @param departname
     *          
     */
    public void setDepartname(String departname) {
        this.departname = departname;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getParentid() {
        return this.parentid;
    }
     
    /**
     * 设置
     * 
     * @param parentid
     *          
     */
    public void setParentid(String parentid) {
        this.parentid = parentid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getProperty() {
        return this.property;
    }
     
    /**
     * 设置
     * 
     * @param property
     *          
     */
    public void setProperty(String property) {
        this.property = property;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getPopedom() {
        return this.popedom;
    }
     
    /**
     * 设置
     * 
     * @param popedom
     *          
     */
    public void setPopedom(String popedom) {
        this.popedom = popedom;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getLevel0() {
        return this.level0;
    }
     
    /**
     * 设置
     * 
     * @param level0
     *          
     */
    public void setLevel0(Integer level0) {
        this.level0 = level0;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getFullpath() {
        return this.fullpath;
    }
     
    /**
     * 设置
     * 
     * @param fullpath
     *          
     */
    public void setFullpath(String fullpath) {
        this.fullpath = fullpath;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getUrl() {
        return this.url;
    }
     
    /**
     * 设置
     * 
     * @param url
     *          
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    /**
     * 获取1为分支机构
     * 
     * @return 1为分支机构
     */
    public String getLtype() {
        return this.ltype;
    }
     
    /**
     * 设置1为分支机构
     * 
     * @param ltype
     *          1为分支机构
     */
    public void setLtype(String ltype) {
        this.ltype = ltype;
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
    public String getAddress() {
        return this.address;
    }
     
    /**
     * 设置
     * 
     * @param address
     *          
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getPostalcode() {
        return this.postalcode;
    }
     
    /**
     * 设置
     * 
     * @param postalcode
     *          
     */
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getProjectpopedom() {
        return this.projectpopedom;
    }
     
    /**
     * 设置
     * 
     * @param projectpopedom
     *          
     */
    public void setProjectpopedom(String projectpopedom) {
        this.projectpopedom = projectpopedom;
    }
    
    /**
     * 获取区域ID
     * 
     * @return 区域ID
     */
    public String getAreaid() {
        return this.areaid;
    }
     
    /**
     * 设置区域ID
     * 
     * @param areaid
     *          区域ID
     */
    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getIsleaf() {
        return this.isleaf;
    }
     
    /**
     * 设置
     * 
     * @param isleaf
     *          
     */
    public void setIsleaf(String isleaf) {
        this.isleaf = isleaf;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getRand0() {
        return this.rand0;
    }
     
    /**
     * 设置
     * 
     * @param rand0
     *          
     */
    public void setRand0(String rand0) {
        this.rand0 = rand0;
    }
    
    /**
     * 获取部门缩写
     * 
     * @return 部门缩写
     */
    public String getEnname() {
        return this.enname;
    }
     
    /**
     * 设置部门缩写
     * 
     * @param enname
     *          部门缩写
     */
    public void setEnname(String enname) {
        this.enname = enname;
    }
    
    /**
     * 获取项目信息缺省审批人
     * 
     * @return 项目信息缺省审批人
     */
    public String getProjectapprove() {
        return this.projectapprove;
    }
     
    /**
     * 设置项目信息缺省审批人
     * 
     * @param projectapprove
     *          项目信息缺省审批人
     */
    public void setProjectapprove(String projectapprove) {
        this.projectapprove = projectapprove;
    }
    
    /**
     * 获取预算工时缺省审批人
     * 
     * @return 预算工时缺省审批人
     */
    public String getSchedulingapprove() {
        return this.schedulingapprove;
    }
     
    /**
     * 设置预算工时缺省审批人
     * 
     * @param schedulingapprove
     *          预算工时缺省审批人
     */
    public void setSchedulingapprove(String schedulingapprove) {
        this.schedulingapprove = schedulingapprove;
    }
    
    /**
     * 获取预算费用缺省审批人
     * 
     * @return 预算费用缺省审批人
     */
    public String getCostapprove() {
        return this.costapprove;
    }
     
    /**
     * 设置预算费用缺省审批人
     * 
     * @param costapprove
     *          预算费用缺省审批人
     */
    public void setCostapprove(String costapprove) {
        this.costapprove = costapprove;
    }
    
    /**
     * 获取实际费用缺省审批人
     * 
     * @return 实际费用缺省审批人
     */
    public String getRealityapprove() {
        return this.realityapprove;
    }
     
    /**
     * 设置实际费用缺省审批人
     * 
     * @param realityapprove
     *          实际费用缺省审批人
     */
    public void setRealityapprove(String realityapprove) {
        this.realityapprove = realityapprove;
    }
    
    /**
     * 获取是否有质控部
     * 
     * @return 是否有质控部
     */
    public String getHasqcRadio() {
        return this.hasqcRadio;
    }
     
    /**
     * 设置是否有质控部
     * 
     * @param hasqcRadio
     *          是否有质控部
     */
    public void setHasqcRadio(String hasqcRadio) {
        this.hasqcRadio = hasqcRadio;
    }
    
    /**
     * 获取是否经过分所质控
     * 
     * @return 是否经过分所质控
     */
    public String getQcselfRadio() {
        return this.qcselfRadio;
    }
     
    /**
     * 设置是否经过分所质控
     * 
     * @param qcselfRadio
     *          是否经过分所质控
     */
    public void setQcselfRadio(String qcselfRadio) {
        this.qcselfRadio = qcselfRadio;
    }
    
    /**
     * 获取分所简称,部门可不填
     * 
     * @return 分所简称
     */
    public String getSimplename() {
        return this.simplename;
    }
     
    /**
     * 设置分所简称,部门可不填
     * 
     * @param simplename
     *          分所简称,部门可不填
     */
    public void setSimplename(String simplename) {
        this.simplename = simplename;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getOrdercode() {
        return this.ordercode;
    }
     
    /**
     * 设置
     * 
     * @param ordercode
     *          
     */
    public void setOrdercode(Integer ordercode) {
        this.ordercode = ordercode;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getInitflag() {
        return this.initflag;
    }
     
    /**
     * 设置
     * 
     * @param initflag
     *          
     */
    public void setInitflag(String initflag) {
        this.initflag = initflag;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getTimeflag() {
        return this.timeflag;
    }
     
    /**
     * 设置
     * 
     * @param timeflag
     *          
     */
    public void setTimeflag(String timeflag) {
        this.timeflag = timeflag;
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
     * 获取
     * 
     * @return 
     */
    public String getIshasuser() {
        return this.ishasuser;
    }
     
    /**
     * 设置
     * 
     * @param ishasuser
     *          
     */
    public void setIshasuser(String ishasuser) {
        this.ishasuser = ishasuser;
    }
}