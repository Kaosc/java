package oop.tumdersler;
import java.io.*;
import java.util.*;
/*sayi.txt dosyasında
* 1) kaç tane sayı olduğunu bulunuz.
* 2) kaç tane çift sayı olduğunu bulunuz.
* 3) ortalamasını bulunuz
* 4) en büyük ve en küçük sayıyı bulunuz.
* */
public class Scanner2 {
	public static void main(String[] args) throws IOException {
		String yol="C:\\Users\\Lenovo\\Desktop\\sayi.txt";
		File f1=new File(yol);
		Scanner s=new Scanner(f1);
		int sayac=0, sayac1=0, i,tpl=0,eb=0,ek=0;
		eb=ek=i=s.nextInt();
		while(s.hasNext()) {
			sayac++;
			if(i%2==0) {sayac1++;}
			tpl=tpl+i;
			if(eb<i) {eb=i;}
			if(i<ek) {ek=i;}
			i=s.nextInt();
		}
		double ort=tpl/sayac;
		System.out.println(sayac+" cifts="+sayac1+" ort"+ort+" eb="+eb+" ek="+ek);
	s.close();	
		

	}

}
