package day4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOccurringChar {

	static final int ASCII_SIZE = 256;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count[] = new int[ASCII_SIZE], i, len, max = -1;
		char result = ' ';
		
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		len = s.length();
		
		for(i=0;i<len;i++) {
			count[s.charAt(i)]++;
		}
		
		for(i=0;i<len;i++) {
			if (max < count[s.charAt(i)]) {
				max = count[s.charAt(i)];
				result = s.charAt(i);
			}
		}
		
		System.out.print("Maximum occuring character is: "+result);
		
		sc.close();
	}
}