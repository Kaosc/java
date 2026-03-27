package oop.tumdersler.file_io;

import java.io.File;
import java.io.IOException;

public class FileMetadataDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("E:/dev/java/oop/texts/dosya.txt");

		System.out.println("Exists: " + file.exists());
		System.out.println("Readable: " + file.canRead());
		System.out.println("Writable: " + file.canWrite());
		System.out.println("Is file: " + file.isFile());
		System.out.println("Is directory: " + file.isDirectory());
		System.out.println("Name: " + file.getName());
		System.out.println("Length (bytes): " + file.length());
		System.out.println("Path: " + file.getPath());
		System.out.println("Parent: " + file.getParent());
	}
}
