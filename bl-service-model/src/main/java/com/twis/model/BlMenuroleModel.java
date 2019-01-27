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
 * 笔录菜单角色表(BL_MENUROLE)
 */
@Table(name = "BL_MENUROLE")
public class BlMenuroleModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = 4640738757811213384L;
    
    /**  */
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    @Column(name = "ID")
    private Long id;
    
    /**  */
    @Column(name = "UUID",isId="true")
    private String uuid;
    
    /**  */
    @Column(name = "ROLEID")
    private Integer roleid;
    
    /**  */
    @Column(name = "MENUID")
    private String menuid;
    
    /**  */
    @Column(name = "REMARK")
    private String remark;
    
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
    
    
     
    public String getOrgid() {
		return orgid;
	}



	public void setOrgid(String orgid) {
		this.orgid = orgid;
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
    public Integer getRoleid() {
        return this.roleid;
    }
     
    /**
     * 设置
     * 
     * @param roleid
     *          
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getMenuid() {
        return this.menuid;
    }
     
    /**
     * 设置
     * 
     * @param menuid
     *          
     */
    public void setMenuid(String menuid) {
        this.menuid = menuid;
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