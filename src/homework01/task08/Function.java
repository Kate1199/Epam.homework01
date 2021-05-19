package homework01.task08;

import homework01.instruments.*;

public class Function {

	public static void main(String[] args) {
		
		double x;
		while (true) {
			x = Instruments.inputDouble("¬ведите х: ");
			System.out.println("F(x) = " + countF(x));
		}

	}

	static double countF(double x) {
		double less3 = -(x * x) + 3 * x + 9;
		double more3 = 1 / (Math.pow(x, 3) - 6);
		return ((x >= 3) ? less3 : more3);
	}

}
