package homework01.instruments;

import java.util.Scanner;

public class Instruments {

	public static double input(String enter) {
		Scanner sc = new Scanner(System.in);
		System.out.println(enter);
		return sc.nextDouble();
	}

	public static int[] inputArray(String text) {
		int[] numbers = new int[4];

		Scanner sc = new Scanner(System.in);
		System.out.println(text);

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		return numbers;
	}
}
