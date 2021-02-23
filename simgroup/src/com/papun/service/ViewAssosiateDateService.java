

package com.papun.service;


import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.QueryRunner;

public class ViewAssosiateDateService {
    QueryRunner queryRunner = new QueryRunner();

	public String getResponseHtml(String id,String page,HttpSession session) {
		String html="";
		try {

				html=getHtmlResponse_viewAdmin();

			return html;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "";
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		System.out.println(new AddNewAssosiateService().getTdData());
	}
	public String getTdData() {
		
		

		StringBuilder td_html=new StringBuilder();
		
			
		String fort_html="<form action='/action_page.php'>" + 
				"  <tr style='background-color: #f2f2f2'><td><label for='statringDate'>Enter Starting Date</label>" + 
				"  <input type='date' id='statringDate' name='statringDate' ><br><br></td></tr>" + 
				"  " + 
				"  <tr style='background-color: white'><td><label for='endDate'>Enter End Date </label>  <input type='date' id='endDate' name='endDate' ><br><br></td></tr>" + 
				"  <tr style='background-color: #f2f2f2'><td><input type='submit'></td> </tr>" + 
				"</form>";


				
	
			
		
		return fort_html;
		
		
		//System.out.println(new ViewAdminService(). getHtmlResponse_viewAdmin());
	}

	public String getHtmlResponse_viewAdmin() {
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
					"  <div style=\"float:left;width:50%;\"><B style=\"color:black;\">View Distributor (Date-wise)</B></div>\r\n" + 
					"  <div style=\"float:right;width:50%;text-align:right;color:black\">View Distributor (Date-wise)</div>\r\n" + 
					"</td>\r\n" + 
					"</tr>\r\n" + 
					"<tr style=\"height: 164px;\">\r\n" + 
					"<td style=\"width: 100%; height: 164px;\">\r\n" + 
					"\r\n" + 
					"<div style=\"overflow-x:auto;\">\r\n" + 
					"  <table>\r\n" + 
					"    <tr>\r\n" + 
					"      <th style=\"color:green;\">Personal Details</th>\r\n" + 
					
					"    </tr>\r\n" + getTdData()+
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
