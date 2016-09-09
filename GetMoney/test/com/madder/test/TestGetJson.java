package com.madder.test;

import java.net.URL;
import java.util.Map;

import org.junit.Test;

import com.madder.util.ConstantsUtil;
import com.madder.util.GetJsonUtil;

public class TestGetJson {

	@Test
	public void testGetJson(){
		String json = GetJsonUtil.getJson(ConstantsUtil.jsonPath);
		System.out.println(json);
		Map<String, Object> map = GetJsonUtil.toMap(json);
		System.out.println(map.get("products"));
	}
	
	@Test
	public void testGetPath(){
//		URL realPath = GetJsonUtil.class.getClassLoader().getResource("");
		URL realPath = GetJsonUtil.class.getClassLoader().getResource(ConstantsUtil.jsonPath);
		System.out.println(realPath.getPath());
		System.out.println(realPath.toString());
	}
	
	@Test
	public void testGetMD5(){
		System.out.println(ConstantsUtil.getMD5("123456"));
	}
}
