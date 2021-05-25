package com.cg.day9_collections.flowerlist;

public class Flower {

	private String fid;
	private String fname;
	private double fpriceperkg;
	private int quantity;
	
	public Flower() {
		
	}

	public Flower(String fid, String fname, double fpriceperkg, int quantity) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fpriceperkg = fpriceperkg;
		this.quantity = quantity;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getFpriceperkg() {
		return fpriceperkg;
	}

	public void setFpriceperkg(double fpriceperkg) {
		this.fpriceperkg = fpriceperkg;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Flower [fid=" + fid + ", fname=" + fname + ", fpriceperkg=" + fpriceperkg + ", quantity=" + quantity
				+ "]";
	}
}