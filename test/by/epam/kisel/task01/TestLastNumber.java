package by.epam.kisel.task01;

import static org.junit.Assert.*;

import org.junit.Test;

import by.epam.kisel.task01.logic.LastNumber;

public class TestLastNumber {
	
	int testInt = 49;
	double testDouble = 32.26;
	int testNegative = -12;
	
	@Test
	public void testCountLastNumberSquare_INT() {
		double expected = 1;
		double actual = LastNumber.countLastNumberSquare(testInt);
		assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void testCountLastNumberSquare_DOUBLE() {
		double expected = 6;
		double actual = LastNumber.countLastNumberSquare(testDouble);
		assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void testCountLastNumberSquare_NEGATIVE() {
		double expected = 4;
		double actual = LastNumber.countLastNumberSquare(testNegative);
		assertEquals(expected, actual, 0.1);
	}
}
