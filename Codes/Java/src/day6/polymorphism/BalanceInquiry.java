package day6.polymorphism;

public class BalanceInquiry extends Transaction {

	private int balance;
	@Override
	public void execute() {
		System.out.print("Balance is: "+balance);
	}
}