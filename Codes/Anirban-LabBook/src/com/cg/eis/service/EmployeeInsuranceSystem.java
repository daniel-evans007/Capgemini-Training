package com.cg.eis.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public class EmployeeInsuranceSystem implements EmployeeService {

	Employee emp = new Employee();
	HashMap<String, Employee> empMap = new HashMap<String, Employee>();
	static Scanner sc = new Scanner(System.in);
	
	public void getEmployeeDetails() throws EmployeeException {
		
		System.out.print("Enter ID: ");
		emp.setId(sc.nextLine());
		
		System.out.print("Enter Name: ");
		emp.setName(sc.nextLine());
		
		System.out.print("Enter Salary: ");
		emp.setSalary(Double.parseDouble(sc.nextLine()));
		
		if (emp.getSalary() < 3000) {
			throw new EmployeeException("Salary cannot be so low.");
		}
		
		System.out.print("Enter Designation: ");
		emp.setDesignation(sc.nextLine());
		
		empMap.put(emp.getId(), emp);
	}
	
	public void getInsuranceScheme() {
		
		emp.setInsuranceScheme("No Scheme");
		
		if (emp.getSalary() < 5000 && emp.getDesignation().equalsIgnoreCase("Clerk")) {
			emp.setInsuranceScheme("No Scheme");
		}
		else if (emp.getSalary() > 5000 && emp.getSalary() < 20000 && emp.getDesignation().equalsIgnoreCase("System Associate")) {
			emp.setInsuranceScheme("Scheme C");
		}
		else if (emp.getSalary() >= 20000 && emp.getSalary() < 40000 && emp.getDesignation().equalsIgnoreCase("Programmer")) {
			emp.setInsuranceScheme("Scheme B");
		}
		else if (emp.getSalary() >= 40000 && emp.getDesignation().equalsIgnoreCase("Manager")) {
			emp.setInsuranceScheme("Scheme A");
		}
	}
	
	public void deleteEmployee() {
		System.out.print("Enter the Employee ID: ");
		String identity = sc.nextLine();
		
		for (Map.Entry<String, Employee> element : empMap.entrySet()) {
			if (element.getKey().equals(identity)) {
				empMap.remove(emp.getId());
			}
		}
	}
	
	public void displayEmployeeDetails() {
		for (Map.Entry<String, Employee> emp : empMap.entrySet()) {
			emp.getValue().print();
		}
	}
}