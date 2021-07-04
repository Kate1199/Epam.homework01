package by.epam.kisel.task07.logic;

import java.util.InputMismatchException;

import by.epam.kisel.inputUtility.InputUtility;
import by.epam.kisel.task07.entity.Point;

public class PointLogic {

	public static Point findTheNearest(Point p1, Point p2) {

		checkPoints(p1, p2);
		if (p1.getDistance() < p2.getDistance()) {
			return p1;
		} else if (p1.getDistance() == p2.getDistance()) {
			return null;
		} else {
			return p2;
		}
	}

	private static void checkPoints(Point p1, Point p2) throws InputMismatchException {
		if (InputUtility.isNull(p1) || InputUtility.isNull(p2)) {
			throw new InputMismatchException("Значение точки - null");
		}
	}

}
