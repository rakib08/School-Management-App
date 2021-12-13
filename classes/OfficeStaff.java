package classes;
import java.lang.*;

public  class OfficeStaff extends Employee
{

	public OfficeStaff(String name, String empId, double salary)
	{
		super(name, empId, salary);
	}

	public void showDetails()
	{
		System.out.println("OfficeStaff ID: " + empId);
		System.out.println("OfficeStaff Name: " + name);
		System.out.println("OfficeStaff Salary: " + salary);
		System.out.println();
	}
}