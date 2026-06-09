package oop.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// dosya.txt dosyasındaki
// en uzun kelime ya da kelimeleri bulunuz
// kaç kelimeden oluştuğunu bulunuz.
// kaç kelimenin A harfi ile başladığını bulunuz.

public class Scanner1 {
	public static void main(String[] args) throws IOException {

		String path = "E:\\dev\\java\\oop\\hafta3\\texts\\text.txt";
		File file = new File(path);
		Scanner scanner = new Scanner(file);

		int wordsStartingWithA = 0;
		int totalWords = 0;
		int maxLength = 0;

		String currentWord, longestWords = "";

		while (scanner.hasNext()) {
			currentWord = scanner.next();
			totalWords++;
			
			if(currentWord.charAt(0)=='A' || currentWord.charAt(0)=='a') {
				wordsStartingWithA++;
			}
			
			if(currentWord.length() > maxLength) {
				maxLength = currentWord.length();
				longestWords = currentWord;
			} else if(currentWord.length() == maxLength) {
				longestWords = longestWords + " " + currentWord;
			}
		}
		
		System.out.println("En uzun kelimeler: " + longestWords);
		System.out.println("Toplam kelime sayısı: " + totalWords);
		System.out.println("A harfi ile başlayan kelime sayısı: " + wordsStartingWithA);

		scanner.close();

	}

}
