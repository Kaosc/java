package oop.tumdersler.file_io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerLookupDemo {
	private static final String INPUT_PATH = "E:\\dev\\java\\oop\\texts\\dosya.txt";

	public static void main(String[] args) throws IOException {
		int matchCount = 0;

		try (
				Scanner fileScanner = new Scanner(new File(INPUT_PATH));
				Scanner inputScanner = new Scanner(System.in)) {
			System.out.print("Enter name to search: ");
			String targetName = inputScanner.nextLine().trim();

			while (fileScanner.hasNextLine()) {
				String[] row = fileScanner.nextLine().split("\\s+");

				// Ensure the row has at least two columns (name and value)
				if (row.length < 2) {
					continue;
				}

				if (row[0].equalsIgnoreCase(targetName)) {
					System.out.println(row[1]);
					matchCount++;
				}
			}
		}

		if (matchCount == 0) {
			System.out.println("Name not found");
		}
	}
}
