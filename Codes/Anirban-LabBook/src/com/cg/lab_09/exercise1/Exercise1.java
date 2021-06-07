package com.cg.lab_09.exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Exponents e = (x,y) -> {
			int product = 1;
			for (int i = 0;i<=y;i++) {
				product *= x;
			}
			return product;
		};
		
		System.out.print("Enter the base number: ");
		int x = sc.nextInt();
		int y = 0;
		
		System.out.print("Enter the power: ");
		y = sc.nextInt();
		
		System.out.print("The final result is: "+e.pow(x, y));
		
		sc.close();
	}
}