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
 * 笔录嫌疑人扩展表(BL_CASEPERSONEXT)
 */
@Table(name = "BL_CASEPERSONEXT")
public class BlCasepersonextModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = 4388206556232345070L;
    
    /**  */
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    @Column(name = "ID")
    private Long id;
    
    /**  */
    @Column(name = "UUID",isId="true")
    private String uuid;
    
    /**  */
    @Column(name = "casepersonId")
    private String casepersonId;
    
    /**  */
    @Column(name = "IDENTITYNUMBER")
    private String identitynumber;
    
    /**  */
    @Column(name = "IDCARDTYPE")
    private String idcardtype;
    
    /**  */
    @Column(name = "NAME")
    private String name;
    
    /**  */
    @Column(name = "GENDER")
    private String gender;
    
    /**  */
    @Column(name = "BIRTH")
    private String birth;
    
    /**  */
    @Column(name = "AGE")
    private Integer age;
    
    /**  */
    @Column(name = "NATION")
    private String nation;
    
    /**  */
    @Column(name = "NATIONALITY")
    private String nationality;
    
    /**  */
    @Column(name = "REGISTER_SITE")
    private String registerSite;
    
    /**  */
    @Column(name = "NOW_SITE")
    private String nowSite;
    
    /**  */
    @Column(name = "TELEPHONE")
    private String telephone;
    
    /**  */
    @Column(name = "STATUS")
    private String status;
    
    /**  */
    @Column(name = "REMARK")
    private String remark;
    
    /**  */
    @Column(name = "ORGID")
    private String orgid;
    
    /**  */
    @Column(name = "CTYPE")
    private Integer ctype;
    
    /**  */
    @Column(name = "WORKUNIT")
    private String workunit;
    
    /**  */
    @Column(name = "FYLANGUAGE")
    private String fylanguage;
    
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
    public String getCasepersonId() {
        return this.casepersonId;
    }
     
    /**
     * 设置
     * 
     * @param casepersonId
     *          
     */
    public void setCasepersonId(String casepersonId) {
        this.casepersonId = casepersonId;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getIdentitynumber() {
        return this.identitynumber;
    }
     
    /**
     * 设置
     * 
     * @param identitynumber
     *          
     */
    public void setIdentitynumber(String identitynumber) {
        this.identitynumber = identitynumber;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getIdcardtype() {
        return this.idcardtype;
    }
     
    /**
     * 设置
     * 
     * @param idcardtype
     *          
     */
    public void setIdcardtype(String idcardtype) {
        this.idcardtype = idcardtype;
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
    public String getGender() {
        return this.gender;
    }
     
    /**
     * 设置
     * 
     * @param gender
     *          
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getBirth() {
        return this.birth;
    }
     
    /**
     * 设置
     * 
     * @param birth
     *          
     */
    public void setBirth(String birth) {
        this.birth = birth;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getAge() {
        return this.age;
    }
     
    /**
     * 设置
     * 
     * @param age
     *          
     */
    public void setAge(Integer age) {
        this.age = age;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getNation() {
        return this.nation;
    }
     
    /**
     * 设置
     * 
     * @param nation
     *          
     */
    public void setNation(String nation) {
        this.nation = nation;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getNationality() {
        return this.nationality;
    }
     
    /**
     * 设置
     * 
     * @param nationality
     *          
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getRegisterSite() {
        return this.registerSite;
    }
     
    /**
     * 设置
     * 
     * @param registerSite
     *          
     */
    public void setRegisterSite(String registerSite) {
        this.registerSite = registerSite;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getNowSite() {
        return this.nowSite;
    }
     
    /**
     * 设置
     * 
     * @param nowSite
     *          
     */
    public void setNowSite(String nowSite) {
        this.nowSite = nowSite;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getTelephone() {
        return this.telephone;
    }
     
    /**
     * 设置
     * 
     * @param telephone
     *          
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getStatus() {
        return this.status;
    }
     
    /**
     * 设置
     * 
     * @param status
     *          
     */
    public void setStatus(String status) {
        this.status = status;
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
    public Integer getCtype() {
        return this.ctype;
    }
     
    /**
     * 设置
     * 
     * @param ctype
     *          
     */
    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getWorkunit() {
        return this.workunit;
    }
     
    /**
     * 设置
     * 
     * @param workunit
     *          
     */
    public void setWorkunit(String workunit) {
        this.workunit = workunit;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getFylanguage() {
        return this.fylanguage;
    }
     
    /**
     * 设置
     * 
     * @param fylanguage
     *          
     */
    public void setFylanguage(String fylanguage) {
        this.fylanguage = fylanguage;
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