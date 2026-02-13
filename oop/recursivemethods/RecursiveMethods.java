package oop.recursivemethods;

import java.util.Scanner;

public class RecursiveMethods {
   public static void main(String[] args) {
      // Özyinelemeli Metot Kullanmadan
      Scanner scan = new Scanner(System.in);
      int faktoriyel = 1;

      System.out.print("Bir sayi giriniz: ");
      int sayi = scan.nextInt();

      if (sayi < 0) {
         System.out.println("Negatif sayilarin faktoriyeli olmaz.");
         scan.close();
         return;
      }

      for (int i = 1; i <= sayi; i++) {
         faktoriyel = faktoriyel * i;
      }

      System.out.println(sayi + "!= " + faktoriyel);
      scan.close();
   }
}
