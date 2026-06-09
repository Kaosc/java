package oop.file_io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFileReadDemo {
	private static final String NAMES_PATH = "E:\\dev\\java\\oop\\texts\\isim.txt";
	private static final String NUMBERS_PATH = "E:\\dev\\java\\oop\\texts\\sayi.txt";

	private static void ensureFileExists(File file) throws IOException {
		if (!file.exists()) {
			file.createNewFile();
		}
	}

	public static void main(String[] args) throws IOException {
		File namesFile = new File(NAMES_PATH);
		File numbersFile = new File(NUMBERS_PATH);
		ensureFileExists(namesFile);
		ensureFileExists(numbersFile);

		try (Scanner scanner = new Scanner(namesFile)) {
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}
	}

}
