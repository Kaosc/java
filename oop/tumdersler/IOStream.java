package oop.tumdersler;
import java.io.*;
public class IOStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f1=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\vize.txt");
		FileOutputStream f2=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\vize.txt");
		//System.out.println((char)f1.read());
		f2.write(65);
		f2.write(66);
		f2.write(67);
		f2.write(68);
		f2.write(69);
	
		int s=f1.read();
		while(s!=-1) {
			System.out.print((char)s);
			s=f1.read();
		}
		
	}

}
