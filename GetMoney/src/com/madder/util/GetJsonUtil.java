package com.madder.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.sf.json.JSONObject;

public class GetJsonUtil {

	public static String getJson(String path){
		URL realPath = GetJsonUtil.class.getClassLoader().getResource(ConstantsUtil.jsonPath);
		StringBuffer sb = new StringBuffer();
		try {
			FileInputStream file = new FileInputStream(realPath.getPath());
			InputStreamReader reader = new InputStreamReader(file);
			BufferedReader br = new BufferedReader(reader);
			String temp = "";
			while((temp = br.readLine()) != null){
				sb.append(temp.trim());
			}
			br.close();
			reader.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public static Map<String, Object> toMap(String json){
		Map<String, Object> map = new HashMap<String, Object>();
		JSONObject obj = JSONObject.fromObject(json);
		Iterator<String> it = obj.keys();
		while(it.hasNext()){
			String key = String.valueOf(it.next());
			Object value = obj.get(key);
			map.put(key, value);
		}
		return map;
	}
}
