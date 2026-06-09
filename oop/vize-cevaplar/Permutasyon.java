// 1. String olarak verilen bir sayının rakamlarından tekrar kullanmadan üretilebilecek tüm 3 basamaklı
// permütasyonları rekürsif metot ile bulan programın java kodunu yazınız.
// Örnek: Girilen değer “123” ise çıktı 132, 123, 213, 231, 312, 321 olmalıdır. (20P)

public class Permutasyon {
   public static void permutasyon(String girilen, String olusan) {
      // Base case: If the length of 'olusan' reaches 3, print and return.
      if (olusan.length() == 3) {
         System.out.println(olusan);
         return;
      }

      for (int i = 0; i < girilen.length(); i++) {
         char secilen = girilen.charAt(i);

         // Check if the character has not already been used in 'olusan'
         if (olusan.indexOf(secilen) == -1) {
            permutasyon(girilen, olusan + secilen);
         }
      }
   }

   public static void main(String[] args) {
      String sayi = "123";
      permutasyon(sayi, "");
   }
}
