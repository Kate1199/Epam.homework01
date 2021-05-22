package by.epam.kisel.task10.view;

import java.util.ArrayList;

public class TableView {
	
	public static void outputTable(ArrayList<Double> x, ArrayList<Double> y) {
		System.out.println("------------------------------\nx \t|\ty\t     |\n------------------------------");
		for (int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i) + " \t| " + y.get(i) + " |\n");
		}
		System.out.println("------------------------------");
	}

}
