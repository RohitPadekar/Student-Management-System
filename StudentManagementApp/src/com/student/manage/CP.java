package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	public static Connection create()
	{
		
		try
		{
			//load the class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the connection
			String url = "jdbc:mysql://localhost:3306/student_manage";
			String user = "root";
			String pass = "Rohit@98";
			con = DriverManager.getConnection(url, user, pass);
			
		} catch (Exception e) 
		{
			System.out.println(e);
		}
		return con;
	}
	
	public static void main(String[] args) 
	{


	}

}
