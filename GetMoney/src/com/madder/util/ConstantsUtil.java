package com.madder.util;

import java.security.MessageDigest;

import sun.misc.BASE64Encoder;

public class ConstantsUtil {

	public static String jsonPath = "products.json";
	
	public static String loginName = "madder";
	public static String loginPass = getMD5("123456");
	
	public static String getMD5(String pass){
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			BASE64Encoder encoder = new BASE64Encoder();
			String str = encoder.encode(md.digest(pass.getBytes("UTF-8")));
			return str;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
