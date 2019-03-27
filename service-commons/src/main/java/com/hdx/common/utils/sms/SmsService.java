package com.hdx.common.utils.sms;

import java.util.Map;

import com.hdx.common.utils.SendResult;

public interface SmsService {
	public SendResult sendSMS(Map<String,Object> map) throws Exception;
}
