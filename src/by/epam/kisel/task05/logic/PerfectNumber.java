package by.epam.kisel.task05.logic;

import by.epam.kisel.inputUtility.InputUtility;

public class PerfectNumber {

	
	public static boolean isPerfect(int x) {
		int sumDivisors = 0;
		
		InputUtility.checkNegative(x);
		
		for(int div = 1; div < x; div++) {
			if(x % div == 0) {
				sumDivisors += div;
			}
		}
		
		return sumDivisors == x;
	}
}
