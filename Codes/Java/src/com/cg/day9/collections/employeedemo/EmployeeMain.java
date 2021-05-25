package com.cg.day9.collections.employeedemo;

import java.util.Arrays;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee[] empList;
		
		empList = new Employee[3];
		
		empList[0] = new Employee("100", "Anirban");
		empList[1] = new Employee("101", "Arpan");
		empList[2] = new Employee("102", "Abhik");
		
		System.out.println(Arrays.toString(empList));
		
		
	}
}