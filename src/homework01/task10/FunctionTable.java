package homework01.task10;

import java.util.ArrayList;
import homework01.instruments.*;

public class FunctionTable {

	public static void main(String[] args) {

		while (true) {

			int a = (int) Instruments.input("¬ведите а: ");
			int b = (int) Instruments.input("¬ведите b: ");
			double h = Instruments.input("¬ведите h: ");

			ArrayList<Double> x = getArgs(a, b, h);
			ArrayList<Double> y = getFuns(x);

			outputTable(x, y);

		}

	}

	static ArrayList<Double> getArgs(int a, int b, double h) {
		
		ArrayList<Double> args = new ArrayList<>();
		
		for (double x = a; x <= b; x = x + h) {
			args.add(x);
		}
		
		return args;
	}

	static ArrayList<Double> getFuns(ArrayList<Double> args) {
		
		ArrayList<Double> funs = new ArrayList<>();
		
		for (double x : args) {
			double y = Math.tan(x);
			funs.add(y);
		}
		
		return funs;
	}

	static void outputTable(ArrayList<Double> x, ArrayList<Double> y) {
		System.out.println("------------------------------\nx \t|\ty\t     |\n------------------------------");
		for (int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i) + " \t| " + y.get(i) + " |\n");
		}
		System.out.println("------------------------------");
	}

}
