package homework01.task01;

import homework01.instruments.*;

public class LastNumber {

	public static void main(String[] args) {
		while (true) {
			double x = Instruments.input("Введите число: ");
			System.out.println("Последняя цифра квадрата: " + getlastNumberSquare(x));
		}
	}

	static boolean isDouble(double x) {
		return x % 1 != 0;
	}

	static double getlastNumberSquare(double x) {
		while (isDouble(x)) {
			x = x * 10;
		}
		return Math.pow(x % 10, 2) % 10;
	}

}
