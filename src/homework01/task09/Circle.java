package homework01.task09;

import homework01.instruments.*;

public class Circle {

	public static void main(String[] args) {
		
		double r;
		while (true) {
			r = Instruments.inputDouble("Введите радиус R: ");
			Instruments.checkNegative(r);
			System.out.println("Длина окружности: " + getCircleLength(r) + "\nПлощадь окружности: " + getCircleArea(r));
		}

	}

	private static double getCircleLength(double r) {
		return 2 * Math.PI * r;
	}

	private static double getCircleArea(double r) {
		return Math.PI * (r * r);
	}

}
