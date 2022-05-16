package com.team7.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team7.login.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login/loginPage.do")
	public String loginPage() {
		return "/login/loginPage";
	}
	
	@RequestMapping(value="/login/accessDenied.do")
	public String accessDeniedPage() throws Exception {
		return "/login/accessDenied";
	}
}
