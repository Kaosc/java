package algoritma;

// With StringBuilder's reverse() method
public class Palindrom2 {
	static void p(String y[]) {
		for (String t : y) {
			String ters = new StringBuilder(t).reverse().toString();
			if (t.equalsIgnoreCase(ters)) {
				System.out.println("Evet");
			} else {
				System.out.println("Hayır");
			}
		}

	}

	public static void main(String[] args) {
		String[] dizi = { "kek", "kaka", "kek", "kaka", "kek" };
		p(dizi);
	}
}
