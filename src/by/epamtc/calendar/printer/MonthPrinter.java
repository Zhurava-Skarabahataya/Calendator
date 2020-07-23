package by.epamtc.calendar.printer;

import java.util.Calendar;

import by.epamtc.calendar.converter.Converter;
import by.epamtc.calendar.converter.FirstDayOfWeekConverter;
import by.epamtc.calendar.month.MonthProvider;
import by.epamtc.calendar.month.MonthProviderImpl;

public class MonthPrinter implements CalendarPrinter {

	@Override
	public void printCalendar(Calendar calendar) {

		int firstDayInWeek;
		int daysInThisMonth;
		String monthName;

		MonthProvider mp = new MonthProviderImpl();

		Converter converter = new FirstDayOfWeekConverter();
		
		firstDayInWeek = converter.countFirstDayFromMonday(calendar); 
		
		daysInThisMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		monthName = mp.getMonthName(calendar.get(Calendar.MONTH));

		MonthHeaderPrinter monthHeaderPrinter = new MonthHeaderPrinter();
		monthHeaderPrinter.printHeader(monthName);

		for (int dayIndex = 1; dayIndex < daysInThisMonth;) {

			for (int currentDayOfWeek = 1; currentDayOfWeek < firstDayInWeek; currentDayOfWeek++) {
				System.out.printf("   ");
			}
			for (int currentDayOfWeek = firstDayInWeek; currentDayOfWeek <= 7; currentDayOfWeek++) {
				if (dayIndex > daysInThisMonth) {
					break;
				}
				System.out.printf("%3d", dayIndex++);
			}
			System.out.println();

			firstDayInWeek = 1;
		}

		System.out.println("----------------------");

	}

}
