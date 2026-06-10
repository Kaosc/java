package oop.threads;

// Threads are bassically independent paths of execution in a program. They allow you to perform multiple tasks concurrently, which can improve the performance of your application, especially when dealing with I/O operations or long-running tasks.

// Runnable's are the tasks that we want to run in separate threads. They are defined by implementing the Runnable interface, which requires us to implement the run() method. This method contains the code that will be executed when the thread is started.

// Thread is the actual thread of execution. We can create a Thread object by passing a Runnable object to its constructor. Once we have a Thread object, we can start it using the start() method, which will call the run() method of the Runnable in a new thread of execution.

// So like basic flow is;
// 1. Create a Runnable object that defines the task to be performed.
// 2. Create a Thread object and pass the Runnable object to its constructor.
// 3. Start the thread using the start() method, which will execute the run() method of the Runnable in a new thread of execution.

// Note: We can also use static class called sleep() method like Thread.sleep(milliseconds) to pause the execution of a thread for a specified amount of time. This can be useful for simulating delays or waiting for certain conditions to be met before proceeding with the execution of the thread. The method can be called from within the run() method of a Runnable, from any thread, or even from anywhere of the program. However, it is important to handle the InterruptedException that may be thrown when a thread is interrupted while sleeping.

class TekSayiYazdirici implements Runnable {
    private String threadAdi;

    public TekSayiYazdirici(String threadAdi) {
        this.threadAdi = threadAdi;
    }

    @Override
    public void run() {
        System.out.println("--- " + threadAdi + " Basladi ---");
        for (int i = 1; i < 20; i += 2) {
            System.out.println(threadAdi + ": " + i);

            // Must be in a try-catch block because sleep() can throw InterruptedException
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(threadAdi + " interrupted: " + e.getMessage());
            }
        }
        System.out.println("--- " + threadAdi + " Bitti ---\n");
    }
}

public class Threads {
    public static void main(String[] args) {
        TekSayiYazdirici gorev1 = new TekSayiYazdirici("Thread 1");
        TekSayiYazdirici gorev2 = new TekSayiYazdirici("Thread 2");
        TekSayiYazdirici gorev3 = new TekSayiYazdirici("Thread 3");

        Thread t1 = new Thread(gorev1);
        Thread t2 = new Thread(gorev2);
        Thread t3 = new Thread(gorev3);

        try {
            t1.start(); // Start the first thread
            t1.join(); // Wait for the first thread to finish before starting the second thread

            t2.start();
            t2.join();

            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("All threads have finished execution.");
    }
}
