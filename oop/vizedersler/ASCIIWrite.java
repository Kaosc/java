package oop.vizedersler;

import java.io.*;

public class ASCIIWrite {
	public static void main(String[] args) throws IOException {

		FileWriter w = new FileWriter("E:/dev/Java/oop/texts/YMZ.txt");

		w.write("ASCII" + "\t Karakter");

		// 65-75 arasındaki ASCII kodlarını ve karakterlerini dosyaya yazdırınız.
		for (int i = 65; i <= 75; i++) {
			w.write("\n" + i + "\t " + (char) i);
		}

		w.close();
	}
}
