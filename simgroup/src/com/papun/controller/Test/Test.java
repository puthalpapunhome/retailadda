package com.papun.controller.Test;



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


@WebServlet(urlPatterns={"/test"})
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	
		PrintWriter out = response.getWriter();

        HttpSession session=request.getSession(false);  
       // session.getAttribute("name")
       if(session==null) {
    	   out.println("{\"ARTIST\":\"papun\",\"title\":\"fg\"}");
       }
       try {
        System.out.println( session.getAttribute("uname"));
        AdminLogin ad=(AdminLogin)session.getAttribute("obj");
        System.out.println( session.getAttribute("obj"));
        System.out.println(ad.getName());
	      out.println("<h1> succefully view </h1>");
	      
       }catch(Exception e) {
    	   e.printStackTrace();
       }
	
	
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
