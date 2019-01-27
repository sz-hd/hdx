package com.twis.model;

/**
 * (K_USER)
 * 
 * @author bianj
 * @version 1.0.0 2018-12-09
 */
@Table(name = "K_USER")
public class KUserModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = 4951153123725353847L;
    
    /**  */
    @Column(name = "ID")
    private Long id;
    
    /**  */
    @Column(name = "NAME")
    private String name;
    
    /**  */
    @Column(name = "LOGINID")
    private String loginid;
    
    /**  */
    @Column(name = "PASSWORD")
    private String password;
    
    /**  */
    @Column(name = "SEX")
    private String sex;
    
    /**  */
    @Column(name = "BORNDATE")
    private String borndate;
    
    /**  */
    @Column(name = "EDUCATIONAL")
    private String educational;
    
    /**  */
    @Column(name = "DIPLOMA")
    private String diploma;
    
    /**  */
    @Column(name = "DEPARTID")
    private String departid;
    
    /**  */
    @Column(name = "RANK")
    private String rank;
    
    /**  */
    @Column(name = "POST")
    private String post;
    
    /**  */
    @Column(name = "SPECIALTY")
    private String specialty;
    
    /**  */
    @Column(name = "PARENTGROUP")
    private String parentgroup;
    
    /**  */
    @Column(name = "POPEDOM")
    private String popedom;
    
    /**  */
    @Column(name = "ISTIPS")
    private String istips;
    
    /**  */
    @Column(name = "DEPARTMENTID")
    private String departmentid;
    
    /**  */
    @Column(name = "PROJECTPOPEDOM")
    private String projectpopedom;
    
    /**  */
    @Column(name = "clientDogSysUi")
    private String clientDogSysUi;
    
    /**  */
    @Column(name = "STATE")
    private String state;
    
    /**  */
    @Column(name = "userPhoto")
    private String userPhoto;
    
    /**  */
    @Column(name = "userPhotoTemp")
    private String userPhotoTemp;
    
    /**  */
    @Column(name = "mobilePhone")
    private String mobilePhone;
    
    /**  */
    @Column(name = "PHONE")
    private String phone;
    
    /**  */
    @Column(name = "EMAIL")
    private String email;
    
    /**  */
    @Column(name = "CPANO")
    private String cpano;
    
    /** 楼层 */
    @Column(name = "FLOOR")
    private String floor;
    
    /** 房间号 */
    @Column(name = "HOUSE")
    private String house;
    
    /** 工位号 */
    @Column(name = "STATION")
    private String station;
    
    /** 身份证号 */
    @Column(name = "identityCard")
    private String identityCard;
    
    /** 证件类型 */
    @Column(name = "PAPERSTYPE")
    private String paperstype;
    
    /** 证件号码 */
    @Column(name = "PAPERSNUMBER")
    private String papersnumber;
    
    /** 民族 */
    @Column(name = "NATION")
    private String nation;
    
    /** 婚姻状况 */
    @Column(name = "MARRIAGE")
    private String marriage;
    
    /** 籍贯 */
    @Column(name = "PLACE")
    private String place;
    
    /** 户口所在地 */
    @Column(name = "RESIDENCE")
    private String residence;
    
    /** 政治面貌 */
    @Column(name = "POLITICS")
    private String politics;
    
    /** 入党团时间 */
    @Column(name = "PARTYTIME")
    private String partytime;
    
    /** 组织关系所在单位 */
    @Column(name = "RELATIONSHIPS")
    private String relationships;
    
    /** 专业 */
    @Column(name = "PROFESSION")
    private String profession;
    
    /** 合同类型 */
    @Column(name = "COMPACT")
    private String compact;
    
    /** 员工状态 */
    @Column(name = "WORKSTATE")
    private String workstate;
    
    /** 离职类型 */
    @Column(name = "LEAVETYPE")
    private String leavetype;
    
    /** 英语能力 */
    @Column(name = "ENGLISH")
    private String english;
    
    /** 毕业时间 */
    @Column(name = "DIPLOMATIME")
    private String diplomatime;
    
    /** 入职时间 */
    @Column(name = "ENTRYTIME")
    private String entrytime;
    
    /** IP */
    @Column(name = "IP")
    private String ip;
    
    /** 禁用时间 */
    @Column(name = "forbiddenDate")
    private String forbiddenDate;
    
    /** 个人简历描述 */
    @Column(name = "RESUME")
    private String resume;
    
    /**  */
    @Column(name = "DEGREE")
    private String degree;
    
    /**  */
    @Column(name = "ENTERCOMPANYTIME")
    private String entercompanytime;
    
    /**  */
    @Column(name = "ENTEROFFICETIME")
    private String enterofficetime;
    
    /**  */
    @Column(name = "RELATIONISBUILD")
    private String relationisbuild;
    
    /**  */
    @Column(name = "EMERGENCYPHONE")
    private String emergencyphone;
    
    /**  */
    @Column(name = "ADDRESS")
    private String address;
    
    /**  */
    @Column(name = "GETCPAWAY")
    private String getcpaway;
    
    /**  */
    @Column(name = "datyType")
    private String datyType;
    
    /**  */
    @Column(name = "CPADATE")
    private String cpadate;
    
    /**  */
    @Column(name = "OUTOFFICETIME")
    private String outofficetime;
    
    /**  */
    @Column(name = "OACOMPANYNAME")
    private String oacompanyname;
    
    /**  */
    @Column(name = "wrokState")
    private String wrokState;
    
    /** 全科合格证号 */
    @Column(name = "ALLPASSNO")
    private String allpassno;
    
    /** 全科合格证通过时间 */
    @Column(name = "ALLPASSDATE")
    private String allpassdate;
    
    /**  */
    @Column(name = "ACCESSTOKEN")
    private String accesstoken;
    
    /** 系统颜色 */
    @Column(name = "SYSTEM_THEME")
    private String systemTheme;
    
    /** app绑定推送ID */
    @Column(name = "registrationId")
    private String registrationId;
    
    /** 直属领导 */
    @Column(name = "directlyUnderLeader")
    private String directlyUnderLeader;
    
    /** */
    @Column(name = "UPDATETIME")
    private String updateTime;
    
    
    public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
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
    public String getPassword() {
        return this.password;
    }
     
    /**
     * 设置
     * 
     * @param password
     *          
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getSex() {
        return this.sex;
    }
     
    /**
     * 设置
     * 
     * @param sex
     *          
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getBorndate() {
        return this.borndate;
    }
     
    /**
     * 设置
     * 
     * @param borndate
     *          
     */
    public void setBorndate(String borndate) {
        this.borndate = borndate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getEducational() {
        return this.educational;
    }
     
    /**
     * 设置
     * 
     * @param educational
     *          
     */
    public void setEducational(String educational) {
        this.educational = educational;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getDiploma() {
        return this.diploma;
    }
     
    /**
     * 设置
     * 
     * @param diploma
     *          
     */
    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }
    
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
    public String getRank() {
        return this.rank;
    }
     
    /**
     * 设置
     * 
     * @param rank
     *          
     */
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getPost() {
        return this.post;
    }
     
    /**
     * 设置
     * 
     * @param post
     *          
     */
    public void setPost(String post) {
        this.post = post;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getSpecialty() {
        return this.specialty;
    }
     
    /**
     * 设置
     * 
     * @param specialty
     *          
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getParentgroup() {
        return this.parentgroup;
    }
     
    /**
     * 设置
     * 
     * @param parentgroup
     *          
     */
    public void setParentgroup(String parentgroup) {
        this.parentgroup = parentgroup;
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
    public String getIstips() {
        return this.istips;
    }
     
    /**
     * 设置
     * 
     * @param istips
     *          
     */
    public void setIstips(String istips) {
        this.istips = istips;
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
     * 获取
     * 
     * @return 
     */
    public String getClientDogSysUi() {
        return this.clientDogSysUi;
    }
     
    /**
     * 设置
     * 
     * @param clientDogSysUi
     *          
     */
    public void setClientDogSysUi(String clientDogSysUi) {
        this.clientDogSysUi = clientDogSysUi;
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
    public String getUserPhoto() {
        return this.userPhoto;
    }
     
    /**
     * 设置
     * 
     * @param userPhoto
     *          
     */
    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getUserPhotoTemp() {
        return this.userPhotoTemp;
    }
     
    /**
     * 设置
     * 
     * @param userPhotoTemp
     *          
     */
    public void setUserPhotoTemp(String userPhotoTemp) {
        this.userPhotoTemp = userPhotoTemp;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getMobilePhone() {
        return this.mobilePhone;
    }
     
    /**
     * 设置
     * 
     * @param mobilePhone
     *          
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
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
    public String getCpano() {
        return this.cpano;
    }
     
    /**
     * 设置
     * 
     * @param cpano
     *          
     */
    public void setCpano(String cpano) {
        this.cpano = cpano;
    }
    
    /**
     * 获取楼层
     * 
     * @return 楼层
     */
    public String getFloor() {
        return this.floor;
    }
     
    /**
     * 设置楼层
     * 
     * @param floor
     *          楼层
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }
    
    /**
     * 获取房间号
     * 
     * @return 房间号
     */
    public String getHouse() {
        return this.house;
    }
     
    /**
     * 设置房间号
     * 
     * @param house
     *          房间号
     */
    public void setHouse(String house) {
        this.house = house;
    }
    
    /**
     * 获取工位号
     * 
     * @return 工位号
     */
    public String getStation() {
        return this.station;
    }
     
    /**
     * 设置工位号
     * 
     * @param station
     *          工位号
     */
    public void setStation(String station) {
        this.station = station;
    }
    
    /**
     * 获取身份证号
     * 
     * @return 身份证号
     */
    public String getIdentityCard() {
        return this.identityCard;
    }
     
    /**
     * 设置身份证号
     * 
     * @param identityCard
     *          身份证号
     */
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }
    
    /**
     * 获取证件类型
     * 
     * @return 证件类型
     */
    public String getPaperstype() {
        return this.paperstype;
    }
     
    /**
     * 设置证件类型
     * 
     * @param paperstype
     *          证件类型
     */
    public void setPaperstype(String paperstype) {
        this.paperstype = paperstype;
    }
    
    /**
     * 获取证件号码
     * 
     * @return 证件号码
     */
    public String getPapersnumber() {
        return this.papersnumber;
    }
     
    /**
     * 设置证件号码
     * 
     * @param papersnumber
     *          证件号码
     */
    public void setPapersnumber(String papersnumber) {
        this.papersnumber = papersnumber;
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
     * 获取婚姻状况
     * 
     * @return 婚姻状况
     */
    public String getMarriage() {
        return this.marriage;
    }
     
    /**
     * 设置婚姻状况
     * 
     * @param marriage
     *          婚姻状况
     */
    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }
    
    /**
     * 获取籍贯
     * 
     * @return 籍贯
     */
    public String getPlace() {
        return this.place;
    }
     
    /**
     * 设置籍贯
     * 
     * @param place
     *          籍贯
     */
    public void setPlace(String place) {
        this.place = place;
    }
    
    /**
     * 获取户口所在地
     * 
     * @return 户口所在地
     */
    public String getResidence() {
        return this.residence;
    }
     
    /**
     * 设置户口所在地
     * 
     * @param residence
     *          户口所在地
     */
    public void setResidence(String residence) {
        this.residence = residence;
    }
    
    /**
     * 获取政治面貌
     * 
     * @return 政治面貌
     */
    public String getPolitics() {
        return this.politics;
    }
     
    /**
     * 设置政治面貌
     * 
     * @param politics
     *          政治面貌
     */
    public void setPolitics(String politics) {
        this.politics = politics;
    }
    
    /**
     * 获取入党团时间
     * 
     * @return 入党团时间
     */
    public String getPartytime() {
        return this.partytime;
    }
     
    /**
     * 设置入党团时间
     * 
     * @param partytime
     *          入党团时间
     */
    public void setPartytime(String partytime) {
        this.partytime = partytime;
    }
    
    /**
     * 获取组织关系所在单位
     * 
     * @return 组织关系所在单位
     */
    public String getRelationships() {
        return this.relationships;
    }
     
    /**
     * 设置组织关系所在单位
     * 
     * @param relationships
     *          组织关系所在单位
     */
    public void setRelationships(String relationships) {
        this.relationships = relationships;
    }
    
    /**
     * 获取专业
     * 
     * @return 专业
     */
    public String getProfession() {
        return this.profession;
    }
     
    /**
     * 设置专业
     * 
     * @param profession
     *          专业
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }
    
    /**
     * 获取合同类型
     * 
     * @return 合同类型
     */
    public String getCompact() {
        return this.compact;
    }
     
    /**
     * 设置合同类型
     * 
     * @param compact
     *          合同类型
     */
    public void setCompact(String compact) {
        this.compact = compact;
    }
    
    /**
     * 获取员工状态
     * 
     * @return 员工状态
     */
    public String getWorkstate() {
        return this.workstate;
    }
     
    /**
     * 设置员工状态
     * 
     * @param workstate
     *          员工状态
     */
    public void setWorkstate(String workstate) {
        this.workstate = workstate;
    }
    
    /**
     * 获取离职类型
     * 
     * @return 离职类型
     */
    public String getLeavetype() {
        return this.leavetype;
    }
     
    /**
     * 设置离职类型
     * 
     * @param leavetype
     *          离职类型
     */
    public void setLeavetype(String leavetype) {
        this.leavetype = leavetype;
    }
    
    /**
     * 获取英语能力
     * 
     * @return 英语能力
     */
    public String getEnglish() {
        return this.english;
    }
     
    /**
     * 设置英语能力
     * 
     * @param english
     *          英语能力
     */
    public void setEnglish(String english) {
        this.english = english;
    }
    
    /**
     * 获取毕业时间
     * 
     * @return 毕业时间
     */
    public String getDiplomatime() {
        return this.diplomatime;
    }
     
    /**
     * 设置毕业时间
     * 
     * @param diplomatime
     *          毕业时间
     */
    public void setDiplomatime(String diplomatime) {
        this.diplomatime = diplomatime;
    }
    
    /**
     * 获取入职时间
     * 
     * @return 入职时间
     */
    public String getEntrytime() {
        return this.entrytime;
    }
     
    /**
     * 设置入职时间
     * 
     * @param entrytime
     *          入职时间
     */
    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }
    
    /**
     * 获取IP
     * 
     * @return IP
     */
    public String getIp() {
        return this.ip;
    }
     
    /**
     * 设置IP
     * 
     * @param ip
     *          IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }
    
    /**
     * 获取禁用时间
     * 
     * @return 禁用时间
     */
    public String getForbiddenDate() {
        return this.forbiddenDate;
    }
     
    /**
     * 设置禁用时间
     * 
     * @param forbiddenDate
     *          禁用时间
     */
    public void setForbiddenDate(String forbiddenDate) {
        this.forbiddenDate = forbiddenDate;
    }
    
    /**
     * 获取个人简历描述
     * 
     * @return 个人简历描述
     */
    public String getResume() {
        return this.resume;
    }
     
    /**
     * 设置个人简历描述
     * 
     * @param resume
     *          个人简历描述
     */
    public void setResume(String resume) {
        this.resume = resume;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getDegree() {
        return this.degree;
    }
     
    /**
     * 设置
     * 
     * @param degree
     *          
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getEntercompanytime() {
        return this.entercompanytime;
    }
     
    /**
     * 设置
     * 
     * @param entercompanytime
     *          
     */
    public void setEntercompanytime(String entercompanytime) {
        this.entercompanytime = entercompanytime;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getEnterofficetime() {
        return this.enterofficetime;
    }
     
    /**
     * 设置
     * 
     * @param enterofficetime
     *          
     */
    public void setEnterofficetime(String enterofficetime) {
        this.enterofficetime = enterofficetime;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getRelationisbuild() {
        return this.relationisbuild;
    }
     
    /**
     * 设置
     * 
     * @param relationisbuild
     *          
     */
    public void setRelationisbuild(String relationisbuild) {
        this.relationisbuild = relationisbuild;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getEmergencyphone() {
        return this.emergencyphone;
    }
     
    /**
     * 设置
     * 
     * @param emergencyphone
     *          
     */
    public void setEmergencyphone(String emergencyphone) {
        this.emergencyphone = emergencyphone;
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
    public String getGetcpaway() {
        return this.getcpaway;
    }
     
    /**
     * 设置
     * 
     * @param getcpaway
     *          
     */
    public void setGetcpaway(String getcpaway) {
        this.getcpaway = getcpaway;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getDatyType() {
        return this.datyType;
    }
     
    /**
     * 设置
     * 
     * @param datyType
     *          
     */
    public void setDatyType(String datyType) {
        this.datyType = datyType;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getCpadate() {
        return this.cpadate;
    }
     
    /**
     * 设置
     * 
     * @param cpadate
     *          
     */
    public void setCpadate(String cpadate) {
        this.cpadate = cpadate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getOutofficetime() {
        return this.outofficetime;
    }
     
    /**
     * 设置
     * 
     * @param outofficetime
     *          
     */
    public void setOutofficetime(String outofficetime) {
        this.outofficetime = outofficetime;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getOacompanyname() {
        return this.oacompanyname;
    }
     
    /**
     * 设置
     * 
     * @param oacompanyname
     *          
     */
    public void setOacompanyname(String oacompanyname) {
        this.oacompanyname = oacompanyname;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getWrokState() {
        return this.wrokState;
    }
     
    /**
     * 设置
     * 
     * @param wrokState
     *          
     */
    public void setWrokState(String wrokState) {
        this.wrokState = wrokState;
    }
    
    /**
     * 获取全科合格证号
     * 
     * @return 全科合格证号
     */
    public String getAllpassno() {
        return this.allpassno;
    }
     
    /**
     * 设置全科合格证号
     * 
     * @param allpassno
     *          全科合格证号
     */
    public void setAllpassno(String allpassno) {
        this.allpassno = allpassno;
    }
    
    /**
     * 获取全科合格证通过时间
     * 
     * @return 全科合格证通过时间
     */
    public String getAllpassdate() {
        return this.allpassdate;
    }
     
    /**
     * 设置全科合格证通过时间
     * 
     * @param allpassdate
     *          全科合格证通过时间
     */
    public void setAllpassdate(String allpassdate) {
        this.allpassdate = allpassdate;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getAccesstoken() {
        return this.accesstoken;
    }
     
    /**
     * 设置
     * 
     * @param accesstoken
     *          
     */
    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken;
    }
    
    /**
     * 获取系统颜色
     * 
     * @return 系统颜色
     */
    public String getSystemTheme() {
        return this.systemTheme;
    }
     
    /**
     * 设置系统颜色
     * 
     * @param systemTheme
     *          系统颜色
     */
    public void setSystemTheme(String systemTheme) {
        this.systemTheme = systemTheme;
    }
    
    /**
     * 获取app绑定推送ID
     * 
     * @return app绑定推送ID
     */
    public String getRegistrationId() {
        return this.registrationId;
    }
     
    /**
     * 设置app绑定推送ID
     * 
     * @param registrationId
     *          app绑定推送ID
     */
    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }
    
    /**
     * 获取直属领导
     * 
     * @return 直属领导
     */
    public String getDirectlyUnderLeader() {
        return this.directlyUnderLeader;
    }
     
    /**
     * 设置直属领导
     * 
     * @param directlyUnderLeader
     *          直属领导
     */
    public void setDirectlyUnderLeader(String directlyUnderLeader) {
        this.directlyUnderLeader = directlyUnderLeader;
    }
}