package oop.vizedersler;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerOrnek2 {
	public static void main(String[] args) throws IOException {
		int c = 0, t = 0;

		File f = new File("E:/dev/Java/oop/texts/sayi.txt");
		Scanner s = new Scanner(f);
		Scanner s1 = new Scanner(f);

		while (s.hasNext()) {
			if (s.nextInt() % 2 == 0) {
				c++;
			} else {
				t++;
			}
		}

		System.out.println(c + " " + t);
		s.close();

		int[] cift = new int[c];
		int[] tek = new int[t];

		int a, x = 0, y = 0;

		while (s1.hasNextInt()) {
			a = s1.nextInt();
			if (a % 2 == 0) {
				cift[x] = a;
				x++;
			} else {
				tek[y] = a;
				y++;
			}
		}

		s1.close();

		for (int b : cift) {
			System.out.print(b + " ");
		}

		System.out.println();

		for (int b : tek) {
			System.out.print(b + " ");
		}
	}
}
