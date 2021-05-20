package com.capgemini.day2;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char variable = sc.next().charAt(0);
		
		System.out.println("The equivalent ASCII code is: "+(int)variable);
		
		sc.close();
	}
}
