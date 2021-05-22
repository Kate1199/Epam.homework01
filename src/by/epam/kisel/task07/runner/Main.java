package by.epam.kisel.task07.runner;

import by.epam.kisel.inputUtility.InputUtility;
import by.epam.kisel.task07.entity.Point;

public class Main {

	public static void main(String[] args) {

		while (true) {
			
			double x1 = InputUtility.inputDouble("Введите х1: ");
			double y1 = InputUtility.inputDouble("Введите y1: ");
			double x2 = InputUtility.inputDouble("Введите х2: ");
			double y2 = InputUtility.inputDouble("Введите y2: ");
			
			Point a = new Point(x1, y1);
			Point b = new Point(x2, y2);
			
			Point nearest = a.findTheNearest(b);
			Point.outputTheNearest(nearest);

		}

	}

}
