package homework01.task06;

import homework01.instruments.*;

public class Time {

	public static void main(String[] args) {
		while (true) {
			int sec = (int) Instruments.input("Введите количество секунд: ");
			System.out.println(countTime(sec));
		}

	}

	static String countTime(int sec) {
		int hours = 0;
		int minuts = 0;

		while (sec >= 3600) {
			sec = sec - 3600;
			hours++;
		}

		while (sec >= 60) {
			sec = sec - 60;
			minuts++;
		}

		return hours + outputHours(hours) + minuts + outputMinuts(minuts) + sec + outputSeconds(sec);
	}

	static String outputHours(int h) {
		String hStr;

		if (h == 1 || (h > 20 && h % 10 == 1)) {
			hStr = " час ";
		} else if ((h > 1 && h < 5) || (h > 20 && (h % 10 > 1 && h % 10 < 5))) {
			hStr = " часа ";
		} else {
			hStr = " часов ";
		}

		return hStr;
	}

	static String outputMinuts(int m) {
		String mStr;

		if (m == 1 || (m > 20 && m % 10 == 1)) {
			mStr = " минута ";
		} else if ((m > 1 && m < 5) || (m > 20 && (m % 10 > 1 && m % 10 < 5))) {
			mStr = " минуты ";
		} else {
			mStr = " минут ";
		}

		return mStr;
	}

	static String outputSeconds(int s) {
		String sStr;

		if (s == 1 || (s > 20 && s % 10 == 1)) {
			sStr = " секунда ";
		} else if ((s > 1 && s < 5) || (s > 20 && (s % 10 > 1 && s % 10 < 5))) {
			sStr = " секунды ";
		} else {
			sStr = " секунд ";
		}

		return sStr;
	}
}