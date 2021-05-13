package day2;

import java.util.*;

public class PerimeterCircle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		int r = sc.nextInt();
		
		final double PI = 3.1415926535;
		double perimeter = 2 * PI * r;
		double area = PI*r*r;
		System.out.println("Perimeter is: " + perimeter + "\nArea is: " + area);
		
		sc.close();
	}
}