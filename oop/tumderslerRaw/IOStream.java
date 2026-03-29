package oop.tumderslerRaw;

import java.io.*;

public class IOStream {

	public static void main(String[] args) throws IOException {

		// FileInputStream ve FileOutputStream sınıfları byte bazında çalışır. Yani
		// karakterleri değil, byte'ları okur ve yazarlar. Bu nedenle, bu sınıflar
		// genellikle ikili dosyalar (örneğin, resimler, ses dosyaları) için kullanılır.
		// Ancak, metin dosyalarıyla çalışırken karakter bazında işlem yapmak daha
		// yaygın olduğundan, FileReader ve FileWriter gibi karakter bazında çalışan
		// sınıflar tercih edilir.

		FileInputStream f1 = new FileInputStream("E:/dev/Java/oop/texts/vize.txt");
		FileOutputStream f2 = new FileOutputStream("E:/dev/Java/oop/texts/vize.txt");

		System.out.println((char) f1.read());

		// write() metodu, bir byte veya karakteri dosyaya yazmak için kullanılır. Eğer
		// bir byte yazıyorsanız, 0 ile 255 arasında bir değer vermelisiniz. Eğer bir
		// karakter yazıyorsanız, karakterin ASCII veya Unicode değerini vermelisiniz.

		f2.write(65);
		f2.write(66);
		f2.write(67);
		f2.write(68);
		f2.write(69);

		int s = f1.read();

		while (s != -1) {
			System.out.print((char) s);
			s = f1.read();
		}

		f1.close();
		f2.close();
	}

}
