package oop.finaldersler.threads;

class GunSonuGorevi implements Runnable {
   private String subeAdi;

   public GunSonuGorevi(String subeAdi) {
      this.subeAdi = subeAdi;
   }

   public void run() {
      System.out.println(">> " + subeAdi + " işlemi başladı.");

      for (int i = 1; i < 4; i++) {
         try {
            System.out.println(i + ". işlem yapılıyor");
            Thread.sleep(500);
         } catch (Exception e) {
            System.err.println(e);
         }
      }
   }
}

public class Example1 {
   public static void main(String[] args) {
      GunSonuGorevi g1 = new GunSonuGorevi("1. şube");
      GunSonuGorevi g2 = new GunSonuGorevi("2. şube");

      Thread t1 = new Thread(g1);
      Thread t2 = new Thread(g2);

      try {
         t1.start();
         t1.join();

         t2.start();
         t2.join();
      } catch (InterruptedException e) {
         System.err.println(e);
      }

   }
}