package com.student.manage;

import java.util.Scanner;

import defaultpackage.student;

public class start {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		while(true)
		{
			System.out.println("press 1 to add student");
			System.out.println("press 2 to delete student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit student");
			int c = sc.nextInt();
			if (c==1)
			{
				System.out.println("enter Name");
				String name = sc1.nextLine();
				System.out.println("enter Phone");
				String phone = sc1.nextLine();
				System.out.println("enter City");
				String city = sc1.nextLine();
				
				student st = new student(name, phone, city);
				Boolean ans =  studentDao.insert(st);
				if (ans = true)
				{
					System.out.println("true");
				}
				System.out.println(st);
			}
			else if (c==2)
			{
				System.out.println("Enter Student id to delete :-");
				int userId = sc.nextInt();
				Boolean f= studentDao.deleteStudent(userId);
				if(f)
				{
					System.out.println("deleted");
				}
				else {
					System.out.println("Something went wrong");
				}
			}
			else if (c==3)
			{
				studentDao.showAllData();
				
			}
			else if (c==4)
			{
				break;
			}
			else 
			{
				
			}
			
		}
		System.out.println("thnak you using my application");
		System.out.println("see you soon");
	}

}
