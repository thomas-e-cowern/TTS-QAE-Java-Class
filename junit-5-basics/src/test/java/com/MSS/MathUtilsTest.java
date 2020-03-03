package com.MSS;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	
	MathUtils mathUtils;
	TestInfo testInfo;
	TestReporter testReporter;
	
	@BeforeEach
	void beforeAllInit (TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
//		System.out.println("This needs to run before all");
		testReporter.publishEntry("Running " + testInfo.getDisplayName());
	}
	
	@BeforeEach
	void init () {
		mathUtils = new MathUtils();
	}

	@Nested
	@DisplayName("Add Method")
	@Tag("Math")
	class AddTest {
		@Test
		@DisplayName("When adding two positive numbers")
		void testAddPositive () {
			assertEquals(2,  mathUtils.add(1, 1), "Should return the right sum");
		}
		
		@Test
		@DisplayName("When adding two negetive numbers")
		void testAddNegative () {
			assertEquals(-2,  mathUtils.add(-1, -1), "Should return the right sum");
		}
	}
	
	@Test
	@DisplayName("Test Multiply")
	@Tag("Math")
	void testMultiply () {
		System.out.println("Running " + testInfo.getDisplayName());
		testReporter.publishEntry("Running " + testInfo.getDisplayName());
		assertAll(
				() -> assertEquals(4, mathUtils.multiply(2, 2)),
				() -> assertEquals(0, mathUtils.multiply(2, 0)),
				() -> assertEquals(-2, mathUtils.multiply(2, -1))
				);
	}
	
	@Test
	@Tag("Math")
	void testDivide () {
		boolean isServerUp = true;
		assumeTrue(isServerUp);
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");
	}
	
	@RepeatedTest(3)
	void testComputeCircleArea (RepetitionInfo repetitionInfo) {	
		System.out.println("Rep: " + repetitionInfo.getCurrentRepetition());
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return circle area");
	}
	
	@Test
	@Disabled
	@DisplayName("Testing disabled")
	void testDisabled () {
		System.out.println("This should be disabled");
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	@DisplayName("Testing windows")
	void testWindows () {
		System.out.println("This should be disabled");
	}
	

}
