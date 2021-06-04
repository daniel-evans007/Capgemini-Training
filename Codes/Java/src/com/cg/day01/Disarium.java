package com.cg.day01;

import java.util.Scanner;

public class Disarium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt();
		
		int temp = n;
		int sum = 0;
		int length = Integer.toString(n).length();
		
		while (temp>0) {
			int d = temp%10;
			sum += (int)Math.pow(d, length);
			temp /= 10;
			length -= 1;
		}
		
		if (sum == n) {
			System.out.println("It's a disarium number");
		}
		else {
			System.out.println("It's not a disarium number");
		}
		sc.close();
	}
}