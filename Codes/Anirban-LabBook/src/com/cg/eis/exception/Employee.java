package com.cg.eis.exception;

import java.util.Scanner;

public class Employee {

	public static void validateEmployeeSalary(int salary) throws EmployeeException {
		if (salary < 3000) {
			throw new EmployeeException("Salary can't be so low.");
		}
		else {
			System.out.print("Salary is valid for an employee.");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the salary of the employee: ");
			int salary = sc.nextInt();
			
			validateEmployeeSalary(salary);
		}
		catch (EmployeeException e) {
			System.out.print(e.getMessage());
		}
		
		sc.close();
	}
}