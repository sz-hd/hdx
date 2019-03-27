package com.hdx.common.utils.httpclient;

import java.util.Map;

public class HttpClientUtil {
	public static String postUrl(String url, String port, String version, String path, Map<String, Object> data) {
		return new HttpClient(HttpClientEnum.POST).httpClientExecute(url, port, version, path, data);
	}
	
	public static String getUrl(String url, String port, String version, String path, Map<String, Object> data) {
		return new HttpClient(HttpClientEnum.GET).httpClientExecute(url, port, version, path, data);
	}
}
