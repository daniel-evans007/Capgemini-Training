package com.cg.lab_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise4 {

	public static HashMap<String, String> getStudents(HashMap<String, Integer> students) {
		
		HashMap<String, String> studentsMedals = new HashMap<String, String>();
		
		for (Map.Entry<String, Integer> element : students.entrySet()) {
			if (element.getValue() >= 90) {
				studentsMedals.put(element.getKey(), "Gold");
			}
			else if (element.getValue() >= 80 && element.getValue() < 90) {
				studentsMedals.put(element.getKey(), "Silver");
			}
			else if (element.getValue() >= 70 && element.getValue() < 80) {
				studentsMedals.put(element.getKey(), "Bronze");
			}
			else {
				continue;
			}
		}
		return studentsMedals;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of students you want: ");
		int n = Integer.parseInt(sc.nextLine());
		
		HashMap<String, Integer> st = new HashMap<String, Integer>();
		
		String regNum;
		int marks;
		
		for (int i=0;i<n;i++) {
			System.out.println();
			System.out.println("For Student #"+(i+1));
			System.out.print("Enter the registration number: ");
			regNum = sc.nextLine();
			System.out.print("Enter the marks obtained: ");
			marks = Integer.parseInt(sc.nextLine());
			
			st.put(regNum, marks);
		}
		
		getStudents(st).entrySet().forEach(entry -> {
			System.out.println("reg No: "+entry.getKey()+", "+"Medal: "+entry.getValue());
		});
		
		sc.close();
	}
}