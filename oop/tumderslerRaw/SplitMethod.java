package oop.tumderslerRaw;

public class SplitMethod {

	public static void main(String[] args) {
		String m = "Cumhuriyet Çok yaşa";
		String t[] = m.split(" ");

		String newLine = System.lineSeparator();

		System.out.print(t[2] + newLine);

		for (String i : t) {
			System.out.print(newLine + i);
		}

	}

}
