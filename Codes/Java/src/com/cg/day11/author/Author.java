package com.cg.day11.author;

public class Author {

	private String name;
	private String email;
	private char gender;
	
	public Author() {
		
	}
	
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + gender;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public void validateName() {
		if (this.name.isEmpty()) {
			throw new RuntimeException("Name cannot be empty");
		}
	}
	
	public void validateEmail() {
		if (!this.email.contains("@")) {
			throw new RuntimeException("Email must contain @");
		}
	}
	
	public void validateGender() {
		if (!(this.gender == 'm' || this.gender == 'f' || this.gender == 'u')) {
			throw new RuntimeException("Gender must be m or f or u");
		}
	}

	public void print() {
		System.out.println("Details of the author");
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Gender"+gender);
	}
}