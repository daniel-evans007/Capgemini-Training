package atm_collections;

import java.util.Date;

public class Transaction extends Account {

	private Date date;
	private double amount;
	
	public Transaction() {
		
	}

	public Transaction(Date date, double amount) {
		super();
		this.date = date;
		this.amount = amount;
	}
	
	public void calculateBalance(double balance) {
		
	}
	
	public void startTransaction() {
		System.out.println("Start of transaction");
	}
	
	public void depositAmount(double amount) {
		balance += amount;
	}
	
	public void cancelTransaction() {
		System.out.println("Transaction cancelled");
	}

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccount() {
		
	}

	@Override
	public void verifyWithdrawAmount() {
		
	}
}