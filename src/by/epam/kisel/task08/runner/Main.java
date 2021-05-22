package by.epam.kisel.task08.runner;

import by.epam.kisel.inputUtility.InputUtility;
import by.epam.kisel.task08.logic.Function;

public class Main {

	public static void main(String[] args) {
		
		double x;
		double y;
		while (true) {
			x = InputUtility.inputDouble("Введите х: ");
			y = Function.countF(x);
			System.out.println("F(x) = " + y);
		}

	}

}
