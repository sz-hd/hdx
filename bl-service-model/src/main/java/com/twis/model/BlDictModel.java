package com.twis.model;

@Table(name="K_DIC")
public class BlDictModel extends com.twis.model.BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5038928779057621627L;
    @Column(name = "AUTOID",isId="true")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "VALUE")
    private String value;
    @Column(name = "VALUE1")
    private String value1;
    @Column(name = "CTYPE")
    private String ctype;
    @Column(name = "USERDATA")
    private String userdata;
    @Column(name = "PROPERTY")
    private String property;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue1() {
		return value1;
	}
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getUserdata() {
		return userdata;
	}
	public void setUserdata(String userdata) {
		this.userdata = userdata;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
    
    
    
}
