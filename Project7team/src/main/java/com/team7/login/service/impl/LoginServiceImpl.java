package com.team7.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team7.login.dao.LoginDAO;
import com.team7.login.dto.LoginVO;
import com.team7.login.service.LoginService;

@Repository
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDAO loginDAO;
	
	@Override
	public LoginVO getInfo() {
		return loginDAO.getInfo();
	}
}
