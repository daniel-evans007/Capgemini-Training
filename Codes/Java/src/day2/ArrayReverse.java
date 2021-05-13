package day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int i,temp,end=n-1;
		
		System.out.println("Enter the elements: ");
		
		for (i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for (i=0;i<n/2;i++) {
			temp = a[i];
			a[i] = a[end];
			a[end] = temp;
			
			end--;
		}
		
		System.out.println("The reversed array is: "+Arrays.toString(a));
	}
}