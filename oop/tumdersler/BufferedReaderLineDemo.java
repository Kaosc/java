package oop.tumdersler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderLineDemo {

	private static final String INPUT_PATH = "E:\\dev\\java\\oop\\texts\\sayi.txt";

	public static void main(String[] args) throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_PATH))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
	}
}
