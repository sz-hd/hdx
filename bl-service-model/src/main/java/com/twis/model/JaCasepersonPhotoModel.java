package com.twis.model;

/**
 * (JA_CASEPERSON_PHOTO)
 * 
 * @author bianj
 * @version 1.0.0 2018-12-09
 */
@Table(name = "JA_CASEPERSON_PHOTO")
public class JaCasepersonPhotoModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = 827971611198923075L;
    
    /**  */
    @Column(name = "UUID")
    private String uuid;
    
    /**  */
    @Column(name = "MAINFORMID")
    private String mainformid;
    
    /** 证件号码 */
    @Column(name = "IDCARTNUMBER")
    private String idcartnumber;
    
    /** 照片类型:0.身份证照 1.现场拍摄 */
    @Column(name = "FTYPE")
    private Integer ftype;
    
    /** 照片 */
    @Column(name = "FPHOTO")
    private String fphoto;
    
    /** 备注 */
    @Column(name = "REMARK")
    private String remark;
    
    /** 操作人 */
    @Column(name = "OPER_USER_ID_")
    private String operUserId;
    
    /** 操作人 */
    @Column(name = "OPER_USER_NAME_")
    private String operUserName;
    
    /** 操作时间 */
    @Column(name = "OPER_TIME_")
    private String operTime;
    
    /** 更新人 */
    @Column(name = "UPDATE_USER_ID_")
    private String updateUserId;
    
    /** 更新人 */
    @Column(name = "UPDATE_USER_NAME_")
    private String updateUserName;
    
    /** 更新时间 */
    @Column(name = "UPDATE_TIME_")
    private String updateTime;
    
    /** 所属机构 */
    @Column(name = "ORGANID_")
    private String organid;
    
    /** 相似度 */
    @Column(name = "similScore")
    private String similScore;
    
    /** 人脸识别ID */
    @Column(name = "faceId")
    private String faceId;
    
    /** 人脸识别设备返回ID */
    @Column(name = "fmachineId")
    private String fmachineId;
    
    /** 状态 */
    @Column(name = "STATUS")
    private String status;
    
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
     * 获取证件号码
     * 
     * @return 证件号码
     */
    public String getIdcartnumber() {
        return this.idcartnumber;
    }
     
    /**
     * 设置证件号码
     * 
     * @param idcartnumber
     *          证件号码
     */
    public void setIdcartnumber(String idcartnumber) {
        this.idcartnumber = idcartnumber;
    }
    
    /**
     * 获取照片类型:0.身份证照 1.现场拍摄
     * 
     * @return 照片类型
     */
    public Integer getFtype() {
        return this.ftype;
    }
     
    /**
     * 设置照片类型:0.身份证照 1.现场拍摄
     * 
     * @param ftype
     *          照片类型:0.身份证照 1.现场拍摄
     */
    public void setFtype(Integer ftype) {
        this.ftype = ftype;
    }
    
    /**
     * 获取照片
     * 
     * @return 照片
     */
    public String getFphoto() {
        return this.fphoto;
    }
     
    /**
     * 设置照片
     * 
     * @param fphoto
     *          照片
     */
    public void setFphoto(String fphoto) {
        this.fphoto = fphoto;
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
     * 获取操作人
     * 
     * @return 操作人
     */
    public String getOperUserName() {
        return this.operUserName;
    }
     
    /**
     * 设置操作人
     * 
     * @param operUserName
     *          操作人
     */
    public void setOperUserName(String operUserName) {
        this.operUserName = operUserName;
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
     * 获取更新人
     * 
     * @return 更新人
     */
    public String getUpdateUserName() {
        return this.updateUserName;
    }
     
    /**
     * 设置更新人
     * 
     * @param updateUserName
     *          更新人
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
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
     * 获取相似度
     * 
     * @return 相似度
     */
    public String getSimilScore() {
        return this.similScore;
    }
     
    /**
     * 设置相似度
     * 
     * @param similScore
     *          相似度
     */
    public void setSimilScore(String similScore) {
        this.similScore = similScore;
    }
    
    /**
     * 获取人脸识别ID
     * 
     * @return 人脸识别ID
     */
    public String getFaceId() {
        return this.faceId;
    }
     
    /**
     * 设置人脸识别ID
     * 
     * @param faceId
     *          人脸识别ID
     */
    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }
    
    /**
     * 获取人脸识别设备返回ID
     * 
     * @return 人脸识别设备返回ID
     */
    public String getFmachineId() {
        return this.fmachineId;
    }
     
    /**
     * 设置人脸识别设备返回ID
     * 
     * @param fmachineId
     *          人脸识别设备返回ID
     */
    public void setFmachineId(String fmachineId) {
        this.fmachineId = fmachineId;
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
}