package com.twis.model;

/**
 * (K_USERROLE)
 * 
 * @author bianj
 * @version 1.0.0 2018-12-09
 */
@Table(name = "K_USERROLE")
public class KUserroleModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = -2941340960250011257L;
    
    /**  */
    @Column(name = "USERID")
    private Long userid;
    
    /**  */
    @Column(name = "RID")
    private Integer rid;
    
    /**  */
    @Column(name = "PROPERTY")
    private String property;
    
    /**
     * 获取
     * 
     * @return 
     */
    public Long getUserid() {
        return this.userid;
    }
     
    /**
     * 设置
     * 
     * @param userid
     *          
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getRid() {
        return this.rid;
    }
     
    /**
     * 设置
     * 
     * @param rid
     *          
     */
    public void setRid(Integer rid) {
        this.rid = rid;
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
}