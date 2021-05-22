package by.epam.kisel.task10.logic;

import java.util.ArrayList;
import java.util.InputMismatchException;

import by.epam.kisel.inputUtility.InputUtility;

public class FunctionTable {

	public static ArrayList<Double> findArgs(int a, int b, double h) throws InputMismatchException {

		if (a >= b) {
			throw new InputMismatchException("а должно быть больше b");
		}
		InputUtility.checkNegative(h);

		ArrayList<Double> args = new ArrayList<>();

		for (double x = a; x <= b; x += h) {
			args.add(x);
		}

		return args;
	}

	public static ArrayList<Double> findFuncs(ArrayList<Double> args) {

		ArrayList<Double> funcs = new ArrayList<>();

		for (double x : args) {
			double y = Math.tan(x);
			funcs.add(y);
		}

		return funcs;
	}
}
