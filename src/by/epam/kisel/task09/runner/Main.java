package by.epam.kisel.task09.runner;

import by.epam.kisel.inputUtility.InputUtility;
import by.epam.kisel.task09.logic.Circle;

public class Main {

	public static void main(String[] args) {
		
		double r;
		double length;
		double area;
		
		while (true) {
			r = InputUtility.inputDouble("Введите R: ");
			
			length = Circle.findCircleLength(r);
			area = Circle.findCircleArea(r);
			
			System.out.println("Длина окружности: " + length + "\nПлощадь круга: " + area);
		}
	}

}
