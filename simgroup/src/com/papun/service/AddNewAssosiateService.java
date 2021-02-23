
package com.papun.service;


import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.QueryRunner;

public class AddNewAssosiateService {
    QueryRunner queryRunner = new QueryRunner();

	public String getResponseHtml(String id,String page,HttpSession session) {
		String html="";
		try {
//			Connection con= new JDBCConectionPool().createDBConnection();
//			String login_details_query="select name, type, id, status from admin_login where id!=?";
//			 ResultSetHandler<List<AdminLogin>> resultHandler = new BeanListHandler<AdminLogin>(AdminLogin.class);
//		      List<AdminLogin> empList = queryRunner.query(con, login_details_query, resultHandler,id);
//			if(empList==null) {
//				html="<!DOCTYPE html><html><body><h1>"
//						+ "<h2 style=\"color:black;\">Welcome Admin!</h2>\r\n" + 
//						"<p style=\"color:black;\">What would you like to do?</p><p style=\"color:red;\">No Record Found</p>"
//						+ "</h1></body></html>";
//			}else {
				html=getHtmlResponse_viewAdmin();
//			}
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
		
		
//		//List<AdminLogin> empList=null;
//		//String page=page;
//		String page_session=(String) session.getAttribute("page_viewAdmin");
//		int start_page=0;
//		int end_page=0;
//		if(page.equals("left") && empList.size()>10){
//			start_page=Integer.parseInt(page_session.split("-")[0])-10;
//			end_page=Integer.parseInt(page_session.split("-")[1])-10;
//			if(start_page<0) {
//				start_page=Integer.parseInt(page_session.split("-")[0]);
//				end_page=Integer.parseInt(page_session.split("-")[1]);
//			}
//			page_session=start_page+"-"+end_page;
//
//		}
//		else if(page.equals("right") && empList.size()>10){
//			start_page=Integer.parseInt(page_session.split("-")[0])+10;
//			end_page=Integer.parseInt(page_session.split("-")[1])+10;
//			if(end_page>empList.size()) {
//				start_page=Integer.parseInt(page_session.split("-")[0]);
//				end_page=Integer.parseInt(page_session.split("-")[1]);
//			}
//			page_session=start_page+"-"+end_page;
//		}
//		else if(page.equals("0") && empList.size()>10) {
//				//empList
//			start_page=0;
//			end_page=10;
//				page_session="0-10";
//			}
//		else if(page.equals("last")) {
//			start_page=Integer.parseInt(page_session.split("-")[0]);
//			end_page=Integer.parseInt(page_session.split("-")[1]);
//		}
//		else {
//			start_page=0;
//			end_page=empList.size();
//			page_session="0-"+empList.size();
//		}
//		session.removeAttribute("page_viewAdmin");
//		session.setAttribute("page_viewAdmin",page_session);
//		StringBuilder td_html=new StringBuilder();
//		int temprow=1;
		StringBuilder td_html=new StringBuilder();
		
			
		String fort_html="<form action='/action_page.php'>" + 
				"  <tr style='background-color: #f2f2f2'><td><label for='memberid'>Member ID:*</label>" + 
				"  <input type='tel' id='memberid' name='memberid' ><br><br></td></tr>" + 
				"  " + 
				"  <tr style='background-color: white'><td><label for='introducer_id'>Introducer ID:* </label>  <input type='tel' id='introducer_id' name='introducer_id' ><br><br></td></tr>" + 
				"  " + 
				"  <tr style='background-color: #f2f2f2'><td><label for='palacement_id'>Placement ID:* </label>  <input type='tel' id='palacement_id' name='palacement_id' ><br><br></td></tr>" + 
				"  <tr style='background-color: white'><td><label for='select_position'>Select Position :*</label>  <select id='select_position' name='select_position'><option value='Left'>Left</option>  <option value='Right'>Right</option>" + 
				"  </select><br><br></td></tr>" + 
				"  <tr style='background-color: #f2f2f2'><td><label for='title'>title:</label>" + 
				"  <input type='tel' id='title' name='title' >&nbsp;&nbsp;" + 
				"  <label for='first_name'>First Name *:</label>" + 
				"  <input type='tel' id='first_name' name='first_name' >&nbsp;&nbsp;" + 
				"  <label for='middle_name'>Middle Name:</label>" + 
				"  <input type='tel' id='middle_name' name='middle_name' >&nbsp;&nbsp;  " + 
				"  <br><br>" + 
				"   <label for='last_name'>Last Name *:</label>" + 
				"  <input type='tel' id='last_name' name='last_name' >&nbsp;&nbsp;  " + 
				"  <br><br></td></tr>" + 
				"    <tr style='background-color: white'><td><label for='conatct_no'>Contact No.:* </label>" + 
				"  <input type='tel' id='conatct_no' name='conatct_no' ><br><br></td></tr><tr style='background-color: #f2f2f2'><td><label for='email_id'>EMAIL ID:</label>" + 
				"  <input type='tel' id='email_id' name='email_id' ><br><br></td></tr><tr style='background-color: white'><td><label for='address'>Address: </label>" + 
				"  <input type='tel' id='address' name='address' ><br><br></td></tr><tr style='background-color: #f2f2f2'><td><label for='city'>City : </label>" + 
				"  <input type='tel' id='city' name='city' ><br><br></td></tr>" + 
				"  <tr style='background-color: white'><td><label for='pincode'>Pin Code: </label>" + 
				"  <input type='tel' id='pincode' name='pincode' ><br><br></td></tr><tr style='background-color: #f2f2f2'><td><label for='pan'>PAN:</label>" + 
				"  <input type='tel' id='pan' name='pan' ><br><br></td></tr><tr style='background-color: white'><td><label for='adhar_no'>Aadhar No:</label>" + 
				"  <input type='tel' id='adhar_no' name='adhar_no' ><br><br></td></tr><tr style='background-color: #f2f2f2'><td><label for='nominee_name'>Nominee Name:</label>" + 
				"  <input type='tel' id='nominee_name' name='nominee_name' ><br><br></td></tr><tr style='background-color: white'><td><label for='relationship_nominee'>Relationship With Nominee:   </label>" + 
				"  <input type='tel' id='relationship_nominee' name='relationship_nominee' ><br><br></td></tr>" + 
				"  <tr style='background-color: #f2f2f2'><td><label style='color:green'for='phone'>Bank A/C. Particulars(Compulsary)</label>" + 
				"  <tr style='background-color: white'><td><label for='benificiary_name'>Beneficiary Name:</label>" + 
				"  <input type='tel' id='benificiary_name' name='benificiary_name' ><br><br></td></tr><tr style='background-color: #f2f2f2'><td><label for='bank_name'>Bank Name:  </label>" + 
				"  <input type='tel' id='bank_name' name='bank_name' ><br><br></td></tr><tr style='background-color: white'><td><label for='bank_branch'>Bank Branch:  </label>" + 
				"  <input type='tel' id='bank_branch' name='bank_branch' ><br><br></td></tr><tr style='background-color: #f2f2f2'><td><label for='ifsc'>IFSC Code</label>" + 
				"  <input type='tel' id='ifsc' name='ifsc' ><br><br></td></tr><tr style='background-color: white'><td><label for='acc_num'>A/C No.: </label>" + 
				"  <input type='tel' id='acc_num' name='acc_num' ><br><br></td></tr>" + 
				" <tr style='background-color: #f2f2f2'><td><label for='account_type'>A/C Type.:</label>" + 
				"  <select id='account_type' name='account_type'>" + 
				"    <option value='saving_account'>Saving Account</option>" + 
				"    <option value='current_account'>Current Account</option>" + 
				"  </select><br><br></td></tr>" + 
				"  <tr style='background-color: white'><td><label for='join_date'>Joining Date:  </label>" + 
				"  <input type='date' id='join_date' name='join_date' ><br><br></td></tr>" + 
				"  <tr style='background-color: #f2f2f2'><td><input type='submit'></td> </tr>" + 
				"</form>";


				
//td_html.append("<form action=\"/action_page.php\">");
//					
//					td_html.append("<tr style='background-color: #f2f2f2'><td>" + 
//							"					     <td><label for=\"memberid\">Member ID:*</label><input type=\"tel\" id=\"memberid\" name=\"memberid\" ><br><br></td>"+
//							"					   </tr>");
//				
//					td_html.append("<tr style=\"background-color: white\">" + 
//							"					      <td>"+temprow+"</td>" + 
//							
//							"					    </tr>");
//				
//				
//td_html.append("</form>");		
			
		
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
					"  <div style=\"float:left;width:50%;\"><B style=\"color:black;\">Manage Assosiate</B></div>\r\n" + 
					"  <div style=\"float:right;width:50%;text-align:right;color:black\">Add Assosiate </div>\r\n" + 
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
