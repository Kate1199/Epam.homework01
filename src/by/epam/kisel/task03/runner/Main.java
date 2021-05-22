package by.epam.kisel.task03.runner;

import by.epam.kisel.inputUtility.InputUtility;
import by.epam.kisel.task03.logic.*;

public class Main {

	public static void main(String[] args) {
		
		double area1;
		double radius;
		double area2;
		
		while(true) {
		area1 = InputUtility.inputDouble("Введите площадь квадрата, в который вписана окружность: ");
		
		radius = Square.countRadius(area1);
		area2 = Square.countSquareArea(radius);
		System.out.println("Площадь вписанного квадрата: " + area2);
		}

	}

}
