package algoUygulamalar.uygulamafoy6;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class melihrusenozkulFoy6 {
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
         System.out.printf("%d. ürünün yeni fiyatı: %.2f\n", (i + 1), fiyatlar[i]);
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

   // UYGULAMA 5 //

   // a) Log kayıtlarını parse et
   static String[][] bolumlendir(String[] logs) {
      String[][] result = new String[logs.length][3];
      for (int i = 0; i < logs.length; i++) {
         String[] parts = logs[i].split("\\|");
         result[i][0] = parts[0]; // tarih
         result[i][1] = parts[1]; // level
         result[i][2] = parts[2]; // mesaj
      }
      return result;
   }

   // b) INFO, WARN, ERROR say
   static void logSayisi(String[][] logs) {
      int info = 0, warn = 0, error = 0;
      for (String[] log : logs) {
         switch (log[1]) {
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
      System.out.println("INFO: " + info + " WARN: " + warn + " ERROR: " + error);
   }

   // c) Aynı dakikada 3+ ERROR → anomali
   static void anomaliTespit(String[][] logs) {
      DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");

      for (int i = 0; i < logs.length; i++) {
         if (!logs[i][1].equals("ERROR"))
            continue;

         // bu log'un dakikasını al
         LocalDateTime dt1 = LocalDateTime.parse(logs[i][0]);
         String dakika1 = dt1.format(fmt);

         int count = 0;
         for (int j = 0; j < logs.length; j++) {
            if (!logs[j][1].equals("ERROR"))
               continue;
            LocalDateTime dt2 = LocalDateTime.parse(logs[j][0]);
            if (dt2.format(fmt).equals(dakika1))
               count++;
         }

         if (count > 3) {
            System.out.println("ANOMALİ: " + dakika1 + " dakikasında " + count + " ERROR!");
         }
      }
   }

   // d) En fazla ERROR olan saat
   static void enYogunSaat(String[][] logs) {
      int[] saatler = new int[24];

      for (String[] log : logs) {
         if (!log[1].equals("ERROR"))
            continue;
         LocalDateTime dt = LocalDateTime.parse(log[0]);
         saatler[dt.getHour()]++;
      }

      int maxSaat = 0;
      for (int i = 1; i < 24; i++) {
         if (saatler[i] > saatler[maxSaat])
            maxSaat = i;
      }

      System.out.println("En yoğun saat: " + maxSaat + ":00 → " + saatler[maxSaat] + " ERROR");
   }

   // e) İlk-son arası süre ve 5 dakikadan kısa aralıklar
   static void zamanAnalizi(String[][] logs) {
      LocalDateTime ilk = LocalDateTime.parse(logs[0][0]);
      LocalDateTime son = LocalDateTime.parse(logs[logs.length - 1][0]);

      long dakika = Duration.between(ilk, son).toMinutes();
      System.out.println("Toplam süre: " + dakika + " dakika");

      // 5 dakikadan kısa aralıklar
      for (int i = 1; i < logs.length; i++) {
         LocalDateTime t1 = LocalDateTime.parse(logs[i - 1][0]);
         LocalDateTime t2 = LocalDateTime.parse(logs[i][0]);
         long fark = Duration.between(t1, t2).toMinutes();
         if (fark < 5) {
            System.out.println("Kısa aralık: " + logs[i - 1][0] + " → " + logs[i][0] + " (" + fark + " dk)");
         }
      }
   }

   // f) Sistem sınıflandırma
   static void siniflandir(String[][] logs) {
      DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");

      int anomaliSayisi = 0;
      int anomaliSaatSayisi = 0;
      boolean[] anomaliSaatler = new boolean[24];

      for (int i = 0; i < logs.length; i++) {
         if (!logs[i][1].equals("ERROR"))
            continue;

         LocalDateTime dt1 = LocalDateTime.parse(logs[i][0]);
         String dakika1 = dt1.format(fmt);
         int count = 0;

         for (int j = 0; j < logs.length; j++) {
            if (!logs[j][1].equals("ERROR"))
               continue;
            LocalDateTime dt2 = LocalDateTime.parse(logs[j][0]);
            if (dt2.format(fmt).equals(dakika1))
               count++;
         }

         if (count > 3 && !anomaliSaatler[dt1.getHour()]) {
            anomaliSayisi++;
            anomaliSaatler[dt1.getHour()] = true;
            anomaliSaatSayisi++;
         }
      }

      if (anomaliSayisi == 0) {
         System.out.println("Sistem Durumu: Normal ✅");
      } else if (anomaliSaatSayisi > 1) {
         System.out.println("Sistem Durumu: Kritik 🔴");
      }
   }

   static void uygulama5() {
      Scanner sc = new Scanner(System.in);
      String[] logs = new String[20];

      System.out.println("20 log kaydı girin:");
      for (int i = 0; i < 20; i++) {
         logs[i] = sc.nextLine();
      }
      sc.close();

      String[][] parsed = bolumlendir(logs);

      System.out.println("\n--- b) Log Sayıları ---");
      logSayisi(parsed);

      System.out.println("\n--- c) Anomali Tespiti ---");
      anomaliTespit(parsed);

      System.out.println("\n--- d) En Yoğun Saat ---");
      enYogunSaat(parsed);

      System.out.println("\n--- e) Zaman Analizi ---");
      zamanAnalizi(parsed);

      System.out.println("\n--- f) Sistem Sınıflandırma ---");
      siniflandir(parsed);
   }

   public static void main(String[] args) {
      // uygulama1();
      uygulama5();
   }
}
