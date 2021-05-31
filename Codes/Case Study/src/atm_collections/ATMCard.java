package atm_collections;

public class ATMCard extends ATM {

	private int pin;
	private long CardID;
	private Account account;
	
	public ATMCard() {
		
	}

	public ATMCard(int pin, long cardID, Account account) {
		super();
		this.pin = pin;
		CardID = cardID;
		this.account = account;
	}
	
	
}