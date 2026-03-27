package oop.tumderslerRaw;

import java.io.*;
import java.util.*;

public class ScannerOrnek {

	static void kontrol(File f) throws IOException {
		if (f.exists()) {
		} else {
			f.createNewFile();
		}
	}

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\dev\\Java\\oop\\texts\\isim.txt");
		File f1 = new File("E:\\dev\\Java\\oop\\texts\\sayi.txt");

		Scanner s = new Scanner(f);
		Scanner s1 = new Scanner(f1);

		kontrol(f);
		kontrol(f1);

		int i = 0, n = 0;

		// hasNext() for strings
		// Read names from the file and print them
		while (s.hasNext()) {
			System.out.println(s.nextLine());
		}

		// hasNextInt() or hasNext()
		// Read numbers from the file and count how many are negative
		while (s1.hasNext()) {
			if (s1.nextInt() < 0) {
				n++;
			}
			i++;
		}

		System.out.println(i + " sayıdan " + n + " tanesi negatif");

		s.close();
		s1.close();
	}
}
