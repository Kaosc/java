package oop.tumderslerRaw;

import java.io.*;
import java.util.*;

// dosya.txt dosyasındaki
//  en uzun kelime ya da kelimeleri bulunuz
//  kaç kelimeden oluştuğunu bulunuz.
//  kaç kelimenin A harfi ile başladığını bulunuz.

public class Scanner1 {
	public static void main(String[] args) throws IOException {
		String yol = "E:/dev/Java/oop/texts/isim.txt";
		File f1 = new File(yol);

		Scanner s = new Scanner(f1);

		int sayac = 0, sayac1 = 0;
		String y = "", eu = "";

		while (s.hasNext()) {
			y = s.next();

			sayac1++;

			if (y.charAt(0) == 'A' || y.charAt(0) == 'a') {
				sayac++;
			}
			if (eu.length() > y.length()) {
				eu = eu;
			} else {
				eu = y;
			}

		}

		System.out.println(eu + " " + sayac + " " + sayac1);
		System.out.println("En uzun kelime: " + eu);
		System.out.println("A harfi ile başlayan kelime sayısı: " + sayac);

		s.close();

	}

}
