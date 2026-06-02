package algoritma;

import java.util.Scanner;

public class M3 {

	public void ort(int[] t) {
		double tpl = 0, sonuc;
		for (int y : t) {
			tpl = tpl + y;

		}
		sonuc = tpl / t.length;
		System.out.println(sonuc);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] t = new int[n];

		for (int i = 0; i < t.length; i++) {

			t[i] = s.nextInt();
		}

		M3 m = new M3();
		m.ort(t);
		/*
		 * 1. kendisine parametre olaran bir tam sayı dizisi alan ve
		 * bu dizinin ortalamsını
		 * hesaplayan bir metot tasarlamanız beklenmektedir.
		 * bu dizinin boyutu ve elamanları dışarıdan ana metotta girilecektir.
		 * 
		 * 2. kendisine parametre olarak vize ve final adında iki double dizisi alan ve
		 * ortalamayı heapalyı ortalama adında bir double diziye aktarılacaktır.
		 * hesaplayan bir metot tasarlamanız beklenmektedir.
		 * bu dizilerin boyutu ve elamanları dışarıdan ana metotta girilecektir.
		 */
		s.close();
	}

}