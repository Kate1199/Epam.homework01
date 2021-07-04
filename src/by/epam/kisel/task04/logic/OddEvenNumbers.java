package by.epam.kisel.task04.logic;

import by.epam.kisel.inputUtility.InputUtility;

public class OddEvenNumbers {

	private static final int MIN_NUMBER_OF_EVEN = 2;

	public static boolean isSomeEven(int[] numbers) {
		int count = 0;
		
		if(InputUtility.isNull(numbers)) {
			return false;
		}

		for (int n : numbers) {
			if (isEven(n)) {
				count++;
			}
		}

		return count >= MIN_NUMBER_OF_EVEN;
	}
	
	private static boolean isEven(int x) {
		return x % 2 == 0;
	}

}
