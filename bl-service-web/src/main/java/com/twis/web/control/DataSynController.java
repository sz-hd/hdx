package com.twis.web.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twis.biz.service.dataSyn.DataSynOfMysqlService;
import com.twis.common.Twis;
import com.twis.common.utils.JsonResult;

@Controller
@RequestMapping ( "/syn" )
public class DataSynController extends BaseController {
	@Autowired
	private DataSynOfMysqlService dataSynOfMysqlServicec;
	
	
	
	/**
	 * 同步表数据到服务端,通用程序，依赖表名、记录修改时间
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/uptoserver")
	@ResponseBody
	@Twis(checkLogin="false",logName="同步表数据到服务端",url="/uptoserver", controller="DataSynController", saveLog="true", saveResult="true")
	public JsonResult synUptoServer(String data, String tableName,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		System.out.println("tableName="+tableName);
		System.out.println("data="+data);
		return dataSynOfMysqlServicec.synUptoServer(tableName,parseMapList(data));
	}
	
	
	/**
	 * 通用查询接口
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="同步表数据到服务端",url="/query", controller="DataSynController", saveLog="true", saveResult="true")
	public JsonResult query(String sql, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		System.out.println("sql==="+sql);
		System.out.println("rsql==="+request.getParameter(sql));
		if(sql==null){
			sql=request.getParameter(sql);
		}
		return dataSynOfMysqlServicec.query(sql);
	}
	
	/**
	 * 通用增删改接口
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/excute")
	@ResponseBody
	@Twis(checkLogin="false",logName="通用增删改接口",url="/excute", controller="DataSynController", saveLog="true", saveResult="true")
	public JsonResult excute(String sql, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		System.out.println("sql==="+sql);
		System.out.println("rsql==="+request.getParameter(sql));
		if(sql==null){
			sql=request.getParameter(sql);
		}
		return dataSynOfMysqlServicec.excute(sql);
	}
	
	
	
}
