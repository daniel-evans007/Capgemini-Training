package com.cg.day14.lambdaexpressions;

public class MulitplicationLambda {

	public static void main(String[] args) {
		
		Multiplication multiply = () -> {
			System.out.println("Here's the result of the multiplication: "+(7*14));
		};
		
		multiply.multiplication();
	}
}