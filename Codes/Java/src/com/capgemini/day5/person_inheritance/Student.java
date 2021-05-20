package com.capgemini.day5.person_inheritance;

import java.util.Scanner;

public class Student extends Person {

	private String program;
	private int year;
	private double fee;
	
	public Student() {
		
	}

	public Student(String name, String address, String program, int year, double fee) {
		super();
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [Person [name = "+name+", address = "+address
				+"], program = "+program+", year = "+year+", fee = "+fee+"]";
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Enter the name of the student: ");
		student.setName(sc.nextLine());
		
		System.out.print("Enter the address of the student: ");
		student.setAddress(sc.nextLine());
		
		System.out.print("Enter the program of the student: ");
		student.setProgram(sc.nextLine());
		
		System.out.print("Enter the year of the student: ");
		student.setYear(Integer.parseInt(sc.nextLine()));
		
		System.out.print("Enter the fees of the student: ");
		student.setFee(Double.parseDouble(sc.nextLine()));
		
		System.out.print("The details of the student are as follows:\n"+student);
		
		sc.close();
	}
}