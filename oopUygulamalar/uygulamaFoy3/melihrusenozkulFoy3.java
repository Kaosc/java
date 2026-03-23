package oopUygulamalar.uygulamaFoy3;

import java.io.File;
import java.util.Scanner;

public class melihrusenozkulFoy3 {

   static void uygulama1() {
      File file = new File("E:\\dev\\java\\oopUygulamalar\\uygulamaFoy3\\texts\\filmler.txt");

      if (!file.exists()) {
         System.out.println("Dosya bulunamadı.\n");
         return;
      }

      try {
         Scanner scanner = new Scanner(file);

         int filmSayisi = 0;
         int IileBaslayanSayisi = 0;
         int ikiKelimeFilmSayisi = 0;

         while (scanner.hasNextLine()) {
            String film = scanner.nextLine();
            filmSayisi++;

            if (film.startsWith("I")) {
               IileBaslayanSayisi++;
            }

            int wordCount = film.split(" ").length;
            if (wordCount > 1) {
               ikiKelimeFilmSayisi++;
            }
         }

         System.out.println("Toplam film sayısı: " + filmSayisi);
         System.out.println("I harfi ile başlayan film sayısı: " + IileBaslayanSayisi);
         System.out.println("İki kelimeden oluşan film sayısı: " + ikiKelimeFilmSayisi);

         scanner.close();
      } catch (Exception e) {
         System.out.println(e);
      }
   }

   static void uygulama2() {
      File file = new File("E:\\dev\\java\\oopUygulamalar\\uygulamaFoy3\\texts\\gunluk.txt");

      if (!file.exists()) {
         System.out.println("Dosya bulunamadı.\n");
         return;
      }

      try {
         Scanner scanner = new Scanner(file, "UTF-8");

         int count = 0;

         while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.equalsIgnoreCase("bugün")) {
               count++;
            }
         }

         System.out.println("Toplam 'bugün' kelime sayısı: " + count);

         scanner.close();
      } catch (Exception e) {
         System.out.println(e);
      }
   }

   static void uygulama3() {
      
   }

   public static void main(String[] args) {
      uygulama1();
      uygulama2();
      uygulama3();
   }
}
