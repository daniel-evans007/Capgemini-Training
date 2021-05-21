package com.cg.firstmavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathematicsTest {

	Mathematics a = new Mathematics();
	
	@Test
	public void addTest() {
		
		int expectedResult = 11;
		int actualResult = a.add(6, 5);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void diffTest() {
		
		int expectedResult = 1;
		int actualResult = a.diff(6, 5);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void mulTest() {
		
		int expectedResult = 30;
		int actualResult = a.mul(6, 5);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void divTest() {
		
		int expectedResult = 1;
		int actualResult = a.div(6, 5);
		
		assertEquals(expectedResult, actualResult);
	}
}