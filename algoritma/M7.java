package algoritma;

/*
 *1. Parametre olarak bir string değeri alan
 * gelen metnin kelimelernini bir string dizisine aktaran
 * ve bu diziye return den bol isimle metot
 * 
 *2.  elde edilen string dizisi içindeki kelimeleri kontrol ederek kaç tane
 palindrom kelime olduğunu hesaplayan metot
 
  * yukarıdaki metotlara sahip java programını yazınız.
  * */
public class M7 {
	String[] bol(String m) {

		String y[] = m.split(" ");
		return y;

	}

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

		M7 m = new M7();
		p(m.bol("Ama Sınıf dersten çok sıkıldı"));

	}

}
