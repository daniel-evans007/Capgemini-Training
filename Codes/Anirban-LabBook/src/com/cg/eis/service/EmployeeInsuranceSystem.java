package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeInsuranceSystem implements EmployeeService{

	Employee emp = new Employee();
	
	public void getEmployeeDetails() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter ID: ");
		emp.setId(sc.nextLine());
		
		System.out.print("Enter Name: ");
		emp.setName(sc.nextLine());
		
		System.out.print("Enter Salary: ");
		emp.setSalary(Double.parseDouble(sc.nextLine()));
		
		System.out.print("Enter Designation: ");
		emp.setDesignation(sc.nextLine());
		
		sc.close();
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
	
	public void displayEmployeeDetails() {
		
		System.out.print("\nEmployee ID: "+emp.getId());
		System.out.print("\nEmployee Name: "+emp.getName());
		System.out.print("\nEmployee Salary: "+emp.getSalary());
		System.out.print("\nEmployee Designation: "+emp.getDesignation());
		System.out.print("\nEmployee Insurance Scheme: "+emp.getInsuranceScheme());
	}
}