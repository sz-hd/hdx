package com.twis.model;

/**
 * (K_ROLE)
 * 
 * @author bianj
 * @version 1.0.0 2018-12-09
 */
@Table(name = "K_ROLE")
public class KRoleModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = -8629260756846381681L;
    
    /**  */
    @Column(name = "ID")
    private Integer id;
    
    /**  */
    @Column(name = "ROLENAME")
    private String rolename;
    
    /**  */
    @Column(name = "ROLEVALUE")
    private String rolevalue;
    
    /**  */
    @Column(name = "POPEDOM")
    private String popedom;
    
    /**  */
    @Column(name = "PROPERTY")
    private String property;
    
    /**  */
    @Column(name = "LTYPE")
    private String ltype;
    
    /**  */
    @Column(name = "INNERNAME")
    private String innername;
    
    /**  */
    @Column(name = "REMARK")
    private String remark;
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getId() {
        return this.id;
    }
     
    /**
     * 设置
     * 
     * @param id
     *          
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getRolename() {
        return this.rolename;
    }
     
    /**
     * 设置
     * 
     * @param rolename
     *          
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getRolevalue() {
        return this.rolevalue;
    }
     
    /**
     * 设置
     * 
     * @param rolevalue
     *          
     */
    public void setRolevalue(String rolevalue) {
        this.rolevalue = rolevalue;
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
    public String getLtype() {
        return this.ltype;
    }
     
    /**
     * 设置
     * 
     * @param ltype
     *          
     */
    public void setLtype(String ltype) {
        this.ltype = ltype;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getInnername() {
        return this.innername;
    }
     
    /**
     * 设置
     * 
     * @param innername
     *          
     */
    public void setInnername(String innername) {
        this.innername = innername;
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
}