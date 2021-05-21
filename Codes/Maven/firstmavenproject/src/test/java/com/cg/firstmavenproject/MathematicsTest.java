package com.cg.firstmavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathematicsTest {

	Mathematics math = new Mathematics();
	
	@Test
	public void addTest() {
		
		int expectedResult = 11;
		int actualResult = math.add(6, 5);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void diffTest() {
		
		int expectedResult = 1;
		int actualResult = math.diff(6, 5);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void mulTest() {
		
		int expectedResult = 30;
		int actualResult = math.mul(6, 5);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void divTest() {
		
		int expectedResult = 1;
		int actualResult = math.div(6, 5);
		
		assertEquals(expectedResult, actualResult);
	}
}