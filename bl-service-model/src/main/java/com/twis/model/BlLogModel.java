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
 * 笔录日志表(BL_LOG)
 */
@Table(name = "BL_LOG")
public class BlLogModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = 1796556290891041719L;
    
    /**  */
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    @Column(name = "ID",isId="true")
    private Long id;
    
    /**  */
    @Column(name = "UUID")
    private String uuid;
    
    /**  */
    @Column(name = "IP")
    private String ip;
    
    /**  */
    @Column(name = "ROOMNO")
    private String roomno;
    
    /**  */
    @Column(name = "MODEL")
    private String model;
    
    /**  */
    @Column(name = "LOGINID")
    private String loginid;
    
    /**  */
    @JsonSerialize(using = JsonDateFormatFull.class)
    @Column(name = "CREATEDATE")
    private Date createdate;
    
    /**  */
    @Column(name = "REMARK")
    private String remark;
    
    /**  */
    @Column(name = "ORGID")
    private String orgid;
    
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
    public String getIp() {
        return this.ip;
    }
     
    /**
     * 设置
     * 
     * @param ip
     *          
     */
    public void setIp(String ip) {
        this.ip = ip;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getRoomno() {
        return this.roomno;
    }
     
    /**
     * 设置
     * 
     * @param roomno
     *          
     */
    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getModel() {
        return this.model;
    }
     
    /**
     * 设置
     * 
     * @param model
     *          
     */
    public void setModel(String model) {
        this.model = model;
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
}