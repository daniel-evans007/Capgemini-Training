package day6.polymorphism;

public class Withdrawal extends Transaction {

	private double amount;
	
	public Withdrawal(double amount) {
		this.amount = amount;
	}
	
	@Override
	public void execute() {
		System.out.print("\nAmount Withdrawn is: "+amount);
		BalanceInquiry.balance -= amount;
	}
}