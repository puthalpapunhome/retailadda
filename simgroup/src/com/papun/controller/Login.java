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


@WebServlet(urlPatterns={"/login"})
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 HttpSession session=request.getSession();  
		String username=request.getParameter("uname");
		
		String password=request.getParameter("password");
		
		String ip=request.getLocalAddr();
		
	System.out.println(">>"+username+" "+password+" "+ip);
	
	LoginService login=new LoginService();
	AdminLogin al=new AdminLogin();
	al.setName(username);
	al.setPassword(password);
	String resp="";
	try {
		 resp=login.checkLogin(username,password,ip,session);
	}catch(Exception e) {
		e.printStackTrace();
	}
	if(!resp.contains("NOK")) {
		
		
		System.out.println("succefully login");
		
		Random rand = new Random(); 
		  
       
        session.setAttribute("uname", username);
        int rand_int1 = rand.nextInt(1000);
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String,Integer>();
        lhm.put(""+rand_int1,rand_int1);
        System.out.println(lhm);
        //out.print("<a href='/CardDistributedSystem/test'>visit</a>"); 
        session.setAttribute("obj", al);
        response.sendRedirect("/CardDistributedSystem/home.jsp");  
	      
	}
	else if(resp.contains("Invalid credentials")) {
		System.out.println("not succefully login");
		request.setAttribute("StatusCode","300");
		request.setAttribute("StatusMessage","NOK");
		request.setAttribute("ErrorMessage","Login with proper username and password!");
		request.getRequestDispatcher("index.jsp").forward(request, response); 
	}
	else {
		System.out.println("not succefully login");
		request.setAttribute("StatusCode","300");
		request.setAttribute("StatusMessage","NOK");
		request.setAttribute("ErrorMessage",resp.split(",")[1]);
		request.getRequestDispatcher("index.jsp").forward(request, response); 
        //response.sendRedirect("/CardDistributedSystem/index.jsp");  

	}
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
