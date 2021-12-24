package com.assessment3.pract1;

public class Employee {
	private String empName;
	private String Id;
	
	public Employee(String empName, String Id) {
		super();
		this.empName = empName;
		this.Id = Id;
	}
	
	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", Id=" + Id + "]";
	}
	
}
