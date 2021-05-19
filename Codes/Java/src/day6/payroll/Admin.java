package day6.payroll;

public class Admin extends Payroll {

	private String name;
	private int salary;
	
	@Override
	public int adjustSalary(int amount) {
		return salary + amount;
	}
	
	public void doAdminStuff() {
		System.out.println("Do admin stuff.");
	}
}