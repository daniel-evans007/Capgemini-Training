package com.cg.lab_three;

import java.time.*;
import java.util.Scanner;

public class Exercise9 {

	static void dateDuration(String s) {
		
		String[] dt = s.split("[-./]+");
		
		LocalDate today = LocalDate.now();
		LocalDate userDate = LocalDate.of(Integer.parseInt(dt[2]),Integer.parseInt(dt[1]),Integer.parseInt(dt[0]));
		
		Period period = Period.between(userDate, today);
		
		int days = period.getDays();
		int months = period.getMonths();
		int years = period.getYears();
		
		if(days < 0 || months < 0 || years < 0) {
			System.out.println(Math.abs(days) + " days " 
					+ Math.abs(months) + " months and " 
					+ Math.abs(years) + " years "
					+ "\nto go to reach the above date.");  
		}
		else {
			System.out.println("Above date is " + Math.abs(days)+ " days " 
					+ Math.abs(months) + " months and " 
					+ Math.abs(years) + " years "
					+ "\nbefore today."); 
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Previous or Upcoming Date"
				+ "\n(Format: DD/MM/YYYY or DD.MM.YYYY or DD-MM-YYYY)");
		String date = sc.nextLine();
		
		dateDuration(date);
		
		sc.close();
	}
}