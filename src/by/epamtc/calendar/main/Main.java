package by.epamtc.calendar.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import by.epamtc.calendar.printer.CalendarPrinter;
import by.epamtc.calendar.printer.MonthPrinter;
import by.epamtc.calendar.printer.YearPrinter;

public class Main {

	public static void main(String[] args) {

		int monthNumber = 7;
		int yearNumber = 2021;

		Calendar calendar = new GregorianCalendar();
		calendar.set(yearNumber, monthNumber, 1);
		
		CalendarPrinter calendarPrinter = new MonthPrinter();
		calendarPrinter.printCalendar(calendar);
		
		CalendarPrinter yearPrinter = new YearPrinter();
		yearPrinter.printCalendar(calendar);

	}

}
