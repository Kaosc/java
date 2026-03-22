package uygulamafoy3;

import java.util.Scanner;

@SuppressWarnings("unused")

public class melihrusenozkulFoy3 {
   public static Scanner scanner = new Scanner(System.in);

   static void uygulama1() {
      int[][] dizi = new int[5][4];

      for (int i = 0; i < dizi.length; i++) {
         for (int j = 0; j < dizi[i].length; j++) {
            dizi[i][j] = 1;
         }
      }
   }

   static void uygulama2() {
      int[][] dizi = {
            { 1, 3, 5 },
            { 7, 9, 11 },
            { 13, 15, 17 }
      };
   }

   static void uygulama3() {
      int[][] notlar = new int[40][6];

      for (int i = 0; i < notlar.length; i++) {
         System.out.println("--- " + (i + 1) + ". Öğrenci ---");
         for (int j = 0; j < notlar[i].length; j++) {
            System.out.print((j + 1) + ". Ders Notunu Giriniz: ");
            try {
               notlar[i][j] = scanner.nextInt();
            } catch (Exception e) {
               System.out.println("Geçersiz giriş! Lütfen bir sayı giriniz.");
               scanner.next();
               j--;
            }
         }
      }

   }

   static void uygulama4() {
      int[][] fiyatlar = new int[4][10];
   }

   static void uygulama5() {
      int[][] koltuklar = new int[12][40];

      for (int[] sefer : koltuklar) {
         for (int i = 0; i < sefer.length; i++) {
            sefer[i] = Math.random() < 0.5 ? 0 : 1;
         }
      }
   }

   static void uygulama6() {
      double[][][] sicakliklar = new double[12][30][24];
   }

   static void uygulama7() {
      int[][][] dizi = {
            {
                  { 2, 4, 6 },
                  { 8, 10, 12 },
                  { 14, 16, 18 }
            },
            {
                  { 20, 22, 24 },
                  { 26, 28, 30 },
                  { 32, 34, 36 }
            },
            {
                  { 38, 40, 42 },
                  { 44, 46, 48 },
                  { 50, 52, 54 }
            }
      };
   }

   static void uygulama8() {
      int[][] odalar = new int[5][20];

      for (int[] kat : odalar) {
         for (int i = 0; i < kat.length; i++) {
            kat[i] = Math.random() < 0.5 ? 0 : 1;
         }
      }
   }

   static void uygulama9() {
      int[][][] stoklar = new int[3][4][10];

      for (int i = 0; i < stoklar.length; i++) {
         System.out.print("--- " + (i + 1) + ". Depo ");
         for (int j = 0; j < stoklar[i].length; j++) {
            System.out.println("--- " + (j + 1) + ". Raf ---");
            for (int k = 0; k < stoklar[i][j].length; k++) {
               System.out.print((k + 1) + ". Ürün Stok Miltarını Giriniz: ");
               try {
                  stoklar[i][j][k] = scanner.nextInt();
               } catch (Exception e) {
                  System.out.println("Geçersiz giriş! Lütfen bir sayı giriniz.");
                  scanner.next();
                  k--;
               }
            }
         }
      }

   }

   static void uygulama10() {
      String[][][] ucuslar = new String[2][5][8];

      for (int i = 0; i < ucuslar.length; i++) {
         System.out.print("--- " + (i == 0 ? "İç Hat" : "Dış Hat") + " Terminali");
         for (int j = 0; j < ucuslar[i].length; j++) {
            System.out.println("--- " + (j + 1) + ". Kapı ---");
            for (int k = 0; k < ucuslar[i][j].length; k++) {
               System.out.print((k + 1) + ". Uçuş PNR numarası giriniz: ");
               ucuslar[i][j][k] = scanner.nextLine();
            }
         }
      }
   }

   public static void main(String[] args) {
      // uygulama1();
      // uygulama2();
      // uygulama3();
      // uygulama4();
      // uygulama5();
      // uygulama6();
      // uygulama7();
      // uygulama8();
      // uygulama9();
      uygulama10();
   }
}
