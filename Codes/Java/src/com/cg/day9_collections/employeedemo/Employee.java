package com.cg.day9_collections.employeedemo;

public class Employee {

	private String empID;
	private String empName;
	
	public Employee() {
		
	}

	public Employee(String empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}
}