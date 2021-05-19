package homework01.task02;

import homework01.instruments.*;

public class NumberOfDays {

	public static void main(String[] args) {
		int month, year, days;

		while (true) {
			month = Instruments.inputInt("¬ведите мес€ц: ");
			checkMonth(month);
			year = Instruments.inputInt("¬ведите год: ");
			Instruments.checkNegative(year);
			days = countDays(month, year);
			System.out.println(" оличество дней в " + month + " мес€це " + year + " года: " + days);
		}
	}

	private static boolean isLeap(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}

	private static int countDays(int month, int year) {
		int days = 0;
		int[] month31 = { 1, 3, 5, 7, 8, 10, 12 };
		int[] month30 = { 4, 6, 9, 11 };

		for (int m : month31) {
			if (month == m) {
				days = 31;
			}
		}

		for (int m : month30) {
			if (month == m) {
				days = 30;
			}
		}

		if (month == 2) {
			days = 28;
			if (isLeap(year)) {
				days++;
			}
		}
		return days;
	}

	private static void checkMonth(int m) throws ArithmeticException {
		if (m <= 0 || m > 12) {
			throw new ArithmeticException("ћес€ц введЄн неверно");
		}
	}

}
