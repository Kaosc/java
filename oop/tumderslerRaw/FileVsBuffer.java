package oop.tumderslerRaw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileVsBuffer {
	public static void main(String[] args) throws IOException {
		File f = new File("E:/dev/java/oop/texts/vize.txt");
		File f2 = new File("E:/dev/java/oop/texts/ort.txt");

		BufferedReader br = new BufferedReader(new FileReader(f));
		BufferedWriter bw = new BufferedWriter(new FileWriter(f2));

		br.readLine();
		String s;

		while ((s = br.readLine()) != null) {

			String[] line = s.split("\\s+");

			String name = line[0].trim();
			int not = Integer.parseInt(line[1].trim());

			if (not >= 50) {
				System.out.println(name + ": fail");
				bw.append(name + "\n");
			} else {
				System.out.println(name + ": pass");
			}

		}

		br.close();
		bw.close();
	}
}
