package com.capgemini.day6.payroll;

import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name and salary of Admin: ");
		Admin admin = new Admin(sc.nextLine(), Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter name and salary of Academic: ");
		Academic academic = new Academic(sc.nextLine(), Integer.parseInt(sc.nextLine()));

		System.out.print("\nAdjusted Salary of Admin is: "+admin.adjustSalary(-1000));
		System.out.print("\nAdjusted Salary of Academic is: "+academic.adjustSalary(+1500));
		
		sc.close();
	}
}