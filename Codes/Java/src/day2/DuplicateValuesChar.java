package day2;

import java.util.Scanner;

public class DuplicateValuesChar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of char array: ");
		int n = sc.nextInt();
		int i, flag = 0;
		
		char[] a = new char[n];
		System.out.println("Enter " + n + " positive integers:");
		for(i = 0; i < n; i++) {
			a[i] = sc.next().charAt(0);
		}
		
		System.out.println("Result:");
		
		for(i = 0; i < n-1; i++) {  
			int cnt = 1;
            for(int j = i + 1; j < n; j++) {  
                if(a[i] == a[j] && a[i] > 33)  {
                	cnt++;
                	a[j] = 33;
                }
            }
            if(cnt > 1) {
            	System.out.println(a[i] + " is repeated " + cnt + " times");
            	flag = 1;
            }
        }
		
		if(flag == 0) {
			System.out.println("No Duplicate Numbers");
		}
		
		sc.close();
	}
}