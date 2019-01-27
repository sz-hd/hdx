package com.twis.common;

import org.aspectj.lang.ProceedingJoinPoint;

import com.twis.common.utils.JsonResult;

public class LogThread extends Thread {
	private ProceedingJoinPoint pjp;
	private Twis twis;
	private Throwable e;
	private Long sTime;
	private JsonResult jsonResult;
	public LogThread(ProceedingJoinPoint pjp,Twis twis,Throwable e,Long sTime,JsonResult jsonResult){
		this.pjp = pjp;
		this.twis = twis;
		this.e = e;
		this.sTime = sTime;
		this.jsonResult = jsonResult;
	}
	public void run() {
		if(twis.saveLogType().equals("file")) {
			LogFile log = new LogFile();
			log.sysLog(pjp,twis,e,sTime,jsonResult);
		}
		
	}
}
