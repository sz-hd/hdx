package com.twis.model;

/**
 * (K_ORGAN)
 * 
 * @author bianj
 * @version 1.0.0 2018-12-09
 */
@Table(name = "K_ORGAN")
public class KOrganModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = -3336946013567932456L;
    
    /**  */
    @Column(name = "DEPARTID")
    private String departid;
    
    /**  */
    @Column(name = "DEPARTNAME")
    private String departname;
    
    /**  */
    @Column(name = "DEPARTENNAME")
    private String departenname;
    
    /**  */
    @Column(name = "VOCATIONID")
    private String vocationid;
    
    /**  */
    @Column(name = "ADDRESS")
    private String address;
    
    /**  */
    @Column(name = "CORPORATE")
    private String corporate;
    
    /**  */
    @Column(name = "COUNTRYCESS")
    private String countrycess;
    
    /**  */
    @Column(name = "EMAIL")
    private String email;
    
    /**  */
    @Column(name = "TERRACESS")
    private String terracess;
    
    /**  */
    @Column(name = "ENTERPRISECODE")
    private String enterprisecode;
    
    /**  */
    @Column(name = "DEPARTDATE")
    private String departdate;
    
    /**  */
    @Column(name = "LOGINADDRESS")
    private String loginaddress;
    
    /**  */
    @Column(name = "BUSINESSBEGIN")
    private String businessbegin;
    
    /**  */
    @Column(name = "LINKMAN")
    private String linkman;
    
    /**  */
    @Column(name = "BUSINESSEND")
    private String businessend;
    
    /**  */
    @Column(name = "PHONE")
    private String phone;
    
    /**  */
    @Column(name = "BUSINESSBOUND")
    private String businessbound;
    
    /**  */
    @Column(name = "PROPERTY")
    private String property;
    
    /**  */
    @Column(name = "REMARK")
    private String remark;
    
    /**  */
    @Column(name = "PARENTDEPARTID")
    private String parentdepartid;
    
    /**  */
    @Column(name = "ISCOLLECT")
    private String iscollect;
    
    /**  */
    @Column(name = "ALIAS")
    private String alias;
    
    /**  */
    @Column(name = "BPR")
    private String bpr;
    
    /**  */
    @Column(name = "REGISTER")
    private String register;
    
    /**  */
    @Column(name = "STOCKOWNER")
    private String stockowner;
    
    /**  */
    @Column(name = "POSTALCODE")
    private String postalcode;
    
    /**  */
    @Column(name = "FAX")
    private String fax;
    
    /**  */
    @Column(name = "TAXPAYER")
    private String taxpayer;
    
    /**  */
    @Column(name = "STANDBYNAME")
    private String standbyname;
    
    /**  */
    @Column(name = "HYLX")
    private String hylx;
    
    /**  */
    @Column(name = "CURNAME")
    private String curname;
    
    /**  */
    @Column(name = "RECORDTIME")
    private String recordtime;
    
    /**  */
    @Column(name = "CUSTOMERLEVEL")
    private String customerlevel;
    
    /**  */
    @Column(name = "DEPARTCODE")
    private Integer departcode;
    
    /**  */
    @Column(name = "PRACTITIONER")
    private String practitioner;
    
    /**  */
    @Column(name = "FASHION")
    private String fashion;
    
    /**  */
    @Column(name = "CALLING")
    private String calling;
    
    /**  */
    @Column(name = "ESTATE")
    private String estate;
    
    /**  */
    @Column(name = "APPROACH")
    private String approach;
    
    /**  */
    @Column(name = "MOSTLY")
    private String mostly;
    
    /**  */
    @Column(name = "SUBORDINATION")
    private String subordination;
    
    /**  */
    @Column(name = "DEFINEID")
    private String defineid;
    
    /**  */
    @Column(name = "FULLPATHID")
    private String fullpathid;
    
    /**  */
    @Column(name = "URL")
    private String url;
    
    /**  */
    @Column(name = "PROPETY")
    private String propety;
    
    /**  */
    @Column(name = "businessArea")
    private String businessArea;
    
    /**  */
    @Column(name = "groupName")
    private String groupName;
    
    /**  */
    @Column(name = "DEPARTMENTID")
    private String departmentid;
    
    /**  */
    @Column(name = "beforeName")
    private String beforeName;
    
    /**  */
    @Column(name = "customerShortName")
    private String customerShortName;
    
    /**  */
    @Column(name = "IFRAMEWORK")
    private String iframework;
    
    /**  */
    @Column(name = "PLATE")
    private String plate;
    
    /**  */
    @Column(name = "INTRO")
    private String intro;
    
    /**  */
    @Column(name = "parentName")
    private String parentName;
    
    /**  */
    @Column(name = "HOLDING")
    private String holding;
    
    /**  */
    @Column(name = "companyProperty")
    private String companyProperty;
    
    /**  */
    @Column(name = "sMarket")
    private String sMarket;
    
    /**  */
    @Column(name = "sockCode")
    private String sockCode;
    
    /**  */
    @Column(name = "customerIeve")
    private String customerIeve;
    
    /**  */
    @Column(name = "webSite")
    private String webSite;
    
    /**  */
    @Column(name = "STATE")
    private String state;
    
    /**  */
    @Column(name = "projectState")
    private String projectState;
    
    /**  */
    @Column(name = "iTmentName")
    private String iTmentName;
    
    /**  */
    @Column(name = "AGENCY")
    private String agency;
    
    /**  */
    @Column(name = "aStateDate")
    private String aStateDate;
    
    /**  */
    @Column(name = "busineLicense")
    private String busineLicense;
    
    /**  */
    @Column(name = "bstateDate")
    private String bstateDate;
    
    /**  */
    @Column(name = "directorName")
    private String directorName;
    
    /**  */
    @Column(name = "directorPhone")
    private String directorPhone;
    
    /**  */
    @Column(name = "dSecretary")
    private String dSecretary;
    
    /**  */
    @Column(name = "secretaryPhone")
    private String secretaryPhone;
    
    /**  */
    @Column(name = "ctaffQuantity")
    private String ctaffQuantity;
    
    /**  */
    @Column(name = "sAccountant")
    private String sAccountant;
    
    /**  */
    @Column(name = "fDirector")
    private String fDirector;
    
    /**  */
    @Column(name = "accountanrPhone")
    private String accountanrPhone;
    
    /**  */
    @Column(name = "fManager")
    private String fManager;
    
    /**  */
    @Column(name = "fPhone")
    private String fPhone;
    
    /**  */
    @Column(name = "stockStartDate")
    private String stockStartDate;
    
    /**  */
    @Column(name = "stockListingDate")
    private String stockListingDate;
    
    /**  */
    @Column(name = "pOfficeAddress")
    private String pOfficeAddress;
    
    /**  */
    @Column(name = "cOfficeAddress")
    private String cOfficeAddress;
    
    /**  */
    @Column(name = "fbusineDate")
    private String fbusineDate;
    
    /**  */
    @Column(name = "ISCHANGE")
    private String ischange;
    
    /**  */
    @Column(name = "EXPLAIN")
    private String explain;
    
    /**  */
    @Column(name = "mergerQuantity")
    private String mergerQuantity;
    
    /**  */
    @Column(name = "agoOffice")
    private String agoOffice;
    
    /**  */
    @Column(name = "cReason")
    private String cReason;
    
    /**  */
    @Column(name = "GROUPPLATE")
    private String groupplate;
    
    /**  */
    @Column(name = "INNERCODE")
    private String innercode;
    
    /**  */
    @Column(name = "ISHASDEPT")
    private String ishasdept;
    
    /**  */
    @Column(name = "ISHASUSER")
    private String ishasuser;
    
    /**  */
    @Column(name = "CTLDEPARTID")
    private String ctldepartid;
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getDepartid() {
        return this.departid;
    }
     
    /**
     * 设置
     * 
     * @param departid
     *          
     */
    public void setDepartid(String departid) {
        this.departid = departid;
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
    public String getDepartenname() {
        return this.departenname;
    }
     
    /**
     * 设置
     * 
     * @param departenname
     *          
     */
    public void setDepartenname(String departenname) {
        this.departenname = departenname;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getVocationid() {
        return this.vocationid;
    }
     
    /**
     * 设置
     * 
     * @param vocationid
     *          
     */
    public void setVocationid(String vocationid) {
        this.vocationid = vocationid;
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
    public String getCorporate() {
        return this.corporate;
    }
     
    /**
     * 设置
     * 
     * @param corporate
     *          
     */
    public void setCorporate(String corporate) {
        this.corporate = corporate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getCountrycess() {
        return this.countrycess;
    }
     
    /**
     * 设置
     * 
     * @param countrycess
     *          
     */
    public void setCountrycess(String countrycess) {
        this.countrycess = countrycess;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getEmail() {
        return this.email;
    }
     
    /**
     * 设置
     * 
     * @param email
     *          
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getTerracess() {
        return this.terracess;
    }
     
    /**
     * 设置
     * 
     * @param terracess
     *          
     */
    public void setTerracess(String terracess) {
        this.terracess = terracess;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getEnterprisecode() {
        return this.enterprisecode;
    }
     
    /**
     * 设置
     * 
     * @param enterprisecode
     *          
     */
    public void setEnterprisecode(String enterprisecode) {
        this.enterprisecode = enterprisecode;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getDepartdate() {
        return this.departdate;
    }
     
    /**
     * 设置
     * 
     * @param departdate
     *          
     */
    public void setDepartdate(String departdate) {
        this.departdate = departdate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getLoginaddress() {
        return this.loginaddress;
    }
     
    /**
     * 设置
     * 
     * @param loginaddress
     *          
     */
    public void setLoginaddress(String loginaddress) {
        this.loginaddress = loginaddress;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getBusinessbegin() {
        return this.businessbegin;
    }
     
    /**
     * 设置
     * 
     * @param businessbegin
     *          
     */
    public void setBusinessbegin(String businessbegin) {
        this.businessbegin = businessbegin;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getLinkman() {
        return this.linkman;
    }
     
    /**
     * 设置
     * 
     * @param linkman
     *          
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getBusinessend() {
        return this.businessend;
    }
     
    /**
     * 设置
     * 
     * @param businessend
     *          
     */
    public void setBusinessend(String businessend) {
        this.businessend = businessend;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getPhone() {
        return this.phone;
    }
     
    /**
     * 设置
     * 
     * @param phone
     *          
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getBusinessbound() {
        return this.businessbound;
    }
     
    /**
     * 设置
     * 
     * @param businessbound
     *          
     */
    public void setBusinessbound(String businessbound) {
        this.businessbound = businessbound;
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
    public String getParentdepartid() {
        return this.parentdepartid;
    }
     
    /**
     * 设置
     * 
     * @param parentdepartid
     *          
     */
    public void setParentdepartid(String parentdepartid) {
        this.parentdepartid = parentdepartid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getIscollect() {
        return this.iscollect;
    }
     
    /**
     * 设置
     * 
     * @param iscollect
     *          
     */
    public void setIscollect(String iscollect) {
        this.iscollect = iscollect;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getAlias() {
        return this.alias;
    }
     
    /**
     * 设置
     * 
     * @param alias
     *          
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getBpr() {
        return this.bpr;
    }
     
    /**
     * 设置
     * 
     * @param bpr
     *          
     */
    public void setBpr(String bpr) {
        this.bpr = bpr;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getRegister() {
        return this.register;
    }
     
    /**
     * 设置
     * 
     * @param register
     *          
     */
    public void setRegister(String register) {
        this.register = register;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getStockowner() {
        return this.stockowner;
    }
     
    /**
     * 设置
     * 
     * @param stockowner
     *          
     */
    public void setStockowner(String stockowner) {
        this.stockowner = stockowner;
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
    public String getFax() {
        return this.fax;
    }
     
    /**
     * 设置
     * 
     * @param fax
     *          
     */
    public void setFax(String fax) {
        this.fax = fax;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getTaxpayer() {
        return this.taxpayer;
    }
     
    /**
     * 设置
     * 
     * @param taxpayer
     *          
     */
    public void setTaxpayer(String taxpayer) {
        this.taxpayer = taxpayer;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getStandbyname() {
        return this.standbyname;
    }
     
    /**
     * 设置
     * 
     * @param standbyname
     *          
     */
    public void setStandbyname(String standbyname) {
        this.standbyname = standbyname;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getHylx() {
        return this.hylx;
    }
     
    /**
     * 设置
     * 
     * @param hylx
     *          
     */
    public void setHylx(String hylx) {
        this.hylx = hylx;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getCurname() {
        return this.curname;
    }
     
    /**
     * 设置
     * 
     * @param curname
     *          
     */
    public void setCurname(String curname) {
        this.curname = curname;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getRecordtime() {
        return this.recordtime;
    }
     
    /**
     * 设置
     * 
     * @param recordtime
     *          
     */
    public void setRecordtime(String recordtime) {
        this.recordtime = recordtime;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getCustomerlevel() {
        return this.customerlevel;
    }
     
    /**
     * 设置
     * 
     * @param customerlevel
     *          
     */
    public void setCustomerlevel(String customerlevel) {
        this.customerlevel = customerlevel;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getDepartcode() {
        return this.departcode;
    }
     
    /**
     * 设置
     * 
     * @param departcode
     *          
     */
    public void setDepartcode(Integer departcode) {
        this.departcode = departcode;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getPractitioner() {
        return this.practitioner;
    }
     
    /**
     * 设置
     * 
     * @param practitioner
     *          
     */
    public void setPractitioner(String practitioner) {
        this.practitioner = practitioner;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getFashion() {
        return this.fashion;
    }
     
    /**
     * 设置
     * 
     * @param fashion
     *          
     */
    public void setFashion(String fashion) {
        this.fashion = fashion;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getCalling() {
        return this.calling;
    }
     
    /**
     * 设置
     * 
     * @param calling
     *          
     */
    public void setCalling(String calling) {
        this.calling = calling;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getEstate() {
        return this.estate;
    }
     
    /**
     * 设置
     * 
     * @param estate
     *          
     */
    public void setEstate(String estate) {
        this.estate = estate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getApproach() {
        return this.approach;
    }
     
    /**
     * 设置
     * 
     * @param approach
     *          
     */
    public void setApproach(String approach) {
        this.approach = approach;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getMostly() {
        return this.mostly;
    }
     
    /**
     * 设置
     * 
     * @param mostly
     *          
     */
    public void setMostly(String mostly) {
        this.mostly = mostly;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getSubordination() {
        return this.subordination;
    }
     
    /**
     * 设置
     * 
     * @param subordination
     *          
     */
    public void setSubordination(String subordination) {
        this.subordination = subordination;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getDefineid() {
        return this.defineid;
    }
     
    /**
     * 设置
     * 
     * @param defineid
     *          
     */
    public void setDefineid(String defineid) {
        this.defineid = defineid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getFullpathid() {
        return this.fullpathid;
    }
     
    /**
     * 设置
     * 
     * @param fullpathid
     *          
     */
    public void setFullpathid(String fullpathid) {
        this.fullpathid = fullpathid;
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
     * 获取
     * 
     * @return 
     */
    public String getPropety() {
        return this.propety;
    }
     
    /**
     * 设置
     * 
     * @param propety
     *          
     */
    public void setPropety(String propety) {
        this.propety = propety;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getBusinessArea() {
        return this.businessArea;
    }
     
    /**
     * 设置
     * 
     * @param businessArea
     *          
     */
    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getGroupName() {
        return this.groupName;
    }
     
    /**
     * 设置
     * 
     * @param groupName
     *          
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getDepartmentid() {
        return this.departmentid;
    }
     
    /**
     * 设置
     * 
     * @param departmentid
     *          
     */
    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getBeforeName() {
        return this.beforeName;
    }
     
    /**
     * 设置
     * 
     * @param beforeName
     *          
     */
    public void setBeforeName(String beforeName) {
        this.beforeName = beforeName;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getCustomerShortName() {
        return this.customerShortName;
    }
     
    /**
     * 设置
     * 
     * @param customerShortName
     *          
     */
    public void setCustomerShortName(String customerShortName) {
        this.customerShortName = customerShortName;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getIframework() {
        return this.iframework;
    }
     
    /**
     * 设置
     * 
     * @param iframework
     *          
     */
    public void setIframework(String iframework) {
        this.iframework = iframework;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getPlate() {
        return this.plate;
    }
     
    /**
     * 设置
     * 
     * @param plate
     *          
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getIntro() {
        return this.intro;
    }
     
    /**
     * 设置
     * 
     * @param intro
     *          
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getParentName() {
        return this.parentName;
    }
     
    /**
     * 设置
     * 
     * @param parentName
     *          
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getHolding() {
        return this.holding;
    }
     
    /**
     * 设置
     * 
     * @param holding
     *          
     */
    public void setHolding(String holding) {
        this.holding = holding;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getCompanyProperty() {
        return this.companyProperty;
    }
     
    /**
     * 设置
     * 
     * @param companyProperty
     *          
     */
    public void setCompanyProperty(String companyProperty) {
        this.companyProperty = companyProperty;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getSMarket() {
        return this.sMarket;
    }
     
    /**
     * 设置
     * 
     * @param sMarket
     *          
     */
    public void setSMarket(String sMarket) {
        this.sMarket = sMarket;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getSockCode() {
        return this.sockCode;
    }
     
    /**
     * 设置
     * 
     * @param sockCode
     *          
     */
    public void setSockCode(String sockCode) {
        this.sockCode = sockCode;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getCustomerIeve() {
        return this.customerIeve;
    }
     
    /**
     * 设置
     * 
     * @param customerIeve
     *          
     */
    public void setCustomerIeve(String customerIeve) {
        this.customerIeve = customerIeve;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getWebSite() {
        return this.webSite;
    }
     
    /**
     * 设置
     * 
     * @param webSite
     *          
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getState() {
        return this.state;
    }
     
    /**
     * 设置
     * 
     * @param state
     *          
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getProjectState() {
        return this.projectState;
    }
     
    /**
     * 设置
     * 
     * @param projectState
     *          
     */
    public void setProjectState(String projectState) {
        this.projectState = projectState;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getITmentName() {
        return this.iTmentName;
    }
     
    /**
     * 设置
     * 
     * @param iTmentName
     *          
     */
    public void setITmentName(String iTmentName) {
        this.iTmentName = iTmentName;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getAgency() {
        return this.agency;
    }
     
    /**
     * 设置
     * 
     * @param agency
     *          
     */
    public void setAgency(String agency) {
        this.agency = agency;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getAStateDate() {
        return this.aStateDate;
    }
     
    /**
     * 设置
     * 
     * @param aStateDate
     *          
     */
    public void setAStateDate(String aStateDate) {
        this.aStateDate = aStateDate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getBusineLicense() {
        return this.busineLicense;
    }
     
    /**
     * 设置
     * 
     * @param busineLicense
     *          
     */
    public void setBusineLicense(String busineLicense) {
        this.busineLicense = busineLicense;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getBstateDate() {
        return this.bstateDate;
    }
     
    /**
     * 设置
     * 
     * @param bstateDate
     *          
     */
    public void setBstateDate(String bstateDate) {
        this.bstateDate = bstateDate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getDirectorName() {
        return this.directorName;
    }
     
    /**
     * 设置
     * 
     * @param directorName
     *          
     */
    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getDirectorPhone() {
        return this.directorPhone;
    }
     
    /**
     * 设置
     * 
     * @param directorPhone
     *          
     */
    public void setDirectorPhone(String directorPhone) {
        this.directorPhone = directorPhone;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getDSecretary() {
        return this.dSecretary;
    }
     
    /**
     * 设置
     * 
     * @param dSecretary
     *          
     */
    public void setDSecretary(String dSecretary) {
        this.dSecretary = dSecretary;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getSecretaryPhone() {
        return this.secretaryPhone;
    }
     
    /**
     * 设置
     * 
     * @param secretaryPhone
     *          
     */
    public void setSecretaryPhone(String secretaryPhone) {
        this.secretaryPhone = secretaryPhone;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getCtaffQuantity() {
        return this.ctaffQuantity;
    }
     
    /**
     * 设置
     * 
     * @param ctaffQuantity
     *          
     */
    public void setCtaffQuantity(String ctaffQuantity) {
        this.ctaffQuantity = ctaffQuantity;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getSAccountant() {
        return this.sAccountant;
    }
     
    /**
     * 设置
     * 
     * @param sAccountant
     *          
     */
    public void setSAccountant(String sAccountant) {
        this.sAccountant = sAccountant;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getFDirector() {
        return this.fDirector;
    }
     
    /**
     * 设置
     * 
     * @param fDirector
     *          
     */
    public void setFDirector(String fDirector) {
        this.fDirector = fDirector;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getAccountanrPhone() {
        return this.accountanrPhone;
    }
     
    /**
     * 设置
     * 
     * @param accountanrPhone
     *          
     */
    public void setAccountanrPhone(String accountanrPhone) {
        this.accountanrPhone = accountanrPhone;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getFManager() {
        return this.fManager;
    }
     
    /**
     * 设置
     * 
     * @param fManager
     *          
     */
    public void setFManager(String fManager) {
        this.fManager = fManager;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getFPhone() {
        return this.fPhone;
    }
     
    /**
     * 设置
     * 
     * @param fPhone
     *          
     */
    public void setFPhone(String fPhone) {
        this.fPhone = fPhone;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getStockStartDate() {
        return this.stockStartDate;
    }
     
    /**
     * 设置
     * 
     * @param stockStartDate
     *          
     */
    public void setStockStartDate(String stockStartDate) {
        this.stockStartDate = stockStartDate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getStockListingDate() {
        return this.stockListingDate;
    }
     
    /**
     * 设置
     * 
     * @param stockListingDate
     *          
     */
    public void setStockListingDate(String stockListingDate) {
        this.stockListingDate = stockListingDate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getPOfficeAddress() {
        return this.pOfficeAddress;
    }
     
    /**
     * 设置
     * 
     * @param pOfficeAddress
     *          
     */
    public void setPOfficeAddress(String pOfficeAddress) {
        this.pOfficeAddress = pOfficeAddress;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getCOfficeAddress() {
        return this.cOfficeAddress;
    }
     
    /**
     * 设置
     * 
     * @param cOfficeAddress
     *          
     */
    public void setCOfficeAddress(String cOfficeAddress) {
        this.cOfficeAddress = cOfficeAddress;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getFbusineDate() {
        return this.fbusineDate;
    }
     
    /**
     * 设置
     * 
     * @param fbusineDate
     *          
     */
    public void setFbusineDate(String fbusineDate) {
        this.fbusineDate = fbusineDate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getIschange() {
        return this.ischange;
    }
     
    /**
     * 设置
     * 
     * @param ischange
     *          
     */
    public void setIschange(String ischange) {
        this.ischange = ischange;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getExplain() {
        return this.explain;
    }
     
    /**
     * 设置
     * 
     * @param explain
     *          
     */
    public void setExplain(String explain) {
        this.explain = explain;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getMergerQuantity() {
        return this.mergerQuantity;
    }
     
    /**
     * 设置
     * 
     * @param mergerQuantity
     *          
     */
    public void setMergerQuantity(String mergerQuantity) {
        this.mergerQuantity = mergerQuantity;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getAgoOffice() {
        return this.agoOffice;
    }
     
    /**
     * 设置
     * 
     * @param agoOffice
     *          
     */
    public void setAgoOffice(String agoOffice) {
        this.agoOffice = agoOffice;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getCReason() {
        return this.cReason;
    }
     
    /**
     * 设置
     * 
     * @param cReason
     *          
     */
    public void setCReason(String cReason) {
        this.cReason = cReason;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getGroupplate() {
        return this.groupplate;
    }
     
    /**
     * 设置
     * 
     * @param groupplate
     *          
     */
    public void setGroupplate(String groupplate) {
        this.groupplate = groupplate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getInnercode() {
        return this.innercode;
    }
     
    /**
     * 设置
     * 
     * @param innercode
     *          
     */
    public void setInnercode(String innercode) {
        this.innercode = innercode;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getIshasdept() {
        return this.ishasdept;
    }
     
    /**
     * 设置
     * 
     * @param ishasdept
     *          
     */
    public void setIshasdept(String ishasdept) {
        this.ishasdept = ishasdept;
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
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getCtldepartid() {
        return this.ctldepartid;
    }
     
    /**
     * 设置
     * 
     * @param ctldepartid
     *          
     */
    public void setCtldepartid(String ctldepartid) {
        this.ctldepartid = ctldepartid;
    }
}