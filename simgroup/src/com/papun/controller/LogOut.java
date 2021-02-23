package com.papun.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.papun.service.LoginService;
import com.papun.vobs.AdminLogin;

@WebServlet(urlPatterns={"/LogOut"})
public class LogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LogOut() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
        
        HttpSession session=request.getSession();  
        session.invalidate();  
        request.getRequestDispatcher("index.jsp").include(request, response);  

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
