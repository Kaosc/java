package oop.tumderslerRaw;

import java.io.*;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {

		FileReader f = new FileReader("C:\\Users\\Lenovo\\Desktop\\isim.txt");

		File s = new File("C:\\Users\\Lenovo\\Desktop\\sayi.txt");
		FileReader f1 = new FileReader(s);

		FileWriter w = new FileWriter(s);
		FileWriter w1 = new FileWriter(s);

		/*
		 * w.write("İftara da Az aldı! \n");
		 * w.write("Ders de bitmedi gitti!");
		 * w.write("Ama yani biz de insanız! \n");
		 */

		w.append("ACIKTIMMMMMMMM!");
		w.write("Ders de bitmedi gitti!");
		w.close();

		/*
		 * w1.write("Hoca sıkıldığımı görüyor mu acaba?");
		 * 
		 * w1.append("Saatte nerdeyse 3.30!");
		 * w1.write("Neyse az kaldı az!");
		 * w1.close();
		 */

		System.out.println((char) f1.read());

		int m = f.read();
		while (m != -1) {
			System.out.print((char) m);
			m = f.read();
		}

		int s1 = f1.read();
		while (s1 != -1) {
			System.out.print((char) s1);
			s1 = f1.read();
		}

		f1.close();
		f.close();
		w1.close();
	}

}
