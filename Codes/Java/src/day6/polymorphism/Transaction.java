package day6.polymorphism;

public class Transaction {

	private int accountNumber;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void execute() {
		System.out.println("Processing Transaction...");
	}
}