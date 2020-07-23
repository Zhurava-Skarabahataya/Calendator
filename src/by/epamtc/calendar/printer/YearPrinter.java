package by.epamtc.calendar.printer;

import java.util.Calendar;

public class YearPrinter implements CalendarPrinter{

	@Override
	public void printCalendar(Calendar calendar) {
		
		CalendarPrinter monthPrinter = new MonthPrinter();
		
		System.out.println(calendar.get(Calendar.YEAR));
		
		for (int monthIndex = 0; monthIndex < 12; monthIndex++) {
			
			calendar.set(Calendar.MONTH, monthIndex);
			monthPrinter.printCalendar(calendar);
			
		}
		
		
	}

}
