package com.twis.web.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twis.biz.service.sysparam.SysparamOfMysqlService;
import com.twis.common.Twis;
import com.twis.common.utils.JsonResult;
import com.twis.web.util.ServletsUtil;

@Controller
public class SysParamController extends BaseController {
	
	
	@Autowired
	private SysparamOfMysqlService SysparamOfMysqlService;
	/**
	 * 系统参数
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/sysparam")
	@ResponseBody
	@Twis(checkLogin="false",logName="系统参数",url="/sysparam", controller="SysParamController", saveLog="true", saveResult="true")
	public JsonResult sysparam(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return SysparamOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 服务测试
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/test")
	@ResponseBody
	@Twis(checkLogin="false",logName="服务测试",url="/test", controller="SysParamController", saveLog="true", saveResult="true")
	public JsonResult test(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return SysparamOfMysqlService.testServer(parseMap(data));
	}
	
	/**
	 * 时间戳
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/getTimeStamp")
	@ResponseBody
	@Twis(checkLogin="false",logName="时间戳",url="/getTimeStamp", controller="SysParamController", saveLog="true", saveResult="true")
	public JsonResult getTimeStamp(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return SysparamOfMysqlService.getTimeStamp(parseMap(data));
	}
	
	/**
	 * 根据ip获取单位信息
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/getOrgInfo")
	@ResponseBody
	@Twis(checkLogin="false",logName="根据ip获取单位信息",url="/getOrgInfo", controller="SysParamController", saveLog="true", saveResult="true")
	public JsonResult isSetOrg(String ip, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		String _ip = "";
		if (org.springframework.util.StringUtils.hasText(ip)) {
			_ip = ip;
		} else {
			_ip = ServletsUtil.getIp(request);
		}
		return getOrgInfo(_ip);
	}
	
	
	
}