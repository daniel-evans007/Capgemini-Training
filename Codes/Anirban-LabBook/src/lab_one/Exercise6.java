package lab_one;

import java.util.Scanner;

public class Exercise6 {

	static int calculateDifference(int n) {
		int i, sum = 0, sumOfSquare = 0, sumSquared = 0;
		
		for(i=1;i<=n;i++) {
			sumOfSquare += (i*i);
			sum += i;
		}
		sumSquared = sum*sum;
		
		return (sumOfSquare - sumSquared);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the nth natural number: ");
		int n = sc.nextInt();
		
		System.out.println(calculateDifference(n));
		
		sc.close();
	}
}