package classes;

import java.lang.*;
import interfaces.*;

public class School implements StudentOperations, TeacherOperations, EmployeeOperations
{
	private String name;
	private String address;
	private Student students[] = new Student [2000];
	private Teacher teachers[] = new Teacher [200];
	private Employee employees[] = new Employee [50];
	
	public School(){}
	public School(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	public void setName(String name){this.name = name;}
	public void setAddress(String address){this.address = address;}
	
	public String getName(){return name;}
	public String getAddress(){return address;}

	public boolean insertStudent(Student s)
	{
		for(int i=0; i<students.length; i++)
		{
			if(students[i] == null)
			{
				students[i] = s;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeStudent(Student s)
	{
		for(int i=0; i<students.length; i++)
		{
			if(students[i] == s)
			{
				students[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Student searchStudent(String studentID)
	{
		for(int i=0; i<students.length; i++)
		{
			if(students[i] != null)
			{
				if(students[i].getStudentID().equals(studentID))
				{
					return students[i];
				}
			}
		}
		return null;
	}
	
	public void showAllStudents()
	{
		for(int i=0; i<students.length; i++)
		{
			if(students[i] != null)
			{
				students[i].showDetails();
			}
		}
	}
	
	
	public boolean insertTeacher(Teacher T)
	{
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] == null)
			{
				teachers[i] = T;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeTeacher(Teacher T)
	{
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] == T)
			{
				teachers[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Teacher searchTeacher(String id)
	{
		for(int i=0; i < teachers.length; i++)
		{
			if(teachers[i] != null)
			{
				if(teachers[i].getEmpId() == id)
				{
					return teachers[i];
				}
			}
		}
		return null;
	}
	
	public void showAllTeachers()
	{
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] != null)
			{
				teachers[i].showDetails();
			}
		}
	}
	
	public boolean insertEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Employee searchEmployee(String empId)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					return employees[i];
				}
			}
		}
		return null;
	}
	
	public void showAllEmployees()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				employees[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("**** School Information ****");
		System.out.println("School Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("//////////////////////////////////");
		System.out.println("### List of Students ###");
		this.showAllStudents();
		System.out.println("//////////////////////////////////");
		System.out.println();
		System.out.println("### List of Teachers ###");
		this.showAllTeachers();
		System.out.println("//////////////////////////////////");
		System.out.println("### List of Employees ###");
		this.showAllEmployees();
		System.out.println("//////////////////////////////////");
		
	}	
}