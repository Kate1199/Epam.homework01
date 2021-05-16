package homework01.task09;

import homework01.instruments.*;

public class Circle {

	public static void main(String[] args) {
		while (true) {
			double r = Instruments.input("������� ������ R: ");
			System.out.println("����� ����������: " + getCircleLength(r) + "\n������� ����������: " + getCircleArea(r));
		}

	}

	static double getCircleLength(double r) {
		return 2 * Math.PI * r;
	}

	static double getCircleArea(double r) {
		return Math.PI * (r * r);
	}

}
