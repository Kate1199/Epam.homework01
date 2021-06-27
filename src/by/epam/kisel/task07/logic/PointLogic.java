package by.epam.kisel.task07.logic;

import by.epam.kisel.task07.entity.Point;

public class PointLogic {
	
public static Point findTheNearest(Point p1, Point p2) {
		
		if (p1.getDistance() < p2.getDistance()) {
			return p1;
		} else if (p1.getDistance() == p2.getDistance()){
			return null;
		} else {
			return p2;
		}
	}

}
