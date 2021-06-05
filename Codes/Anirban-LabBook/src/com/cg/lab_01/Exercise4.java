package com.cg.lab_01;

import java.util.Scanner;

public class Exercise4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number up to which prime numbers will be displayed.");
		int n = sc.nextInt();
		boolean flag = false;
		
		for (int j=2;j<n;j++) {
			flag = false;
			for (int i=2;i<=j/2;i++) {
				if (j%2 == 0) {
					flag = true;
					break;
				}
			}
			
			if (flag == false) {
				System.out.print(j+" ");
			}
		}
		
		sc.close();
	}
}