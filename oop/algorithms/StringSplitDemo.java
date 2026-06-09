package oop.algorithms;

public class StringSplitDemo {

	public static void main(String[] args) {
		String sentence = "Cumhuriyet Cok yasa";
		String[] words = sentence.split(" ");

		System.out.println("Third word: " + words[2]);
		for (String word : words) {
			System.out.println(word);
		}
	}

}
