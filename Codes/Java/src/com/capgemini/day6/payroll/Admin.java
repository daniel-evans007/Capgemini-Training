package com.capgemini.day6.payroll;

public class Admin extends Payroll {

	private String name;
	private int salary;
	
	public Admin() {
		
	}
	
	public Admin(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int adjustSalary(int amount) {
		return salary + amount;
	}
	
	public void doAdminStuff() {
		System.out.println("Do admin stuff.");
	}
}