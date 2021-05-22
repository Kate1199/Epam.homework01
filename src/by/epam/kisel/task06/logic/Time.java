package by.epam.kisel.task06.logic;

import java.util.InputMismatchException;

public class Time {

	private static final int SECONDS_IN_HOUR = 3600;
	private static final int SECONDS_IN_MINUTE = 60;

	public static String countTime(int sec) throws InputMismatchException{
		int hours = 0;
		int minuts = 0;

		String strHours;
		String strMin;
		String strSec;
		
		if(sec < 0) {
			throw new InputMismatchException("Значение не может быть меньше 0");
		}

		while (sec >= SECONDS_IN_HOUR) {
			sec -= SECONDS_IN_HOUR;
			hours++;
		}

		while (sec >= SECONDS_IN_MINUTE) {
			sec -= SECONDS_IN_MINUTE;
			minuts++;
		}

		strHours = hours + outputHours(hours);
		strMin = minuts + outputMinuts(minuts);
		strSec = sec + outputSeconds(sec);

		return strHours + strMin + strSec;
	}

	public static String outputHours(int h) {
		String hStr;

		if (isOne(h)) {
			hStr = " час ";
		} else if (isTwoTillFive(h)) {
			hStr = " часа ";
		} else {
			hStr = " часов ";
		}

		return hStr;
	}

	public static String outputMinuts(int m) {
		String mStr;

		if (isOne(m)) {
			mStr = " минута ";
		} else if (isTwoTillFive(m)) {
			mStr = " минуты ";
		} else {
			mStr = " минут ";
		}

		return mStr;
	}

	public static String outputSeconds(int s) {
		String sStr;

		if (isOne(s)) {
			sStr = " секунда ";
		} else if (isTwoTillFive(s)) {
			sStr = " секунды ";
		} else {
			sStr = " секунд ";
		}

		return sStr;
	}

	private static boolean isOne(int x) {
		boolean one = x == 1;
		boolean moreThanTwenty = x > 20 && x % 10 == 1;
		return one || moreThanTwenty;
	}

	private static boolean isTwoTillFive(int x) {
		int lastNumber = x % 10;
		boolean twoTillFive = x > 1 && x < 5;
		boolean moreThanTwenty = x > 20 && (lastNumber > 1 && lastNumber < 5);
		return twoTillFive || moreThanTwenty;
	}
}