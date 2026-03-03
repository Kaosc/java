package oop.week_1_2;

public class Permutation {

	static void gen(String remaining, String current) {

		if (remaining.length() == 0) {
			System.out.println("Permutation: " + current);
			return;
		}

		for (int i = 0; i < remaining.length(); i++) {

			// remaining chosen char
			String nextremaining = remaining.substring(0, i) + remaining.substring(i + 1);

			// add chosen char
			String nextcurrent = current + remaining.charAt(i);

			gen(nextremaining, nextcurrent);
		}
	}

	public static void main(String[] args) {
		String in = "ABC";
		gen(in, "");
	}
}
