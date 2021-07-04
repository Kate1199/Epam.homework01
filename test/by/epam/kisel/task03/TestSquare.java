package by.epam.kisel.task03;

import static org.junit.Assert.assertEquals;

import java.util.InputMismatchException;

import org.junit.Test;

import by.epam.kisel.task03.logic.Square;

public class TestSquare {
	
	private double testRadius = 3; 
	private double testNegativeRadius = -3; 
	
	@Test
	public void testCountSquareArea() {
		double expected = 18;
		double actual = Square.countSquareArea(testRadius);
		assertEquals(expected, actual, 0.1);
	}
	
	@Test(expected = InputMismatchException.class)
	public void testCountSquareArea_NEGATIVE() {
		Square.countSquareArea(testNegativeRadius);
	}
	
	@Test
	public void testcountRadius() {
		double expected = 0.9;
		double actual = Square.countRadius(testRadius);
		assertEquals(expected, actual, 0.1);
	}
	
	@Test(expected = InputMismatchException.class)
	public void testcountRadius_NEGATIVE() {
		Square.countSquareArea(testNegativeRadius);
	}

}
