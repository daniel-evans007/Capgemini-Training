package com.cg.lab_six;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {

	static final int MAX_CHAR = 256;
	
	public static Map<Character, Integer> countChars(char[] arr) {
		int count[] = new int[MAX_CHAR];
		HashMap<Character, Integer> chFreqMap = new HashMap<Character, Integer>();
		int len = arr.length;
		
		for (int i=0;i<len;i++) {
			count[arr[i]]++;
		}
		
		for (int i=0;i<len;i++) {
			
			int find = 0;
			
			for (int j=0;j<=i;j++) {
				if (arr[i] == arr[j]) {
					find++;
				}
			}
			
			if (find == 1) {
				chFreqMap.put(arr[i], count[arr[i]]);
			}
		}
		
		return chFreqMap;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the contents of the character array: ");
		String s = sc.nextLine();
		
		char[] a = new char[s.length()];
		
		for (int i=0;i<s.length();i++) {
			a[i] = s.charAt(i);
		}
		
		countChars(a).entrySet().forEach(entry -> {
			System.out.println(entry.getKey()+" "+entry.getValue());
		});
		
		sc.close();
	}
}