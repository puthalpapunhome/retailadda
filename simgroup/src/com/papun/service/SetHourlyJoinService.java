package com.papun.service;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.papun.dao.JDBCConectionPool;
import com.papun.vobs.ManageLogin;

public class SetHourlyJoinService {
	QueryRunner queryRunner = new QueryRunner();
	public Object getResponseHtml(String id, String page, HttpSession session) {


		String html="";
		try {
			Connection con= new JDBCConectionPool().createDBConnection();
			String login_details_query="SELECT count(*) as id  FROM member where active='Y'";
			 ResultSetHandler<List<ManageLogin>> resultHandler = new BeanListHandler<ManageLogin>(ManageLogin.class);
		      List<ManageLogin> empList = queryRunner.query(con, login_details_query, resultHandler);
			if(empList==null) {
				html="<!DOCTYPE html><html><body><h1>"
						+ "<h2 style=\"color:black;\">Welcome Admin!</h2>\r\n" + 
						"<p style=\"color:black;\">What would you like to do?</p><p style=\"color:red;\">No Record Found</p>"
						+ "</h1></body></html>";
			}else {
				html=getHtmlResponse_SetHourlyJoin(empList,session);
			}
			return html;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "";
		// TODO Auto-generated method stub
		
	
	}
	private String getHtmlResponse_SetHourlyJoin(List<ManageLogin> empList, HttpSession session) {


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
					"      <th style=\"color:black;\">Current Active Member:"+empList.get(0).getId()+"</th>\r\n" + 
					
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
	private String getTdData(List<ManageLogin> empList, HttpSession session) {
		try {
			StringBuilder td_html=new StringBuilder();
			String count="";
						td_html.append("<tr style=\"background-color: white\">" + 
								 
								"					      <td>"
								+ "<table action=\"../CardDistributedSystem/setHourlyJoin?page_type=update_commision\" method=\"get\">"
								+" Current Commission: <input type=\"text\" name=\"update_comision_value\" placeholder=\""+count+"\">"
								  +"</tr><tr style=\"background-color: #f2f2f2\">"
								  +"<input  type=\"submit\" value=\"update\">"
								+ "</table> "
								+ "</td>" + 
								"					    </tr>");
					
					
				
				
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		return null;
	}

}
