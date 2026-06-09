package oop.file_io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	private static final String NAMES_PATH = "E:\\dev\\java\\oop\\texts\\isim.txt";
	private static final String NUMBERS_PATH = "E:\\dev\\java\\oop\\texts\\sayi.txt";

	public static void main(String[] args) throws IOException {
		File numbersFile = new File(NUMBERS_PATH);

		try (FileWriter writer = new FileWriter(numbersFile, true)) {
			writer.write(System.lineSeparator() + "Sample text written by FileWriter.");
		}

		System.out.println("First char from numbers file:");
		try (FileReader numbersReader = new FileReader(numbersFile)) {
			int firstChar = numbersReader.read();
			if (firstChar != -1) {
				System.out.println((char) firstChar);
			}
		}

		System.out.println("Contents of isim.txt:");
		try (FileReader namesReader = new FileReader(NAMES_PATH)) {
			int value;
			while ((value = namesReader.read()) != -1) {
				System.out.print((char) value);
			}
		}
	}

}
