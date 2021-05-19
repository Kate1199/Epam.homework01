package homework01.task04;

import homework01.instruments.*;

public class OddEvenNumbers {

	public static void main(String[] args) {
		while (true) {
			int[] numbers = Instruments.inputArray("Введите A, B, C, D");
			boolean result = isTrue(numbers);
			System.out.println("Как минимум 2 числа чётные: " + result);
		}
	}

	private static boolean isTrue(int[] numbers) {
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				count++;
			}
		}

		return count >= 2;
	}

}
