package org.student;

import org.department.Department;

public class Student extends Department {
public void studentName()
{
	System.out.println("The Student Name is Raghu");
}
	public String studentDept()
	{
		return "Mechanical";
	}
	public void studentId()
	{
		System.out.println("The student id is 10005");
	}
	public static void main (String args[])
	{
		Student st= new Student();
		String deptName = st.deptName();
		System.out.println(" The department name is "+ deptName);
		st.collegeName();
		st.collegeRank();
		int collegeCode = st.collegeCode();
		System.out.println("The college code is "+ collegeCode);
		String studentDept = st.studentDept();
		System.out.println("The Student dept is "+studentDept);
		st.studentId();
		
		
	}
	
}
