package by.epam.kisel.task02.logic;

import java.util.InputMismatchException;

public class NumberOfDays {

	private static final int LEAP_YEAR_DIV_4 = 4;
	private static final int LEAP_YEAR_DIV_100 = 100;
	private static final int LEAP_YEAR_DIV_400 = 400;

	public static boolean isLeap(int year) {
		boolean div4 = year % LEAP_YEAR_DIV_4 == 0;
		boolean div100 = year % LEAP_YEAR_DIV_100 != 0;
		boolean div400 = year % LEAP_YEAR_DIV_400 == 0;

		return div4 && (div100 || div400);
	}

	public static int countDays(int month, int year) throws InputMismatchException {
		int days = 0;

		if (month <= 0 || month > 12 || year < 0) {
			throw new InputMismatchException("Дата введена не корректно");
		}
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		days = daysInMonth[month - 1];

		if (month == 2 && isLeap(year)) {
			days++;
		}
		return days;
	}

}
