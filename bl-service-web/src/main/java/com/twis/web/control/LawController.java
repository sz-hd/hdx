package com.twis.web.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twis.biz.service.law.LawOfMysqlService;
import com.twis.common.Twis;
import com.twis.common.utils.JsonResult;

@Controller
@RequestMapping ( "/law" )
public class LawController extends BaseController {
	@Autowired
	private LawOfMysqlService lawOfMysqlServicec;
	/**
	 * 法律法规查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="法律法规查询",url="/law/query", controller="LawController", saveLog="true", saveResult="true")
	public JsonResult queryLaw(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return lawOfMysqlServicec.query(parseMap(data));
	}
	
	/**
	 * 法律法规查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName="法律法规新增",url="/law/insert", controller="LawController", saveLog="true", saveResult="true")
	public JsonResult insertLaw(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return lawOfMysqlServicec.insert(parseMap(data));
	}
	
	/**
	 * 法律法规update
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/update")
	@ResponseBody
	@Twis(checkLogin="false",logName="法律法规新增",url="/law/update", controller="LawController", saveLog="true", saveResult="true")
	public JsonResult updateLaw(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return lawOfMysqlServicec.update(parseMap(data));
	}
	
	/**
	 * 法律法规update
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/delete")
	@ResponseBody
	@Twis(checkLogin="false",logName="法律法规新增",url="/law/delete", controller="LawController", saveLog="true", saveResult="true")
	public JsonResult deleteLaw(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return lawOfMysqlServicec.delete(parseMap(data));
	}
}
