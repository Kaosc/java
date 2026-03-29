package algoritma.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Zaman2 {

	public static void main(String[] args) {

		LocalDate bugun = LocalDate.now();

		LocalDate teslimTarihi = bugun.plusDays(15);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");

		System.out.println("Kitap Alış Tarihi: " + bugun.format(format));
		System.out.println("Teslim Tarihi: " + teslimTarihi.format(format));

	}

}
