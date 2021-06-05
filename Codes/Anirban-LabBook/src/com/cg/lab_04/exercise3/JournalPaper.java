package com.cg.lab_04.exercise3;

public class JournalPaper extends WrittenItem {

	private int year;
	
	public JournalPaper() {
		
	}
	
	public JournalPaper(String uid, String title, int noOfCopies, String author, int year) {
		super(uid, title, noOfCopies, author);
		this.year=year;
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
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.print("\nYear of Publish: "+year);
	}
}