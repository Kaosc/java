package oop.foyler.foy4;

import java.io.File;
import java.util.Scanner;

public class Foy4 {

   static void uygulama1() throws Exception {
      File file = new File("E:\\dev\\java\\oopUygulamalar\\uygulamaFoy4\\texts\\satis.txt");
      Scanner sc = new Scanner(file);

      if (!file.exists()) {
         System.out.print("Dosya bulunamadı");
      }

      try {
         int totalSales = 0;
         int maxSales = 0;
         String maxSaledProduct = "";

         while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split("\\\\s+");

            for (int i = 0; i < parts.length; i += 2) {
               String product = parts[i];
               int quantity = Integer.parseInt(parts[i + 1]);

               if (quantity > maxSales) {
                  maxSaledProduct = product;
                  maxSales = quantity;
               }

               totalSales += quantity;
            }

         }

         System.out.println("Toplam Satış: " + totalSales);
         System.out.println("En Çok Satılan Ürün: " + maxSaledProduct + " (" + maxSales + " adet)");
      } catch (Exception e) {
         System.out.print("Dosya okunurken hata oluştu");
      }

      sc.close();
   }

   static void uygulama2() {
   }

   static void uygulama3() {
   }

   static void uygulama4() {
   }

   public static void main(String[] args) {
      try {
         uygulama1();
      } catch (Exception e) {
         System.out.print(e);
      }
   }
}
