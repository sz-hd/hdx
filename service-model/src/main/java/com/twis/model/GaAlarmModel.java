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
 * 报警信息记录表(GA_ALARM)
 * 
 * @author bianj
 * @version 1.0.0 2018-10-11
 */
@Table(name = "GA_ALARM")
public class GaAlarmModel extends com.twis.model.BaseObject {
    /** 版本号 */
    private static final long serialVersionUID = 4729272746546806592L;
    
    /** 主键id自增 */
    @Column(name = "ID",isId="true")
    private Long id;
    
    /** 主键id自增 */
    @Column(name = "ALARMID")
    private Long alarmid;
    
    /** 卡号 */
    @Column(name = "CARD_ID")
    private int card_id;
    
    /** 区域id */
    @Column(name = "AREA_ID")
    private int area_id;
    
    /** 动态围栏id */
    @Column(name = "DYNAMIC_AREA_ID")
    private int dynamic_area_id;
    
    /** 离群id */
    @Column(name = "STRAY_ID")
    private int stray_id;
    
    /** 场景id */
    @Column(name = "SCENE_ID")
    private int scene_id;
    
    /** 建筑id */
    @Column(name = "BUILDING_ID")
    private int building_id;
    
    /** 楼层id */
    @Column(name = "FLOOR_ID")
    private int floor_id;
    
    /** 时间戳 */
    @Column(name = "TIME")
    private Long time;
    
    /** 2越界3多卡4强拆9区域消失10区域聚众11区域不动12区域超时13进入越界14离开越界15危险源16监护组19陪同报警20离群报警 */
    @Column(name = "TYPE")
    private String type;
    
    @Column(name = "NAME")
    private String name;
    
    @Column(name = "OUT_TIME")
    private String out_time;
    
    
    /** 唯一id */
    @Column(name = "UUID")
    private int uuid;
    
    /** 类型：0没有类型，1人员，2物品 */
    @Column(name = "UTYPE")
    private int utype;
    
    /** 报警内容 */
    @Column(name = "ALARM_INFO")
    private String alarm_info;
    
    /** 0未处理1处理 */
    @Column(name = "STATUS")
    private Integer status;
    
    /** 处理人 */
    @Column(name = "DISPOSE")
    private int dispose;
    
    /** 聚众的卡号，逗号隔开 */
    @Column(name = "CARD_LIST")
    private String card_list;
    
    /** 备注 */
    @Column(name = "COMMENT")
    private String comment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCard_id() {
		return card_id;
	}

	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}

	public int getArea_id() {
		return area_id;
	}

	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}

	public int getDynamic_area_id() {
		return dynamic_area_id;
	}

	public void setDynamic_area_id(int dynamic_area_id) {
		this.dynamic_area_id = dynamic_area_id;
	}

	public int getStray_id() {
		return stray_id;
	}

	public void setStray_id(int stray_id) {
		this.stray_id = stray_id;
	}

	public int getScene_id() {
		return scene_id;
	}

	public void setScene_id(int scene_id) {
		this.scene_id = scene_id;
	}

	public int getBuilding_id() {
		return building_id;
	}

	public void setBuilding_id(int building_id) {
		this.building_id = building_id;
	}

	public int getFloor_id() {
		return floor_id;
	}

	public void setFloor_id(int floor_id) {
		this.floor_id = floor_id;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUuid() {
		return uuid;
	}

	public void setUuid(int uuid) {
		this.uuid = uuid;
	}

	public int getUtype() {
		return utype;
	}

	public void setUtype(int utype) {
		this.utype = utype;
	}

	public String getAlarm_info() {
		return alarm_info;
	}

	public void setAlarm_info(String alarm_info) {
		this.alarm_info = alarm_info;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public int getDispose() {
		return dispose;
	}

	public void setDispose(int dispose) {
		this.dispose = dispose;
	}

	public String getCard_list() {
		return card_list;
	}

	public void setCard_list(String card_list) {
		this.card_list = card_list;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOut_time() {
		return out_time;
	}

	public void setOut_time(String out_time) {
		this.out_time = out_time;
	}

	public Long getAlarmid() {
		return alarmid;
	}

	public void setAlarmid(Long alarmid) {
		this.alarmid = alarmid;
	}



	
    
}