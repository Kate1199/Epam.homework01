package by.epam.kisel.task10.runner;

import java.util.ArrayList;

import by.epam.kisel.inputUtility.InputUtility;
import by.epam.kisel.task10.logic.FunctionTable;
import by.epam.kisel.task10.view.TableView;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		double h;

		while (true) {

			a = InputUtility.inputInt("Введите а: ");
			b = InputUtility.inputInt("Введите b: ");
			h = InputUtility.inputDouble("Введите h: ");

			ArrayList<Double> x = FunctionTable.findArguments(a, b, h);
			ArrayList<Double> y = FunctionTable.findFunctions(x);

			TableView.outputTable(x, y);
		}

	}
}
