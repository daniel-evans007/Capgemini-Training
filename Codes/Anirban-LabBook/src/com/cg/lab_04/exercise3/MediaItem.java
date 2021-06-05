package com.cg.lab_04.exercise3;

public abstract class MediaItem extends Item {

	private int runtime;
	
	public MediaItem() {
		
	}
	
	public MediaItem(String uid, String title, int noOfCopies, int runtime) {
		super(uid, title, noOfCopies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.print("\nRuntime: "+runtime);
	}
}