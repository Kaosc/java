package oop.tumdersler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	private static final String INPUT_PATH = "E:\\dev\\java\\oop\\texts\\sayi.txt";
	private static final String OUTPUT_PATH = "E:\\dev\\java\\oop\\texts\\m.txt";

	public static void main(String[] args) throws IOException {
		byte[] buffer = new byte[64];

		try (
				FileInputStream inputStream = new FileInputStream(INPUT_PATH);
				FileOutputStream outputStream = new FileOutputStream(OUTPUT_PATH)) {
			int bytesRead;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				// Write only valid bytes from the buffer.
				outputStream.write(buffer, 0, bytesRead);
			}
		}
	}
}
