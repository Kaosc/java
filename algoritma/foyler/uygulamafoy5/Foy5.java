package algoritma.foyler.uygulamafoy5;

import java.util.Scanner;

public class Foy5 {
   public static Scanner scanner = new Scanner(System.in);

   // UYGULAMA-1 //

   static void topla(int num1, int num2) {
      System.out.println("Toplam: " + (num1 + num2));
   }

   static void cikar(int num1, int num2) {
      if (num1 >= num2) {
         System.out.println("Fark: " + (num1 - num2));
      } else {
         System.out.println("Fark: " + (num2 - num1));
      }
   }

   static void carp(int num1, int num2) {
      if (num1 == 0 && num2 == 0) {
         System.out.println("İki sayı da sıfır olamaz.");
      }

      System.out.println("Çarpım: " + (num1 * num2));
   }

   static void bol(int num1, int num2) {
      if (num2 == 0) {
         System.out.println("Bölen sıfır olamaz");
      } else {
         System.out.println("Bölüm: " + (num1 / num2));
      }
   }

   static void mod(int num1, int num2) {
      if (num2 == 0) {
         System.out.println("Bölen sıfır olamaz");
      } else {
         System.out.println("Mod: " + (num1 % num2));
      }
   }

   static void ortalama(int[] numbers) {
      int sum = 0;
      for (int n : numbers) {
         sum += n;
      }
      System.out.println("Ortalama: " + (double) sum / numbers.length);
   }

   static void uygulama1() {
      Scanner sc = new Scanner(System.in);

      while (true) {
         System.out.println("""
               Lütfen yapmak istediğiniz işlemi seçiniz:
               --------------------------------
               1. Toplama İşlemi
               2. Çıkarma İşlemi
               3. Çarpma İşlemi
               4. Bölme İşlemi
               5. Mod Alma İşlemi
               6. Ortalama İşlemi
               --------------------------------
               7. Çıkış
               """);
         System.out.print("> ");
         int op = 0;

         try {
            op = sc.nextInt();
         } catch (Exception e) {
            System.out.println("Lütfen tam sayı giriniz.");
            sc.next();
            continue;
         }

         if ((op < 1 || op > 7)) {
            System.out.println("Geçersiz işlem seçimi. Lütfen tekrar deneyiniz.");
            continue;
         }

         if (op == 7) {
            System.out.println("program  kapatılacak  emin  misiniz(E/H)?");
            String confirm = sc.next();
            if (confirm.equalsIgnoreCase("E")) {
               System.out.println("Program kapatılıyor...");
            } else {
               continue;
            }
            sc.close();
            return;
         }

         int n1 = 0, n2 = 0;

         if (op != 6) {
            System.out.print("Lütfen ilk tam sayıyı giriniz: ");
            n1 = sc.nextInt();
            System.out.print("Lütfen ikinci tam sayıyı giriniz: ");
            n2 = sc.nextInt();
         }

         switch (op) {
            case 1:
               topla(n1, n2);
               break;
            case 2:
               cikar(n1, n2);
               break;
            case 3:
               carp(n1, n2);
               break;
            case 4:
               bol(n1, n2);
               break;
            case 5:
               mod(n1, n2);
               break;
            case 6:
               System.out.print("Lütfen 10 adet sayıyı arada boşluk bırakarak giriniz: ");

               int[] numbers = new int[10];

               for (int i = 0; i < 10; i++) {
                  numbers[i] = sc.nextInt();
               }

               ortalama(numbers);
               break;
            default:
               return;
         }

      }
   }

   static String[] merge(String[] list1, String[] list2) {
      String[] mergedList = new String[list1.length + list2.length];
      int index = 0;

      for (String item1 : list1) {
         boolean found = false;
         for (String item2 : list2) {
            if (item1.equalsIgnoreCase(item2)) {
               found = true;
               break;
            }
         }
         if (!found) {
            mergedList[index++] = item1;
         }
      }

      for (String item2 : list2) {
         mergedList[index++] = item2;
      }

      String finalListStr = "";

      for (String string : mergedList) {
         if (string != null) {
            finalListStr += string + " ";
         }
      }

      return finalListStr.trim().split(" ");
   }

   static void uygulama2() {
      String[] l1 = { "milk", "Bread", "EGG", "butter", "sugar" };
      String[] l2 = { "milk", "bread", "egg", "butter", "sugar" };

      String[] ml = merge(l1, l2);

      System.out.println("\nShopping List: \n");
      for (String item : ml) {
         System.out.println(">> " + item);
      }
      System.out.println("");
   }

