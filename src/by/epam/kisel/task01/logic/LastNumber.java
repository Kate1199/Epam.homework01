package by.epam.kisel.task01.logic;

public class LastNumber {
	
	static boolean isDouble(double x) { 
		return x % 1 != 0;
	}

	public static double takelastNumberSquare(double x) {
		double square;
		
		while (isDouble(x)) {
			x = x * 10;
		}
		square = Math.pow(x % 10, 2) % 10;
		return square;
	}

}
