package oop.tumderslerRaw;

import java.io.*;
import java.util.Scanner;

public class ScannerOrnek3 {
	public static void main(String[] args) throws IOException {
		File f = new File("E:/dev/Java/oop/texts/dosya.txt");

		// With the scanner get the data from file
		Scanner sc = new Scanner(f);
		// With the scanner get the data from user
		Scanner sc2 = new Scanner(System.in);

		System.out.print("Lütfen bir isim giriniz: ");
		String userInput = sc2.nextLine();

		int count = 0;

		sc.nextLine(); // Skip the first line (header)

		while (sc.hasNext()) {
			String veri[] = sc.nextLine().split("\\s+");

			if (veri[0].equalsIgnoreCase(userInput)) {
				System.out.println(veri[1]);
				count++;
			}

		}

		if (count == 0) {
			System.out.println("İsim bulunamadı");
		}

		sc.close();
		sc2.close();
	}
}
