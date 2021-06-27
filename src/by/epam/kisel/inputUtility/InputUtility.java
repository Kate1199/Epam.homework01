package by.epam.kisel.inputUtility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtility {
	
	static Scanner sc = new Scanner(System.in);

	public static double inputDouble(String text) {

		double x;
		System.out.println(text);
		
		while(!sc.hasNextDouble()) {
			sc.next();
		}
		x = sc.nextDouble();

		return x;

	}

	public static int inputInt(String text) {

		int x;
		System.out.println(text);
		
		while(!sc.hasNextInt()) {
			sc.next();
		}
		x = sc.nextInt();
		
		return x;

	}

	public static int[] inputArray(String text, int size) {
		int[] numbers = new int[size];

		System.out.println(text);

		for (int i = 0; i < numbers.length; i++) {
			while(!sc.hasNextDouble()) {
				sc.next();
			}
			numbers[i] = sc.nextInt();
		}
		return numbers;
	}
	
	public static void checkNegative(double x) throws InputMismatchException {
		if(x <= 0) {
			throw new InputMismatchException("Значение должно быть больше 0");
		}
	}
}
