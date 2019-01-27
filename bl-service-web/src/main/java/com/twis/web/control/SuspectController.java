package com.twis.web.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twis.biz.service.suspect.SuspectPersonExtOfMysqlService;
import com.twis.biz.service.suspect.SuspectPersonOfMysqlService;
import com.twis.biz.service.suspect.SuspectPersonPhotoOfMysqlService;
import com.twis.common.Twis;
import com.twis.common.utils.JsonResult;

@Controller
@RequestMapping ( "/suspect" )
public class SuspectController extends BaseController {
	
	@Autowired
	private SuspectPersonOfMysqlService suspectPersonOfMysqlService;
	
	@Autowired
	private SuspectPersonExtOfMysqlService suspectPersonExtOfMysqlService;
	
	@Autowired
	private SuspectPersonPhotoOfMysqlService suspectPersonPhotoOfMysqlService;
	
	
	
	/**
	 * 嫌疑人删除
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectInfo/delete")
	@ResponseBody
	@Twis(checkLogin="false",logName="嫌疑人删除",url="/suspectInfo/delete", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult deleteSuspectInfo(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonOfMysqlService.delete(parseMap(data));
	}
	
	/**
	 * 嫌疑人新增
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectInfo/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName="嫌疑人新增",url="/suspectInfo/insert", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult insertSuspectInfo(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonOfMysqlService.insert(parseMap(data));
	}
	
	/**
	 * 嫌疑人查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectInfo/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="嫌疑人查询",url="/suspectInfo/query", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult querySuspectInfo(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonOfMysqlService.query(parseMap(data));
	}
	
	
	/**
	 * 嫌疑人分页查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectInfo/queryNavigator")
	@ResponseBody
	@Twis(checkLogin="false",logName="嫌疑人分页查询",url="/suspectInfo/queryNavigator", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult queryNavigatorSuspectInfo(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonOfMysqlService.queryNavigator(parseMap(data));
	}
	
	/**
	 * 嫌疑人更新
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectInfo/update")
	@ResponseBody
	@Twis(checkLogin="false",logName="嫌疑人更新",url="/suspectInfo/update", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult updateSuspectInfo(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonOfMysqlService.update(parseMap(data));
	}
	
	/**
	 * 嫌疑人扩展表删除
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectExtInfo/delete")
	@ResponseBody
	@Twis(checkLogin="false",logName="嫌疑人扩展表删除",url="/suspectExtInfo/delete", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult deleteSuspectExtInfo(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonExtOfMysqlService.delete(parseMap(data));
	}
	
	/**
	 * 嫌疑人扩展表新增
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectExtInfo/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName="嫌疑人扩展表新增",url="/suspectExtInfo/insert", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult insertSuspectExtInfo(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonExtOfMysqlService.insert(parseMap(data));
	}
	
	/**
	 * 嫌疑人查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectExtInfo/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="嫌疑人查询",url="/suspectExtInfo/query", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult querySuspectExtInfo(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonExtOfMysqlService.query(parseMap(data));
	}
	
	
	/**
	 * 嫌疑人扩展表分页查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectExtInfo/queryNavigator")
	@ResponseBody
	@Twis(checkLogin="false",logName="嫌疑人扩展表分页查询",url="/suspectExtInfo/queryNavigator", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult queryNavigatorSuspectExtInfo(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonExtOfMysqlService.queryNavigator(parseMap(data));
	}
	
	/**
	 * 嫌疑人扩展表更新
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectExtInfo/update")
	@ResponseBody
	@Twis(checkLogin="false",logName="嫌疑人扩展表更新",url="/suspectExtInfo/update", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult updateSuspectExtInfo(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonExtOfMysqlService.update(parseMap(data));
	}
	
	/**
	 * 嫌疑人头像删除
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectPersonPhoto/delete")
	@ResponseBody
	@Twis(checkLogin="false",logName=" 嫌疑人头像删除",url="/suspectPersonPhoto/delete", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult deleteSuspectPersonPhoto(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonPhotoOfMysqlService.delete(parseMap(data));
	}
	/**
	 *  嫌疑人头像新增
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectPersonPhoto/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName=" 嫌疑人头像新增",url="/suspectPersonPhoto/insert", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult insertSuspectPersonPhoto(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonPhotoOfMysqlService.insert(parseMap(data));
	}
	
	/**
	 * 嫌疑人头像查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectPersonPhoto/query")
	@ResponseBody
	@Twis(checkLogin="false",logName=" 嫌疑人头像查询",url="/suspectPersonPhoto/query", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult querySuspectPersonPhoto(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonPhotoOfMysqlService.query(parseMap(data));
	}
	
	
	/**
	 * 嫌疑人头像分页查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectPersonPhoto/queryNavigator")
	@ResponseBody
	@Twis(checkLogin="false",logName="嫌疑人头像查询",url="/suspectPersonPhoto/queryNavigator", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult queryNavigatorSuspectPersonPhoto(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonPhotoOfMysqlService.queryNavigator(parseMap(data));
	}
	
	/**
	 * 嫌疑人头像更新
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/suspectPersonPhoto/update")
	@ResponseBody
	@Twis(checkLogin="false",logName="嫌疑人头像扩展表更新",url="/suspectPersonPhoto/update", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult updateSuspectPersonPhoto(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonPhotoOfMysqlService.update(parseMap(data));
	}
	
	/**
	 * 增量获取嫌疑人信息
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/getSuspectByTimes")
	@ResponseBody
	@Twis(checkLogin="false",logName="增量获取嫌疑人信息",url="/getSuspectByTimes", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult getSuspectByTimes(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonOfMysqlService.getSuspectByTimes(parseMap(data));
	}
	
	/**
	 * 增量获取嫌疑人信息
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/updateSuspectFinishStatus")
	@ResponseBody
	@Twis(checkLogin="false",logName="更新嫌疑人完成状态",url="/updateSuspectFinishStatus", controller="SuspectController", saveLog="true", saveResult="true")
	public JsonResult updateSuspectFinishStatus(String data,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return suspectPersonOfMysqlService.updateSuspectFinishStatus(parseMap(data));
	}
	
	
	
}
