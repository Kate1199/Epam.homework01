package by.epam.kisel.task06.runner;

import by.epam.kisel.inputUtility.InputUtility;
import by.epam.kisel.task06.view.TimeView;

public class Main {

	public static void main(String[] args) {
		
		int sec;
		while (true) {
			sec = InputUtility.inputInt("Введите количество секунд: ");
			TimeView.printTime(sec);
		}


	}

}
