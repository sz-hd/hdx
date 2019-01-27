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
 * (JA_CASEPERSON)
 * 
 * @author bianj
 * @version 1.0.0 2018-12-11
 */
@Table(name = "JA_CASEPERSON")
public class JaCasepersonModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = -1418029289117966993L;
    
    /**  */
    @Column(name = "UUID",isId="true")
    private String uuid;
    
    /**  */
    @Column(name = "MAINFORMID")
    private String mainformid;
    
    /** 身份证号码 */
    @Column(name = "IDENTITYNUMBER")
    private String identitynumber;
    
    /** 姓名 */
    @Column(name = "SUSPECTSNAME")
    private String suspectsname;
    
    /** 性别 */
    @Column(name = "GENDER")
    private String gender;
    
    /** 出身日期 */
    @Column(name = "BIRTH")
    private String birth;
    
    /** 民族 */
    @Column(name = "NATION")
    private String nation;
    
    
    /** 户籍地址  */
    @Column(name = "REGISTER_SITE")
    private String registerSite;
    
    /** 暂时住址 */
    @Column(name = "NOW_SITE")
    private String nowSite;
    
    /** 联系电话 */
    @Column(name = "TELEPHONE")
    private String telephone;
    
    /** 身份核实 */
    @Column(name = "VERIFICATION")
    private String verification;
    
    /**  */
    @Column(name = "FINGERTXT")
    private String fingertxt;
    
    /** 家属通知书号[办案编号] */
    @Column(name = "WORDCODE")
    private String wordcode;
    
    /** 进入时间 */
    @Column(name = "ENTERTIME")
    private String entertime;
    
    /** 年月日 */
    @Column(name = "SDATE1")
    private String sdate1;
    
    /** 年 */
    @Column(name = "SDATE2")
    private String sdate2;
    
    /** 月 */
    @Column(name = "SDATE3")
    private String sdate3;
    
    /** 日 */
    @Column(name = "SDATE4")
    private String sdate4;
    
    /** 时 */
    @Column(name = "SDATE5")
    private String sdate5;
    
    /** 分 */
    @Column(name = "SDATE6")
    private String sdate6;
    
    /** 状态 */
    @Column(name = "STATUS")
    private String status;
    
    /** 状态名称 */
    @Column(name = "STATUSNAME")
    private String statusname;
    
    /** 审核时间 */
    @Column(name = "APPLYTIME")
    private String applytime;
    
    /** 是否完成 */
    @Column(name = "ISFINISH")
    private String isfinish;
    
    /** 人身检查是否完成 */
    @Column(name = "ISURINE")
    private String isurine;
    
    /** 尿检项目是否完成 */
    @Column(name = "ISURINEITEM")
    private String isurineitem;
    
    /** 信息采集是否完成 */
    @Column(name = "ISCOLLECT")
    private String iscollect;
    
    /** 拘留等候是否完成 */
    @Column(name = "ISAWAITDOOR")
    private String isawaitdoor;
    
    /** 讯问询问是否完成 */
    @Column(name = "ISQUESTIONDOOR")
    private String isquestiondoor;
    
    /** 案情处理是否完成 */
    @Column(name = "ISDISPOSE")
    private String isdispose;
    
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
    
    /** 是否带离办案区 */
    @Column(name = "ISOUT")
    private String isout;
    
    /** 是否有带离办案区 */
    @Column(name = "HASOUT")
    private String hasout;
    
    /** 证件类型 */
    @Column(name = "IDCARDTYPE")
    private String idcardtype;
    
    /** 手环号码 */
    @Column(name = "RFCARD_NUM")
    private String rfcardNum;
    
    /** 绑定时间 */
    @Column(name = "RFCARD_BINDTIME")
    private String rfcardBindtime;
    
    /** 是否重点关注人员 */
    @Column(name = "ISATTENTION")
    private String isattention;
    
    /** 疾病名称 */
    @Column(name = "DISEASE")
    private String disease;

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
     * 获取身份证号码
     * 
     * @return 身份证号码
     */
    public String getIdentitynumber() {
        return this.identitynumber;
    }
     
    /**
     * 设置身份证号码
     * 
     * @param identitynumber
     *          身份证号码
     */
    public void setIdentitynumber(String identitynumber) {
        this.identitynumber = identitynumber;
    }
    
    /**
     * 获取姓名
     * 
     * @return 姓名
     */
    public String getSuspectsname() {
        return this.suspectsname;
    }
     
    /**
     * 设置姓名
     * 
     * @param suspectsname
     *          姓名
     */
    public void setSuspectsname(String suspectsname) {
        this.suspectsname = suspectsname;
    }
    
    /**
     * 获取性别
     * 
     * @return 性别
     */
    public String getGender() {
        return this.gender;
    }
     
    /**
     * 设置性别
     * 
     * @param gender
     *          性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
     * 获取出身日期
     * 
     * @return 出身日期
     */
    public String getBirth() {
        return this.birth;
    }
     
    /**
     * 设置出身日期
     * 
     * @param birth
     *          出身日期
     */
    public void setBirth(String birth) {
        this.birth = birth;
    }
    
    /**
     * 获取民族
     * 
     * @return 民族
     */
    public String getNation() {
        return this.nation;
    }
     
    /**
     * 设置民族
     * 
     * @param nation
     *          民族
     */
    public void setNation(String nation) {
        this.nation = nation;
    }
    
    /**
     * 获取户籍地址 
     * 
     * @return 户籍地址 
     */
    public String getRegisterSite() {
        return this.registerSite;
    }
     
    /**
     * 设置户籍地址 
     * 
     * @param registerSite
     *          户籍地址 
     */
    public void setRegisterSite(String registerSite) {
        this.registerSite = registerSite;
    }
    
    /**
     * 获取暂时住址
     * 
     * @return 暂时住址
     */
    public String getNowSite() {
        return this.nowSite;
    }
     
    /**
     * 设置暂时住址
     * 
     * @param nowSite
     *          暂时住址
     */
    public void setNowSite(String nowSite) {
        this.nowSite = nowSite;
    }
    
    /**
     * 获取联系电话
     * 
     * @return 联系电话
     */
    public String getTelephone() {
        return this.telephone;
    }
     
    /**
     * 设置联系电话
     * 
     * @param telephone
     *          联系电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    /**
     * 获取身份核实
     * 
     * @return 身份核实
     */
    public String getVerification() {
        return this.verification;
    }
     
    /**
     * 设置身份核实
     * 
     * @param verification
     *          身份核实
     */
    public void setVerification(String verification) {
        this.verification = verification;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getFingertxt() {
        return this.fingertxt;
    }
     
    /**
     * 设置
     * 
     * @param fingertxt
     *          
     */
    public void setFingertxt(String fingertxt) {
        this.fingertxt = fingertxt;
    }
    
    /**
     * 获取家属通知书号[办案编号]
     * 
     * @return 家属通知书号[办案编号]
     */
    public String getWordcode() {
        return this.wordcode;
    }
     
    /**
     * 设置家属通知书号[办案编号]
     * 
     * @param wordcode
     *          家属通知书号[办案编号]
     */
    public void setWordcode(String wordcode) {
        this.wordcode = wordcode;
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
     * 获取年月日
     * 
     * @return 年月日
     */
    public String getSdate1() {
        return this.sdate1;
    }
     
    /**
     * 设置年月日
     * 
     * @param sdate1
     *          年月日
     */
    public void setSdate1(String sdate1) {
        this.sdate1 = sdate1;
    }
    
    /**
     * 获取年
     * 
     * @return 年
     */
    public String getSdate2() {
        return this.sdate2;
    }
     
    /**
     * 设置年
     * 
     * @param sdate2
     *          年
     */
    public void setSdate2(String sdate2) {
        this.sdate2 = sdate2;
    }
    
    /**
     * 获取月
     * 
     * @return 月
     */
    public String getSdate3() {
        return this.sdate3;
    }
     
    /**
     * 设置月
     * 
     * @param sdate3
     *          月
     */
    public void setSdate3(String sdate3) {
        this.sdate3 = sdate3;
    }
    
    /**
     * 获取日
     * 
     * @return 日
     */
    public String getSdate4() {
        return this.sdate4;
    }
     
    /**
     * 设置日
     * 
     * @param sdate4
     *          日
     */
    public void setSdate4(String sdate4) {
        this.sdate4 = sdate4;
    }
    
    /**
     * 获取时
     * 
     * @return 时
     */
    public String getSdate5() {
        return this.sdate5;
    }
     
    /**
     * 设置时
     * 
     * @param sdate5
     *          时
     */
    public void setSdate5(String sdate5) {
        this.sdate5 = sdate5;
    }
    
    /**
     * 获取分
     * 
     * @return 分
     */
    public String getSdate6() {
        return this.sdate6;
    }
     
    /**
     * 设置分
     * 
     * @param sdate6
     *          分
     */
    public void setSdate6(String sdate6) {
        this.sdate6 = sdate6;
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
     * 获取是否完成
     * 
     * @return 是否完成
     */
    public String getIsfinish() {
        return this.isfinish;
    }
     
    /**
     * 设置是否完成
     * 
     * @param isfinish
     *          是否完成
     */
    public void setIsfinish(String isfinish) {
        this.isfinish = isfinish;
    }
    
    /**
     * 获取人身检查是否完成
     * 
     * @return 人身检查是否完成
     */
    public String getIsurine() {
        return this.isurine;
    }
     
    /**
     * 设置人身检查是否完成
     * 
     * @param isurine
     *          人身检查是否完成
     */
    public void setIsurine(String isurine) {
        this.isurine = isurine;
    }
    
    /**
     * 获取尿检项目是否完成
     * 
     * @return 尿检项目是否完成
     */
    public String getIsurineitem() {
        return this.isurineitem;
    }
     
    /**
     * 设置尿检项目是否完成
     * 
     * @param isurineitem
     *          尿检项目是否完成
     */
    public void setIsurineitem(String isurineitem) {
        this.isurineitem = isurineitem;
    }
    
    /**
     * 获取信息采集是否完成
     * 
     * @return 信息采集是否完成
     */
    public String getIscollect() {
        return this.iscollect;
    }
     
    /**
     * 设置信息采集是否完成
     * 
     * @param iscollect
     *          信息采集是否完成
     */
    public void setIscollect(String iscollect) {
        this.iscollect = iscollect;
    }
    
    /**
     * 获取拘留等候是否完成
     * 
     * @return 拘留等候是否完成
     */
    public String getIsawaitdoor() {
        return this.isawaitdoor;
    }
     
    /**
     * 设置拘留等候是否完成
     * 
     * @param isawaitdoor
     *          拘留等候是否完成
     */
    public void setIsawaitdoor(String isawaitdoor) {
        this.isawaitdoor = isawaitdoor;
    }
    
    /**
     * 获取讯问询问是否完成
     * 
     * @return 讯问询问是否完成
     */
    public String getIsquestiondoor() {
        return this.isquestiondoor;
    }
     
    /**
     * 设置讯问询问是否完成
     * 
     * @param isquestiondoor
     *          讯问询问是否完成
     */
    public void setIsquestiondoor(String isquestiondoor) {
        this.isquestiondoor = isquestiondoor;
    }
    
    /**
     * 获取案情处理是否完成
     * 
     * @return 案情处理是否完成
     */
    public String getIsdispose() {
        return this.isdispose;
    }
     
    /**
     * 设置案情处理是否完成
     * 
     * @param isdispose
     *          案情处理是否完成
     */
    public void setIsdispose(String isdispose) {
        this.isdispose = isdispose;
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
     * 获取是否带离办案区
     * 
     * @return 是否带离办案区
     */
    public String getIsout() {
        return this.isout;
    }
     
    /**
     * 设置是否带离办案区
     * 
     * @param isout
     *          是否带离办案区
     */
    public void setIsout(String isout) {
        this.isout = isout;
    }
    
    /**
     * 获取是否有带离办案区
     * 
     * @return 是否有带离办案区
     */
    public String getHasout() {
        return this.hasout;
    }
     
    /**
     * 设置是否有带离办案区
     * 
     * @param hasout
     *          是否有带离办案区
     */
    public void setHasout(String hasout) {
        this.hasout = hasout;
    }
    
    /**
     * 获取证件类型
     * 
     * @return 证件类型
     */
    public String getIdcardtype() {
        return this.idcardtype;
    }
     
    /**
     * 设置证件类型
     * 
     * @param idcardtype
     *          证件类型
     */
    public void setIdcardtype(String idcardtype) {
        this.idcardtype = idcardtype;
    }
    
    /**
     * 获取手环号码
     * 
     * @return 手环号码
     */
    public String getRfcardNum() {
        return this.rfcardNum;
    }
     
    /**
     * 设置手环号码
     * 
     * @param rfcardNum
     *          手环号码
     */
    public void setRfcardNum(String rfcardNum) {
        this.rfcardNum = rfcardNum;
    }
    
    /**
     * 获取绑定时间
     * 
     * @return 绑定时间
     */
    public String getRfcardBindtime() {
        return this.rfcardBindtime;
    }
     
    /**
     * 设置绑定时间
     * 
     * @param rfcardBindtime
     *          绑定时间
     */
    public void setRfcardBindtime(String rfcardBindtime) {
        this.rfcardBindtime = rfcardBindtime;
    }
    
    /**
     * 获取是否重点关注人员
     * 
     * @return 是否重点关注人员
     */
    public String getIsattention() {
        return this.isattention;
    }
     
    /**
     * 设置是否重点关注人员
     * 
     * @param isattention
     *          是否重点关注人员
     */
    public void setIsattention(String isattention) {
        this.isattention = isattention;
    }
    
    /**
     * 获取疾病名称
     * 
     * @return 疾病名称
     */
    public String getDisease() {
        return this.disease;
    }
     
    /**
     * 设置疾病名称
     * 
     * @param disease
     *          疾病名称
     */
    public void setDisease(String disease) {
        this.disease = disease;
    }
}