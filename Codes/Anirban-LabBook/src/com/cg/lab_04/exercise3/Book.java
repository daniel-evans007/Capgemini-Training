package com.cg.lab_04.exercise3;

public class Book extends WrittenItem {

	public Book() {
		
	}
	
	public Book(String uid, String title, int noOfCopies, String author) {
		super(uid, title, noOfCopies, author);
	}
	
	@Override
	public String getUid() {
		return super.getUid();
	}
	
	@Override
	public String getTitle() {
		return super.getTitle();
	}
	
	@Override
	public int getNoOfCopies() {
		return super.getNoOfCopies();
	}
	
	@Override
	public String getAuthor() {
		return super.getAuthor();
	}
	
	@Override
	public void print() {
		super.print();
		System.out.print("Author: "+getAuthor());
	}
}