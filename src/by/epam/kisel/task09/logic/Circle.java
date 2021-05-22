package by.epam.kisel.task09.logic;

import by.epam.kisel.inputUtility.InputUtility;

public class Circle {

	public static double findCircleLength(double r) {
		InputUtility.checkNegative(r);
		double length = 2 * Math.PI * r;
		return length;
	}

	public static double findCircleArea(double r) {
		InputUtility.checkNegative(r);
		double area = Math.PI * (r * r);
		return area;
	}

}
