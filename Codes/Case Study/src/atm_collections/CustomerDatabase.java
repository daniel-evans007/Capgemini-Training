package atm_collections;

import java.text.SimpleDateFormat;

public class CustomerDatabase {

	private String custID;
	private String custName;
	private String custAge;
	private String custEmail;
	private String custContact;
	private SimpleDateFormat sdf;
	
	public CustomerDatabase() {
		
	}

	public CustomerDatabase(String custID, String custName, String custAge, String custEmail, String custContact,
			SimpleDateFormat sdf) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custAge = custAge;
		this.custEmail = custEmail;
		this.custContact = custContact;
		this.sdf = sdf;
	}

	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAge() {
		return custAge;
	}

	public void setCustAge(String custAge) {
		this.custAge = custAge;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustContact() {
		return custContact;
	}

	public void setCustContact(String custContact) {
		this.custContact = custContact;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	
	public void display() {
		System.out.print("Customer ID: "+custID);
		System.out.print("Customer Name: "+custName);
		System.out.print("Customer Age: "+custAge);
		System.out.print("Customer Email: "+custEmail);
		System.out.print("Customer Contact: "+custContact);
		System.out.print("Customer ID: "+custID);
	}
}