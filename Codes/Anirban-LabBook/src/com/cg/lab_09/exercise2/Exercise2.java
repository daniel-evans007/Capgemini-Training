package com.cg.lab_09.exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringFormat s = (string) -> {
			char ch[] = string.toCharArray();
			String result = "";
			
			for (int i=0;i<ch.length-1;i++) {
				result += ch[i]+" ";
			}
			return result+ch[ch.length-1];
		};
		
		System.out.print("Enter the String: ");
		String string = sc.next();
		
		System.out.println("Final String is: "+s.expression(string));
		
		sc.close();
	}
}