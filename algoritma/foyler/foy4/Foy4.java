package algoritma.foyler.foy4;

import java.util.Scanner;

@SuppressWarnings("unused")

public class Foy4 {
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
         System.out.printf(i + 1 + ". Servis" + " doluluk oranı:" + doluYatakOrani + "%%\\n");

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
      String[] metin1 = { "Ben", "ezelden", "beridir", "hür", "yaşadım,", "hür", "yaşarım" };
      String[] metin2 = { "Hakkıdır,", "hür", "yaşamış", "bayrağımın", "hürriyet" };

      int ortakKelimeSayisi = 0;

      for (int i = 0; i < metin1.length; i++) {
         for (int j = 0; j < metin2.length; j++) {
            if (metin1[i].equals(metin2[j])) {
               ortakKelimeSayisi++;
               System.out.println("Ortak kelime: " + metin1[i]);
               System.out.println("Metin 1'deki index: " + i);
               System.out.println("Metin 2'deki index: " + j);
            }
         }
      }

      System.out.println("Toplam ortak kelime sayısı: " + ortakKelimeSayisi);
   }

   static void uygulama8() {
      String[][] menu = {
            { "15.06.1915", "Üzüm Hoşafı", "Yok", "Üzüm Hoşafı" },
            { "16.06.1915", "Yok", "Yok", "Yağlı Buğday Çorbası" },
            { "18.07.1915", "Üzüm Hoşafı", "Yok", "Yok" },
            { "21.07.1915", "Yarım Ekmek", "Yok", "Şekersiz Üzüm Hoşafı" }
      };

      int yokSayisi = 0;
      int uzumHosafiSayisi = 0;
      boolean yemeksizGun = false;

      for (String[] gun : menu) {
         int gunYokSayisi = 0;

         for (int i = 1; i < gun.length; i++) {
            if (gun[i].equals("Yok")) {
               yokSayisi++;
               gunYokSayisi++;
            }

            if (gun[i].equals("Üzüm Hoşafı")) {
               uzumHosafiSayisi++;
            }
         }

         if (gunYokSayisi == 3) {
            yemeksizGun = true;
         }
      }

      System.out.println("Toplam yok sayısı: " + yokSayisi);
      System.out.println("Toplam üzüm hoşafı sayısı: " + uzumHosafiSayisi);
      System.out.println("Yemeksiz Gün Sayısı: " + (yemeksizGun ? "Evet" : "Hayır"));

      System.out.println("Akşam yemeği verilen günler ve yemek isimleri:");
      for (String[] gun : menu) {
         if (!gun[3].equals("Yok")) {
            System.out.println(gun[0] + ": " + gun[3]);
         }
      }
   }

   static void uygulama9(char[][] dizi) {

      int toplam = 0;

      for (char[] satir : dizi) {
         for (char c : satir) {
            if (!Character.isLetterOrDigit(c)) {
               toplam++;
            }
         }
      }

      System.out.println("Harf ve sayısal karakterler dışındaki toplam karakter sayısı: " + toplam);
   }

   static void uygulama10() {
      String[] dizi1 = { "İstiklal Marşı", "Çanakkale Şehitlerine", "Dur Yolcu", "Mehmetçik" };
      String[] dizi2 = { "Çanakkale Şehitlerine", "Gençliğe Hitabe", "İstiklal Marşı" };

      String[] merged = new String[dizi1.length + dizi2.length];
      int index = 0;

      for (String siir : dizi1) {
         merged[index] = siir;
         index++;
      }

      for (String siir : dizi2) {
         boolean found = false;

         for (String i : merged) {
            if (siir.equals(i)) {
               found = true;
            }
         }

         if (!found) {
            merged[index] = siir;
            index++;
         }
      }

      System.out.println("Oluşacak Dizi:");
      for (int i = 0; i < index; i++) {
         System.out.print(merged[i] + " ");
      }
   }

   static void uygulama11() {
      int[] sekil1 = { 5, 4, 3, 2, 1 };
      int[] sekil2 = { 5, 3, 1, 3, 5 };
      int[] sekil3 = { 1, 3, 5, 3, 1 };

      int maxLen = 5;

      System.out.println("1");
      for (int yildiz : sekil1) {
         for (int i = 0; i < yildiz; i++) {
            System.out.print("*");
         }

         System.out.println();
      }

      System.out.println("2");
      for (int yildiz : sekil2) {
         int bosluk = (maxLen - yildiz) / 2;

         for (int i = 0; i < bosluk; i++) {
            System.out.print(" ");
         }

         for (int i = 0; i < yildiz; i++) {
            System.out.print("*");
         }

         System.out.println();
      }

      System.out.println("3");
      for (int yildiz : sekil3) {
         int bosluk = (maxLen - yildiz) / 2;

         for (int i = 0; i < bosluk; i++) {
            System.out.print(" ");
         }

         for (int i = 0; i < yildiz; i++) {
            System.out.print("*");
         }

         System.out.println();
      }
   }

   static void uygulama12() {
      int[][] pascal = new int[7][7];

      for (int i = 0; i < pascal.length; i++) {
         for (int j = 0; j <= i; j++) {
            if (j == 0 || j == i) {
               pascal[i][j] = 1;
            } else {
               pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
         }
      }

      System.out.println("Pascal Üçgeni:");
      for (int i = 0; i < pascal.length; i++) {
         for (int j = 0; j <= i; j++) {
            System.out.print(pascal[i][j] + " ");
         }
         System.out.println();
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
      // uygulama9(new char[][] { { 'A', 'B', 'C', '!', '@' }, { '1', '2', '3', '#',
      // '$' } });
      // uygulama10();
      // uygulama11();
      // uygulama12();
   }
}