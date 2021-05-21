package com.cg.firstmavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdditionTest {

	Addition add = new Addition();
	
	@Test
	public void addTest() {
		
		int expectedResult = 11;
		int actualResult = add.add(5, 6);
		
		assertEquals(11, add.add(expectedResult, actualResult));
	}
}