package oop.exceptions;

import java.util.Scanner;

class PasswordException extends Exception {
   public PasswordException(String msg) {
      super(msg);
   }
}

class PasswordLengthException extends Exception {
   public PasswordLengthException(String msg) {
      super(msg);
   }
}

public class ExpectionWithWhile {
   public void sifreKontrol(String sifre) throws PasswordException, PasswordLengthException {
      if (sifre.matches("[0-9]+")) { // Check for is password all numbers
         if (sifre.matches("[0-9]{3,}")) { // Check for at least 3 number
            System.out.println("Sifre belirlendi");
         } else {
            throw new PasswordLengthException("Password must be at least 3 char long.");
         }
      } else {
         throw new PasswordException("Password must be numbers only.");
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (true) {
         try {
            System.out.print("\nŞifre giriniz: ");
            String sifre = sc.next();
            new ExpectionWithWhile().sifreKontrol(sifre);
            break;
         } catch (PasswordException | PasswordLengthException e) {
            System.out.print(e.getMessage());
         }
      }

      sc.close();
   }
}
