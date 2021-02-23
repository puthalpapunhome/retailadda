package com.papun.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.papun.service.ManageAdminService;
import com.papun.service.ViewAdminService;

@WebServlet(urlPatterns={"/manageAdmin"})
public class ManageAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ManageAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	HttpSession session=request.getSession();  
    	if(session==null) {
    		System.out.println("not succefully login");
    		request.setAttribute("StatusCode","300");
    		request.setAttribute("StatusMessage","NOK");
    		request.setAttribute("ErrorMessage","Please Login,You are not logged in yet!");
    		request.getRequestDispatcher("index.jsp").forward(request, response); 
    	}else {
    	String id=(String) session.getAttribute("id");  
    	System.out.println("view admin id"+id);
    	String defaultt="view_admin";
    	
		String page_type=(String) request.getParameter("page_type");
		System.out.println("page_type >"+page_type);
		if( page_type.equals("manage_admin_page")) {
			String page=(String) request.getParameter("page");
	    	
	    	System.out.println("not succefully login");
			request.setAttribute("StatusCode","200");
			request.setAttribute("StatusMessage","OK");
			request.setAttribute("ErrorMessage",new ManageAdminService().getResponseHtml(id,page,session));
			//request.getRequestDispatcher("index.jsp").forward(request, response); 
			request.getRequestDispatcher("manageAdmin.jsp").forward(request, response); 
	        //response.sendRedirect("/CardDistributedSystem/ViewAdmin.jsp");  
		}else {
			
		}
		

    	
    	}
    }

}
