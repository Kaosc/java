package oop.foyler.foy3;

import java.io.File;
import java.util.Scanner;

public class Foy3 {

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
      File file = new File("E:\\dev\\java\\oopUygulamalar\\uygulamaFoy3\\texts\\yoklama.txt");

      if (!file.exists()) {
         System.out.println("Dosya bulunamadı.\n");
         return;
      }

      try {
         Scanner scanner = new Scanner(file, "UTF-8");

         int toplamOgrenci = 0;
         int toplamOgrenciY = 0;

         while (scanner.hasNextLine()) {
            String student = scanner.nextLine();
            toplamOgrenci++;

            System.out.println(toplamOgrenci + ". " + student);

            if (student.toLowerCase().startsWith("y")) {
               toplamOgrenciY++;
            }
         }

         System.out.println("Toplam öğrenci sayısı: " + toplamOgrenci);
         System.out.println("İsmi Y harfi ile başlayan Toplam öğrenci sayısı: " + toplamOgrenciY);

         scanner.close();
      } catch (Exception e) {
         System.out.println(e);
      }

   }

   static void uygulama4() {
      File file = new File("E:\\dev\\java\\oopUygulamalar\\uygulamaFoy3\\texts\\adim.txt");

      if (!file.exists()) {
         System.out.println("Dosya bulunamadı.\n");
         return;
      }

      try {
         Scanner scanner = new Scanner(file);

         int toplamAdim = 0;
         int i = 0;

         while (scanner.hasNext()) {
            int adim = scanner.nextInt();
            toplamAdim += adim;
            i++;
         }

         double ortalamaAdimSayisi = (double) toplamAdim / i;
         System.out.println("Ortalama adım sayısı: " + ortalamaAdimSayisi);
         scanner.close();

      } catch (Exception e) {
         System.out.println(e);
      }
   }

   static void uygulama5() {
      File file = new File("E:\\dev\\java\\oopUygulamalar\\uygulamaFoy3\\texts\\rehber.txt");

      if (!file.exists()) {
         System.out.println("Dosya bulunamadı.\n");
         return;
      }

      try {
         Scanner fileScanner = new Scanner(file, "UTF-8");
         Scanner userInputScanner = new Scanner(System.in, "UTF-8");

         System.out.print("Bir isim girin: ");
         String arananIsim = userInputScanner.next();
         boolean found = false;

         while (fileScanner.hasNextLine()) {
            String satir = fileScanner.nextLine();
            // split(\\s+) tüm boşluk karakterlerinin kaldırır. "\\s+" Tüm bolukluk karakterlerini belirtir.
            String[] parcalar = satir.replace(".", "").split("\\\\s+");

            if (parcalar[0].equalsIgnoreCase(arananIsim)) {
               System.out.println("Telefon numarası: " + parcalar[1]);
               found = true;
               break;
            }
         }

         if (!found) {
            System.out.println("Kişi bulunamadı.");
         }

         fileScanner.close();
         userInputScanner.close();
      } catch (Exception e) {
         System.out.println(e);
      }
   }

   public static void main(String[] args) {
      // uygulama1();
      // uygulama2();
      // uygulama3();
      // uygulama4();
      uygulama5();
   }
}
