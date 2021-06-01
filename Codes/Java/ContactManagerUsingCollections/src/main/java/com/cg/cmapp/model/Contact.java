package com.cg.cmapp.model;

/**
 * 
 * @author Anirban Goswami
 *
 */
public class Contact {

	/**
	 * fName to store first name of contact
	 */
	private String fName;
	/**
	 * fName to store last name of contact
	 */
	private String lName;
	/**
	 * fName to store phone no of contact
	 */
	private String phNo;
	
	public Contact() {
		
	}

	/**
	 * 
	 * @param fName
	 * @param lName
	 * @param phNo
	 */
	public Contact(String fName, String lName, String phNo) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.phNo = phNo;
	}

	/**
	 * 
	 * @return fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * 
	 * @param fName
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * 
	 * @return lName
	 */

	public String getlName() {
		return lName;
	}

	/**
	 * 
	 * @param lName
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * 
	 * @return phNo
	 */
	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	/**
	 * Overriding hashCode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((phNo == null) ? 0 : phNo.hashCode());
		return result;
	}

	/**
	 * Overriding equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (phNo == null) {
			if (other.phNo != null)
				return false;
		} else if (!phNo.equals(other.phNo))
			return false;
		return true;
	}

	/**
	 * Overriding toString
	 */
	@Override
	public String toString() {
		return "Contact [fName=" + fName + ", lName=" + lName + ", phNo=" + phNo + "]";
	}

	
	public void validateFirstName() {
		// TODO Auto-generated method stub
		if (this.fName.isEmpty()) {
			throw new RuntimeException("First Name cannot be empty");
		}
	}

	public void validateLastName() {
		// TODO Auto-generated method stub
		if (this.lName.isEmpty()) {
			throw new RuntimeException("Last name cannot be empty");
		}
	}

	public void validatePhNo() {
		// TODO Auto-generated method stub
		if (this.phNo.isEmpty()) {
			throw new RuntimeException("Phone number cannot be empty");
		}
		if (this.phNo.length() != 11) {
			throw new RuntimeException("Phone number should be 11 digits long");
		}
		if (!this.phNo.matches("\\d+")) {
			throw new RuntimeException("Phone number can only contains digits"); 
		}
		if (!this.phNo.startsWith("0")) {
			throw new RuntimeException("Phone number should start with zero");
		}
	}
}