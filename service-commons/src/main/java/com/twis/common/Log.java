package com.twis.common;

import org.aspectj.lang.ProceedingJoinPoint;

import com.twis.common.utils.JsonResult;

/**
 * 系统日志
 * 
 * @author yxm
 *
 */
public interface Log {
	public void sysLog(ProceedingJoinPoint pjp,Twis twis,Throwable e,Long sTime,JsonResult jsonResult);
}
