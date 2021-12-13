package classes;

import java.lang.*;

public abstract class Employee {
	protected String empId;
	protected String name;
	protected double salary;

	public Employee() {
	}

	public Employee(String name, String empId, double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	abstract public void showDetails();
}