package homework01.task05;

import homework01.instruments.*;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int num;
		int[] div;
		while (true) {
			num = Instruments.inputInt("Введите число: ");
			div = findDivisors(num);
			System.out.println("Число " + num + " совершенное: " + isPerfect(num, div));
		}

	}

	private static int[] findDivisors(int x) {
		int count = 1;
		int position = 0;

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				count++;
			}
		}

		int[] divisors = new int[count];

		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				divisors[position++] = i;
			}
		}

		return divisors;

	}

	private static boolean isPerfect(int x, int[] divisors) {
		int sum = 0;

		for (int d : divisors) {
			sum = sum + d;
		}
		
		return sum == x;
	}
}
