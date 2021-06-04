package com.cg.day02;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		
		int d= (int)(Math.sqrt(n));
		
		if((d*d)==n)
			System.out.println(n+" is a perfect sqaure number");
		else
			System.out.println(n+" is not a perfect sqaure number");
		
		sc.close();
	}

}