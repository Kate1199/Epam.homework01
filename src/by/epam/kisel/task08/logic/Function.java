package by.epam.kisel.task08.logic;

import java.util.InputMismatchException;

public class Function {
	
	private static final double CONDITION = 3;
	
	public static double countF(double x) {
		double y1 = findY1(x);
		double y2 = findY2(x);
		double func = ((x >= CONDITION) ? y1 : y2);
		return func;
	}
	
	private static double findY1(double x) {
		double y = -(x * x) + 3 * x + 9;
		return y;
	}
	
	private static double findY2(double x) throws InputMismatchException {
		double divider = Math.pow(x, 3) - 6;
		
		if(divider == 0) {
			throw new InputMismatchException("Деление на 0");
		}
		double y = 1 / divider;
		return y;
	}

}
