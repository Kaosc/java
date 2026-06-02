package algoritma;

import java.util.Scanner;

public class M4 {

	public void ort(double[] v, double[] f) {
		double sonuc;
		double[] ort = new double[v.length];
		for (int i = 0; i < v.length; i++) {
			sonuc = (v[i] * 0.4) + (f[i] * 0.6);
			ort[i] = sonuc;

		}
		for (double m : ort) {
			System.out.println(m);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double[] vize = new double[n];
		double[] fin = new double[n];

		for (int i = 0; i < vize.length; i++) {

			vize[i] = s.nextDouble();
			fin[i] = s.nextDouble();
		}

		M4 m = new M4();
		m.ort(vize, fin);
		s.close();
	}

}
