package by.epam.kisel.task07.view;

import by.epam.kisel.task07.entity.Point;

public class PointView {
	public static void outputTheNearest(Point p) {
		if(p != null ) {
			System.out.println("Точка с координатами " + p.toString() + " ближе к началу координат");
		} else  {
			System.out.println("Точки равноудалены от начала координат");
		}
	}
}
