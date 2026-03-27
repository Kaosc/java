package oop.tumderslerRaw;

import java.io.*;

public class FileMethods {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:/Users/Lenovo/Desktop/dosya.txt");

		System.out.println(f1.exists());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		System.out.println(f1.getName());
		System.out.println(f1.length());
		System.out.println(f1.toString());
		System.out.println(f1.getPath());
		System.out.println(f1.getParent());

	}

}
