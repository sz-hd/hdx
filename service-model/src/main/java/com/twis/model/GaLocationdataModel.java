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

/**
 * 定位历史数据记录模板表(GA_LOCATIONDATA)
 * 
 * @author bianj
 * @version 1.0.0 2018-10-11
 */
@Table(name = "GA_LOCATIONDATA{PREFIX}")
public class GaLocationdataModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = -6208061259908587828L;
    
    /** 主键id自增 */
    @Column(name = "ID", isId="true")
    private Long id;
    
    /** 卡号 */
    @Column(name = "CARD_ID")
    private Integer card_id;
    
    /** x坐标 */
    @Column(name = "CARD_X")
    private Float card_x;
    
    /** y坐标 */
    @Column(name = "CARD_Y")
    private Float card_y;
    
    /** z坐标 */
    @Column(name = "CARD_Z")
    private Float card_z;
    
    /** 相对楼层高度z */
    @Column(name = "CARD_RELATIVE_Z")
    private Float card_relative_z;
    
    /** 毫秒时间戳 */
    @Column(name = "TIME")
    private Long time;
    
    /** 小区id */
    @Column(name = "SUBNET_ID")
    private Integer subnet_id;
    
    /** 场景id */
    @Column(name = "SCENE_ID")
    private Integer scene_id;
    
    /** 建筑id */
    @Column(name = "BUILDING_ID")
    private Integer building_id;
    
    /** 楼层id */
    @Column(name = "FLOOR_ID")
    private Integer floor_id;
    
    /** 唯一标示id */
    @Column(name = "UUID")
    private Integer uuid;
    
    /** 类型：0没有类型，1人员，2物品 */
    @Column(name = "UTYPE")
    private Integer utype;
    
    /** 基站id链表 */
    @Column(name = "BS_COORD")
    private String bs_coord;
    
    /**  */
    @Column(name = "CREATEDATE")
    private Date createdate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCard_id() {
		return card_id;
	}

	public void setCard_id(Integer card_id) {
		this.card_id = card_id;
	}

	public Float getCard_x() {
		return card_x;
	}

	public void setCard_x(Float card_x) {
		this.card_x = card_x;
	}

	public Float getCard_y() {
		return card_y;
	}

	public void setCard_y(Float card_y) {
		this.card_y = card_y;
	}

	public Float getCard_z() {
		return card_z;
	}

	public void setCard_z(Float card_z) {
		this.card_z = card_z;
	}

	public Float getCard_relative_z() {
		return card_relative_z;
	}

	public void setCard_relative_z(Float card_relative_z) {
		this.card_relative_z = card_relative_z;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Integer getSubnet_id() {
		return subnet_id;
	}

	public void setSubnet_id(Integer subnet_id) {
		this.subnet_id = subnet_id;
	}

	public Integer getScene_id() {
		return scene_id;
	}

	public void setScene_id(Integer scene_id) {
		this.scene_id = scene_id;
	}

	public Integer getBuilding_id() {
		return building_id;
	}

	public void setBuilding_id(Integer building_id) {
		this.building_id = building_id;
	}

	public Integer getFloor_id() {
		return floor_id;
	}

	public void setFloor_id(Integer floor_id) {
		this.floor_id = floor_id;
	}

	public Integer getUuid() {
		return uuid;
	}

	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}

	public Integer getUtype() {
		return utype;
	}

	public void setUtype(Integer utype) {
		this.utype = utype;
	}

	public String getBs_coord() {
		return bs_coord;
	}

	public void setBs_coord(String bs_coord) {
		this.bs_coord = bs_coord;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
    
    
}