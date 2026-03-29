package algoritma.methods;

public class M5 {

	public static void toplama(int a, int b) {
		double tpl = 0;
		tpl = a + b;

		System.out.println("int toplam=" + tpl + " " + topla(6, 9));
		// System.out.println(a+b);
	}

	public static double topla(int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {
		System.out.println(topla(3, 5));
		double b = topla(6, 6);
		System.out.println(b);
		toplama(8, 9);
	}

}
