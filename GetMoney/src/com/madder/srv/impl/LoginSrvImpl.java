package com.madder.srv.impl;

import org.springframework.stereotype.Service;

import com.madder.srv.LoginSrv;
import com.madder.util.ConstantsUtil;

@Service("loginSrv")
public class LoginSrvImpl implements LoginSrv {

	@Override
	public String login(String name, String pass) {
		String passStr = ConstantsUtil.getMD5(pass);
		if("madder".equals(name) && passStr.equals(ConstantsUtil.loginPass)){
			return "success";
		}else if(!"madder".equals(name)){
			return "nameFail";
		}else if(!passStr.equals(pass)){
			return "passFail";
		}
		return "fail";
	}

}
