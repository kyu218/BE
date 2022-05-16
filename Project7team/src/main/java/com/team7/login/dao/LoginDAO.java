package com.team7.login.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team7.login.dto.LoginVO;

@Repository("LoginDAO")
public class LoginDAO {
	
	@Autowired
	private SqlSession mybatis;
	
	public LoginVO getInfo() {
		return mybatis.selectOne("login.getInfo");
	}
}
