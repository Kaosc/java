package oop.tumdersler;

public class splitt {

	public static void main(String[] args) {
		String m="Cumhuriyet Çok yaşa";
	
		String t[]=	m.split(" "); 
		System.out.println(t[2]);
		for (String i:t) {System.out.println(i);}

	}

}
