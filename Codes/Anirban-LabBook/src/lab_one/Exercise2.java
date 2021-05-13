package lab_one;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter either red green or yellow: ");
		String s = sc.nextLine().toLowerCase();
		
		switch(s) {
		case "red" :
			System.out.println("Stop");
			break;
		case "yellow" :
			System.out.println("Ready");
			break;
		case "green" :
			System.out.println("Go");
			break;
		default :
			System.out.println("Invalid input");
		}
		
		sc.close();
	}
}