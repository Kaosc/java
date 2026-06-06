package algoritma.vizeders;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.*;

@SuppressWarnings("unused")

public class Date {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now(); // Date only - 2024-06-11
		LocalTime time = LocalTime.now(); // Time only - 14:30:45.123
		LocalDateTime dateTime = LocalDateTime.now(); // Date and Time - 2024-06-11T14:30:45.123

		LocalDate todayDate = LocalDate.now();
		LocalDateTime todayDateDateTime = LocalDateTime.now();

		LocalDate spesificDate = LocalDate.of(1983, 06, 11);
		LocalDateTime spesificDateTime = LocalDateTime.of(1983, 06, 11, 14, 30, 45);

		// Parsing dates and times from strings
		LocalDate dateFromString = LocalDate.parse("2007-11-03");
		LocalDateTime dateTimeFromString = LocalDateTime.parse("2007-11-03T14:30:45");

		// Parsing a date from a string with a custom format
		String s2 = "15/06/2026";
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d = LocalDate.parse(s2, f); // 2026-06-15
		
		// Formatting dates and times
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
		LocalDateTime dt = LocalDateTime.of(2000, 06, 07, 22, 30, 00);
		String formattedDate = dt.format(fm); // "07-06-2000 22-30"


		// Extracting int values from date and time
		LocalDate date2 = LocalDate.of(2026, 3, 27);
		int yil = date2.getYear(); // 2026
		int ay = date2.getMonthValue(); // 3
		int gun = date2.getDayOfMonth(); // 27
		int dayOfWeek = date2.getDayOfWeek().getValue(); // 5 (Friday)
		int dayOfYear = date2.getDayOfYear(); // 86 (March 27 is the 86th day of the year)

		// Extracting int values from a date string
		String s1 = "2026-06-15";
		int year = Integer.parseInt(s1.substring(0, 4)); // 2026
		int month = Integer.parseInt(s1.substring(5, 7)); // 6
		int day = Integer.parseInt(s1.substring(8, 10)); // 15


		// Date calculations
		LocalDate tomorrowDate = todayDate.plusDays(1); // Tomorrow's date
		LocalDate lastWeekDate = todayDate.minusWeeks(1); // Date one week ago
		LocalDate nextMonthDate = todayDate.plusMonths(1); // Date one month from now
		LocalDate lastYearDate = todayDate.minusYears(1); // Date one year ago

		// Date difference
		LocalDate d1 = LocalDate.of(2020, 1, 1);
		LocalDate d2 = LocalDate.of(2025, 3, 27);
		Period diff = Period.between(d1, d2);
		int diffYears = diff.getYears(); // 5
		int diffMonths = diff.getMonths(); // 2
		int diffDays = diff.getDays(); // 26

		// Using ChronoUnit for date difference
		// The difference between ChronoUnit and Period is that ChronoUnit calculates
		// the total number of units (like years, months, days) between two dates, while
		// Period calculates the difference in terms of years, months, and days
		// separately. For example, if you calculate the difference between January 1,
		// 2020, and March 27, 2025: the Period will give you 5 years, 2 months, and 26
		// days, while ChronoUnit will give you the total number of years (5), total
		// number of months (62), and total number of days (1912) between the two dates.
		long diffYearsChrono = ChronoUnit.YEARS.between(d1, d2); // 5
		long diffMonthsChrono = ChronoUnit.MONTHS.between(d1, d2); // 62
		long diffDaysChrono = ChronoUnit.DAYS.between(d1, d2); // 1912

		// ChronoUnit can also be used for time differences. For example, if you have
		// two LocalTime instances, you can calculate the difference in seconds between
		// them:
		LocalTime t1 = LocalTime.of(23, 23, 23);
		LocalTime t2 = LocalTime.of(05, 12, 19);
		long diffSecondsChrono = ChronoUnit.SECONDS.between(t1, t2); // 64824 seconds
		long diffMinutesChrono = ChronoUnit.MINUTES.between(t1, t2); // 1080 minutes
		long diffHoursChrono = ChronoUnit.HOURS.between(t1, t2); // 18 hours

		// Comparing dates
		LocalDate d3 = LocalDate.of(2025, 3, 10);
		LocalDate d4 = LocalDate.of(2025, 3, 15);

		System.out.println(d3.isBefore(d4)); // true
		System.out.println(d3.isAfter(d4)); // false
		System.out.println(d3.isEqual(d3)); // true

		// Return a copy of this date with the specified field altered.
		// For example, below code will return a new LocalDate with the
		// year changed to 2025-01-07 which is the 7th day of the year 2025.

		// Change the day of the YEAR to 7, but keep the year the same
		d3 = d3.withDayOfYear(7); // 2025-01-07
		// Change the day of the YEAR to 365, but keep the year the same
		d3 = d3.withDayOfYear(365); // 2025-12-31
		// Change the day of the month to 1, but keep the year and month the same
		d3 = d3.withDayOfMonth(1); // 2025-03-01
		// Change the month to February, but keep the year and day the same
		d3 = d3.withMonth(2); // 2025-02-07
		// Change the year to 2026, but keep the month and day the same
		d3 = d3.withYear(2026); // 2026-02-07

		// TemporalAdjusters is a utility class that provides common date adjustments.
		// It can be used to find the next or previous occurrence of a specific day of
		// the week, the first or last day of the month, and more. For example, you can
		// use TemporalAdjusters to find the next Monday after a given date, or to find
		// the last day of the month for a given date.
		LocalDate d5 = LocalDate.of(2026, 6, 8);
		LocalDate nextMonday = d5.with(TemporalAdjusters.next(DayOfWeek.MONDAY)); // 2026-06-15
		LocalDate lastDayOfMonth = d5.with(TemporalAdjusters.lastDayOfMonth()); // 2026-06-30

		// Leap year is a year that is divisible by 4, but not divisible by 100, unless
		// it is also divisible by 400. This means that the year 2000 was a leap year,
		// but the year 1900 was not. leap years have an extra day (February 29) to
		// keep the calendaryear synchronized with the astronomical year. so leap years
		// have 366 days instead of the usual 365 days. This is important for date
		// calculations, as it affects the number of days in a year and can impact
		// the results of date arithmetic.
		LocalDate d6 = LocalDate.of(2032, 12, 10);
		System.out.println(d6.isLeapYear()); // true*/

		/*
		 * yyyy-MM-dd "1988-09-29"
		 * dd/MM/yyyy "29/09/1988"
		 * dd-MMM-yyyy "29-Sep-1988"
		 * E, MMM dd yyyy "Thu, Sep 29 1988"
		 */

		LocalDate deliveryDate = todayDate.plusDays(15);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println("Book order date: " + todayDate.format(format));
		System.out.println("Delivery date: " + deliveryDate.format(format));
	}

}
