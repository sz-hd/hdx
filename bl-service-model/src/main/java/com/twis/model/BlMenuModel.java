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
 * 笔录菜单表(BL_MENU)
 */
@Table(name = "BL_MENU")
public class BlMenuModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = -4332538610493353257L;
    
    /**  */
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    @Column(name = "ID")
    private Long id;
    
    /**  */
    @Column(name = "UUID",isId="true")
    private String uuid;
    
    /**  */
    @Column(name = "MENUNAME")
    private String menuname;
    
    /**  */
    @Column(name = "MENUTYPE")
    private Integer menutype;
    
    /**  */
    @Column(name = "MENULEVEL")
    private Integer menulevel;
    
    /**  */
    @Column(name = "TYPELEVEL")
    private Integer typelevel;
    
    /**  */
    @Column(name = "PARENTID")
    private String parentid;
    
    /**  */
    @Column(name = "orderInx")
    private Integer orderInx;
    
    /**  */
    @Column(name = "REMARK")
    private String remark;
    
    /**  */
    @Column(name = "BLTYPEID")
    private String bltypeid;
    
    /**  */
    @Column(name = "ORGID")
    private String orgid;
    
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
    public String getMenuname() {
        return this.menuname;
    }
     
    /**
     * 设置
     * 
     * @param menuname
     *          
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getMenutype() {
        return this.menutype;
    }
     
    /**
     * 设置
     * 
     * @param menutype
     *          
     */
    public void setMenutype(Integer menutype) {
        this.menutype = menutype;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getMenulevel() {
        return this.menulevel;
    }
     
    /**
     * 设置
     * 
     * @param menulevel
     *          
     */
    public void setMenulevel(Integer menulevel) {
        this.menulevel = menulevel;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getTypelevel() {
        return this.typelevel;
    }
     
    /**
     * 设置
     * 
     * @param typelevel
     *          
     */
    public void setTypelevel(Integer typelevel) {
        this.typelevel = typelevel;
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
    public Integer getOrderInx() {
        return this.orderInx;
    }
     
    /**
     * 设置
     * 
     * @param orderInx
     *          
     */
    public void setOrderInx(Integer orderInx) {
        this.orderInx = orderInx;
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
    public String getBltypeid() {
        return this.bltypeid;
    }
     
    /**
     * 设置
     * 
     * @param bltypeid
     *          
     */
    public void setBltypeid(String bltypeid) {
        this.bltypeid = bltypeid;
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