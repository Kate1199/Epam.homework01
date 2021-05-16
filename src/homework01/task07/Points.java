package homework01.task07;

import homework01.instruments.*;

public class Points {

	public static void main(String[] args) {
		while (true) {
			double x1 = Instruments.input("������� �1: ");
			double y1 = Instruments.input("������� y1: ");
			double x2 = Instruments.input("������� �2: ");
			double y2 = Instruments.input("������� y2: ");

			double A = getHypotenuse(x1, y1);
			double B = getHypotenuse(x2, y2);

			System.out.println(comparePoints(A, B));
		}

	}

	static double getHypotenuse(double x, double y) {
		return Math.sqrt(x * x + y * y);
	}

	static String comparePoints(double A, double B) {
		if (A < B) {
			return "����� � ����� � ������ ���������";
		} else if (A == B) {
			return "����� � � � ��������� ������� �� ������ ���������";
		} else {
			return "����� B ����� � ������ ���������";
		}
	}

}
