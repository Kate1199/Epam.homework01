package by.epam.kisel.task08;

import static org.junit.Assert.*;

import org.junit.Test;

import by.epam.kisel.task08.logic.Function;

public class TestFunction {
	
	private double testNumber1 = 3;
	private double testNumber2 = -3;	
	
	@Test
	public void testCountF_CONDITION1() {
		double expected = 9;
		double actual = Function.countF(testNumber1);
		assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void testCountF_CONDITION2() {
		double expected = -0.03;
		double actual = Function.countF(testNumber2);
		assertEquals(expected, actual, 0.01);
	}
}
