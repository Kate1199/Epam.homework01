package by.epam.kisel.task01.runner;

import by.epam.kisel.inputUtility.InputUtility;
import by.epam.kisel.task01.logic.*;

public class Main {

	public static void main(String[] args) {
		double x;
		while (true) {
			x = InputUtility.inputDouble("Введите число: ");
			System.out.println("Последняя цифра квадрата числа: " + LastNumber.countLastNumberSquare(x));
		}
	}

}
