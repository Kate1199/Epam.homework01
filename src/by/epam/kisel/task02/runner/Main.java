package by.epam.kisel.task02.runner;

import by.epam.kisel.inputUtility.InputUtility;
import by.epam.kisel.task02.logic.*;

public class Main {

	public static void main(String[] args) {
		int month, year, days;

		while (true) {
			
			month = InputUtility.inputInt("Введите месяц: ");
			year = InputUtility.inputInt("Введите год: ");
			
			days = NumberOfDays.countDays(month, year);
			System.out.println("Количество дней в " + month + " месяце " + year + " года: " + days);
		}

	}

}
