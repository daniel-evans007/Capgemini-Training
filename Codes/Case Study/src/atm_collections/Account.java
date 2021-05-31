package atm_collections;

public abstract class Account {
	
	int accountNumber = 0;
	double balance = 0.0;
	Transaction transaction = new Transaction();
	
	public abstract void calculateInterest();
	public abstract void updateAccount();
	public abstract void verifyWithdrawAmount();
}