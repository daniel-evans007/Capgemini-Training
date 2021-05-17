package lab_three;

import java.util.Scanner;

public class Exercise2 {

	static String getImage(String s) {
		
		StringBuffer sb = new StringBuffer(s);
		String finalString = new String();
		
		sb.reverse();
		
		finalString = s+"|"+sb;
		
		return finalString;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		System.out.print("Here's the new String: "+getImage(s));
		
		sc.close();
	}
}
