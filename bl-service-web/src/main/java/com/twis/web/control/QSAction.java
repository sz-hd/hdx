package com.twis.web.control;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/blqq")
public class QSAction extends BaseController {
	private static Map mp=new HashMap();
	/**
	 * 
	 * 发送笔录系统协同办案消息
	 * 
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/send")
	@ResponseBody
	public String send(HttpServletRequest request,
			HttpServletResponse response) {
		try{
			//获取页面参数
			String xyrid = showNull(request.getParameter("xyrid"));
			String xyrname =showNull(request.getParameter("xyrname"));
			String bamjid = showNull(request.getParameter("bamjid"));
			String bamjname =showNull(request.getParameter("bamjname"));
			String loginname =showNull(request.getParameter("loginname"));
			String msg = showNull(request.getParameter("msg"));
			List<String> list=null;
			if(mp.get(xyrid)==null){
				list=new ArrayList<String>();
			}else{
				list=(List<String>)mp.get(xyrid);
			}
			String ss="{";
			ss=ss+"\"loginname\":"+"\""+loginname+"\",";
			ss=ss+"\"name\":"+"\""+bamjname+"\",";
			ss=ss+"\"time\":"+"\""+getTimeByCalendar()+"\",";
			ss=ss+"\"msg\":"+"\""+msg+"\"}";
			list.add(ss);
			mp.put(xyrid, list);
		}catch(Exception e){
			return "false";	
		}
		return "success";			
	}	
	
	private String showNull(String ss){
		if(null==ss){
			ss="";
		}
		return ss;
	}
	/**
	 * 
	 * 获取笔录系统协同办案消息
	 * 
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/receive")
	@ResponseBody
	public String receive(HttpServletRequest request,
			HttpServletResponse response) {
		String json="";
		try{
			//获取页面参数
			String xyrid = showNull(request.getParameter("xyrid"));
			List<String> list=null;
			if(mp.get(xyrid)==null){
				list=new ArrayList<String>();
			}else{
				list=(List<String>)mp.get(xyrid);
			}
			for(int i=0;i<list.size();i++){
				String ss=(String)list.get(i);
				json+=ss+",";
			}
			if(json.length()>2){
				json=json.substring(0, json.length()-1);
			}
			json="["+json+"]";
			System.out.println("json="+json);
		}catch(Exception e){
			
			return "";	
		}
		
		return json;			
	}	
	
	public String getTimeByCalendar(){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH)+1;
        int day=cal.get(Calendar.DATE);
        int hour=cal.get(Calendar.HOUR_OF_DAY);
        int minute=cal.get(Calendar.MINUTE);
        int second=cal.get(Calendar.SECOND);
        //int WeekOfYear = cal.get(Calendar.DAY_OF_WEEK);
        String ss=year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second+"";
        return ss;
    }
}
