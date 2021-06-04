package com.cg.day07.abstraction_example;

public class SavingsAccount extends BankAccount {

	float rateOfInt =  0.3f;
	int withDrawAmt;
	int depAmt;
	
	public SavingsAccount() {
		super();
	}
	
	@Override
	public void openAccount() {
			
		super.enterDetailsToOpenAccount();
		super.minBal = 3000;
		System.out.println("Enter accid");
		accId = details.nextInt();
		
		System.out.println("Enter accHolderName");
		details.nextLine();
		accHolderName = details.nextLine();
		
		System.out.println("Enter actualBal");
		actualBal = details.nextInt();
		
		System.out.println("Enter address");
		details.nextLine();
		address = details.nextLine();
		
		super.accType = "Savings";
	}

	@Override
	public float calculateInterest() {
		
		return actualBal * rateOfInt;
	}

	@Override
	public void creditAmount() {

		System.out.println("Amount credited = " +calculateInterest());
	}

	@Override
	public void checkBalance() {
		
		System.out.println("Amount credited = " + (actualBal + calculateInterest()));
	}

	@Override
	public void withDraw() {
		
		System.out.println("Enter the amount to withdraw");
		withDrawAmt = details.nextInt();
		
		System.out.println("After withdrawing balance = " + (updateAmount()));
		System.out.println("Thank you");
	}
	

	public float updateAmount() {

		return (actualBal - withDrawAmt);
		
	}
	
	public void addMoney() {

		System.out.println("Enter the amount to deposit");
		depAmt = details.nextInt();
		
		actualBal += depAmt;
		
		System.out.println("After Depositing balance = " + actualBal);
		System.out.println("Thank you");
	}
}