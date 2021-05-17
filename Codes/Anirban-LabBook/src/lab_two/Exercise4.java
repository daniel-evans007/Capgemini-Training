package lab_two;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

	static int[] modifyArray(int[] a) {
		
		int i, len = a.length, j=0, t=0;
		int[] temp = new int[len];
		
		Arrays.sort(a);
		
		for (i=0;i<len-1;i++) {
			if (a[i] != a[i+1]) {
				temp[j++] = a[i];
			}
		}
		
		temp[j++] = a[len-1];
		
		for (i=0;i<temp.length;i++) {
			a[i] = temp[i];
		}
		
		int[] temp2 = new int[j];
		
		for (i=0;i<j;i++) {
			temp2[i] = a[i];
		}
		
		for (i=0;i<j/2;i++) {
			t = temp2[i];
			temp2[i] = temp2[j - i - 1];
			temp2[j - i - 1] = t;
		}
		
		return temp2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int i,j=0;
		System.out.print("Enter the elements: ");
		for (i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(modifyArray(a)));
		
		sc.close();
	}
}
