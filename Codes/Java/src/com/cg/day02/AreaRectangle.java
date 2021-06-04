package com.cg.day02;

import java.util.*;

public class AreaRectangle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of rectangle");
		int length=sc.nextInt();
		
		System.out.println("Enter breadth of rectangle");
		int breadth=sc.nextInt();
		
		int area=length*breadth;
		System.out.println("Area of the rectangle is ="+area);
		
		sc.close();
	}

}