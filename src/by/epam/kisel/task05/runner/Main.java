package by.epam.kisel.task05.runner;

import by.epam.kisel.inputUtility.InputUtility;
import by.epam.kisel.task05.logic.PerfectNumber;

public class Main {

	public static void main(String[] args) {
		int num;
		
		while (true) {
			num = InputUtility.inputInt("Введите число: ");
			
			System.out.println("Число " + num + " совершенное: " + PerfectNumber.isPerfect(num));
		}
	}

}
