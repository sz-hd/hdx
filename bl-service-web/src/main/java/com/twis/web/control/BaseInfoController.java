package com.twis.web.control;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twis.biz.service.baseInfo.ClientInfoOfMysqlService;
import com.twis.biz.service.baseInfo.DepartmentOfMysqlService;
import com.twis.biz.service.baseInfo.DictOfMysqlService;
import com.twis.biz.service.baseInfo.IpOfMysqlService;
import com.twis.biz.service.baseInfo.OrgOfMysqlService;
import com.twis.biz.service.baseInfo.RoleOfMysqlService;
import com.twis.biz.service.baseInfo.RoomOfMysqlService;
import com.twis.biz.service.baseInfo.UserOfMysqlService;
import com.twis.biz.service.baseInfo.UserPhotoOfMysqlService;
import com.twis.biz.service.baseInfo.UserRoleOfMysqlService;
import com.twis.common.Twis;
import com.twis.common.utils.JsonResult;
import com.twis.web.util.ServletsUtil;

@Controller
@RequestMapping ( "/baseInfo" )
public class BaseInfoController extends BaseController {
	@Autowired
	private ClientInfoOfMysqlService clientInfoOfMysqlService;
	
	@Autowired
	private DepartmentOfMysqlService departmentOfMysqlService;
	
	@Autowired
	private DictOfMysqlService dictOfMysqlService;
	
	@Autowired
	private IpOfMysqlService ipOfMysqlService;
	
	@Autowired
	private OrgOfMysqlService orgOfMysqlService;
	
	@Autowired
	private RoleOfMysqlService roleOfMysqlService;
	
	@Autowired
	private RoomOfMysqlService roomOfMysqlService;
	
	@Autowired
	private UserOfMysqlService userOfMysqlService;
	
	@Autowired
	private UserPhotoOfMysqlService userPhotoOfMysqlService;
	
	@Autowired
	private UserRoleOfMysqlService userRoleOfMysqlService;
	
	
	
	
	
	/**
	 * 客户端查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/clientInfo/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="客户端查询",url="/baseInfo/clientInfo/query", controller="BaseInfoController", saveLog="true", saveResult="true")
	public JsonResult clientInfo(Map<String, Object> map, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return clientInfoOfMysqlService.query(map);
	}
	
	/**
	 * 单位查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/org/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="单位查询",url="/org/query", controller="BaseInfoController", saveLog="true", saveResult="true")
	public JsonResult queryOrg(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return orgOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 部门查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/department/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="部门查询",url="/department/query", controller="BaseInfoController", saveLog="true", saveResult="true")
	public JsonResult queryDepartment(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return departmentOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 字典查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/dict/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="字典查询",url="/dict/query", controller="BaseInfoController", saveLog="true", saveResult="true")
	public JsonResult queryDict(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return dictOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 询问室ip查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/ip/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="询问室ip查询",url="/ip/query", controller="BaseInfoController", saveLog="true", saveResult="true")
	public JsonResult queryIp(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return ipOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 角色查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/role/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="角色查询",url="/role/query", controller="BaseInfoController", saveLog="true", saveResult="true")
	public JsonResult queryRole(String data,  HttpServletRequest request,HttpServletResponse response) throws Exception{
		return roleOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 角色查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/role/getRoleListByOrg")
	@ResponseBody
	@Twis(checkLogin="false",logName="角色查询",url="/role/getRoleListByOrg", controller="BaseInfoController", saveLog="true", saveResult="true")
	public JsonResult getRoleListByOrg(String data,  HttpServletRequest request,HttpServletResponse response) throws Exception{
		return userRoleOfMysqlService.getRoleListByOrg(parseMap(data));
	}
	
	
	
	
	/**
	 * 询问室信息查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/room/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="询问室信息查询",url="/room/query", controller="BaseInfoController", saveLog="true", saveResult="true")
	public JsonResult queryRoom(String data,  HttpServletRequest request,HttpServletResponse response) throws Exception{
		return roomOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 用户查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/user/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="用户查询",url="/user/query", controller="BaseInfoController", saveLog="true", saveResult="true")
	public JsonResult queryUser(String data,  HttpServletRequest request,HttpServletResponse response) throws Exception{
		return userOfMysqlService.query(parseMap(data));
	}
	

	
	/**
	 * 用户头像查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/user/queryUserPhoto")
	@ResponseBody
	@Twis(checkLogin="false",logName="用户头像查询",url="/user/queryUserPhoto", controller="BaseInfoController", saveLog="true", saveResult="true")
	public JsonResult queryUserPhoto(String data, HttpServletRequest request,HttpServletResponse response) throws Exception{
		return userPhotoOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 用户角色对应查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/user/queryUserRole")
	@ResponseBody
	@Twis(checkLogin="false",logName="用户角色对应查询",url="/user/queryUserRole", controller="BaseInfoController", saveLog="true", saveResult="true")
	public JsonResult queryUserRole(String data,  HttpServletRequest request,HttpServletResponse response) throws Exception{
		return userRoleOfMysqlService.query(parseMap(data));
	}
	
	
}
