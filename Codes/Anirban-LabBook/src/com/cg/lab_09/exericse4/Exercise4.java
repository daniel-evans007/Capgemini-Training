package com.cg.lab_09.exericse4;

import java.util.Scanner;

@FunctionalInterface
interface Display {
	void print();
}

public class Exercise4 {

	private int id;
	private String name;
	
	public Exercise4() {
		
	}

	public Exercise4(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public void display() {
		System.out.println("Details are: ");
		System.out.println("ID: "+getId());
		System.out.println("Name: "+getName().toUpperCase());
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the ID: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Name: ");
		String name = sc.nextLine();
		
		Exercise4 ex4 = new Exercise4(id, name);
		Display display = ex4::display;
		
		System.out.println();
		
		sc.close();
	}
}