package com.cg.day04;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		
		int i, j;
		boolean flag;
		
		StringBuffer nouveau = new StringBuffer();
		
		for(i=0;i<s.length();i++) {
			flag = false;
			for (j=0;j<nouveau.length();j++) {
				if (s.charAt(i) == nouveau.charAt(j)) {
					flag = true;
					break;
				}
			}
			
			if (flag == false) {
				nouveau.append(s.charAt(i));
			}
		}
		
		System.out.print("The string after removing duplicate characters: "+nouveau);
		
		sc.close();
	}
}