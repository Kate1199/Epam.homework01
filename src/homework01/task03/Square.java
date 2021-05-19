package homework01.task03;

import homework01.instruments.*;

public class Square {

	public static void main(String[] args) {
		
		double area1;
		double radius;
		double area2;
		
		while(true) {
		area1 = Instruments.inputDouble("Введите площадь квадрата, в который вписана окружность: ");
		Instruments.checkNegative(area1);
		
		radius = getRadius(area1);
		area2 = getSquareArea(radius);
		System.out.println("Площадь вписанного квадрата: " + area2);
		}

	}

	private static double getSquareArea(double radius) {
		double a = radius * Math.sqrt(2);
		return a * a;
	}

	private static double getRadius(double area) {
		double a = Math.sqrt(area);
		return a / 2;
	}
	
}
