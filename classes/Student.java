package classes;

import java.lang.*;


public class Student
{	
	private String name;
	private String studentID;
	private String dob; /* dob = Date Of Birth */
	
	public Student() { }
	public Student(String name, String studentID, String dob)
	{
		this.name = name;
		this.studentID = studentID;
		this.dob = dob;  /* dob = Date Of Birth */
	}
	public void setName(String name){ this.name = name; }
	public void setStudentID(String studentID) { this.studentID = studentID; }
	public void setDOB(String dob) { this.dob = dob;}
	
	public String getName() { return name; }
	public String getStudentID() { return studentID; }
	public String getDOB() { return dob;}
	
	public void showDetails()
	{
		
	}

}
	
	
	