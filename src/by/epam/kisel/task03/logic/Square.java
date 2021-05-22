package by.epam.kisel.task03.logic;

import by.epam.kisel.inputUtility.InputUtility;

public class Square {
	
	public static double countSquareArea(double radius)  {
		
		InputUtility.checkNegative(radius);
		double a = radius * Math.sqrt(2);
		return a * a;
	}

	public static double countRadius(double area) {
		
		InputUtility.checkNegative(area);
		double a = Math.sqrt(area);
		return a / 2;
	}
	
}
