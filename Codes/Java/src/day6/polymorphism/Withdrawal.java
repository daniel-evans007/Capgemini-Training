package day6.polymorphism;

public class Withdrawal extends Transaction {

	private double amount;
	
	@Override
	public void execute() {
		System.out.print("Amount Withdrawn is: "+amount);
	}
}