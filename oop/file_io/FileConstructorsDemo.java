package oop.file_io;

import java.io.File;
import java.io.IOException;

public class FileConstructorsDemo {

	public static void main(String[] args) throws IOException {
		String absolutePath = "E:/dev/java/oop/texts/dosya.txt";
		File fileFromSinglePath = new File(absolutePath);

		String parentPath = "E:/dev/java/oop";
		String childPath = "texts/dosya.txt";
		File fileFromParentChild = new File(parentPath, childPath);

		File parentFile = new File("E:/dev/java/oop");
		File fileFromFileAndChild = new File(parentFile, childPath);

		System.out.println("fileFromSinglePath: " + fileFromSinglePath.getPath());
		System.out.println("fileFromParentChild: " + fileFromParentChild.getPath());
		System.out.println("fileFromFileAndChild: " + fileFromFileAndChild.getPath());

		if (fileFromSinglePath.exists()) {
			System.out.println("File exists.");
		} else {
			System.out.println("File does not exist. Creating file...");
			fileFromSinglePath.createNewFile();
		}
	}
}
