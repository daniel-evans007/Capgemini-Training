package com.cg.day14.lambdaexpressions;

public class RunnableUsingLambda {

	public static void main(String[] args) {
		
		//implementing runnable interface using lambda expressions
		Runnable runnable1 = () -> System.out.println("Run method using Lambda Expression");
	}
}