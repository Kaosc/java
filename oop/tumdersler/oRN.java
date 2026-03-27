package oop.tumdersler;

import java.io.*;

public class oRN {
	public static void main(String[] args) throws IOException {
		
		FileWriter w=new FileWriter("C:\\Users\\Lenovo\\Desktop\\YZM.txt");
		w.write("ASCII"+"\t Karakter" );
		for(int i=65;i<=75;i++) {
			w.write("\n"+i+"\t "+(char)i);
			
		}
		w.close();
		
		
	}
}
