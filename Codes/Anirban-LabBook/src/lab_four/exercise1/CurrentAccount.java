package lab_four.exercise1;

public class CurrentAccount extends Account {

	private double overdraftLimit;
	
	@Override
	public void withdraw(double amount) {
		if (amount > overdraftLimit) {
			System.out.println("Overdraft Limit exceeded.");
		}
		else {
			super.setBalance(super.getBalance()-amount);
		}
	}
}