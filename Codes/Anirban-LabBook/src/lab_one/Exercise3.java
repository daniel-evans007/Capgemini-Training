package lab_one;

import java.util.Scanner;

public class Exercise3 {

	static int fibRec(int n) {
		
		if (n <= 1)
			return n;
		return fibRec(n-1) + fibRec(n-2);
    }
	
	static void fibonacci(int n) {
		
		int term1 = 1, term2 = 1, sum = 0, i;
		System.out.print(term1+" "+term2+" ");
		
		for (i=0;i<n-2;i++) {
			sum = term1 + term2;
			System.out.print(sum+" ");
			term1 = term2;
			term2 = sum;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int term1 = 1, term2 = 1;
		
		System.out.print("Enter the term number: ");
		int n = sc.nextInt();
		
		fibonacci(n);
		
		System.out.println();
		System.out.println();
		
		System.out.print(term1+" "+term2+" ");
		for (int i=3;i<=n;i++) {
			System.out.print(fibRec(i)+" ");
		}
		
		sc.close();
	}
}