package oop.foyler.uygulamaFoy2;

public class Foy2 {

   static void palindromKontrol(String str, String rev, int i) {
      if (str.length() == rev.length()) {
         if (str.equals(rev)) {
            System.out.println(str + " Palindromdur -> " + rev);
         } else {
            System.out.println(str + " Palindrom değildir -> " + rev);
         }
         return;
      }

      if (i == 0) {
         i = str.length();
      }

      palindromKontrol(str, rev + str.charAt(i - 1), --i);
   }

   static void karakterSay(String str, char c, int i, int adet) {
      if (i == str.length()) {
         System.out.println(c + " karakteri " + str + " metninde " + adet + " adet var.");
         return;
      }

      if (str.charAt(i++) == c) {
         adet++;
      }

      karakterSay(str, c, i, adet);
   }

   static void asalKontrol(int num, int i) {
      if (i == num) {
         System.out.println(num + " bir asal sayıdır.");
         return;
      }

      if (num % i == 0 && i != 1) {
         System.out.println(num + " bir asal sayı değildir.");
         return;
      }

      asalKontrol(num, ++i);
   }

   static void buyukHarfSayac(String str, int i, int adet) {
      if (i == str.length()) {
         System.out.println(str + " metninde " + adet + " adet büyük harf var.");
         return;
      }

      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
         adet++;
      }

      buyukHarfSayac(str, ++i, adet);
   }

   static void sudoku() {
      
   }

   public static void main(String[] args) {
      palindromKontrol("KABAK", "", 0);
      palindromKontrol("EKMEK", "", 0);

      karakterSay("MERHABA", 'A', 0, 0);

      asalKontrol(11, 1);
      asalKontrol(25, 1);

      buyukHarfSayac("mErHaBa", 0, 0);

      sudoku();
   }
}
