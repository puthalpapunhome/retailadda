package com.papun.service;

import javax.servlet.http.HttpSession;

import com.papun.dao.JDBCConectionPool;

public class LoginService {

	public String checkLogin(String username, String password,String ip,HttpSession session) {
		// TODO Auto-generated method stub
		try {
			return new JDBCConectionPool().validateCredentials(username,password,ip,session);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "";
	}

}
