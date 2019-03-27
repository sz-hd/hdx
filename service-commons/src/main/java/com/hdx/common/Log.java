package com.hdx.common;

import org.aspectj.lang.ProceedingJoinPoint;

import com.hdx.common.utils.JsonResult;

/**
 * 系统日志
 * 
 * @author yxm
 *
 */
public interface Log {
	public void sysLog(ProceedingJoinPoint pjp,Twis twis,Throwable e,Long sTime,JsonResult jsonResult);
}
