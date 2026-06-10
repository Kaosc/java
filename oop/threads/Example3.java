package oop.threads;

// synchronized keyword is used to control access to a particular resource by multiple threads. When a method or block of code is marked as synchronized, only one thread can access it at a time. This is particularly useful when you have shared resources (class) that multiple threads need to access, such as a shared counter, a shared list, or in this case, a shared pool of tickets.


// Define a class that represents a pool of tickets. This class will have a method to sell tickets, and we will use the synchronized keyword to ensure that only one thread can sell a ticket at a time.
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

// Define the task that will be executed by each thread. This task will try to buy a ticket from the TicketPool. This is a task that will be executed by multiple threads concurrently, and it will access the shared resource (TicketPool) to sell tickets.
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

      // Define tasks that will try to access the shared resource (TicketPool)
      // concurrently
      BuyTicketTask g1 = new BuyTicketTask(ticketPool, "Kaosc");
      BuyTicketTask g2 = new BuyTicketTask(ticketPool, "Hyle");
      BuyTicketTask g3 = new BuyTicketTask(ticketPool, "Morph");
      BuyTicketTask g4 = new BuyTicketTask(ticketPool, "Soap");
      BuyTicketTask g5 = new BuyTicketTask(ticketPool, "Scream");
      BuyTicketTask g6 = new BuyTicketTask(ticketPool, "Guardian");

      // Create threads for each task
      Thread t1 = new Thread(g1);
      Thread t2 = new Thread(g2);
      Thread t3 = new Thread(g3);
      Thread t4 = new Thread(g4);
      Thread t5 = new Thread(g5);
      Thread t6 = new Thread(g6);

      // So tecnically, all threads will start at the same time and try to access the
      // shared resource (TicketPool) concurrently. So you might think that the output
      // will be random and some threads might not get a chance to buy a ticket
      // because of the race condition. However, because we have implemented the
      // synchronized keyword in the sellTicket() method of the TicketPool class, it
      // will not allow multiple threads to access the method at the same time. Only
      // one thread can access the method at a time, and the others will have to WAIT
      // until the current thread finishes its execution. This means that even though
      // all threads start at the same time, they will access the sellTicket() method
      // one by one in a sequential manner, ensuring that each thread gets a chance to
      // buy a ticket until there are no tickets left.

      // Will start at the same time but because of the synchronized key we
      // implemented to TicketPool.sellTicket() method, it will not allow the thread
      // to access the TicketPool class and execute the sellTicket method. It'll have
      // to await for the previous process to end. It's like a queue. So the output
      // will be in order of the threads we started.
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();
      t6.start();
   }
}