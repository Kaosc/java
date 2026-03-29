package oop.tumderslerRaw;

import java.io.*;
import java.util.Scanner;

public class FileReadWriteOrtalama {

	public static void main(String[] args) throws IOException {
		File vizeler = new File("E:/dev/Java/oop/texts/vize.txt");
		File finaller = new File("E:/dev/Java/oop/texts/final.txt");

		FileWriter ortalamalar = new FileWriter("E:/dev/Java/oop/texts/ort.txt");

		Scanner s = new Scanner(vizeler);
		Scanner s1 = new Scanner(finaller);

		int x, y;
		double ort;

		while (s.hasNext() && s1.hasNext()) {
			x = s.nextInt();
			y = s1.nextInt();
			ort = (x * 0.4) + (y * 0.6);

			ortalamalar.write(Double.toString(ort) + System.lineSeparator());
		}

		s.close();
		s1.close();
		ortalamalar.close();
	}

}
