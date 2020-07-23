package by.epamtc.calendar.month;

import java.util.HashMap;
import java.util.Map;

public class MonthProviderImpl implements MonthProvider {

	private static Map<Integer, MonthName> months = new HashMap<>();

	public MonthProviderImpl() {
		months.put(0, MonthName.JANUARY);
		months.put(1, MonthName.FEBRUARY);
		months.put(2, MonthName.MARCH);
		months.put(3, MonthName.APRIL);
		months.put(4, MonthName.MAY);
		months.put(5, MonthName.JUNE);
		months.put(6, MonthName.JULY);
		months.put(7, MonthName.AUGUST);
		months.put(8, MonthName.SEPTEMBER);
		months.put(9, MonthName.OCTOBER);
		months.put(10, MonthName.NOVEMBER);
		months.put(11, MonthName.DECEMBER);
	}

	public String getMonthName(int number) {

		return months.get(number).name();

	}

}
