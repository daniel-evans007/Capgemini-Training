package com.cg.lab_four.exercise3;

public abstract class Item {

	private String uid;
	private String title;
	private int noOfCopies;
	
	public Item() {
		
	}

	public Item(String uid, String title, int noOfCopies) {
		super();
		this.uid = uid;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Item other = (Item) obj;
		
		if (noOfCopies != other.noOfCopies)
			return false;
		
		if (title == null) {
			if (other.title != null)
				return false;
		}
		
		else if (!title.equals(other.title))
			return false;
		
		if (uid == null) {
			if (other.uid != null)
				return false;
		}
		
		else if (!uid.equals(other.uid))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "Item [uid = " + uid + ", title = " + title + ", noOfCopies = " + noOfCopies + "]";
	}
	
	public void checkIn() {
		noOfCopies+=1;
	}
	
	public void checkOut() {
		if(noOfCopies - 1 < 0)
		{
			noOfCopies = 1;
			System.out.println("Cannot check out...");
		}
		noOfCopies -= 1;
	}
	
	public void addItem() {
		noOfCopies+=1;
	}
	
	public void print() {
		System.out.print("\nUnique Identification Number: "+ uid);
		System.out.println("\nTitle: "+title);
		System.out.println("\nNumber of copies: "+noOfCopies);
	}
}