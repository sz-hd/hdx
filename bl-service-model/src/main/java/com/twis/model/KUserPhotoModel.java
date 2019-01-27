package com.twis.model;

/**
 * 用户照片表(K_USER_PHOTO)
 * 
 * @author bianj
 * @version 1.0.0 2018-12-09
 */
@Table(name = "K_USER_PHOTO")
public class KUserPhotoModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = 1427841956938826947L;
    
    /**  */
    @Column(name = "UUID",isId="true")
    private Long uuid;
    
    /**  */
    @Column(name = "MAINFORMID")
    private String mainformid;
    
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
    
    /**
     * 获取
     * 
     * @return 
     */
    public Long getUuid() {
        return this.uuid;
    }
     
    /**
     * 设置
     * 
     * @param uuid
     *          
     */
    public void setUuid(Long uuid) {
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
}