package com.cg.lab_two;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	static int getSecondSmallest(int[] a) {
		
		Arrays.sort(a);
		return a[1];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the array: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		System.out.println("Enter the elements of the array: ");
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("The second smallest number is: "+getSecondSmallest(a));
		
		sc.close();
	}
}
