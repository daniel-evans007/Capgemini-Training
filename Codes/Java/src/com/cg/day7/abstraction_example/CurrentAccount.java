package com.cg.day7.abstraction_example;

public  class CurrentAccount extends BankAccount {

	float rateOfInt =  0.3f;
	int withDrawAmt;
	int depAmt;
	public CurrentAccount() {
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
		super.accType = "Current";
	}
	
	public void viewAccount() {
		System.out.println("Account Number : "+accId);
		super.minBal = 3000;
		System.out.println("AccHolderName : "+accHolderName);
		//System.out.println("Minimum Balance : "+super.minBal);
		System.out.println("ActualBal : "+actualBal);
		System.out.println("Address : "+address);
		//super.accType = "Current";
		System.out.println("Account Type : "+super.accType);
}

	@Override
	public float calculateInterest() {
		
		return actualBal * rateOfInt;
	}

	@Override
	public void creditAmount() {
		
		System.out.println("amount credited = " +calculateInterest());
	}

	@Override
	public void checkBalance() {
		
		System.out.println("balance = " + actualBal );
	}

	@Override
	public void withDraw() {
		
		System.out.println("Enter the amount to withdraw");
		withDrawAmt = details.nextInt();
		System.out.println("After Withdrawing balance = " + (updateAmount()));
		System.out.println("Thank you");
	}
	

	public float updateAmount() {
		
		return (actualBal-withDrawAmt);
		
	}
	
	public void addMoney() {
		
		System.out.println("Enter the amount to deposit");
		depAmt = details.nextInt();
		actualBal += depAmt;
		System.out.println("After with deposit balance = " + (actualBal));
		System.out.println("Thank you");
	}
}