package by.epam.kisel.task09;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Test;

import by.epam.kisel.task09.logic.Circle;

public class TestCircle {

	private double testRadius = 4;
	private double testNegativeRadius = -4;

	@Test
	public void testCircleLength() {
		double expected = 25.1;
		double actual = Circle.findCircleLength(testRadius);
		assertEquals(expected, actual, 0.1);
	}

	@Test(expected = InputMismatchException.class)
	public void testCircleLength_NEGATIVE() {
		Circle.findCircleLength(testNegativeRadius);
	}
	
	@Test
	public void testCircleArea() {
		double expected = 50.2;
		double actual = Circle.findCircleArea(testRadius);
		assertEquals(expected, actual, 0.1);
	}

	@Test(expected = InputMismatchException.class)
	public void testCircleArea_NEGATIVE() {
		Circle.findCircleArea(testNegativeRadius);
	}

}
