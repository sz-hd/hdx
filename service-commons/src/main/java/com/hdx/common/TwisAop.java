package com.hdx.common;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.hdx.common.exception.BaseException;
import com.hdx.common.utils.JsonResult;

import net.sf.json.JSONObject;

@Component
@Aspect
public class TwisAop {

	private static Logger log = LoggerFactory.getLogger(TwisAop.class);
	
	@Before(value = "@annotation(twis)")
	public void beforeRun(JoinPoint jp, Twis twis) throws Throwable {
	}
	
	@AfterReturning(pointcut = "@annotation(twis)")
	public void afterReturning(JoinPoint jp, Twis twis)throws Exception {

	}

	@AfterThrowing(pointcut = "@annotation(twis)", throwing = "e")
	public void afterThrowing(JoinPoint jp, Twis twis, Exception e)throws Exception {
		
	}
	
	private boolean checkDebug(ProceedingJoinPoint pjp,Twis twis) throws Throwable {
		boolean flag = false,flag1=false;
		Object[] args = pjp.getArgs();
		if ((args[0] instanceof Map)) {
			@SuppressWarnings("unchecked")
			Map<String, String> parameter = (Map<String, String>)args[0];
			if (parameter.containsKey("debug")){
				Object debug = parameter.get("debug");
				if ((Boolean)debug){
					flag1 = true;
				}
			}
			Object debug = System.getProperty("Debug");
			if(Boolean.parseBoolean((String)debug)||flag1) {
				flag = true;
			}
		}
		return flag;
	}

	@SuppressWarnings("unchecked")
	@Around(value = "@annotation(twis)")
	public Object around(ProceedingJoinPoint pjp,Twis twis) throws Throwable {
		if(!checkDebug(pjp,twis)) {
			if(twis.checkLogin().equals("true")){
				Object[] args = pjp.getArgs();
				if ((args != null) && (args.length > 0) && (args[0] instanceof Map)) {
					Map<String, String> parameter = (Map<String, String>)args[0];
					if(!CheckLogin.checkLogin(parameter)){
						return CheckLogin.checkLogin();
					}
				} else {
					return CheckLogin.noLoginToken();
				}
			}
		}
		
		JsonResult jsonResult = new JsonResult();
		
		Long sTime = new Date().getTime();
		Object o = null;
		try {
			o = pjp.proceed();
			ExecutorService pool = null;
			try {
				pool = Executors.newSingleThreadExecutor();
				if(twis.saveLog().equals("true")&&twis.saveResult().equals("false")){
					pool.execute(new LogThread(pjp,twis,null,sTime,null));
				}else if(twis.saveLog().equals("true")&&twis.saveResult().equals("true")){
					pool.execute(new LogThread(pjp,twis,null,sTime,(JsonResult)o));
				}
			} finally {
				pool.shutdown();
			}
			
			sTime=null;
		} catch (Throwable e) {
			
			try {
				Object[] args = pjp.getArgs();
				if (args != null) {
					for(int i = 0; i< args.length; i++)
						if (args[i] != null) {
					          if ((args[i] instanceof Map)) {
					        	  log.error("twisAop异常,{},{}",twis.controller() + "/" + twis.url(), JSONObject.fromObject(args[i]),e);
					          } else if ((args[i] instanceof String)) {
					        	  log.error("twisAop异常,{},{}",twis.controller() + "/" + twis.url(),args[i],e);
					          } else if (args[i].getClass().equals(Object.class)){
					        	  log.error("twisAop异常,{},{}",twis.controller() + "/" + twis.url(),args[i].getClass(),e);
					    	  }
						}
				}
			} catch(Exception ex) {
				
			}
			
			e.printStackTrace();
			
			if (e.getClass().getSuperclass()!=null&&e.getClass().getSuperclass().getTypeName().equals(BaseException.class.getTypeName())){
				
				String msg = e.getMessage();
				if ((msg == null) || ("".equals(msg))) {
					msg = "后台错误！请与管理员联系！";
				}
				
				jsonResult.setMsg(msg);
				BaseException baseException = (BaseException) e;
				jsonResult.setErrorCode(baseException.getCode());
			}else{
				jsonResult.setMsg("后台错误！请与管理员联系！");
				jsonResult.setErrorCode(-1);
			}
			jsonResult.setSuccess(false);
			ExecutorService pool = null;
			try {
				pool = Executors.newSingleThreadExecutor();
				if(twis.saveLog().equals("true")&&twis.saveResult().equals("false")){
					pool.execute(new LogThread(pjp,twis,e,sTime,null));
				}else if(twis.saveLog().equals("true")&&twis.saveResult().equals("true")){
					pool.execute(new LogThread(pjp,twis,e,sTime,(JsonResult)o));
				}
			} finally {
				pool.shutdown();
			}
			
			return jsonResult;
		}
		sTime=null;
		return o;
	}
}
