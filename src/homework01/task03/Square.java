package homework01.task03;

import homework01.instruments.*;

public class Square {

	public static void main(String[] args) {
		double area1 = Instruments.input("Введите площадь описанного квадрата: ");
		double radius = getRadius(area1);
		double area2 = getSquareArea(radius);
		System.out.println("Площадь вписанного квадрата: " + area2);

	}

	static double getSquareArea(double radius) {
		double a = radius * Math.sqrt(2);
		return a * a;
	}

	static double getRadius(double area) {
		double a = Math.sqrt(area);
		return a / 2;
	}
}
