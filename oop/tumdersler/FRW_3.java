package oop.tumdersler;

import java.io.*;

public class FRW_3 {

	public static void main(String[] args)  throws IOException{
/*File Sınıfı
 * Scanner ile Okuma
 * FileReader, FileWriter
 * BufferedReader, BUffereredWriter 
 * FileInputStream, FileOutStream
 * */
		
		FileInputStream f1=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\SEDA İŞGÜZAR DERS NOTLARI\\sayi.txt");
		FileOutputStream f2=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\SEDA İŞGÜZAR DERS NOTLARI\\m.txt");
		
		//int a=f1.read();
		int a;
		byte []d=new byte[20];
		while((a=f1.read(d))!=-1) {
			//System.out.print((char)a);
			//a=f1.read();
			f2.write(d);}
		
		f2.close();
		
		for(byte v:d) {System.out.print((char)v);}

	}

}
