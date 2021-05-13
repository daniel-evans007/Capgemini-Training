package day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j=0, k=0, l=0;
		
		
		System.out.println("Enter the number of elements of first array");
		int n1 = sc.nextInt();
		int[] a = new int[n1];
		System.out.println("Enter the elements of the first array");
		
		for (i=0;i<n1;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number of elements of second array");
		int n2 = sc.nextInt();
		int[] b = new int[n2];
		System.out.println("Enter the elements of the second array");
		
		for(i=0;i<n2;i++) {
			b[i] = sc.nextInt();
		}
		
		int[] c = new int[n1+n2];
		
		while(j<a.length) {
			c[k] = a[j];
			j++;
			k++;
		}

		while(l<b.length) {
			c[k] = b[l];
			l++;
			k++;
		}
		
		System.out.println(Arrays.toString(c));
		sc.close();
	}
}
