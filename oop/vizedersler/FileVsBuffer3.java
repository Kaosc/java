package oop.vizedersler;

import java.io.*;

public class FileVsBuffer3 {
	// BufferedWriter BufferedReader

	public static void main(String[] args) throws IOException {
		File f = new File("E:/dev/Java/oop/texts/isim.txt");
		FileWriter w = new FileWriter(f, true);
		FileWriter y = new FileWriter("E:/dev/Java/oop/texts/isim.txt", true);
		FileReader r = new FileReader(f);

		int fr = r.read();

		while (fr != -1) {
			System.out.print((char) fr);
			fr = r.read();
		}

		// BufferedWriter b=new BufferedWriter(y);

		/*
		 * w.append("Merve\t96\n");
		 * w.append("Doğa\t36\n");
		 * w.append("Sinem\t16\n");
		 * w.append("Melahat\t96\n");
		 * w.append("Can\t270\n");
		 * w.append("Sude\t296\n");
		 * w.append("Pervin\t440\n");
		 * y.append("Kadir\t160\n");
		 * 
		 * y.append("Rümeysa\t110\n");
		 */

		y.write("Pervin\t440\n");
		y.write("Merve\t440\n");
		y.write("Merve\t430\n");
		y.write("Gökçe\t100\n");

		/*
		 * w.write("Merhaba\n");
		 * w.write("Kontrol");
		 * w.write("Merhaba2");
		 * w.write("Merhaba3");
		 * w.write("Merhaba4");
		 */
		w.close();
		y.close();

		/*
		 * b.write("Ferdi");
		 * b.newLine();
		 * b.write("Tayfur");
		 * b.newLine();
		 * b.append("Melahat");
		 * b.newLine();
		 * b.write("Tolga");
		 * b.close();
		 */

		r.close();
	}

}
