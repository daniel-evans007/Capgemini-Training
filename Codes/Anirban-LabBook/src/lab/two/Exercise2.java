package lab.two;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	static String[] sortStrings(String[] a) {
		
		int i, len = a.length;
		Arrays.sort(a);
		if (len%2 == 0) {
			for (i=0;i<len/2;i++) {
				a[i] = a[i].toUpperCase();
			}
			
			for (i=len/2;i<len;i++) {
				a[i] = a[i].toLowerCase();
			}
		}
		else {
			for (i=0;i<(len/2)+1;i++) {
				a[i] = a[i].toUpperCase();
			}
			
			for (i=(len/2)+1;i<len;i++) {
				a[i] = a[i].toLowerCase();
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the array: ");
		int n = Integer.parseInt(sc.nextLine());
		
		String[] a = new String[n];
		
		System.out.println("Enter the elements");

		for (int i=0;i<n;i++) {
			a[i] = sc.nextLine();
		}
		
		System.out.println(Arrays.toString(sortStrings(a)));
	
		sc.close();
	}
}