   static void durationCalc(double[] arr) {
      double sum = 0, avg = 0, max = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
         sum += arr[i];
      }

      System.out.println("Toplam izleme süresi: " + sum);
      System.out.println("Ortalama film süresi: " + avg);
      System.out.println("En uzun film süresi: " + max);
   }

   static void uygulama3() {
      Scanner sc = new Scanner(System.in);

      System.out.print("Film sürelerini arada boşluk olacak şekilde yazınız: ");
      String durationsStr = scanner.nextLine();
      String[] durationsStrList = durationsStr.split(" ");
      int listLen = durationsStrList.length;

      double[] durations = new double[listLen];

      for (int i = 0; i < durationsStrList.length; i++) {
         durations[i] = Double.parseDouble(durationsStrList[i]);
      }

      durationCalc(durations);

      sc.close();
   }

   void daire(double r) {
      System.out.println("Dairenin alanı: " + (Math.PI * r * r));
   }

   void kare(double a) {
      System.out.println("Karenin alanı: " + (a * a));
   }

   void dikdortgen(double a, double b) {
      System.out.println("Dikdörtgenin alanı: " + (a * b));
   }

   void yamuk(double a, double b, double h) {
      System.out.println("Yamuğun alanı: " + (((a + b) / 2) * h));
   }

   void cesitkenarUcgen(double a, double b, double c) {
      double s = (a + b + c) / 2;
      System.out.println("Çeşitkenar üçgenin alanı: " + (Math.sqrt(s * (s - a) * (s - b) * (s - c))));
   }

   void dikKenarUcgen(double a, double b) {
      System.out.println("Dik kenar üçgenin alanı: " + ((a * b) / 2));
   }

   void kup(double a) {
      System.out.println("Küpün alanı: " + (6 * a * a));
   }

   static void uygulama5() {
      Scanner sc = new Scanner(System.in);
      Foy5 m = new Foy5();

      System.out.print("""
            Lütfen alanını hesaplamak istediğiniz şekli seçiniz:
            --------------------------------
            1. Daire
            2. Kare
            3. Dikdörtgen
            4. Yamuk
            5. Çeşitkenar Üçgen
            6. Dik Kenar Üçgen
            7. Küp
            --------------------------------
            >
            """);

      int opt = sc.nextInt();

      switch (opt) {
         case 1:
            System.out.print("Yarıçapı giriniz: ");
            double r = sc.nextDouble();
            m.daire(r);
            break;
         case 2:
            System.out.print("Kenar uzunluğunu giriniz: ");
            double a = sc.nextDouble();
            m.kare(a);
            break;
         case 3:
            System.out.print("Kısa kenarı giriniz: ");
            double kisa = sc.nextDouble();
            System.out.print("Uzun kenarı giriniz: ");
            double uzun = sc.nextDouble();
            m.dikdortgen(kisa, uzun);
            break;
         case 4:
            System.out.print("Alt taban uzunluğunu giriniz: ");
            double altTaban = sc.nextDouble();
            System.out.print("Üst taban uzunluğunu giriniz: ");
            double ustTaban = sc.nextDouble();
            System.out.print("Yüksekliği giriniz: ");
            double h = sc.nextDouble();
            m.yamuk(altTaban, ustTaban, h);
            break;
         case 5:
            System.out.print("Birinci kenar uzunluğunu giriniz: ");
            double kenar1 = sc.nextDouble();
            System.out.print("İkinci kenar uzunluğunu giriniz: ");
            double kenar2 = sc.nextDouble();
            System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
            double kenar3 = sc.nextDouble();
            m.cesitkenarUcgen(kenar1, kenar2, kenar3);
            break;
         case 6:
            System.out.print("Dik kenarlardan birinin uzunluğunu giriniz: ");
            double dikKenar1 = sc.nextDouble();
            System.out.print("Diğer dik kenarın uzunluğunu giriniz: ");
            double dikKenar2 = sc.nextDouble();
            m.dikKenarUcgen(dikKenar1, dikKenar2);
            break;
         case 7:
            System.out.print("Kenar uzunluğunu giriniz: ");
            double kupKenar = sc.nextDouble();
            m.kup(kupKenar);
            break;
         default:
            System.out.println("Geçersiz işlem seçimi. Lütfen tekrar deneyiniz.");
            break;
      }
      sc.close();
   }

   public static void main(String[] args) {
      // uygulama1();
      // uygulama2();
      // uygulama3();
      // uygulama4();
      uygulama5();
   }
}
