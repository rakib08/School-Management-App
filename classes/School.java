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
				students[i] = a;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeStudent(Student s)
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				students[i] = null;
				return true;
			}
		}
		return false;
	}
	
	/*public Account searchStudent(String studentID)
	{
		for(int i=0; i<students.length; i++)
		{
			if(students[i] != null)
			{
				if(students[i].getAccountNumber().equals(accountNumber))
				{
					return accounts[i];
				}
			}
		}
		return null;
	}*/
	
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
				teachers[i] = c;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeTeacher(Teacher T)
	{
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] == c)
			{
				teachers[i] = null;
				return true;
			}
		}
		return false;
	}
	
	/*public Customer searchCustomer(int nid)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				if(customers[i].getNid() == nid)
				{
					return customers[i];
				}
			}
		}
		return null;
	}*/
	
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
		this.showAllAccounts();
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