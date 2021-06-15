package com.cg.day17.SOLIDprinciples.openclosedprinciple;

public class Rectangle implements Shape {
	
	private int length;
	private int width;
	@Override
	public double calculateArea() {
		return length * width;
	}

}
