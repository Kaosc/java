package oop.tumdersler.file_io;

import java.io.IOException;
import java.io.*;

public class BufferedReaderWriterDemo {

	private static final String INPUT_PATH = "E:\\dev\\java\\oop\\texts\\vize.txt";
	private static final String OUTPUT_PATH = "E:\\dev\\java\\oop\\texts\\ort.txt";

	private static void ensureFileExists(File file) throws IOException {
		if (!file.exists()) {
			file.createNewFile();
		}
	}

	public static void main(String[] args) throws IOException {
		File inputFile = new File(INPUT_PATH);
		File outputFile = new File(OUTPUT_PATH);
		ensureFileExists(inputFile);
		ensureFileExists(outputFile);

		try (
				BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
			writer.write("Sample line 1");
			writer.newLine();
			writer.write("Sample line 2");
			writer.newLine();

			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
	}
}
