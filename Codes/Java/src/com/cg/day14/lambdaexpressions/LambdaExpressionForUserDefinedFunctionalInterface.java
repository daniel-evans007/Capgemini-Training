package com.cg.day14.lambdaexpressions;

public class LambdaExpressionForUserDefinedFunctionalInterface {

	public static void main(String[] args) {
		
		Addition addition = () -> {
			System.out.println("Addition of two numbers = "+(40+60));
		};
		
		addition.add();
	}
}
