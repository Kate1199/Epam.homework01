package by.epam.kisel.task05;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Test;

import by.epam.kisel.task05.logic.PerfectNumber;

public class TestPerfectNumbers {
	
	private int testNumber = 8;
	private int testPerfectNumber = 28;
	private int testNegativeNumber = -28;
	
	@Test
	public void testIsPerfect() {
		boolean condition = PerfectNumber.isPerfect(testPerfectNumber);
		assertTrue(condition);
	}
	
	@Test
	public void testIsPerfect_NOT_PERFECT() {
		boolean condition = PerfectNumber.isPerfect(testNumber);
		assertFalse(condition);
	}
	
	@Test(expected = InputMismatchException.class)
	public void testIsPerfect_NEGATIVE() {
		PerfectNumber.isPerfect(testNegativeNumber);
	}

}
