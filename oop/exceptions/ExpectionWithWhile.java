package oop.exceptions;

import java.util.Scanner;

class GecersizKarakterException extends Exception {
   public GecersizKarakterException(String mesaj) {
      super(mesaj);
   }
}

class Kullanici {
   public void sifreKontrol(String sifre) throws GecersizKarakterException {
      if (sifre.matches("[0-9]+")) {
         System.out.println("Sifre belirlendi");
      } else {
         throw new GecersizKarakterException("Şifre sadece rakamlardan oluşmalıdır");
      }
   }
}

public class ExpectionWithWhile {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (true) {
         try {
            System.out.print("\nŞifre giriniz: ");
            String sifre = sc.next();
            new Kullanici().sifreKontrol(sifre);
            break;
         } catch (Exception e) {
            System.out.print(e.getMessage());
         }
      }

      sc.close();
   }
}
