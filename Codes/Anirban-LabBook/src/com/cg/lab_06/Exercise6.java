package com.cg.lab_06;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise6 {

	public static List<String> eligibilityList(Map<String, String> votersMap) {
		
		Period age;
		LocalDate voterDOB;
		
		List<String> voterList = new ArrayList<String>();
		
		for (Map.Entry<String, String> voter : votersMap.entrySet()) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			voterDOB = LocalDate.parse(voter.getValue(), formatter);
			age = Period.between(voterDOB, LocalDate.now());
			
			if (age.getYears() > 18) {
				voterList.add(voter.getKey());
			}
		}
		return voterList;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of voters you want on the list: ");
		int n = Integer.parseInt(sc.nextLine());
		
		String id;
		String dob;
		
		Map<String, String> votersMap = new HashMap<String, String>();
		
		for (int i=0;i<n;i++) {
			System.out.print("\nEnter the ID of the "+(i+1)+" voter: ");
			id = sc.nextLine();
			System.out.print("\nEnter the D.O.B (dd/MM/yyyy) of the "+(i+1)+" voter: ");
			dob = sc.nextLine();
			votersMap.put(id, dob);
		}
		
		System.out.println("Here are the ID's of the voters who are eligible to vote...");

		for (String identity : eligibilityList(votersMap)) {
			System.out.println(identity.toString());
		}
		
		sc.close();
	}
}