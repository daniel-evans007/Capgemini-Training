package com.cg.day17.SOLIDprinciples.srp;

import java.util.Date;

//single responsibility principle
public class Employee {

	private String empId;
	private String empName;
	private String empAddress;
	private Date doj;
	
	public Employee(String empId, String empName, String empAddress, Date doj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.doj = doj;
	}
	
	
}