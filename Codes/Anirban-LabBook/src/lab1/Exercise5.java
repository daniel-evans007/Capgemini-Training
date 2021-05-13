package lab1;

import java.util.Scanner;

public class Exercise5 {

	static int calculateSum(int n) {
		int i, sum=0;
		for (i=1;i<=n;i++) {
			if (i%3 == 0 || i%5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no of terms of natural number: ");
		int n = sc.nextInt();
		
		System.out.println(calculateSum(n));
		
		sc.close();
	}
}
