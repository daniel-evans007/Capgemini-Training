package com.cg.lab_four.exercise3;

public class Video extends MediaItem {

	private String director;
	private String genre;
	private int year;
	
	public Video() {
		
	}

	public Video(String uid, String title, int noOfCopies, int runtime, String director, String genre, int year) {
		super();
		this.director = director;
		this.genre = genre;
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Director : "+director);
		System.out.println("Genre : "+genre);
		System.out.println("Year of Release : "+year);
	}
}