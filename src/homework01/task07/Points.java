package homework01.task07;

import homework01.instruments.*;

public class Points {

	public static void main(String[] args) {

		double[] coor = new double[4];

		while (true) {
			coor[0] = Instruments.inputDouble("������� �1: ");
			coor[1] = Instruments.inputDouble("������� y1: ");
			coor[2] = Instruments.inputDouble("������� �2: ");
			coor[3] = Instruments.inputDouble("������� y2: ");
			
			for(double c : coor) {
				Instruments.checkNegative(c);
			}

			double A = getHypotenuse(coor[0], coor[1]);
			double B = getHypotenuse(coor[2], coor[3]);

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
