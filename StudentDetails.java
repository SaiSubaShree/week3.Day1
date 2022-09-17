package org.student;

import java.math.BigInteger;

public class StudentDetails {

	public void getStudentInfo()
	{
		System.out.println("Welcome to student details display");
	}
	public void getStudentInfo(int id)
	{
	int val=id;
	System.out.println("The sudent id is "+val);

	}
	public void getStudentInfo(int id,String name)
	{
		int val= id;
		String stuname=name;
		System.out.println("The student name is "+ stuname+ " and Id is"+ val);
		
	}
	public void getStudentInfo(String email,long ph)
	{
		long phone=ph;
		String mail=email;
		System.out.println("The Email of the student is "+mail+ " and phone number is "+phone);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentDetails stu=new StudentDetails();
stu.getStudentInfo();
stu.getStudentInfo(601);
stu.getStudentInfo(601, "Raghu");
stu.getStudentInfo("Ram@gmail.com",1234556);
		
	}

}
