package oop.tumdersler;

import java.io.*;
import java.util.Scanner;


public class FRW_ort {

	public static void main(String[] args) throws IOException {
		String a="C:\\Users\\Lenovo\\Desktop\\vize.txt";
		File f1=new File(a);
		
		String b="C:\\Users\\Lenovo\\Desktop\\final.txt";
		File f2=new File(b);
		
		String c="C:\\Users\\Lenovo\\Desktop\\ort.txt";
		FileWriter w=new FileWriter(c);
		
		Scanner s=new Scanner(f1);
		Scanner s1=new Scanner(f2);
		int x,y;double ort;
		while(s.hasNext()&& s1.hasNext()) {
			x=s.nextInt();
			y=s1.nextInt();
			ort=(x*0.4)+(y*0.6);
			
			w.write(String.valueOf(ort+"\n"));
			w.write(System.lineSeparator());
			}
		
		w.close();
	}

}
