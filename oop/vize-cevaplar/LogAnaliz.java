// 2. Bir şirketin web sunucusu her gün milyonlarca satır log üretmektedir. Bu loglar sistemdeki hataları izlemek
// ve hangi kullanıcıların en çok sorun yaşadığını tespit etmek amacıyla analiz edilmek istenmektedir. Log
// dosyası aşağıdaki formatta satırlardan oluşmaktadır

// Tarih Saat LogTur İşlemTuru Kullanıcı
// 2024-01-15 08:14:23 INFO Kullanici girisi basarili user=17
// 2024-01-15 09:32:01 ERROR NullPointerException user=42
// 2024-01-15 09:45:17 ERROR ArrayIndexOutOfBoundsException user=42
// 2024-01-15 11:20:55 WARN Yavas sorgu tespit edildi user=7
// 2024-01-15 11:58:44 ERROR SocketTimeoutException user=17

// Buna göre log.txt dosyasına göre aşağıdaki metotları içeren java sınıfının kodlarını yazınız. (30P)
// En çok hata yapan kullanıcıyı ekrana yazdıran metot
// (Verilen örnek görüntüyü dikkate alırsak ekrana çıktı olarak user42 yazmalıdır.)
// Başlangıç ve bitiş saatini parametre alarak bu aralıkta sunucuya kaç istek yapıldığını ekrana yazdıran metot
// (Verilen örnek görüntüyü dikkate alırsak başlangıç saati 08:00:00, bitiş 10:00:00 ise ekrana çıktı olarak 3
// yazmalıdır.) 

import java.io.*;

public class LogAnaliz {

   // Finds the user with the most errors
   static void enCokHata() throws Exception {
      BufferedReader br = new BufferedReader(new FileReader("log.txt"));
      String satir;

      // Assuming a maximum of 100 users (indexed 0-99)
      int[] say = new int[100];

      while ((satir = br.readLine()) != null) {
         // Splitting the line by one or more whitespace characters
         String[] p = satir.split("\\s+");

         if (p[2].equals("ERROR")) {
            // Extracting user ID from the last element (e.g., "user=42")
            int id = Integer.parseInt(p[p.length - 1].split("=")[1]);
            say[id]++;
         }
      }

      int max = 0, user = 0;

      for (int i = 0; i < say.length; i++) {
         if (say[i] > max) {
            max = say[i];
            user = i;
         }
      }

      System.out.println("user" + user);
      br.close();
   }

   // Counts the number of requests between two given time strings (HH:MM:SS)
   static void istekSay(String bas, String bit) throws Exception {
      BufferedReader br = new BufferedReader(new FileReader("log.txt"));
      String satir;

      int say = 0;

      while ((satir = br.readLine()) != null) {
         // Splitting the line by one or more whitespace characters
         String[] p = satir.split("\\s+");

         // The time stamp is expected to be in the second position (p[1])
         String saat = p[1];

         // Time comparison: Check if current time >= start time AND current time <= end
         // time
         if (saat.compareTo(bas) >= 0 && saat.compareTo(bit) <= 0) {
            say++;
         }
      }
      br.close();
      System.out.println(say);
   }

   public static void main(String[] args) throws Exception {
      enCokHata(); // Calls the function to find max errors
      istekSay("08:00:00", "10:00:00"); // Calls the function to count requests in time range
   }
}
