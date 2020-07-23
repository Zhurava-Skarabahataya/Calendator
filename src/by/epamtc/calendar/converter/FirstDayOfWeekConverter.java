package by.epamtc.calendar.converter;

import java.util.Calendar;

public class FirstDayOfWeekConverter implements Converter {

	@Override
	public int countFirstDayFromMonday(Calendar calendar) {

		int dayOfWeekMonthStartsInSundayWay;
		int dayOfWeekStartsInMondayWay;

		dayOfWeekMonthStartsInSundayWay = calendar.get(Calendar.DAY_OF_WEEK);

		dayOfWeekStartsInMondayWay = dayOfWeekMonthStartsInSundayWay > 1 ? dayOfWeekMonthStartsInSundayWay - 1 : 7;

		return dayOfWeekStartsInMondayWay;
	}

}
