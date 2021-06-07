package com.cg.lab_09.exericse4;

@FunctionalInterface
interface Display {
	void print();
}

public class Exercise4 {

	private int id;
	private String name;
	private float marks1;
	private float marks2;
	private float marks3;
	
	public Exercise4() {
		
	}

	public Exercise4(int id, String name, float marks1, float marks2, float marks3) {
		super();
		this.id = id;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks1() {
		return marks1;
	}

	public void setMarks1(float marks1) {
		this.marks1 = marks1;
	}

	public float getMarks2() {
		return marks2;
	}

	public void setMarks2(float marks2) {
		this.marks2 = marks2;
	}

	public float getMarks3() {
		return marks3;
	}

	public void setMarks3(float marks3) {
		this.marks3 = marks3;
	}
	
	public float calculateTotal() {
		return getMarks1()+getMarks2()+getMarks3();
	}
	
	public void display() {
		System.out.println("Details are: ");
		System.out.println("ID: "+getId());
		System.out.println("Name: "+getName().toUpperCase());
		System.out.println("Total: "+calculateTotal());
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new 
	}
}