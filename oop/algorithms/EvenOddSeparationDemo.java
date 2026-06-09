package oop.algorithms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOddSeparationDemo {

	private static final String INPUT_PATH = "E:\\dev\\java\\oop\\texts\\sayi.txt";

	public static void main(String[] args) throws IOException {
		List<Integer> evenNumbers = new ArrayList<>();
		List<Integer> oddNumbers = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File(INPUT_PATH))) {
			while (scanner.hasNextInt()) {
				int value = scanner.nextInt();
				if (value % 2 == 0) {
					evenNumbers.add(value);
				} else {
					oddNumbers.add(value);
				}
			}
		}

		System.out.println("Even count: " + evenNumbers.size());
		System.out.println("Odd count: " + oddNumbers.size());

		System.out.print("Even values: ");
		for (int value : evenNumbers) {
			System.out.print(value + " ");
		}

		System.out.println();
		System.out.print("Odd values: ");
		for (int value : oddNumbers) {
			System.out.print(value + " ");
		}
	}
}
