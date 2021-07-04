package by.epam.kisel.task06;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Test;

import by.epam.kisel.task06.logic.Time;

public class TestTime {
	
	private int testSec = 85645;
	private int testNegativeSec = -565648;
	
	@Test
	public void testCountHours() {
		int expected = 23;
		int actual = Time.countHours(testSec);
		assertEquals(expected, actual);
	}
	
	@Test(expected = InputMismatchException.class)
	public void testCountHours_NEGATIVE() {
		Time.countHours(testNegativeSec);
	}
	
	@Test
	public void testCountMinuts() {
		int expected = 47;
		int actual = Time.countMinutes(testSec);
		assertEquals(expected, actual);
	}
	
	@Test(expected = InputMismatchException.class)
	public void testCountMinuts_NEGATIVE() {
		Time.countMinutes(testNegativeSec);
	}
	
	@Test
	public void testCountSeconds() {
		int expected = 25;
		int actual = Time.countSeconds(testSec);
		assertEquals(expected, actual);
	}
	
	@Test(expected = InputMismatchException.class)
	public void testCountSeconds_NEGATIVE() {
		Time.countSeconds(testNegativeSec);
	}
}
