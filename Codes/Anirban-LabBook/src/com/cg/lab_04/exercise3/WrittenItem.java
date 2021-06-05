package com.cg.lab_04.exercise3;

public abstract class WrittenItem extends Item {

	private String author;
	
	public WrittenItem() {
		
	}

	public WrittenItem(String uid, String title, int noOfCopies, String author) {
		super();
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.print("Author: "+author);
	}
}