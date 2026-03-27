package oop.tumdersler;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAppendDemo {

	private static final String FILE_PATH = "E:\\dev\\java\\oop\\texts\\isim.txt";

	public static void main(String[] args) throws IOException {
		File file = new File(FILE_PATH);

		try (FileWriter writer = new FileWriter(file, true)) {
			writer.write(System.lineSeparator() + "Pervin\t440");
			writer.write(System.lineSeparator() + "Merve\t430");
			writer.write(System.lineSeparator() + "Gokce\t100");
		}

		try (FileReader reader = new FileReader(file)) {
			int ch;
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
		}
	}

}
