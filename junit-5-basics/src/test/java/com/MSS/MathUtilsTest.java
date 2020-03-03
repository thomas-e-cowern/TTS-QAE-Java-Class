package com.MSS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd () {
		System.out.println("This test ran...");
		MathUtils mathUtils = new MathUtils();
		
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "The add method should add two numbers");
	}
	
	@Test
	void testDivide () {
		MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");
		
	}
	
	@Test
	void testComputeCircleArea () {
		MathUtils mathUtils = new MathUtils();
		
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return circle area");
	}
	

}
