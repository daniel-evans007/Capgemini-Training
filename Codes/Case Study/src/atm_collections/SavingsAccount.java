package atm_collections;

public class SavingsAccount extends Account {

	private float interestRate;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(float interestRate) {
		this.interestRate = interestRate;
	}
	
	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public void calculateInterest() {
		System.out.println(0.4*balance);
	}

	@Override
	public void updateAccount() {
		System.out.print("\nBalance after updating account: "+balance);
		
	}

	@Override
	public void verifyWithdrawAmount() {
		
		
	}

	
}