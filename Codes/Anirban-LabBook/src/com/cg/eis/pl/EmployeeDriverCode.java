package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeInsuranceSystem;

public class EmployeeDriverCode {

	public static void main(String[] args) throws EmployeeException {
		
		
		Scanner sc = new Scanner(System.in);
		EmployeeInsuranceSystem empInSys = new EmployeeInsuranceSystem();
		
		String choice = "yes";
		
		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("Enter 1 to add an Employee and auto-apply an Insurance scheme: ");
			System.out.println("Enter 2 to delete an Employee: ");
			System.out.println("Enter 3 to display all the Employees: ");
			System.out.print("\nEnter your choice: ");
			int option = Integer.parseInt(sc.nextLine());
			
			switch (option) {
			case 1:
				empInSys.getEmployeeDetails();
				empInSys.getInsuranceScheme();
				break;
			case 2:
				empInSys.deleteEmployee();
				break;
			case 3:
				empInSys.displayEmployeeDetails();
				break;
			default:
				System.out.println("Invalid choice...");
			}
			
			System.out.println("\nDo you want to continue, yes or no: ");
			choice = sc.nextLine();
			
			if (!choice.equalsIgnoreCase("yes")) {
				System.out.println("\nExiting Program successfully...");
				System.exit(0);
			}
			
			System.out.println();
		}
	}
}