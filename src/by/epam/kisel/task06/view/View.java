package by.epam.kisel.task06.view;

import by.epam.kisel.task06.logic.Time;

public class View {
	
	public static void printTime(int sec) {
		int hours = Time.countHours(sec);
		int minutes = Time.countMinutes(sec);
		int seconds = Time.countSeconds(sec);

		String strHours;
		String strMin;
		String strSec;
		
		strHours = hours + outputHours(hours);
		strMin = minutes + outputMinuts(minutes);
		strSec = seconds + outputSeconds(sec);
		
		System.out.println(strHours + strMin + strSec);
	}
	
	private static String outputHours(int h) {
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

	private static String outputMinuts(int m) {
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

	private static String outputSeconds(int s) {
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
