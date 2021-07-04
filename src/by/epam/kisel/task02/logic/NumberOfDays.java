package by.epam.kisel.task02.logic;

import java.util.InputMismatchException;

public class NumberOfDays {

	private static final int LEAP_YEAR_DIV_4 = 4;
	private static final int LEAP_YEAR_DIV_100 = 100;
	private static final int LEAP_YEAR_DIV_400 = 400;

	public static int countDays(int month, int year) throws InputMismatchException {
		int currentMonthDays = 0;

		checkDate(month, year);
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		currentMonthDays = daysInMonth[month - 1];

		currentMonthDays = countDaysInFebruary(currentMonthDays, month, year);
		return currentMonthDays;
	}
	
	private static void checkDate(int month, int year) {
		if (month <= 0 || month > 12 || year < 0) {
			throw new InputMismatchException("Дата введена не корректно");
		}
	}
	
	private static int countDaysInFebruary(int currentMonthDays, int month, int year) {
		if (month == 2 && isLeap(year)) {
			currentMonthDays = 29;
		}
		return currentMonthDays;
	}
	
	private static boolean isLeap(int year) {
		boolean div4 = year % LEAP_YEAR_DIV_4 == 0;
		boolean div100 = year % LEAP_YEAR_DIV_100 != 0;
		boolean div400 = year % LEAP_YEAR_DIV_400 == 0;

		return div4 && (div100 || div400);
	}

}
