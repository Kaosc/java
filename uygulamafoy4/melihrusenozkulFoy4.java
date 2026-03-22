package uygulamafoy4;

import java.util.Scanner;

// @SuppressWarnings("unused")

public class melihrusenozkulFoy4 {
   public static Scanner scanner = new Scanner(System.in);

   static void uygulama1() {
      int[][] koltuklar = new int[5][10];

      for (int[] sefer : koltuklar) {
         for (int i = 0; i < sefer.length; i++) {
            sefer[i] = Math.random() < 0.5 ? 0 : 1;
         }
      }

      int count = 0;
      for (int[] sira : koltuklar) {
         for (int koltuk : sira) {
            if (koltuk == 0) {
               count++;
            }
         }
      }

      System.out.println("Boş koltuk sayısı: " + count);
   }

   static void uygulama2() {
      int[][] notlar = {
            { 55, 90, 78, 92, 68 },
            { 92, 48, 95, 91, 90 },
            { 76, 80, 43, 87, 54 },
            { 49, 91, 34, 91, 96 }
      };

      int sum = 0;
      for (int[] sinif : notlar) {
         for (int not : sinif) {
            sum += not;
         }
      }

      int notSayisi = notlar.length * notlar[0].length;

      System.out.println("Notların Ortalaması: " + (sum / (double) notSayisi));
   }

   static void uygulama3() {
      int[][] katilimlar = {
            { 5, 10, 21 },
            { 3, 15, 18 },
            { 8, 12, 25 },
            { 6, 9, 20 },
            { 4, 11, 17 },
            { 7, 14, 22 },
            { 2, 13, 19 },
      };

      int maxKatilim = 0;
      int gunKatilim = 0;
      int maxKalitimIndex = 0;
      int toplamKatilim = 0;

      for (int gun = 0; gun < katilimlar.length; gun++) {
         for (int katilim = 0; katilim < katilimlar[gun].length; katilim++) {
            gunKatilim += katilimlar[gun][katilim];
            toplamKatilim += gunKatilim;
         }

         if (gunKatilim > maxKatilim) {
            maxKatilim = gunKatilim;
            maxKalitimIndex = gun;
         }

         gunKatilim = 0;
      }

      System.out.println("En çok katılan gün: " + (maxKalitimIndex + 1));
      System.out.println("Toplam Katılım: " + toplamKatilim);
   }

   static void uygulama4() {
      int[][] notlar = {
            { 55, 90, 78, 92 },
            { 92, 48, 95, 91, },
            { 76, 80, 43, 87, },
            { 49, 91, 34, 91, },
            { 85, 70, 60, 80, },
            { 90, 95, 85, 88, },
      };

      double[] ortalamalar = new double[notlar.length];

      int maxOrtalamaIndex = 0;
      double maxOrtalama = 0;

      for (int i = 0; i < notlar.length; i++) {
         int sum = 0;

         for (int j = 0; j < notlar[i].length; j++) {
            sum += notlar[i][j];
         }

         double ortalama = sum / (double) notlar[i].length;

         if (ortalama > maxOrtalama) {
            maxOrtalama = ortalama;
            maxOrtalamaIndex = i;
         }

         ortalamalar[i] = ortalama;
      }

      System.out.print("En yüksek ortalama alan öğrencinin notları:");
      for (int not : notlar[maxOrtalamaIndex]) {
         System.out.print(" " + not + ",");
      }

      System.out.println("\nSınıf birincisinin öğrenci numarası: " + (maxOrtalamaIndex + 1));
      System.out.println("Sınıf birincisinin ortalaması: " + maxOrtalama);
   }

   static void uygulama5() {
      int[][] yataklar = {
            { 1, 0, 1, 0, 1, 0, 1, 1, 1, 1 },
            { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
            { 1, 0, 0, 0, 0, 1, 1, 1, 1, 1 },
            { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 },
      };

      double[] doluYatakOranlari = new double[yataklar.length];

      int maxBosServisIndex = 0;
      int maxBosServisYatakSayisi = 0;

      for (int i = 0; i < doluYatakOranlari.length; i++) {
         int doluYatakSayisi = 0;

         for (int j = 0; j < yataklar[i].length; j++) {
            if (yataklar[i][j] == 1) {
               doluYatakSayisi++;
            }
         }

         double doluYatakOrani = (doluYatakSayisi / (double) yataklar[i].length) * 100;
         System.out.printf(i + 1 + ". Servis" + " doluluk oranı:" + doluYatakOrani + "%%\n");

         int bosYatakSayisi = yataklar[i].length - doluYatakSayisi;
         if (bosYatakSayisi > maxBosServisYatakSayisi) {
            maxBosServisYatakSayisi = bosYatakSayisi;
            maxBosServisIndex = i;
         }

         doluYatakOranlari[i] = doluYatakOrani;
      }

      System.out.println("En az boş yatağa sahip servis: " + (maxBosServisIndex + 1));
      System.out.println("En az boş yatağa sahip servisin boş yatak sayısı: " + maxBosServisYatakSayisi);
   }

   static void uygulama6() {
      int baslangicKat = 0;
      int[] cagrilanKatlar = new int[3];

      System.out.print("Başlangıç kat numarasını girin: ");
      baslangicKat = scanner.nextInt();

      for (int i = 0; i < cagrilanKatlar.length; i++) {
         System.out.print("Çağrılan " + (i + 1) + ". kat numarasını girin: ");
         cagrilanKatlar[i] = scanner.nextInt();
      }

      int[] dolasilacakKatlar = new int[3];
      int suankiKat = baslangicKat;
      int toplamMesafe = 0;

      for (int i = 0; i < dolasilacakKatlar.length; i++) {
         int minMesafe = Integer.MAX_VALUE;
         int minMesafeIndex = -1;

         for (int j = 0; j < cagrilanKatlar.length; j++) {
            int mesafe = Math.abs(suankiKat - cagrilanKatlar[j]);

            if (mesafe < minMesafe) {
               minMesafe = mesafe;
               minMesafeIndex = j;
            }
         }

         dolasilacakKatlar[i] = cagrilanKatlar[minMesafeIndex];
         toplamMesafe += minMesafe;
         suankiKat = dolasilacakKatlar[i];
         cagrilanKatlar[minMesafeIndex] = Integer.MAX_VALUE; // Bu kat artık çağrılmayacak
      }

      for (int j = 0; j < dolasilacakKatlar.length; j++) {
         System.out.println((j + 1) + ". durak: " + dolasilacakKatlar[j]);
      }

      System.out.println("Toplam mesafe: " + toplamMesafe);

   }

   static void uygulama7() {
   }

   static void uygulama8() {
   }

   static void uygulama9() {
   }

   static void uygulama10() {
   }

   public static void main(String[] args) {
      // uygulama1();
      // uygulama2();
      // uygulama3();
      // uygulama4();
      // uygulama5();
      uygulama6();
      uygulama7();
      uygulama8();
      uygulama9();
      uygulama10();
   }
}
