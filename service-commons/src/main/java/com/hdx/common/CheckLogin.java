package com.hdx.common;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.hdx.common.utils.JsonResult;
import com.hdx.common.utils.RedisPoolUtils;

/**
 * 用户登陆鉴权
 * @author yswh
 *
 */
public class CheckLogin {
	public static Boolean checkLogin(Map<String, String> map){
		if ((map != null) && map.containsKey("token")) {
			String token = map.get("token");
			if (token != null)
				return checkLogin(token);
			else
				return false;
		} else {
			return false;
		}
	}
	
	public static Boolean checkLoginByMap(Map<String, Object> map){
		if ((map != null) && map.containsKey("token")) {
			Object obj = map.get("token");
			if (obj != null)
				return checkLogin(obj.toString());
			else 
				return false;
		} else {
			return false;
		}
	}
	
	public static synchronized Boolean checkLogin(String tokenStr) {
		if ((tokenStr != null) && (tokenStr.length() > 0)) {
			RedisPoolUtils redisUtils = new RedisPoolUtils();
			String userLoginName = redisUtils.get(tokenStr);
			if(!StringUtils.hasText(userLoginName)){
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
	
	public static JsonResult checkLogin(){
		return JsonResult.getFailResult("登录凭证失效，请重新登录", -2) ;
	}
	
	public static JsonResult noLoginToken(){
		return JsonResult.getFailResult("请输入登陆凭证！", -2) ;
	}
}
