package homework01.instruments;

import java.util.Scanner;

public class Instruments {

	public static double inputDouble(String text) {

		Scanner sc = new Scanner(System.in);
		double x;

		System.out.println(text);
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		} else {
			throw new ArithmeticException("�������� ����");
		}

		return x;

	}

	public static int inputInt(String text) {

		int x;
		Scanner sc = new Scanner(System.in);

		System.out.println(text);
		if (sc.hasNextInt()) {
			x = sc.nextInt();
		} else {
			throw new ArithmeticException("�������� ����");
		}

		return x;

	}

	public static int[] inputArray(String text) {
		int[] numbers = new int[4];
		Scanner sc = new Scanner(System.in);

		System.out.println(text);

		for (int i = 0; i < numbers.length; i++) {
			if (sc.hasNextDouble()) {
				numbers[i] = sc.nextInt();
			} else {
				throw new ArithmeticException("�������� ����");
			}
		}
		return numbers;
	}

	public static void checkNegative(double x) throws ArithmeticException {
		if (x < 0) {
			throw new ArithmeticException("�� ����� ���� �������������");
		}
	}

}
