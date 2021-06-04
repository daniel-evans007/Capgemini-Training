package com.cg.day05.person_inheritance;

import java.util.Scanner;

public class Staff extends Person {

	private String school;
	private double pay;
	
	public Staff() {
		
	}

	public Staff(String name, String address, String school, double pay) {
		super();
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		return "Student [Person [name = "+name+", address = "+address
				+"], school = "+school+", pay = "+pay+"]";
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Staff staff = new Staff();
		
		System.out.print("Enter the name of the staff: ");
		staff.setName(sc.nextLine());
		
		System.out.print("Enter the address of the staff: ");
		staff.setAddress(sc.nextLine());
		
		System.out.print("Enter the school of the staff: ");
		staff.setSchool(sc.nextLine());
		
		System.out.print("Enter the pay of the staff: ");
		staff.setPay(Integer.parseInt(sc.nextLine()));
		
		System.out.print("The details of the staff are as follows:\n"+staff);
		
		sc.close();
	}
}