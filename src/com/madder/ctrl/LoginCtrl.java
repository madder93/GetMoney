package com.madder.ctrl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.madder.srv.LoginSrv;

@Controller
public class LoginCtrl {
	
	@Resource
	private LoginSrv loginSrv;

	@ResponseBody
	@RequestMapping("/login.do")
	public String login(String name, String pass){
		String flag = this.loginSrv.login(name, pass);
		return flag;
	}
}
