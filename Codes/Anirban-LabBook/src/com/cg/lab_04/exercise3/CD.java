package com.cg.lab_04.exercise3;

public class CD extends MediaItem {

	private String artist;
	private String genre;
	
	public CD() {
		
	}

	public CD(String uid, String title, int noOfCopies, int runtime, String artist, String genre) {
		super();
		this.artist = artist;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.print("\nArtist: "+artist);
		System.out.print("\nGenre: "+genre);
	}
}