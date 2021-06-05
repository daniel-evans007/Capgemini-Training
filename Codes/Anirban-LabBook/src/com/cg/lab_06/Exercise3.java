package com.cg.lab_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {

	public static Map<Integer, Integer> getSquares(int[] a) {
		
		HashMap<Integer, Integer> squared = new HashMap<Integer, Integer>();
		
		for (Integer i: a) {
			squared.put(i, i*i);
		}
		
		return squared;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the array: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter the elements of the array...");
		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		getSquares(a).entrySet().forEach(entry -> {
			System.out.println(entry.getKey()+" "+entry.getValue());
		});
		
		sc.close();
	}
}