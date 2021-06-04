package com.cg.day02;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, k=0;
		
		System.out.print("Enter the number of elements of the array: ");
		int n1 = sc.nextInt();
		int[] a = new int[n1];
		int[] b = new int[n1-1];
		System.out.println("Enter the elements of the array");
		
		for (i=0;i<n1;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("Enter the index whose element you want to remove: ");
		int index = sc.nextInt();
		
		if (index>=a.length)
			System.out.println("Invalid Index position");
		else {
			for(i=0;i<a.length;i++) {
				if (i == index)
					continue;
					
				b[k++] = a[i];
			}
		}
		
		System.out.println(Arrays.toString(b));
		sc.close();
	}
}