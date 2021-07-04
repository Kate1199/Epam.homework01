package by.epam.kisel.task01.logic;

public class LastNumber {

	public static double countLastNumberSquare(double x) {
		double square;
		double lastDigit;
		x = makeInt(x);
		lastDigit = x % 10;
		square = Math.pow(lastDigit, 2) % 10;
		return square;
	}
	
	private static double makeInt(double x) {
		while (isDouble(x)) {
			x = x * 10;
		}
		return x;
	}
	
	private static boolean isDouble(double x) { 
		return x % 1 != 0;
	}

}
