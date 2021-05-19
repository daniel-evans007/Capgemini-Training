package day6.polymorphism;

public class Deposit extends Transaction{

	private double amount;
	
	@Override
	public void execute() {
		System.out.print("Amount Deposited is: "+amount);
	}
}