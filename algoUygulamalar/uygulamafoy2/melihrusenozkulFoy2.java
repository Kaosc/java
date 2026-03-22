package algoUygulamalar.uygulamafoy2;

import java.util.HashMap;
import java.util.Scanner;

public class melihrusenozkulFoy2 {
   static Scanner scanner = new Scanner(System.in);

   static void print(String arg) {
      System.out.print(arg);
   }

   static void println(String arg) {
      System.out.println(arg);
   }

   static void uygulama1() {

      print("Toplam kategori sayısı: ");
      int categoryCount = scanner.nextInt();
      String[] categories = new String[categoryCount];

      int no = 0;
      while (no < categories.length) {
         print(no + 1 + ". kategori: ");
         categories[no] = scanner.next();
         no++;
      }

      print("Oluşturulan kategoriler: ");
      for (String c : categories) {
         print(c + " ");
      }
   }

   static void uygulama2() {
      int[] numbers = new int[10];

      int threeCount = 0;
      for (int i = 0; i < numbers.length; i++) {
         print((i + 1) + ". sayı: ");
         int num = scanner.nextInt();
         numbers[i] = num;

         if (num == 3) {
            ++threeCount;
         }
      }

      print("Toplam üç sayısı" + threeCount);
   }

   static void uygulama3() {
      int[] nums = { 12, 4, 6, 8, 10 };

      int sum = 0;
      for (int i : nums) {
         if (i % 2 == 0) {
            sum += i;
         }
      }

      print("Çift sayılar toplamı: " + sum);
   }

   static void uygulama4() {
      int[] nums = { 10, 20, 30, 40 };
      int[] mulipliedNums = new int[4];

      print("Sayılar: ");
      for (int i = 0; i < nums.length; i++) {
         print(nums[i] + " ");
         mulipliedNums[i] = nums[i] * 2;
      }

      print("\n2x sayılar: ");
      for (int i : mulipliedNums) {
         print(i + " ");
      }
   }

   static void uygulama5() {
      char[] chars = new char[8];

      for (int i = 0; i < chars.length; i++) {
         print("Bir harf giriniz: ");
         String input = scanner.next();
         String reversed;

         if (input == input.toLowerCase()) {
            reversed = input.toUpperCase();
         } else {
            reversed = input.toLowerCase();
         }

         chars[i] = reversed.charAt(0);
      }

      for (char c : chars) {
         print(c + " ");
      }
   }

   static void uygulama6() {
      int[] ciros = { 3200, 2400, 7500, 4000, 5000, 1500, 2000, };
      String[] days = { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };

      int maxDayIndex = 0;
      int ciroSum = 0;

      for (int i = 0; i < days.length; i++) {
         ciroSum += ciros[i];

         if (ciros[i] > ciros[maxDayIndex]) {
            maxDayIndex = i;
         }
      }

      print("En çok ciro yapılan gün: " + days[maxDayIndex]);
      print("\nToplam haftalık ciro: " + ciroSum);
      print("\nGünlük ortalama ciro: " + ciroSum / ciros.length);

   }

   static void uygulama7() {
      String[] plates = { "44 AF 123", "34 AB 456", "06 AC 789", "23 AD 321", "01 BE 654", "55 BF 987", "34 BG 654",
            "44 CH 321", "06 CI 789", "23 CJ 456" };

      int elazigCount = 0;
      HashMap<Character, Integer> letterCounts = new HashMap<>();

      for (int i = 0; i < plates.length; i++) {
         String[] splitted = plates[i].split(" ");

         if (splitted[0].equals("23")) {
            ++elazigCount;
         }

         char c = splitted[1].charAt(0);
         if (letterCounts.containsKey(c)) {
            letterCounts.put(c, letterCounts.get(c) + 1);
         } else {
            letterCounts.put(c, 1);
         }
      }

      print("Plakası 23 ile başlayan araç sayısı: " + elazigCount);
      for (Character c : letterCounts.keySet()) {
         print("\nPlaka sonrasında " + c + " harfiyle başlayan araç sayısı: " + letterCounts.get(c));
      }
   }

   static void uygulama8() {
      // Uygulama 7 ile aynı
   }

   static void uygulama9() {
      String siir = "Dalgalandığın yerde ne korku, ne keder... Gölgende bana da, bana da yer ver. Sabah olmasın, günler doğmasın ne çıkar: Yurda ay yıldızının ışığı yeter.";

      int neCount = 0;
      String[] words = siir.split(" ");

      for (int i = 0; i < words.length; i++) {
         words[i] = words[i].replaceAll("[.:,]", "");

         if (words[i].equals("ne")) {
            ++neCount;
         }
      }

      print("Toplam 'ne' kelime sayısı: " + neCount);
   }

   static void uygulama10() {
      int[] parkingSpots = new int[50];
      int emptyCount = 0;

      // Diziyi rastgele 0 ve 1 ile doldur
      for (int i = 0; i < parkingSpots.length; i++) {
         parkingSpots[i] = Math.random() < 0.5 ? 0 : 1;
      }

      // Toplam boş park yeri sayısını hesaplayınız.
      for (int i : parkingSpots) {
         if (i == 0) {
            ++emptyCount;
         }
      }
      print("Toplam boş park sayısı: " + emptyCount);

      // İlk boş park yerinin indeksini bulunuz.
      for (int i = 0; i < parkingSpots.length; i++) {
         if (parkingSpots[i] == 0) {
            print("\nİlk boş park yeri indeksi: " + i);
            break;
         }
      }

      // Yan yana en fazla kaç boş park yeri olduğunu tespit ediniz.
      int maxEmptySpot = 0;
      int currentEmptySpotCount = 0;

      for (int i = 0; i < parkingSpots.length; i++) {
         if (parkingSpots[i] == 0) {
            ++currentEmptySpotCount;
         } else if (parkingSpots[i] == 1) {
            maxEmptySpot = Math.max(maxEmptySpot, currentEmptySpotCount);
            currentEmptySpotCount = 0;
         }
      }

      print("\nYan yana en fazla boş park yeri sayısı: " + maxEmptySpot);

      // En az 3 araçlık yan yana boş alan var mı kontrol ediniz.
      String msg = "\nEn az 3 araçlık yan yana boş yer ";
      if (maxEmptySpot >= 3) {
         print(msg + "var");
      } else {
         print(msg + "yok");
      }

      // Otoparkın doluluk oranını yüzde (%) olarak hesaplayınız.
      double ratio = (double) (parkingSpots.length - emptyCount) / parkingSpots.length;
      int rate = (int) (ratio * 100);
      print("\nOtopark doluluk oranı: %" + rate);
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
