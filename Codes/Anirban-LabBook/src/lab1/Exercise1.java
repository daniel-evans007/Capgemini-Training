package lab1;

import java.util.Scanner;

public class Exercise1 {

	static int sumOfCubes(int n) {
		
		int temp = n, digit = 0, sum = 0;
		
		while (temp > 0) {
			digit = temp%10;
			sum += digit*digit*digit;
			temp /= 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println();
		System.out.print("Sum of the cubes of the digits are: "+sumOfCubes(n));
		
		sc.close();
	}
}