package com.cg.day14.lambdaexpressions;

public class SubtractionWithLambda {

	public static void main(String[] args) {
		
		Subtraction sub = (int a, int b) -> {
			System.out.println("Here's the result of the subtraction: "+(a-b));
		};
		
		sub.subtraction(150, 74);
	}
}