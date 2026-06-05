package oop.finaldersler.threads;

class TicketPool {
   private int totalTickets = 5;

   public synchronized void sellTicket(String customerName) {
      if (totalTickets > 0) {
         --totalTickets;
         System.out.println(customerName + " bought an ticket. Ticket left: " + totalTickets);
      } else {
         System.out.println("No ticket left");
      }
   }

   public int getTotalTickets() {
      return totalTickets;
   }
}

class BuyTicketTask implements Runnable {
   private TicketPool ticketPool;
   private String customerName;

   public BuyTicketTask(TicketPool ticketPool, String customerName) {
      this.ticketPool = ticketPool;
      this.customerName = customerName;
   }

   public void run() {
      ticketPool.sellTicket(customerName);
   }
}

public class Example3 {
   public static void main(String[] args) {
      TicketPool ticketPool = new TicketPool();
      System.err.println(ticketPool.getTotalTickets() + " ticket available to sell.");

      BuyTicketTask g1 = new BuyTicketTask(ticketPool, "Kaosc");
      BuyTicketTask g2 = new BuyTicketTask(ticketPool, "Hyle");
      BuyTicketTask g3 = new BuyTicketTask(ticketPool, "Morph");
      BuyTicketTask g4 = new BuyTicketTask(ticketPool, "Soap");
      BuyTicketTask g5 = new BuyTicketTask(ticketPool, "Scream");
      BuyTicketTask g6 = new BuyTicketTask(ticketPool, "Guardian");

      Thread t1 = new Thread(g1);
      Thread t2 = new Thread(g2);
      Thread t3 = new Thread(g3);
      Thread t4 = new Thread(g4);
      Thread t5 = new Thread(g5);
      Thread t6 = new Thread(g6);

      // Will start at the same time but because of the synchronized key we
      // implemented to TicketPool.sellTicket() method, it will not allow the
      // thread to access the TicketPool class and execute the sellTicket method.
      // It'll have to await for the previous process to end.
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();
      t6.start();
   }
}