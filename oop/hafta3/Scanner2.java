package oop.hafta3;

import java.io.*;
import java.util.*;

/* numbers.txt dosyasında
* 1) kaç tane sayı olduğunu bulunuz.
* 2) kaç tane çift sayı olduğunu bulunuz.
* 3) ortalamasını bulunuz
* 4) en büyük ve en küçük sayıyı bulunuz.
* */

public class Scanner2 {
	public static void main(String[] args) throws IOException {

		String path = "E:\\dev\\java\\oop\\hafta3\\numbers.txt";
		File file = new File(path);
		Scanner s = new Scanner(file);

		int sayac = 0, sayac1 = 0, i, tpl = 0, eb = 0, ek = 0;
		eb = ek = i = s.nextInt();

		while (s.hasNext()) {
			sayac++;

			if (i % 2 == 0) {
				sayac1++;
			}

			tpl = tpl + i;

			if (eb < i) {
				eb = i;
			}

			if (i < ek) {
				ek = i;
			}

			i = s.nextInt();
		}

		double ort = tpl / sayac;
		System.out.println(sayac + " Toplam Sayı, " + sayac1 + " Çift Sayı, Ortalama=" + ort + ", En Büyük=" + eb + ", En Küçük=" + ek);

		s.close();
	}

}
