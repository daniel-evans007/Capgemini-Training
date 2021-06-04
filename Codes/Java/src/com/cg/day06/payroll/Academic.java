package com.cg.day06.payroll;

public class Academic extends Payroll {

	private int salary;
	
	public Academic() {
		
	}
	
	public Academic (String name, int salary) {
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