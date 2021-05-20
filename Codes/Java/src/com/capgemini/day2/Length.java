package com.capgemini.day2;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length in inches: ");
		double n = sc.nextDouble();
		
		n *= 0.0254;
		
		System.out.println("The length in meters: "+n);
		
		sc.close();
	}
}
