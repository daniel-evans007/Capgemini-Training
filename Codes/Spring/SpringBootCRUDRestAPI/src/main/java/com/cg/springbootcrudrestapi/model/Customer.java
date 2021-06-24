package com.cg.springbootcrudrestapi.model;

public class Customer {

	private int custId;
	private String custName;
	private String custEmail;
	private String custMobileNo;
	
	public Customer() {
		super();
	}
	
	public Customer(int custId, String custName, String custEmail, String custMobileNo) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custMobileNo = custMobileNo;
	}
	
	public int getCustId() {
		return custId;
	}
	
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getCustEmail() {
		return custEmail;
	}
	
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	
	public String getCustMobileNo() {
		return custMobileNo;
	}
	
	public void setCustMobileNo(String custMobileNo) {
		this.custMobileNo = custMobileNo;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + ", custMobileNo="
				+ custMobileNo + "]";
	}
}