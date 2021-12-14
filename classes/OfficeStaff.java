package classes;
import java.lang.*;

public  class OfficeStaff extends Employee
{
	String post;

	public OfficeStaff(String name, String empId, double salary, String post)
	{
		super(name, empId, salary);
		this.post = post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getPost() {
		return post;
	}

	public void showDetails()
	{
		System.out.println("OfficeStaff ID: " + empId);
		System.out.println("OfficeStaff Name: " + name);
		System.out.println("OfficeStaff Salary: " + salary);
		System.out.println("OfficeStaff Post: " + post);
		System.out.println();
	}
}