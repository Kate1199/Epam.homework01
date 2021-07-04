package by.epam.kisel.task10;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.InputMismatchException;

import org.junit.Before;
import org.junit.Test;

import by.epam.kisel.task10.logic.FunctionTable;

public class TestFunctionTable {
	
	private int testA = 1;
	private int testB = 9;
	private int testH = 3;
	private int testNegativeH = -3;
	
	private ArrayList<Double> testArguments = new ArrayList<>();
	private ArrayList<Double> testFunctions = new ArrayList<>();
	
	@Before
	public void setUp() {
		testArguments.add(1.0);
		testArguments.add(4.0);
		testArguments.add(7.0);
		
		testFunctions.add(1.5574077246549023);
		testFunctions.add(1.1578212823495775);
		testFunctions.add(0.8714479827243188);
	}
	
	@Test
	public void testFindArguments() {
		ArrayList<Double> expected = testArguments;
		ArrayList<Double> actual = FunctionTable.findArguments(testA, testB, testH);
		assertEquals(expected, actual);
	}
	
	@Test(expected = InputMismatchException.class)
	public void testFindArguments_INCORRECT_RANGE() {
		FunctionTable.findArguments(testB, testA, testH);
	}
	
	@Test(expected = InputMismatchException.class)
	public void testFindArguments_NEGATIVE_H() {
		FunctionTable.findArguments(testB, testA, testNegativeH);
	}
	
	@Test
	public void testFindFunctions() {
		ArrayList<Double> expected = testFunctions;
		ArrayList<Double> actual = FunctionTable.findFunctions(testArguments);
		assertEquals(expected, actual);
	}
	
	@Test(expected = InputMismatchException.class)
	public void testFindArguments_NULL() {
		FunctionTable.findFunctions(null);
	}

}
