package by.epam.kisel.task04;

import static org.junit.Assert.*;

import org.junit.Test;

import by.epam.kisel.task04.logic.OddEvenNumbers;

public class TestOddEvenNumbers {
	
	int[] testNumbers1 = {1, 2, 3, 5};
	int[] testNumbers2 = {-1, -2, 4, 8};

	@Test
	public void testIsSomeEven_TRUE() {
		boolean condition = OddEvenNumbers.isSomeEven(testNumbers2);
		assertTrue(condition);
	}
	
	@Test
	public void testIsSomeEven_FALSE() {
		boolean condition = OddEvenNumbers.isSomeEven(testNumbers1);
		assertFalse(condition);
	}
	
	@Test
	public void testIsSomeEven_NULL() {
		boolean condition = OddEvenNumbers.isSomeEven(null);
		assertFalse(condition);
	}
}
