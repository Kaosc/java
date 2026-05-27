package oop.foyler.foy1;

public class Foy1 {

   static int usAl(int num, int power) {
      if (power == 0) {
         return 1;
      } else {
         return num * usAl(num, --power);
      }
   }

   static int sepetTutari(int[] fiyatlar, int i, int sum) {
      if (i == fiyatlar.length - 1) {
         return sum + fiyatlar[i];
      } else {
         return sepetTutari(fiyatlar, i + 1, sum + fiyatlar[i]);
      }
   }

   // TODO: ??
   static void permutasyon(String remaining, String current) {
      if (remaining.length() == 0) {
         System.out.println("Permüstasyon: " + current);
         return;
      }

      for (int i = 0; i < remaining.length(); i++) {

         String nextremaining = remaining.substring(0, i) + remaining.substring(i + 1);
         String nextcurrent = current + remaining.charAt(i);

         permutasyon(nextremaining, nextcurrent);
      }
   }

   static int basamakTopla(int num, int sum) {
      if (num == 0) {
         return sum;
      }

      return basamakTopla(num / 10, sum + num % 10);
   }

   static int tersCevir(int num, double rev) {
      if (num == 0) {
         return (int) rev;
      }

      return tersCevir(num / 10, (rev * 10 + num % 10));
   }

   public static void main(String[] args) {
      System.out.println("8'2: " + usAl(8, 2));
      System.out.println("Sepet tutarı: " + sepetTutari(new int[] { 43, 53, 32 }, 0, 0));
      permutasyon("ABC", "");
      System.out.println("Basamak toplamı: " + basamakTopla(232324, 0));
      System.out.println("Ters çevrilmiş sayı: " + tersCevir(12345, 0));
   }
}
