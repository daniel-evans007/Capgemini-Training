package lab_three;

import java.util.Scanner;

public class Exercise4 {

	static int modifyNumber(int n) {
		String s = Integer.toString(n);
		StringBuffer sb = new StringBuffer();
		int i, diff;
		
		for (i=0;i<s.length()-1;i++) {
			diff = Math.abs((int)s.charAt(i) - (int)s.charAt(i+1));
			sb.append(diff);
		}
		
		sb.append(n%10);
		
		return Integer.parseInt(sb.toString());
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int n = sc.nextInt();
		
		System.out.print("The modified number is: "+modifyNumber(n));
		
		sc.close();
	}
}
