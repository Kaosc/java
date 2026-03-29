package oop.tumderslerRaw;

import java.io.*;
import java.io.IOException;

public class FileVsBuffer4 {

	static void kontrol(File f) throws IOException {

		if (f.exists()) {
		} else {
			f.createNewFile();
		}
	}

	public static void main(String[] args) throws IOException {
		File m = new File("E:/dev/java/oop/texts/vize.txt");
		File n = new File("E:/dev/java/oop/texts/ort.txt");
		kontrol(m);
		kontrol(n);

		FileReader f = new FileReader(m);
		FileWriter e = new FileWriter(n);

		BufferedReader b = new BufferedReader(f);
		BufferedWriter w = new BufferedWriter(e);
		w.write("abc\n");
		w.append("xyz");
		w.write("tuü");

		/*
		 * System.out.print((char)b.read());
		 * System.out.println((char)b.read());
		 */

		String y = b.readLine();
		System.out.println(y);

		y = b.readLine();
		System.out.println(y);

		y = b.readLine();
		System.out.println(y);

		y = b.readLine();
		System.out.println(y);
		y = b.readLine();
		System.out.println(y);
		y = b.readLine();
		System.out.println(y);

		/*
		 * e.write("def");
		 * w.write("ghi");
		 * e.write("jkl");
		 * w.append('*');
		 * w.append('?');
		 * e.append('0');
		 */
		w.close();
		b.close();

		/*
		 * String s;
		 * while((s=b.readLine())!=null) {
		 * System.out.println(s); }
		 * f.close();
		 */

	}
}
