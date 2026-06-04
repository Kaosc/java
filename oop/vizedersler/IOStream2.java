package oop.vizedersler;

import java.io.*;

public class IOStream2 {

	public static void main(String[] args) throws IOException {
		/*
		 * File Sınıfı
		 * Scanner ile Okuma
		 * FileReader, FileWriter
		 * BufferedReader, BUffereredWriter
		 * FileInputStream, FileOutStream
		 */

		FileInputStream f1 = new FileInputStream("E:/dev/Java/oop/texts/sayi.txt");
		FileOutputStream f2 = new FileOutputStream("E:/dev/Java/oop/texts/m.txt");

		int a = f1.read();
		byte[] d = new byte[20];

		while ((a = f1.read(d)) != -1) {
			System.out.print((char) a);

			a = f1.read();
			
			f2.write(d);
		}

		
		for (byte v : d) {
			System.out.print((char) v);
		}
		
		f1.close();
		f2.close();
	}
	
}
