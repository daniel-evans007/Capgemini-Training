package com.capgemini.day1;

public class LucasNumber {

	public static void main(String[] args) 
	{
		int num1=2,num2=1,sum=0;
		System.out.println("First ten Lucas numbers: ");
		System.out.println(num1);
		System.out.println(num2);
		sum=num1+num2;
		for(int i=0;i<8;i++)
		{
			System.out.println(sum);
			int prev=sum;
			sum=sum+num2;
			num2=prev;
		}
	}
}