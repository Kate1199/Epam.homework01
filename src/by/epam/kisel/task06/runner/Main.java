package by.epam.kisel.task06.runner;

import by.epam.kisel.inputUtility.InputUtility;
import by.epam.kisel.task06.logic.Time;

public class Main {

	public static void main(String[] args) {
		
		int sec;
		while (true) {
			sec = InputUtility.inputInt("Введите количество секунд: ");
			
			System.out.println(Time.countTime(sec));
		}


	}

}
