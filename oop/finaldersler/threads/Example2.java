package oop.finaldersler.threads;

class GeriSayimThread extends Thread {
   private String threadName;
   private int startIndex;

   public GeriSayimThread(String threadName, int startIndex) {
      this.threadName = threadName;
      this.startIndex = startIndex;
   }

   @Override
   public void run() {
      System.err.println(threadName + ": count down starting...");

      for (int i = startIndex; i > 0; i--) {
         try {
            System.out.println(threadName + " " + i);
            Thread.sleep(300);
         } catch (Exception e) {
            System.err.println(e);
         }
      }
   }
}

public class Example2 {
   public static void main(String[] args) {
      GeriSayimThread t1 = new GeriSayimThread("Thread-1", 5);
      GeriSayimThread t2 = new GeriSayimThread("Thread-2", 10);

      t1.start();
      t2.start();
   }
}
