package com.cg.eis.service;

import com.cg.eis.exception.EmployeeException;

public interface EmployeeService {

	public void getEmployeeDetails() throws EmployeeException;
	
	public void getInsuranceScheme();
	
	public void displayEmployeeDetails();
}