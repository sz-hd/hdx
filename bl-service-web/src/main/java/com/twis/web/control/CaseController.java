package com.twis.web.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twis.biz.service.ajcase.JaCaseOfMysqlService;
import com.twis.common.Twis;
import com.twis.common.utils.JsonResult;

@Controller
@RequestMapping ( "/case" )
public class CaseController extends BaseController {
	@Autowired
	private JaCaseOfMysqlService jaCaseOfMysqlService;
	/**
	 * 案件查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="案件查询",url="/case/query", controller="CaseController", saveLog="true", saveResult="true")
	public JsonResult query(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return jaCaseOfMysqlService.queryCaseInfo(parseMap(data));
	}
	
	
	/**
	 * 案件分页查询
	 * @param map
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/queryNavigator")
	@ResponseBody
	@Twis(checkLogin="false",logName="案件分页查询",url="/case/queryNavigator", controller="CaseController", saveLog="true", saveResult="true")
	public JsonResult queryNavigator(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return jaCaseOfMysqlService.queryNavigator(parseMap(data));
	}
	
	/**
	 * 案件新增
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName="案件插入",url="/case/insert", controller="CaseController", saveLog="true", saveResult="true")
	public JsonResult insert(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return jaCaseOfMysqlService.insert(parseMap(data));
	}
	
	/**
	 * 案件更新
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/update")
	@ResponseBody
	@Twis(checkLogin="false",logName="案件更新",url="/case/update", controller="CaseController", saveLog="true", saveResult="true")
	public JsonResult update(String data,  HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return jaCaseOfMysqlService.update(parseMap(data));
	}
	
	/**
	 * 案件删除
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/delete")
	@ResponseBody
	@Twis(checkLogin="false",logName="案件删除",url="/case/delete", controller="CaseController", saveLog="true", saveResult="true")
	public JsonResult delete(String data,  HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return jaCaseOfMysqlService.delete(parseMap(data));
	}
	
	/**
	 * 增量获取案件信息
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/getCaseByTimes")
	@ResponseBody
	@Twis(checkLogin="false",logName="增量获取嫌疑人信息",url="/getCaseByTimes", controller="CaseController", saveLog="true", saveResult="true")
	public JsonResult getCaseByTimes(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return jaCaseOfMysqlService.getCaseByTimes(parseMap(data));
	}
	
}
