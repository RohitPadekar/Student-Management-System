package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

import defaultpackage.student;

public class studentDao {

	public static boolean insert(student st) 
	{
		boolean f = false;
		try 
		{
			Connection con = CP.create();
			String que = "insert into students(sname,sphone,scity)values(?,?,?)";
			PreparedStatement PS = con.prepareStatement(que);
			PS.setString(1, st.getStudentName());
			PS.setString(2, st.getStudentPhone());
			PS.setString(3, st.getStudentCity());
			PS.executeUpdate();
			f = true;
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return f;
	}

	public static boolean deleteStudent(int userId)
	{
		boolean f = false;
		try 
		{
			Connection con = CP.create();
			String que = "delete from students where sid=?";
			PreparedStatement PS = con.prepareStatement(que);
			PS.setInt(1, userId);
		
			PS.executeUpdate();
			f = true;
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return f;
	}

	public static void showAllData() 
	{

		boolean f = false;
		try 
		{
			Connection con = CP.create();
			String que = "select * from students";
			java.sql.Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(que); 
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);
				
				System.out.println("Id : "+ id);
				System.out.println("Name : "+ name);
				System.out.println("Phone : "+ phone);
				System.out.println("City : "+ city);
				System.out.println("+++++++++++++++++++++++++++++++++++");
			}
			f = true;
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
