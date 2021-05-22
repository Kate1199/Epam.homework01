package by.epam.kisel.task04.runner;

import by.epam.kisel.inputUtility.InputUtility;
import by.epam.kisel.task04.logic.*;

public class Main {

	public static void main(String[] args) {
		int[] numbers;
		boolean someEven;
		
		while (true) {
			numbers = InputUtility.inputArray("Введите A, B, C, D", 4);
			
			someEven = OddEvenNumbers.isSomeEven(numbers);
			System.out.println("Как минимум 2 числа чётные: " + someEven);
		}

	}

}
