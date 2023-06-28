package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Name of the Student is Abinaya");
	}
public void studentDept() 
{
	System.out.println("Student belong to Information Technology");
}
public void studentId() 
{
	System.out.println("Student ID is 25689");
}

public static void main(String[] args) {

	Student s=new Student();
	s.collegeCode();
	s.collegeName();
	s.collegeRank();
	s.deptName();
	s.studentDept();
	s.studentId();
	s.studentName();
}
}
