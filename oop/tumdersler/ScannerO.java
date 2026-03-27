package oop.tumdersler;
import java.io.*;
import java.util.*;
public class ScannerO {
	static void kontrol(File f) throws IOException{
			if(f.exists()) {}
			else {
			f.createNewFile();}}
	public static void main(String[] args) throws IOException{
		File f=new File("C:\\Users\\Lenovo\\Desktop\\isim.txt");
		File f1=new File("C:\\Users\\Lenovo\\Desktop\\sayi.txt");
		Scanner s=new Scanner(f);
	//	Scanner s1=new Scanner(f1);
		kontrol(f);
		kontrol(f1);
		//	int i=0,n=0;
		while(s.hasNext()) {
			System.out.println(s.nextLine());}
			//i++;
			//i=0;}
		//System.out.println(i);
	/*	while(s1.hasNext()) {
			if(s1.nextInt()<0) {n++;}
			i++;}
		System.out.println(i+" sayıdan "+n+" tanesi negatif");*/
		s.close();
		//s1.close();*/
		
			
	}

}
