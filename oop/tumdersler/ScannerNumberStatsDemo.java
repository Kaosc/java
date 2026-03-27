package oop.tumdersler;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerNumberStatsDemo {
	private static final String INPUT_PATH = "E:\\dev\\java\\oop\\texts\\sayi.txt";

	public static void main(String[] args) throws IOException {
		int count = 0;
		int evenCount = 0;
		int total = 0;
		Integer min = null;
		Integer max = null;

		try (Scanner scanner = new Scanner(new File(INPUT_PATH))) {
			while (scanner.hasNextInt()) {
				int value = scanner.nextInt();
				count++;
				total += value;

				if (value % 2 == 0) {
					evenCount++;
				}

				if (min == null || value < min) {
					min = value;
				}
				if (max == null || value > max) {
					max = value;
				}
			}
		}

		if (count == 0) {
			System.out.println("No numbers found in file.");
			return;
		}

		double average = (double) total / count;
		System.out.println("Count: " + count);
		System.out.println("Even count: " + evenCount);
		System.out.println("Average: " + average);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}

}
