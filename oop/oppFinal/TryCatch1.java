package oop.oppFinal;

import java.util.InputMismatchException;
import java.util.Scanner;

class TryCatch1 {
   public static void main(String[] args) {
      int[] oduller = { 500, 1000, 2000 };
      Scanner sc = new Scanner(System.in);

      try {
         System.out.print("Bir sayı girin: ");
         int sayi = sc.nextInt();
         int odul = oduller[sayi - 1];
         System.out.print("Ödülünüz: " + odul);
      } catch (InputMismatchException e) {
         System.out.print("Sadece sayı giriniz!");
      } catch (ArrayIndexOutOfBoundsException e) { // or IndexOutOfBoundsException
         System.out.print("1 ile 3 arasında sayı giriniz!");
      }

      sc.close();
   }
}