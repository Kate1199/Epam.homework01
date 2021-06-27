package by.epam.kisel.task05.logic;

import by.epam.kisel.inputUtility.InputUtility;

public class PerfectNumber {
	
	public static boolean isPerfect(int x) {
		int sumDivisors = 0;
		
		InputUtility.checkNegative(x);
		
		for(int div = 1; div < x; div++) {
			sumDivisors = addDivisor(x, div, sumDivisors);
		}
		
		return sumDivisors == x;
	}
	
	private static boolean isDivisor(int x, int div) {
		return x % div == 0;
	}
	
	private static int addDivisor(int x, int div, int sumDivisors) {
		if(isDivisor(x, div)) {
			sumDivisors += div;
		}
		return sumDivisors;
	}
}
