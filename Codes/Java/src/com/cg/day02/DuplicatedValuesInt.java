package com.cg.day02;

import java.util.Scanner;

public class DuplicatedValuesInt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int i;
		boolean flag = false;
		
		int[] a = new int[n];
		
		System.out.println("Enter " + n + " characters:");
		
		for(i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(i = 0; i < n-1; i++) {  
			int cnt = 1;
            for(int j = i + 1; j < n; j++) {  
                if(a[i] == a[j] && a[i] > 0)  {
                	cnt++;
                	a[j] = -1;
                }
            }
            if(cnt > 1) {
            	System.out.println(a[i] + " is repeated " + cnt + " times");
            	flag = true;
            }
        }
		
		if(flag == false) {
			System.out.println("No Duplicate Numbers");
		}
		
		sc.close();
	}
}