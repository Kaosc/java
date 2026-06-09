package algoritma;

import java.util.Scanner;

class Prac14 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] seats = new int[n][n];

      while (true) {
         System.out.println("Tiyatro Rezervasyon Sistemi");
         System.out.println("1. Rezervasyonu Yap");
         System.out.println("2. Rezervasyonu İptal Et");
         int choice = sc.nextInt();

         if (choice == 1) {
            System.out.print("Satır numarası: ");
            int row = sc.nextInt();
            System.out.print("Sütun numarası: ");
            int col = sc.nextInt();

            if (seats[row][col] == 0) {
               seats[row][col] = 1;
               System.out.println("Rezervasyon yapıldı.");
            } else {
               System.out.println("Bu koltuk zaten dolu, lütfen başka bir koltuk seçin.");
            }
         } else if (choice == 2) {
            System.out.print("Satır numarası: ");
            int row = sc.nextInt();
            System.out.print("Sütun numarası: ");
            int col = sc.nextInt();

            if (seats[row][col] == 1) {
               seats[row][col] = 0;
               System.out.println("Rezervasyon iptal edildi.");
            } else {
               System.out.println("Bu koltuk zaten boş, lütfen başka bir koltuk seçin.");
            }
         } else {
            System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
         }
      }
   }
}

class Prac13 {
   public static void main(String[] args) {
      int[] arr = new int[5];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = (int) (Math.random() * 101);
      }

      for (int num : arr) {
         System.out.print(num + " ");
      }
   }
}

class Prac12 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int pay = sc.nextInt();
      int payda = sc.nextInt();
      int n = sc.nextInt();

      int i = 0;
      while (i < n) {
         System.out.print(pay + "/" + payda + " ");
         pay *= 2;
         payda += 3;
         i++;
      }

      sc.close();
   }
}

class Prac11 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] arr = new int[n][n];

      // Diziye değerleri doldur
      for (int i = 0; i < n; i++) {
         System.out.println(i);
         for (int j = 0; j < n - i; j++) {
            arr[i][j] = j + 1;
         }
      }

      // Diziyi ekrana yazdır
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n - i; j++) {
            System.out.print(arr[i][j] + "- ");
         }
         System.out.println();
      }

      sc.close();
   }
}

public class Prac {

}
