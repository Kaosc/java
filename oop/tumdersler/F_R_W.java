package oop.tumdersler;
import java.io.*;
import java.util.*;
public class F_R_W {
	
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Lenovo\\Desktop\\SEDA İŞGÜZAR DERS NOTLARI\\isim.txt");//parametre dosya yolunu (path) içeren bir stringdir.
	String a="C:\\Users\\Lenovo\\Desktop\\isim.txt";
	
	File f1=new File(a);	
	
	String ust="C:\\Users\\Lenovo\\Desktop";
	String alt="isim.txt";
	File f2=new File(ust,alt);	
	
	File f3=new File("C:\\Users\\Lenovo\\Desktop");
	File f4=new File(f3,alt);	
	System.out.println(f.exists());
	System.out.println(f.canRead());
	System.out.println(f.canWrite());
	System.out.println(f.isFile());
	System.out.println(f.isDirectory());
	System.out.println(f3.isDirectory());
	System.out.println(f.length());
	
	/*Scanner s1=new Scanner(f);
	File f2=new File("C:\\Users\\Lenovo\\Desktop\\final.txt");
	Scanner s2=new Scanner(f1);
	FileWriter w=new FileWriter("C:\\Users\\Lenovo\\Desktop\\ort.txt");
	String y;
	double v,fi;
	while(s1.hasNext()) {
		v=s1.nextDouble();
		fi=s2.nextDouble();
		y=String.valueOf(v*0.4+fi*0.6);
		w.write(y+"\n");
		
			}

	s1.close();
	s2.close();
	w.close();*/
}
}
