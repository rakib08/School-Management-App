package classes;

import java.lang.*;

public class Teacher extends Employee {
	private String subject;
	private String designation;

	public Teacher(String name, String empId, double salary, String subject, String designation) {
		super(name, empId, salary);
		this.subject = subject;
		this.designation = designation;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSubject() {
		return subject;
	}

	public String getDesignation() {
		return designation;
	}

	public void showDetails() {
		System.out.println("Teacher Name: " + name);
		System.out.println("Teacher ID : " + empId);
		System.out.println("Subject: " + subject);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
		System.out.println();
	}
}
