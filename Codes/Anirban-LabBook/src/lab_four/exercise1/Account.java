package lab_four.exercise1;

public class Account {

	private long accNum;
	private double balance;
	private Person accHolder;
	
	public Account() {
		
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	private void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public static void main(String[] args) {
		
		Person smith = new Person();
		Person kathy = new Person();
		
		Account smithAcc = new Account();
		Account kathyAcc = new Account();
		
		smithAcc.setAccHolder(smith);
		kathyAcc.setAccHolder(kathy);
		
		smithAcc.setAccNum((int) (100*Math.random()));
		kathyAcc.setAccNum((int) (100*Math.random()));
		
		smithAcc.deposit(2000);
		kathyAcc.deposit(3000);
		
		smithAcc.deposit(2000);
		kathyAcc.withdraw(2000);
		
		System.out.print("Updated balance of Smith's Acc: "+smithAcc.getBalance());
		System.out.print("\nUpdated balance of Kathy's Acc: "+kathyAcc.getBalance());		
	}
}