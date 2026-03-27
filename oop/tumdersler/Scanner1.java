package oop.tumdersler;
import java.io.*;
import java.util.*;
/*dosya.txt dosyasındaki
 * 1) en uzun kelime ya da kelimeleri bulunuz
 * 2) kaç kelimeden oluştuğunu bulunuz.
 * 3) kaç kelimenin A harfi ile başladığını bulunuz.
 * */
public class Scanner1 {
	public static void main(String[] args) throws IOException {
		String yol="C:\\Users\\Lenovo\\Desktop\\isim.txt";
		File f1=new File(yol);
		Scanner s=new Scanner(f1);
		int sayac=0, sayac1=0, i;
		String t,y,eu="";
		t="";
		while(s.hasNext()) {
			//y=s.next();
			i=s.nextInt();
			sayac1++;
			/*if(y.charAt(0)=='A' || y.charAt(0)=='a')
			{	sayac++;}
			if(eu.length()>y.length()) {eu=eu;}
			else {eu=y;}
			t=y;*/
		}
		System.out.println(eu+" "+sayac+" "+sayac1);
		
	s.close();	
		

	}

}
