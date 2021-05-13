package lab_two;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	static int[] getSorted(int[] a) {
		
		int n = a.length, i;
		
		for (i=0;i<n;i++) {
			StringBuffer s = new StringBuffer(String.valueOf(a[i]));
			s.reverse();
			a[i] = Integer.parseInt(String.valueOf(s));
		}
		
		Arrays.sort(a);
		
		return a;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the array: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int[] a = new int[n];
		
		System.out.println("Enter the elements");

		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(getSorted(a)));
		
		sc.close();
	}
}