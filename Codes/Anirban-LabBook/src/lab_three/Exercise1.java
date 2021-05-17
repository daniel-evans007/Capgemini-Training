package lab_three;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, sum = 0;
		String[] integer;
		
		System.out.print("Enter some integers separated by a space: ");
		String s = sc.nextLine();
		
		integer = s.split(" ");
		
		for (i=0;i<integer.length;i++) {
			System.out.print(integer[i]+" ");
			sum += Integer.parseInt(integer[i]);
		}
		
		System.out.println();
		System.out.print("The sum of all the integers is: "+ sum);
		
		sc.close();
	}
}