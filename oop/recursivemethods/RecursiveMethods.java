package oop.recursivemethods;

import java.util.Scanner;

public class RecursiveMethods {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.print("Bir sayi giriniz: ");
      int sayi = scan.nextInt();

      int resultOfRecursive = getfactorialRecursive(sayi);
      int resultOfNonRecursive = getfactorialNonRecursive(sayi);

      System.out.println("Recursive: " + sayi + "!= " + resultOfRecursive);
      System.out.println("Non-Recursive: " + sayi + "!= " + resultOfNonRecursive);
      
      scan.close();
   }

   // =================================
   // Without using Recursive Method
   // =================================
   public static int getfactorialNonRecursive(int num) {
      int faktoriyel = 1;

      for (int i = 1; i <= num; i++) {
         faktoriyel = faktoriyel * i;
      }

      return faktoriyel;
   }

   // =================================
   // Using Recursive Method
   // =================================
   public static int getfactorialRecursive(int num) {
      if (num == 1) {
         return 1;
      } else {
         return num * getfactorialRecursive(num - 1);
      }
   }
}
