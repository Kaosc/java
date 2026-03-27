package oop.tumdersler;
import java.io.*;
import java.util.Scanner;
public class ScOr3 {
	public static void main(String[] args) throws IOException  {
		File f=new File("C:\\Users\\Lenovo\\Desktop\\dosya.txt");
		Scanner s=new Scanner(f);
		Scanner s1=new Scanner(System.in);
		String d=s1.nextLine();
		int sayac=0;
		//s.nextLine();
		while(s.hasNext()) {
	// String m="Cumhuriyet Çok yaşa"; m.split("\\s+"); String t[]={"Cumhuriyet", "Çok", "yaşa"})
		String veri[]	=s.nextLine().split("\\s+");
		if(veri[0].equalsIgnoreCase(d))	{
			System.out.println(veri[1]); sayac++;}

			}
		if (sayac==0) {System.out.println("İsim bulunamadı"); }
		}}


