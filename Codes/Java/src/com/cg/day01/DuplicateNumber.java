package com.cg.day01;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp = n;
		int a[] = new int[10];
		
		while(temp>0) {
			int digit = temp%10;
			a[digit]++;
			temp /= 10;
		}
		
		for (int i=0;i<10;i++) {
			if(a[i]>1) {
				System.out.println(i+" is repeated "+a[i]+" times.");
			}
		}
		
		sc.close();
	}

}
