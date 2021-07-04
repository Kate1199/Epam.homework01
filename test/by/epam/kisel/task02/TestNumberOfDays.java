package by.epam.kisel.task02;

import static org.junit.Assert.assertEquals;

import java.util.InputMismatchException;

import org.junit.Test;

import by.epam.kisel.task02.logic.NumberOfDays;

public class TestNumberOfDays {
	
	private int testMonth = 4;
	private int testFebruary = 2;
	private int testYear = 2021;
	private int testLeapYear = 2020;
	private int testNotLeapYear = 1900;
	private int incorrectMonth = 13;
	private int incorrectYear = -256;
	
	@Test
	public void testCountDays() {
		int expected = 30;
		int actual = NumberOfDays.countDays(testMonth, testYear);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCountDays_LEAP_YEAR() {
		int expected = 29;
		int actual = NumberOfDays.countDays(testFebruary, testLeapYear);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCountDays_NOT_LEAP_YEAR() {
		int expected = 28;
		int actual = NumberOfDays.countDays(testFebruary, testNotLeapYear);
		assertEquals(expected, actual);
	}
	
	@Test(expected = InputMismatchException.class)
	public void testCountDays_INCORRECT_MONTH() {
		NumberOfDays.countDays(incorrectMonth, testYear);
	}
	
	@Test(expected = InputMismatchException.class)
	public void testCountDays_INCORRECT_YEAR() {
		NumberOfDays.countDays(testMonth, incorrectYear);
	}
}
