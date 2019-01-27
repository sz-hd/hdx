package com.twis.web.control;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twis.biz.service.record.RecordMenuOfMysqlService;
import com.twis.biz.service.record.RecordMenuRoleOfMysqlService;
import com.twis.biz.service.record.RecordModelOfMysqlService;
import com.twis.biz.service.record.RecordOfMysqlService;
import com.twis.biz.service.record.RecordPersonShareOfMysqlService;
import com.twis.biz.service.record.RecordQuseOfMysqlService;
import com.twis.biz.service.record.RecordTypeOfMysqlService;
import com.twis.biz.service.record.RecordWdOfMysqlService;
import com.twis.common.Twis;
import com.twis.common.utils.JsonResult;

@Controller
@RequestMapping ( "/record" )
public class RecordController extends BaseController {
	@Autowired
	private RecordOfMysqlService recordOfMysqlService;
	
	@Autowired
	private RecordMenuOfMysqlService recordMenuOfMysqlService;
	
	@Autowired
	private RecordMenuRoleOfMysqlService recordMenuRoleOfMysqlService;
	
	@Autowired
	private RecordModelOfMysqlService recordModelOfMysqlService;
	
	@Autowired
	private RecordPersonShareOfMysqlService recordPersonShareOfMysqlService;
	
	@Autowired
	private RecordTypeOfMysqlService recordTypeOfMysqlService;
	
	@Autowired
	private RecordWdOfMysqlService recordWdOfMysqlService;
	
