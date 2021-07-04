package by.epam.kisel.task10.logic;

import java.util.ArrayList;
import java.util.InputMismatchException;

import by.epam.kisel.inputUtility.InputUtility;

public class FunctionTable {

	public static ArrayList<Double> findArguments(int a, int b, double h) throws InputMismatchException {

		checkRange(a, b);
		InputUtility.checkNegative(h);

		ArrayList<Double> args = new ArrayList<>();

		for (double x = a; x <= b; x += h) {
			args.add(x);
		}

		return args;
	}
	
	private static void checkRange(int a, int b) throws InputMismatchException {
		if (a >= b) {
			throw new InputMismatchException("а должно быть больше b");
		}
	}

	public static ArrayList<Double> findFunctions(ArrayList<Double> args) {
		emptyArguments(args);
		ArrayList<Double> funcs = new ArrayList<>();

		for (double x : args) {
			double y = Math.tan(x);
			funcs.add(y);
		}

		return funcs;
	}
	
	private static void emptyArguments(ArrayList<Double> args) throws InputMismatchException {
		if(InputUtility.isNull(args)) {
			throw new InputMismatchException("Знаечние аргументов - null");
		}

	}
}
