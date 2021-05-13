package lab1;

import java.util.Scanner;

public class Exercise7 {

	static boolean checkNumber(int number) {
		
		String s = String.valueOf(number);
		int length = s.length();
		int i;
		
		for (i=0;i<length-1;i++) {
			if (s.charAt(i) > s.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		if (checkNumber(n) == true) {
			System.out.println("It's an increasing number");
		}
		else {
			System.out.println("It's not an increasing number");
		}
		
		sc.close();
	}
}