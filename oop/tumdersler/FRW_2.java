package oop.tumdersler;
import java.io.*;
public class FRW_2 {

	public static void main(String[] args) throws IOException{

		//FileWriter y=new FileWriter("C:\\Users\\Lenovo\\Desktop\\sayi.txt");
		FileReader r=new FileReader("C:\\Users\\Lenovo\\Desktop\\sayi.txt");
		//BufferedWriter b=new BufferedWriter(y);
		BufferedReader b2=new BufferedReader(r);
		/*b.write("13");
		b.newLine();
		b.write("23");
		b.newLine();
		b.write("33");
		b.newLine();
		b.write("98");
		b.close();*/
		String a=b2.readLine();
		/*System.out.println(a);
		String x=b2.readLine();
		System.out.println(x);
		System.out.println(Integer.parseInt(x)+Integer.parseInt(a));*/
		while(a!=null) {
			System.out.println(a);
			a=b2.readLine();
		}
	     
		
		
		
		

	}

}
