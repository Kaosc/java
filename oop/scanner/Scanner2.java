package oop.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// numbers.txt dosyasında
// kaç tane sayı olduğunu bulunuz.
// kaç tane çift sayı olduğunu bulunuz.
// ortalamasını bulunuz
// en büyük ve en küçük sayıyı bulunuz.

public class Scanner2 {
	public static void main(String[] args) throws IOException {

		String path = "E:\\dev\\java\\oop\\hafta3\\numbers.txt";
		File file = new File(path);
		Scanner s = new Scanner(file);

		int count = 0, evenCount = 0, num, sum = 0, max = 0, min = 0;
		max = min = num = s.nextInt();

		while (s.hasNext()) {
			count++;

			if (num % 2 == 0) {
				evenCount++;
			}

			sum = sum + num;

			if (max < num) {
				max = num;
			}

			if (num < min) {
				min = num;
			}

			num = s.nextInt();
		}

		double avg = sum / count;
		System.out.println(count + " Toplam Sayı, " + evenCount + " Çift Sayı, Ortalama=" + avg + ", En Büyük=" + max
				+ ", En Küçük=" + min);

		s.close();
	}

}
