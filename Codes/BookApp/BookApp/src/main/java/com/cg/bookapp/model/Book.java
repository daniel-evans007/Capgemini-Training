package com.cg.bookapp.model;

import com.cg.bookapp.exception.*;

public class Book {

	private int bId;
	private String bName;
	private double price;
	
	public Book() {
		
	}

	public Book(int bId, String bName, double price) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.price = price;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bId;
		result = prime * result + ((bName == null) ? 0 : bName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Book other = (Book) obj;
		if (bId != other.bId)
			return false;
		if (bName == null) {
			if (other.bName != null)
				return false;
		} else if (!bName.equals(other.bName))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", price=" + price + "]";
	}
	
	public void validateBookId() throws BookIdException {
		if (this.bId < 0) {
			throw new BookIdException("Book ID can't be less than zero");
		}
	}
	
	public void validateBookName() throws BookNameException {
		if (this.bName == null) {
			throw new BookNameException("Book Name cannot be null");
		}
	}
	
	public void validateBookPrice() throws BookPriceException {
		if (this.price == 0 || this.price < 0) {
			throw new BookPriceException("Book Price can't be zero or less than that");
		}
	}
}