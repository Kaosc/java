package algoritma;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.*;

@SuppressWarnings("unused")

public class Date {

	public static void main(String[] args) {

		LocalDate zm = LocalDate.now(); // LocalDate nesnesi oluşturduk.
		System.out.println(zm); // Geçerli tarihi görüntüledik.
		LocalDate z; // yaşınızı hesaplama örneği yapın

		LocalTime s = LocalTime.now();// LocalTime nesnesi oluşturduk.
		System.out.println(s);// Geçerli saati görüntüledik.

		LocalDateTime zms = LocalDateTime.now(); // LocalDateTime nesnesi oluşturduk.
		System.out.println(zms); // Geçerli tarih ve saati görüntüledik.

		// Format Biçimlendirme

		LocalDateTime d = LocalDateTime.now();
		System.out.println("Önce: " + d);
		DateTimeFormatter ds = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String bicimli = d.format(ds);
		System.out.println("Sonra: " + bicimli);

		LocalDate bugun = LocalDate.now(); // bugünün tarihi
		LocalDate dtarih = LocalDate.of(1983, 06, 11); // yıl, ay, gün
		LocalDate parse = LocalDate.parse("2007-11-03"); // string'den
		System.out.println(dtarih);
		System.out.println(parse);

		LocalDate tarih2 = LocalDate.of(2026, 3, 27);
		int yil = tarih2.getYear(); // 2026
		int ay = tarih2.getMonthValue();// 3
		int gun = tarih2.getDayOfMonth(); // 27

		System.out.println(yil + " " + ay + " " + gun + " " + tarih2.getDayOfWeek() + " " + tarih2.getDayOfYear());

		LocalDate yarin = bugun.plusDays(1);
		LocalDate gecenHafta = bugun.minusWeeks(1);
		LocalDate gelecekAy = bugun.plusMonths(1);
		LocalDate gecenYil = bugun.minusYears(1);
		System.out.println(yarin);
		System.out.println(gecenYil);
		System.out.println(bugun.minusDays(19));

		LocalDate t1 = LocalDate.of(2020, 1, 1);
		LocalDate t2 = LocalDate.of(2025, 3, 27);
		Period fark = Period.between(t1, t2);
		Period fark1 = Period.between(dtarih, bugun);

		System.out.println(fark1.getYears() + " Yıl " + fark1.getMonths() + " Ay " + fark1.getDays() + " Gün ");
		System.out.println(fark.getYears()); // 5
		System.out.println(fark.getMonths()); // 2
		System.out.println(fark.getDays()); // 26

		LocalDate t3 = LocalDate.of(2025, 3, 1);
		LocalDate t4 = LocalDate.of(2028, 5, 10);
		long gunFarki = ChronoUnit.YEARS.between(t3, t4);
		System.out.println(gunFarki); // 9

		LocalTime z2 = LocalTime.of(23, 23, 23);
		LocalTime z3 = LocalTime.of(05, 12, 19);
		System.out.println(ChronoUnit.SECONDS.between(z3, z2));

		LocalDate t5 = LocalDate.of(2025, 3, 10);
		LocalDate t6 = LocalDate.of(2025, 3, 15);

		System.out.println(t5.isBefore(t1)); // true
		System.out.println(t5.isAfter(t1)); // false
		System.out.println(t5.isEqual(t5)); // false

		t5 = t5.withDayOfYear(34);
		System.out.println(t5);

		LocalDate tarih3 = LocalDate.of(2025, 3, 27);

		LocalDate yeni = tarih3.withYear(2030);
		LocalDate ayDegis = tarih3.withMonth(12);
		LocalDate gunDegis = tarih3.withDayOfMonth(1);

		LocalDate sonrakiPazartesi = bugun.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));

		LocalDate aySonu = bugun.with(TemporalAdjusters.lastDayOfMonth());

		System.out.println(sonrakiPazartesi);

		LocalDate tarih4 = LocalDate.of(2032, 12, 10);
		System.out.println(tarih4.isLeapYear()); // true*/

		/*
		 * yyyy-MM-dd "1988-09-29"
		 * dd/MM/yyyy "29/09/1988"
		 * dd-MMM-yyyy "29-Sep-1988"
		 * E, MMM dd yyyy "Thu, Sep 29 1988"
		 */

		LocalDate bugun1 = LocalDate.now();

		LocalDate teslimTarihi = bugun1.plusDays(15);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");

		System.out.println("Kitap Alış Tarihi: " + bugun1.format(format));
		System.out.println("Teslim Tarihi: " + teslimTarihi.format(format));
	}

}
