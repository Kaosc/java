package oop.vizedersler.recrusive;

public class Faktoriyel {

	private static int f(int sayi) {
		if (sayi == 1) {
			return 1;
		} else {
			return sayi * f(--sayi);
		}
	}

	public static void main(String[] args) {
		System.out.print(f(5));
	}
}
