package oop.tumdersler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ornk2 {
	public static void main(String[] args) throws IOException {
		File m=new File("C:\\Users\\Lenovo\\Desktop\\vize.txt");
		File n=new File("C:\\Users\\Lenovo\\Desktop\\ort.txt");
		
		FileReader f=new FileReader(m);
		FileWriter e=new FileWriter(n);
	
		BufferedReader b=new BufferedReader(f);
		BufferedWriter w=new BufferedWriter(e);
		
		b.readLine();
		String s;
		
		while((s=b.readLine())!=null) {
		
		String [] d=s.split("\\s+");
		int not=Integer.parseInt(d[1].trim());
		if(not>=50) {System.out.println(d[0]+" Geçti");
		w.append(d[0].trim()+"\n");
		}
		else {System.out.println(d[0]+" Kaldı");}
			
			
		}
		
		w.close();
	}}
