package com.twis.web.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twis.biz.service.log.LogOfMysqlService;
import com.twis.common.Twis;
import com.twis.common.utils.JsonResult;

@Controller
@RequestMapping ( "/log" )
public class LogController extends BaseController {
	@Autowired
	private LogOfMysqlService logOfMysqlService;
	/**
	 * 保存日志
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName="保存日志",url="/log/insert", controller="LogController", saveLog="true", saveResult="true")
	public JsonResult insert(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return logOfMysqlService.insert(parseMap(data));
	}
	
	/**
	 * 查询日志
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="查询日志",url="/log/query", controller="LogController", saveLog="true", saveResult="true")
	public JsonResult query(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return logOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 日志分页查询
	 * @param map
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/queryNavigator")
	@ResponseBody
	@Twis(checkLogin="false",logName="日志分页查询",url="/log/queryNavigator", controller="LogController", saveLog="true", saveResult="true")
	public JsonResult queryNavigator(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return logOfMysqlService.queryNavigator(parseMap(data));
	}
}
