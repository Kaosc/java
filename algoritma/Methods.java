package algoritma;

import java.util.Scanner;

//İki sayı için Hesap Makinesi
public class Methods {
	public static void toplama(double a, double b) {
		double tpl = 0;
		tpl = a + b;
		System.out.println("toplam=" + tpl);
	}

	public static void toplama(int a, int b) {
		double tpl = 0;
		tpl = a + b;
		System.out.println("int toplam=" + tpl);
	}

	public static void cıkarma(double a, double b) {
		double çıkar = 0;
		çıkar = a - b;
		System.out.println("çıkarma=" + çıkar);
		çıkar = Math.abs(a - b);
		System.out.println("negatif değer engeli=" + çıkar);
	}

	public void carp(double a, double b) {
		double çrp = 1;
		çrp = a * b;
		System.out.println("çarpma=" + çrp);
	}

	public void bol(double a, double b) {
		double bol = 0;
		bol = a / b;
		System.out.println("bolme=" + bol);
	}

	public void mod(double a, double b) {
		double md;
		md = a % b;
		System.out.println("mod=" + md);
	}

	public static void main(String[] args) {
		toplama(36, 89);
		toplama(36.0, 89.0);
		cıkarma(36.0, 89.0);

		// sınıf_Adı nesne_adı=new sınıf_adı();
		Methods m = new Methods();

		m.carp(36.0, 89.0);
		m.bol(36.0, 89.0);
		m.mod(36.0, 89.0);

		Scanner s = new Scanner(System.in);

		System.out.println("Yapmak istediğiniz işlemi seçiniz:");
		System.out.println("Toplama için +" + "\nÇıkarma için -" + "\nÇarpma için *" + "\nBölme için /");
		char c = s.next().charAt(0);

		if (c == '+') {
			toplama(s.nextDouble(), s.nextDouble());
		} else if (c == '-') {
			cıkarma(s.nextDouble(), s.nextDouble());
		} else if (c == '*') {
			m.carp(s.nextDouble(), s.nextDouble());
		} else if (c == '/') {
			m.bol(s.nextDouble(), s.nextDouble());
		} else if (c == '%') {
			m.mod(s.nextDouble(), s.nextDouble());
		} else {
			System.out.println("Geçersiz seçim");
		}

		s.close();
	}

}
