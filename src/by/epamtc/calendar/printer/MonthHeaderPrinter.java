package by.epamtc.calendar.printer;

public class MonthHeaderPrinter {

	public void printHeader(String monthName) {

		int lineLength;
		int spaceDistance;

		lineLength = 20;
		spaceDistance = (lineLength - monthName.length()) / 2 + monthName.length();

		System.out.println("----------------------");

		System.out.printf("%" + spaceDistance + "s%n", monthName);
		System.out.println("----------------------");

		System.out.printf("%3s%3s%3s%3s%3s%3s%3s%n", "M", "T", "W", "T", "F", "S", "S");

		System.out.println("----------------------");

	}

}
