package by.epam.kisel.task06.logic;

import java.util.InputMismatchException;

public class Time {

	private static final int SECONDS_IN_HOUR = 3600;
	private static final int SECONDS_IN_MINUTE = 60;
	
	public static int countHours(int sec) throws InputMismatchException {
		incorrectNumberOfSeconds(sec);
		int hours = 0;
		while(sec >= SECONDS_IN_HOUR) {
			sec -= SECONDS_IN_HOUR;
			hours++;
		}
		return hours;
	}
	
	public static int countMinutes(int sec) throws InputMismatchException {
		incorrectNumberOfSeconds(sec);
		int minutes = 0;
		int hours = countHours(sec);
		sec -= (hours * SECONDS_IN_HOUR);
		
		while(sec >= SECONDS_IN_MINUTE) {
			sec -= SECONDS_IN_MINUTE;
			minutes++;
		}
		return minutes;
	}
	
	public static int countSeconds(int sec) throws InputMismatchException {
		incorrectNumberOfSeconds(sec);
		int minutes = countMinutes(sec);
		int hours = countHours(sec);
		
		return sec - (hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE);
	}
	
	private static void incorrectNumberOfSeconds(int sec) throws InputMismatchException {
		if(sec < 0) {
			throw new InputMismatchException("Значение не может быть меньше 0");
		}
	}
}