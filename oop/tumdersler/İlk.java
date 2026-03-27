package oop.tumdersler;
import java.io.*;
public class İlk {
//File nesnesi Tanımlama
	public static void main(String[] args) throws IOException {

		//String türünde tek parametreli Kurucu metota göre
	  File f1=new File("C:/Users/Lenovo/Desktop/dosya.txt");
	  String yol="C:\\Users\\Lenovo\\Desktop\\dosya.txt";
	  File f2=new File(yol);
	  
		//String türünde iki parametreli Kurucu metota göre
	  String p="C:/Users/Lenovo";
	  String c="Desktop\\dosya.txt"; 
	  File f3=new File(p,c);
	  File f4=new File("C:\\Users\\Lenovo","Desktop\\dosya.txt");
	  
	  //File ve String türünde iki parametreli Kurucu metota göre
	  
	  File f5=new File("C:\\Users\\Lenovo");
	  File f6=new File(f5,c);
	  
	  File f7=new File(p);
	  File f8=new File(f7,c);
	  
	  
	  if(f1.exists()) {System.out.println("Dosya var");}
	  else {System.out.println("Dosya yok");}
	  
	  if(f1.exists()) {System.out.println("Dosya var");}
	  else {f1.createNewFile();}
	  
	  
	  
	  
	  
	}

}
