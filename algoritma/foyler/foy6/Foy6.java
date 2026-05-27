package algoritma.foyler.foy6;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Foy6 {
   public static Scanner scanner = new Scanner(System.in);

   public static int acilKategoriSayisi(int[] rafOmru) {
      int sayac = 0;
      for (int omur : rafOmru) {
         if (omur >= 0 && omur <= 3) {
            sayac++;
         }
      }
      return sayac;
   }

   public static double acilKategoriOrani(int acilKategoriSayisi, int toplamUrunSayisi) {
      return (double) acilKategoriSayisi / toplamUrunSayisi * 100;
   }

   public static void indirimYap(double[] fiyatlar, int indirimYuzdesi) {
      System.out.println("Yeni fiyatlar:");
      for (int i = 0; i < fiyatlar.length; i++) {
         fiyatlar[i] = fiyatlar[i] * (1 - indirimYuzdesi / 100.0);
         System.out.printf("%d. ürünün yeni fiyatı: %.2f\\n", (i + 1), fiyatlar[i]);
      }
   }

   static void uygulama1() {
      int[] rafOmru = new int[8];
      double[] fiyatlar = new double[8];

      for (int i = 0; i < rafOmru.length; i++) {
         System.out.print((i + 1) + ". ürünün kalan raf ömrünü gün cinsinden giriniz: ");
         rafOmru[i] = scanner.nextInt();
         System.out.print((i + 1) + ". ürünün fiyatını giriniz: ");
         fiyatlar[i] = scanner.nextDouble();
      }

      int acilKategoriSayisi = acilKategoriSayisi(rafOmru);
      int toplamUrunSayisi = rafOmru.length;
      double acilKategoriOrani = acilKategoriOrani(acilKategoriSayisi, toplamUrunSayisi);

      if (acilKategoriOrani > 50) {
         System.out.println("Acil müdahale gerekli");
         indirimYap(fiyatlar, 50);
      } else if (acilKategoriOrani >= 25) {
         System.out.println("Dikkat edilmeli");
         indirimYap(fiyatlar, 30);
      } else {
         System.out.println("Stok durumu normal");
         indirimYap(fiyatlar, 10);
      }

   }

   static class Log {
      LocalDateTime tarih;
      String level;
      String mesaj;

      Log(String satir) {
         String[] parts = satir.split("\\|");
         this.tarih = LocalDateTime.parse(parts[0]);
         this.level = parts[1];
         this.mesaj = parts[2];
      }
   }

   static ArrayList<Log> dosyaOku(String dosyaYolu) {
      ArrayList<Log> logs = new ArrayList<>();

      try (Scanner sc = new Scanner(new File(dosyaYolu))) {
         while (sc.hasNextLine()) {
            logs.add(new Log(sc.nextLine().trim()));
         }
      } catch (Exception e) {
         System.out.println("Dosya okunamadı: " + e);
      }

      return logs;
   }

   static void logSayisi(ArrayList<Log> logs) {
      int info = 0, warn = 0, error = 0;

      for (Log log : logs) {
         switch (log.level) {
            case "INFO":
               info++;
               break;
            case "WARN":
               warn++;
               break;
            case "ERROR":
               error++;
               break;
         }
      }

      System.out.println("INFO: " + info + " | WARN: " + warn + " | ERROR: " + error);
   }

   static void anomaliTespit(ArrayList<Log> logs) {
      DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
      boolean anomaliBulundu = false;

      for (Log log1 : logs) {
         if (!log1.level.equals("ERROR")) {
            continue;
         }

         String dakika1 = log1.tarih.format(fmt);
         int count = 0;

         for (Log log2 : logs) {
            if (!log2.level.equals("ERROR")) {
               continue;
            }

            if (log2.tarih.format(fmt).equals(dakika1))
               count++;
         }

         if (count > 3) {
            System.out.println("ANOMALİ: " + dakika1 + " → " + count + " ERROR!");
            anomaliBulundu = true;
         }
      }

      if (!anomaliBulundu)
         System.out.println("Anomali tespit edilmedi.");
   }

   static void enYogunSaat(ArrayList<Log> logs) {
      int[] saatler = new int[24];

      for (Log log : logs) {
         if (!log.level.equals("ERROR")) {
            continue;
         }

         saatler[log.tarih.getHour()]++;
      }

      int maxSaat = 0;
      for (int i = 1; i < 24; i++) {
         if (saatler[i] > saatler[maxSaat]) {
            maxSaat = i;
         }
      }

      System.out.println("En yoğun saat: " + maxSaat + ":00 → " + saatler[maxSaat] + " ERROR");
   }

   static void zamanAnalizi(ArrayList<Log> logs) {
      LocalDateTime ilk = logs.get(0).tarih;
      LocalDateTime son = logs.get(logs.size() - 1).tarih;

      long dakika = Duration.between(ilk, son).toMinutes();
      System.out.println("Toplam süre: " + dakika + " dakika");

      System.out.println("5 dakikadan kısa aralıklar:");
      boolean bulundu = false;

      for (int i = 1; i < logs.size(); i++) {
         long fark = Duration.between(logs.get(i - 1).tarih, logs.get(i).tarih).toMinutes();

         if (fark < 5) {
            System.out.println("  " + logs.get(i - 1).tarih + " → " + logs.get(i).tarih + " (" + fark + " dk)");
            bulundu = true;
         }
      }

      if (!bulundu)
         System.out.println("  Yok.");
   }

   static void siniflandir(ArrayList<Log> logs) {
      DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
      boolean[] anomaliSaatler = new boolean[24];
      int anomaliSaatSayisi = 0;
      boolean anomaliVar = false;

      for (Log log1 : logs) {
         if (!log1.level.equals("ERROR"))
            continue;

         String dakika1 = log1.tarih.format(fmt);
         int count = 0;

         for (Log log2 : logs) {
            if (!log2.level.equals("ERROR")) {
               continue;
            }
            if (log2.tarih.format(fmt).equals(dakika1)) {
               count++;
            }
         }

         int saat = log1.tarih.getHour();
         if (count > 3 && !anomaliSaatler[saat]) {
            anomaliSaatler[saat] = true;
            anomaliSaatSayisi++;
            anomaliVar = true;
         }
      }

      if (!anomaliVar) {
         System.out.println("Sistem Durumu: Normal");
      } else if (anomaliSaatSayisi > 1) {
         System.out.println("Sistem Durumu: Kritik");
      } else {
         System.out.println("Sistem Durumu: Uyarı");
      }
   }

   static void uygulama5() {
      String dosyaYolu = "E:/dev/java/algoUygulamalar/uygulamafoy6/log.txt";

      ArrayList<Log> logs = dosyaOku(dosyaYolu);

      System.out.println("\nb) Log Sayıları");
      logSayisi(logs);

      System.out.println("\nc) Anomali Tespiti");
      anomaliTespit(logs);

      System.out.println("\nd) En Yoğun Saat");
      enYogunSaat(logs);

      System.out.println("\ne) Zaman Analizi");
      zamanAnalizi(logs);

      System.out.println("\nf) Sistem Sınıflandırma");
      siniflandir(logs);
   }

   public static void main(String[] args) {
      // uygulama1();
      uygulama5();
   }
}
