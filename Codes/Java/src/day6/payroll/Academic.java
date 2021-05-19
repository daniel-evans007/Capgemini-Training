package day6.payroll;

public class Academic extends Payroll {

	private String name;
	private int salary;
	
	@Override
	public int adjustSalary(int amount) {
		return salary + amount;
	}
	
	public void doAdminStuff() {
		System.out.println("Give Lecuture.");
	}
}