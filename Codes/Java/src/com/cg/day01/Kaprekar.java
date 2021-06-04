package com.cg.day01;

public class Kaprekar {
	public static int power(int n)
	{
		if(n>1)
			return 10*power(n-1);
		else if(n==0)
			return 1;
		return 10;
	}
	public static boolean kaprekar(int n)
	{
		int sq=n*n;
		String s=String.valueOf(sq);
		int a,b;
		if(s.length()%2==0)
		{
			b=sq%power(s.length()/2);
			a=sq/power(s.length()/2);
		}
		else
		{
			b=sq%power(s.length()/2+1);
			a=sq/power(s.length()/2+1);
		}
		if(a+b==n)
			return true;
		return false;
	}
	public static void main(String args[])
	{
		int i;
		for(i=1;i<1000;i++)
		{
			if(kaprekar(i))
			{
				System.out.println(i);
			}
		}
	}
}