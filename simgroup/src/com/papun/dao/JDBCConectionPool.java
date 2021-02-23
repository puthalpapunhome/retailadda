package com.papun.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.papun.vobs.AdminLogin;
import com.papun.vobs.LogInAdmin;


public class JDBCConectionPool {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/demotop1_simgroup_starwing_dbwingst";
	Connection  conn = null;
	static final String USER = "root";
	static final String PASS = "root";
    QueryRunner queryRunner = new QueryRunner();

	public JDBCConectionPool() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public Connection createDBConnection() {
		
		return conn;
		// TODO Auto-generated method stub
		
	}
	public String validateCredentials(String username, String password,String ip,HttpSession session) {
		// TODO Auto-generated method stub
		String msg="";
		try {
			String login_details_query="select id,username, name, type, status, super_control , branch_id from `admin_login` where `username`=? and `password`=?";
			String date="";
			String time="";
			try {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:a");  
				   LocalDateTime now = LocalDateTime.now();  
				   System.out.println(dtf.format(now)); 
				   date=dtf.format(now).split(" ")[0];
				   time=dtf.format(now).split(" ")[1];
			}catch(Exception e) {e.printStackTrace();}
			
		      ResultSetHandler<AdminLogin> resultHandler = new BeanHandler<AdminLogin>(AdminLogin.class);
		      AdminLogin empList = queryRunner.query(conn, login_details_query, resultHandler,username,password);
		      if(empList==null) {
		    	 // System.out.println("username from db"+empList.getUsername());
		    	  msg="NOK,Invalid credentials";
		      }else {
		    	  try {
		    	  //insert into log_in_admin
		    	  String insertInto_log_in_admin="INSERT INTO log_in_admin (admin_id, admin_name, username, date, time, ip) VALUES (?, ?, ?, ?, ?, ?)";
		    	 
		    	 // ResultSetHandler<LogInAdmin> resultHandlerinsertInto_log_in_admin = new BeanHandler<LogInAdmin>(LogInAdmin.class);
			      
		    	  int loginadmin = queryRunner.update(conn, insertInto_log_in_admin,empList.getId(),
		    			  empList.getName(),empList.getUsername(),date,time,ip);
			      
		    	  if(loginadmin!=1 && empList.getStatus().equals("n"))
		    		{
		    		  msg="NOK,You are blocked by Super-Admin!";
		    		}
		    	  else {
		    		  session.setAttribute("id", empList.getId());
		    		  msg="OK";
		    	  }
			      
		    	  }catch(Exception e) {
		    		  e.printStackTrace();
		    	  }
		    	 		      }
			
			
		}catch(Exception e) {
			e.printStackTrace();
			msg="NOK,Invalid credentials";
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return msg;
		
	}

	
}
