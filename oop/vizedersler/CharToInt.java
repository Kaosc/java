package oop.vizedersler;

public class CharToInt {
	public static void main(String[] args) {
		// This is a char
		char c = '6';
		// We can assign a char to an int, because char is a 16-bit unsigned integer
		int b = c;
		// Now b holds the Unicode code point of the character '6', which is 54
		System.out.print("b: " + b);
	}
}
