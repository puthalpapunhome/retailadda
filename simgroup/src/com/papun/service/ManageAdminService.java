package com.papun.service;


import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.papun.dao.JDBCConectionPool;
import com.papun.vobs.AdminLogin;
import com.papun.vobs.ManageLogin;

public class ManageAdminService {
    QueryRunner queryRunner = new QueryRunner();

	public String getResponseHtml(String id,String page,HttpSession session) {
		String html="";
		try {
			Connection con= new JDBCConectionPool().createDBConnection();
			String login_details_query="select id, branch_name, short_code from branch";
			 ResultSetHandler<List<ManageLogin>> resultHandler = new BeanListHandler<ManageLogin>(ManageLogin.class);
		      List<ManageLogin> empList = queryRunner.query(con, login_details_query, resultHandler);
			if(empList==null) {
				html="<!DOCTYPE html><html><body><h1>"
						+ "<h2 style=\"color:black;\">Welcome Admin!</h2>\r\n" + 
						"<p style=\"color:black;\">What would you like to do?</p><p style=\"color:red;\">No Record Found</p>"
						+ "</h1></body></html>";
			}else {
				html=getHtmlResponse_viewAdmin(empList,session);
			}
			return html;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "";
		// TODO Auto-generated method stub
		
	}
	public String getTdData(List<ManageLogin> empList,HttpSession session) {
		
		
		//List<AdminLogin> empList=null;
		String page="";
		String page_session=(String) session.getAttribute("page_viewAdmin");
		int start_page=0;
		int end_page=0;
		if(page.equals("left") && empList.size()>10){
			start_page=Integer.parseInt(page_session.split("-")[0])-10;
			end_page=Integer.parseInt(page_session.split("-")[1])-10;
			if(start_page<0) {
				start_page=Integer.parseInt(page_session.split("-")[0]);
				end_page=Integer.parseInt(page_session.split("-")[1]);
			}
			page_session=start_page+"-"+end_page;

		}
		else if(page.equals("right") && empList.size()>10){
			start_page=Integer.parseInt(page_session.split("-")[0])+10;
			end_page=Integer.parseInt(page_session.split("-")[1])+10;
			if(end_page>empList.size()) {
				start_page=Integer.parseInt(page_session.split("-")[0]);
				end_page=Integer.parseInt(page_session.split("-")[1]);
			}
			page_session=start_page+"-"+end_page;
		}
		else if(page.equals("0") && empList.size()>10) {
				//empList
			start_page=0;
			end_page=10;
				page_session="0-10";
			}
		else if(page.equals("last")) {
			start_page=Integer.parseInt(page_session.split("-")[0]);
			end_page=Integer.parseInt(page_session.split("-")[1]);
		}
		else {
			start_page=0;
			end_page=empList.size();
			page_session="0-"+empList.size();
		}
		session.removeAttribute("page_viewAdmin");
		session.setAttribute("page_viewAdmin",page_session);
		StringBuilder td_html=new StringBuilder();
		int temprow=1;
		for(int i=0;i<end_page;i++) {
			if(i==start_page || i>start_page ) {
				
				if(i%2==0) {
					
					td_html.append("<tr style=\"background-color: #f2f2f2\">" + 
							"					     <td>"+temprow+"</td>"+
							"					     <td>"+empList.get(i).getBranch_name()+"</td>"+
							"					     <td>"+empList.get(i).getShort_code()+"</td>"+
							"					      "+
							"					     <td><a href=\"../CardDistributedSystem/viewAdmin?page=admin_setting&id="+empList.get(i).getId()+"\">setting|tick</a></td>"+
							"					   </tr>");
				}else {
					td_html.append("<tr style=\"background-color: white\">" + 
							"					      <td>"+temprow+"</td>" + 
							"					      <td>"+empList.get(i).getBranch_name()+"</td>" + 
							"					      <td>"+empList.get(i).getShort_code()+"</td>" + 
							"					     " + 
							"					      <td><a href=\"../CardDistributedSystem/viewAdmin?page=admin_id_tick&id="+empList.get(i).getId()+"&action=status&st=yes\">setting|tick</a></td>" + 
							"					    </tr>");
				}
				temprow++;
			}
			
		}
		return td_html.toString();
		
		
		//System.out.println(new ViewAdminService(). getHtmlResponse_viewAdmin());
	}

	public String getHtmlResponse_viewAdmin(List<ManageLogin> empList,HttpSession session) {
		// TODO Auto-generated method stub
		String html="";
		try {
			html="<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
					"<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n" + 
					"<style>\r\n" + 
					"table {\r\n" + 
					"  border-collapse: collapse;\r\n" + 
					"  border-spacing: 0;\r\n" + 
					"  width: 100%;\r\n" + 
					"  border: 0px solid #ddd;\r\n" + 
					"}\r\n" + 
					"\r\n" + 
					"th, td {\r\n" + 
					"  text-align: left;\r\n" + 
					"  padding: 8px;\r\n" + 
					"}\r\n" + 
					"\r\n" + 
					"th:first-child, td:first-child {\r\n" + 
					"  text-align: left;\r\n" + 
					"}\r\n" + 
					"\r\n" + 
					"tr:nth-child(even) {\r\n" + 
					"  background-color: #f2f2f2\r\n" + 
					"}\r\n" + 
					"\r\n" + 
					".fa-check {\r\n" + 
					"  color: green;\r\n" + 
					"}\r\n" + 
					"\r\n" + 
					".fa-remove {\r\n" + 
					"  color: red;\r\n" + 
					"}\r\n" + 
					"\r\n" + 
					"tr:nth-child(even){background-color: #f2f2f2}\r\n" + 
					"\r\n" + 
					"</style>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"\r\n" + 
					"<h2 style=\"color:black;\">Welcome Admin!</h2>\r\n" + 
					"<p style=\"color:black;\">What would you like to do?</p>\r\n" + 
					"\r\n" + 
					"<table style=\"border-collapse: collapse; width: 100%; height: 238px;\" border=\"1\">\r\n" + 
					"<tbody cellspacing=\"0\">\r\n" + 
					"<tr style=\"height: 34px;background-color: grey\" >\r\n" + 
					"<td style=\"width: 100%; height: 34px;\">\r\n" + 
					"\r\n" + 
					"  <div style=\"float:left;width:50%;\"><B style=\"color:black;\">Manage Branch</B></div>\r\n" + 
					"  <div style=\"float:right;width:50%;text-align:right;\"><a href=\"\">Admin List</a> |<a href=\"\"> Add Admin</a> </div>\r\n" + 
					"</td>\r\n" + 
					"</tr>\r\n" + 
					"<tr style=\"height: 164px;\">\r\n" + 
					"<td style=\"width: 100%; height: 164px;\">\r\n" + 
					"\r\n" + 
					"<div style=\"overflow-x:auto;\">\r\n" + 
					"  <table>\r\n" + 
					"    <tr>\r\n" + 
					"      <th style=\"color:black;\">Sl No.</th>\r\n" + 
					"      <th style=\"color:black;\">Branch Name</th>\r\n" + 
					"      <th style=\"color:black;\">Branch Code</th>\r\n" + 
					"      " + 
					"      <th style=\"color:black;\">Action</th>\r\n" + 
					"    </tr>\r\n" + getTdData( empList, session)+
					"  </table>\r\n" + 
					"</div>\r\n" + 
					"\r\n" + 
					"</td>\r\n" + 
					"</tr>\r\n" + 
					"<tr style=\"height: 40px;background-color: grey;\">\r\n" + 
					"<td style=\"width: 100%; height: 40px;text-align:right;\">\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"<div class=\"pagination\">\r\n" + 
					"  <a href=\"../CardDistributedSystem/viewAdmin?page=left&page_type=admin_page\">previous&lt;</a>  &nbsp;&nbsp;\r\n" + 
					"  <a href=\"../CardDistributedSystem/viewAdmin?page=right&page_type=admin_page\">&gt;next</a>\r\n" + 
					"</div>\r\n" + 
					"\r\n" + 
					"</td>\r\n" + 
					"</tr>\r\n" + 
					"</tbody>\r\n" + 
					"</table>\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"</body>\r\n" + 
					"</html>\r\n" + 
					" ";
			return html;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
