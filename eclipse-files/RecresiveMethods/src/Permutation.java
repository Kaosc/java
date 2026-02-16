public class Permutation {

	static void f(String s, String str) {

		if (s.length() == 0) {
			System.out.println(str);
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			String newText = s.substring(0, i) + s.substring(i + 1);
			String newStr = str + s.charAt(i);

			f(newText, newStr);
		}
	}

	public static void main(String[] args) {
		// Backtracking
		// Bir stringteki karakterklerden anlamlı anlamsız
		// en az 2 harfli kaç kelime oluşturuabileceğini bulan rekürsif metotu yazınız.
		f("ABC", "");
	}
}
