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
 * (JA_SYSTEM_ENV)
 * 
 * @author bianj
 * @version 1.0.0 2018-12-09
 */
@Table(name = "JA_SYSTEM_ENV")
public class JaSystemEnvModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = 7157534667471131818L;
    
    /**  */
    @Column(name = "UUID")
    private String uuid;
    
    /** 房间编号 */
    @Column(name = "ROOMBH")
    private String roombh;
    
    /** 房间类型 */
    @Column(name = "ROOMTYPE")
    private String roomtype;
    
    /** 摄像头编号 */
    @Column(name = "CAMERABH")
    private String camerabh;
    
    /** 摄像头文件编号 */
    @Column(name = "CAMERAFILEBH")
    private String camerafilebh;
    
    /** 房间设备IP */
    @Column(name = "ROOMIP")
    private String roomip;
    
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
    
    /** 门禁控制器编号 */
    @Column(name = "DOORCTLBH")
    private String doorctlbh;
    
    /** 门禁设备编号 */
    @Column(name = "DOORBH")
    private String doorbh;
    
    /** 排序 */
    @Column(name = "SORTFLAG")
    private Integer sortflag;
    
    /** IP菜单权限 */
    @Column(name = "POPEDOM")
    private String popedom;
    
    /** 首页路径 */
    @Column(name = "INDEXPAGE")
    private String indexpage;
    
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
     * 获取房间编号
     * 
     * @return 房间编号
     */
    public String getRoombh() {
        return this.roombh;
    }
     
    /**
     * 设置房间编号
     * 
     * @param roombh
     *          房间编号
     */
    public void setRoombh(String roombh) {
        this.roombh = roombh;
    }
    
    /**
     * 获取房间类型
     * 
     * @return 房间类型
     */
    public String getRoomtype() {
        return this.roomtype;
    }
     
    /**
     * 设置房间类型
     * 
     * @param roomtype
     *          房间类型
     */
    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }
    
    /**
     * 获取摄像头编号
     * 
     * @return 摄像头编号
     */
    public String getCamerabh() {
        return this.camerabh;
    }
     
    /**
     * 设置摄像头编号
     * 
     * @param camerabh
     *          摄像头编号
     */
    public void setCamerabh(String camerabh) {
        this.camerabh = camerabh;
    }
    
    /**
     * 获取摄像头文件编号
     * 
     * @return 摄像头文件编号
     */
    public String getCamerafilebh() {
        return this.camerafilebh;
    }
     
    /**
     * 设置摄像头文件编号
     * 
     * @param camerafilebh
     *          摄像头文件编号
     */
    public void setCamerafilebh(String camerafilebh) {
        this.camerafilebh = camerafilebh;
    }
    
    /**
     * 获取房间设备IP
     * 
     * @return 房间设备IP
     */
    public String getRoomip() {
        return this.roomip;
    }
     
    /**
     * 设置房间设备IP
     * 
     * @param roomip
     *          房间设备IP
     */
    public void setRoomip(String roomip) {
        this.roomip = roomip;
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
     * 获取门禁控制器编号
     * 
     * @return 门禁控制器编号
     */
    public String getDoorctlbh() {
        return this.doorctlbh;
    }
     
    /**
     * 设置门禁控制器编号
     * 
     * @param doorctlbh
     *          门禁控制器编号
     */
    public void setDoorctlbh(String doorctlbh) {
        this.doorctlbh = doorctlbh;
    }
    
    /**
     * 获取门禁设备编号
     * 
     * @return 门禁设备编号
     */
    public String getDoorbh() {
        return this.doorbh;
    }
     
    /**
     * 设置门禁设备编号
     * 
     * @param doorbh
     *          门禁设备编号
     */
    public void setDoorbh(String doorbh) {
        this.doorbh = doorbh;
    }
    
    /**
     * 获取排序
     * 
     * @return 排序
     */
    public Integer getSortflag() {
        return this.sortflag;
    }
     
    /**
     * 设置排序
     * 
     * @param sortflag
     *          排序
     */
    public void setSortflag(Integer sortflag) {
        this.sortflag = sortflag;
    }
    
    /**
     * 获取IP菜单权限
     * 
     * @return IP菜单权限
     */
    public String getPopedom() {
        return this.popedom;
    }
     
    /**
     * 设置IP菜单权限
     * 
     * @param popedom
     *          IP菜单权限
     */
    public void setPopedom(String popedom) {
        this.popedom = popedom;
    }
    
    /**
     * 获取首页路径
     * 
     * @return 首页路径
     */
    public String getIndexpage() {
        return this.indexpage;
    }
     
    /**
     * 设置首页路径
     * 
     * @param indexpage
     *          首页路径
     */
    public void setIndexpage(String indexpage) {
        this.indexpage = indexpage;
    }
}