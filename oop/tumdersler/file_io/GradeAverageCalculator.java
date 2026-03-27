package oop.tumdersler.file_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GradeAverageCalculator {

	private static final String MIDTERM_PATH = "E:\\dev\\java\\oop\\texts\\vize.txt";
	private static final String FINAL_PATH = "E:\\dev\\java\\oop\\texts\\final.txt";
	private static final String OUTPUT_PATH = "E:\\dev\\java\\oop\\texts\\ort.txt";

	public static void main(String[] args) throws IOException {
		try (
				Scanner midtermScanner = new Scanner(new File(MIDTERM_PATH));
				Scanner finalScanner = new Scanner(new File(FINAL_PATH));
				FileWriter writer = new FileWriter(OUTPUT_PATH)) {
			while (midtermScanner.hasNextInt() && finalScanner.hasNextInt()) {
				int midterm = midtermScanner.nextInt();
				int fin = finalScanner.nextInt();
				double average = (midterm * 0.4) + (fin * 0.6);
				writer.write(average + System.lineSeparator());
			}
		}
	}

}
