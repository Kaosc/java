package algoritma;

import java.util.Scanner;

public class M6 {

	/*
	 * boyutu ve elemanları dışarıdan girilen
	 * bir double dizinin ortalamasını diziolutur,
	 * dtopla ve dortalama olmak üzere
	 * 3 ayrı geriye değer döndünrem emtotla yapınız.
	 */

	public double[] olustur(int n) {
		Scanner s = new Scanner(System.in);
		double d[] = new double[n];
		for (int i = 0; i < n; i++) {
			d[i] = s.nextDouble();
		}
		s.close();
		return d;
	}

	public double topla(double[] y) {
		double tpl = 0;
		for (double m : y) {
			tpl = tpl + m;
		}
		return tpl;

	}

	public double ort(double t, int n) {
		double ort = t / n;
		return ort; // return t/n;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		M6 m = new M6();
		double b[] = m.olustur(s.nextInt());
		s.close();
		System.out.println(m.ort(m.topla(b), b.length));
		// double tp=m.topla(b);
		// double y=m.ort(tp,b.length);
		// double y=m.ort(m.topla(b),b.length);
		// System.out.println(y);

	}

}
