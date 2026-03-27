package oop.tumdersler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PassFailFilterDemo {
	private static final String INPUT_PATH = "E:\\dev\\java\\oop\\texts\\vize.txt";
	private static final String OUTPUT_PATH = "E:\\dev\\java\\oop\\texts\\ort.txt";

	public static void main(String[] args) throws IOException {
		File inputFile = new File(INPUT_PATH);
		File outputFile = new File(OUTPUT_PATH);

		try (
				BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
			// Skip header line if the file starts with one.
			reader.readLine();

			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split("\\s+");
				if (parts.length < 2) {
					continue;
				}

				String name = parts[0].trim();
				int grade = Integer.parseInt(parts[1].trim());

				if (grade >= 50) {
					System.out.println(name + " passed");
					writer.write(name);
					writer.newLine();
				} else {
					System.out.println(name + " failed");
				}
			}
		}
	}
}
