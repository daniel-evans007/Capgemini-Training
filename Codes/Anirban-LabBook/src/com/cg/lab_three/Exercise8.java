package com.cg.lab_three;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {

	static boolean positiveString(String s) {
		
		char[] ch = new char[s.length()];
		int i;
		
		for (i=0;i<ch.length;i++) {
			ch[i] = s.charAt(i);
		}
				
		Arrays.sort(ch);
		
		if (s.equals(new String(ch))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		
		boolean flag = positiveString(s);
		
		if (flag == true) {
			System.out.println("It's a positive String.");
		}
		else {
			System.out.println("It's not a positive String.");
		}
		
		sc.close();
	}
}