	@Autowired
	private RecordQuseOfMysqlService recordQuseOfMysqlService;
	
	
	/**
	 * 笔录查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/sxquery")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录查询",url="/record/sxquery", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult querySxRecord(@RequestBody Map<String,Object> map, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordOfMysqlService.querysx(map);
	}
	
	
	/**
	 * 笔录查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录查询",url="/record/query", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult queryRecord(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 笔录插入
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录插入",url="/record/insert", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult insertRecord(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordOfMysqlService.insertRecord(parseMapList(data));
	}
	
	/**
	 * 笔录删除
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/delete")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录删除",url="/record/delete", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult deleteRecord(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordOfMysqlService.delete(parseMap(data));
	}
	
	/**
	 * 笔录更新
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/update")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录更新",url="/record/update", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult updateRecord(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordOfMysqlService.update(parseMap(data));
	}
	
	/**
	 * 笔录分页查询
	 * @param map
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/queryNavigator")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录分页查询",url="/record/queryNavigator", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult queryNavigator(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordOfMysqlService.queryNavigator(parseMap(data));
	}
	
	/**
	 * 笔录菜单删除
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordMenu/delete")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录菜单删除",url="/recordMenu/delete", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult deleteRecordMenu(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordMenuOfMysqlService.delete(parseMap(data));
	}
	
	/**
	 * 笔录菜单新增
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordMenu/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录菜单权限新增",url="/recordMenu/insert", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult insertRecordMenu(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordMenuOfMysqlService.insert(parseMap(data));
	}
	
	/**
	 * 笔录菜单查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordMenu/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录菜单查询",url="/recordMenu/query", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult queryRecordMenu(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordMenuOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 笔录菜单更新
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordMenu/update")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录菜单更新",url="/recordMenu/update", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult updateRecordMenu(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordMenuOfMysqlService.update(parseMap(data));
	}
	
	/**
	 * 笔录菜单权限删除
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordMenuRole/delete")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录菜单删除",url="/recordMenuRole/delete", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult deleteRecordMenuRole(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordMenuRoleOfMysqlService.delete(parseMap(data));
	}
	
	/**
	 * 笔录菜单权限新增
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordMenuRole/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录菜单权限新增",url="/recordMenuRole/insert", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult insertRecordMenuRole(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordMenuRoleOfMysqlService.insert(parseMap(data));
	}
	
	/**
	 * 笔录菜单权限查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordMenuRole/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录菜单权限查询",url="/recordMenuRole/query", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult queryRecordMenuRole(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordMenuRoleOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 笔录菜单权限更新
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordMenuRole/update")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录菜单权限更新",url="/recordMenuRole/update", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult updateRecordMenuRole(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordMenuRoleOfMysqlService.update(parseMap(data));
	}
	
	/**
	 * 笔录模板删除
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordModel/delete")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录模板删除",url="/recordModel/delete", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult deleteRecordModel(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordModelOfMysqlService.delete(parseMap(data));
	}
	
	/**
	 * 笔录模板新增
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordModel/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录模板新增",url="/recordModel/insert", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult insertRecordModel(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordModelOfMysqlService.insert(parseMap(data));
	}
	
	/**
	 * 笔录模板查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordModel/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录模板查询",url="/recordModel/query", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult queryRecordModel(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordModelOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 笔录模板更新
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordModel/update")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录模板更新",url="/recordModel/update", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult updateRecordModel(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordModelOfMysqlService.update(parseMap(data));
	}
	
	
	/**
	 * 笔录模板分享删除
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordPersonShare/delete")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录模板分享删除",url="/recordPersonShare/delete", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult deleteRecordPersonShare(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordPersonShareOfMysqlService.delete(parseMap(data));
	}
	
	/**
	 * 笔录模板分享新增
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordPersonShare/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录模板新增",url="/recordPersonShare/insert", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult insertRecordPersonShare(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordPersonShareOfMysqlService.insert(parseMap(data));
	}
	
	/**
	 * 笔录模板分享查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordPersonShare/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录模板查询",url="/recordPersonShare/query", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult queryRecordPersonShare(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordPersonShareOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 笔录模板分享更新
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordPersonShare/update")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录模板更新",url="/recordPersonShare/update", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult updateRecordPersonShare(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordPersonShareOfMysqlService.update(parseMap(data));
	}
	
	/**
	 * 笔录类型删除
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordType/delete")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录类型删除",url="/recordType/delete", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult deleteRecordType(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordTypeOfMysqlService.delete(parseMap(data));
	}
	
	/**
	 * 笔录类型新增
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordType/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录类型新增",url="/recordType/insert", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult insertRecordType(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordTypeOfMysqlService.insert(parseMap(data));
	}
	
	/**
	 * 笔录类型查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordType/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录类型查询",url="/recordType/query", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult queryRecordType(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordTypeOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 笔录类型更新
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordType/update")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录类型更新",url="/recordType/update", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult updateRecordType(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordTypeOfMysqlService.update(parseMap(data));
	}
	
	/**
	 * 笔录问答删除
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordWd/delete")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录类型删除",url="/recordWd/delete", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult deleteRecordWd(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordWdOfMysqlService.delete(parseMap(data));
	}
	
	/**
	 * 笔录问答新增
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordWd/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录问答新增",url="/recordWd/insert", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult insertRecordWd(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordWdOfMysqlService.insert(parseMap(data));
	}
	
	/**
	 * 笔录问答查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordWd/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录问答查询",url="/recordWd/query", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult queryRecordWd(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordWdOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 笔录问答更新
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordWd/update")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录问答更新",url="/recordWd/update", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult updateRecordWd(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordWdOfMysqlService.update(parseMap(data));
	}
	
	/**
	 * 笔录问题删除
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordQuse/delete")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录类型删除",url="/recordQuse/delete", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult deleteRecordQuse(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordQuseOfMysqlService.delete(parseMap(data));
	}
	
	/**
	 * 笔录问题新增
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordQuse/insert")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录问答新增",url="/recordQuse/insert", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult insertRecordQuse(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordQuseOfMysqlService.insert(parseMap(data));
	}
	
	/**
	 * 笔录问题查询
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordQuse/query")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录问题查询",url="/recordQuse/query", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult queryRecordQuse(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordQuseOfMysqlService.query(parseMap(data));
	}
	
	/**
	 * 笔录问题更新
	 * @param map
	 * @param request
	 * @param response
	 * @returns
	 */
	@RequestMapping(value = "/recordQuse/update")
	@ResponseBody
	@Twis(checkLogin="false",logName="笔录问题更新",url="/recordQuse/update", controller="RecordController", saveLog="true", saveResult="true")
	public JsonResult updateRecordQuse(String data, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		return recordQuseOfMysqlService.update(parseMap(data));
	}
	
}
