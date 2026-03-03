package oop.hafta3;

import java.io.*;
import java.util.*;

/*dosya.txt dosyasındaki
 * 1) en uzun kelime ya da kelimeleri bulunuz
 * 2) kaç kelimeden oluştuğunu bulunuz.
 * 3) kaç kelimenin A harfi ile başladığını bulunuz.
 * */

public class Scanner1 {
	public static void main(String[] args) throws IOException {

		String path = "E:\\dev\\java\\oop\\hafta3\\text.txt";
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
