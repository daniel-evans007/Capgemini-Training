package com.cg.day14.lambdaexpressions;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//implementing Runnable Interface using Lambda Expression
		Runnable runnable1=()->{
			System.out.println("run method using lambda expression");
			System.out.println("Run method in anonymous class");
		};

		//implementing using anonymous class
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Implementation of Runnable Functional Interface using anonymous class");
				System.out.println("Run method in anonymous class");
				
				Thread th = new Thread(runnable1);
				th.start();
			}
		}).start();
		
		
		//Lambda expression for Predicate interface in java.util.function package
		
		Predicate<Integer> greater = age->(age>18);
		
		Predicate<Integer> lesser = age->(age<18);
		
		//calling Predicate Method
		System.out.println(greater.test(20));
		
		boolean checkAge=greater.or(lesser).test(25);
		
		System.out.println(checkAge);
		
		//calling a method with predicate as parameter
		predicateInMethod(14, age->(age>18));
		
	}//close of main method
	
	static void predicateInMethod(int number,Predicate<Integer> age) {
		if(age.test(number)) {
			System.out.println("age = "+number);
		}
		else {
			System.out.println("age not satisfied = "+number);
		}
	}
}