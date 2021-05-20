package com.capgemini.day2;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int evensum = 0, oddsum = 0, i = 0;
		

		System.out.println("Enter the elements: ");
		
		for (i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for (i=0;i<n;i++) {
			if (i%2 == 0) {
				evensum += a[i];
			}
			else {
				oddsum += a[i];
			}
		}
		
		System.out.print("Even Sum is: "+evensum);
		System.out.println();
		System.out.print("Odd Sum is: "+oddsum);
	}
}