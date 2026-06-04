package oop.vizedersler;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerOrnek1 {

	public static void main(String[] args) throws IOException {
		int c = 0, t = 0;

		File f = new File("E:/dev/java/oop/texts/sayi.txt");
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

		int x = 0, y = 0;

		for (int i = 0; i < cift.length; i++) {
			while (s1.hasNext()) {
				int a = s1.nextInt();

				if (a % 2 == 0) {
					cift[x] = a;
					x++;
				} // i=0 cift[0]=0 i=1 cift[1]=56
				else {
					tek[y] = a;
					y++;
				} // i=0 tek[0]=-69 tek[1]=0

			}

		}

		for (int b : cift) {
			System.out.print(b + " ");
		}

		System.out.println();

		for (int b : tek) {
			System.out.print(b + " ");
		}

		s1.close();
	}

}
