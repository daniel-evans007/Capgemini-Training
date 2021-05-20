package com.capgemini.day6.payroll;

public class Academic extends Payroll {

	private String name;
	private int salary;
	
	public Academic() {
		
	}
	
	public Academic (String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int adjustSalary(int amount) {
		return salary + amount;
	}
	
	public void doAdminStuff() {
		System.out.println("Give Lecuture.");
	}
}