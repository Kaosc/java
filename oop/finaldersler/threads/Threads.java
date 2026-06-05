package oop.finaldersler.threads;

// Runnable arayüzünü uygulayan sınıfımız
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
        }
        System.out.println("--- " + threadAdi + " Bitti ---\n");
    }
}

public class Threads {
    public static void main(String[] args) {
        // Görevlerin (Runnable) oluşturulması
        TekSayiYazdirici gorev1 = new TekSayiYazdirici("Thread 1");
        TekSayiYazdirici gorev2 = new TekSayiYazdirici("Thread 2");
        TekSayiYazdirici gorev3 = new TekSayiYazdirici("Thread 3");

        // Thread nesnelerinin oluşturulması
        Thread t1 = new Thread(gorev1);
        Thread t2 = new Thread(gorev2);
        Thread t3 = new Thread(gorev3);

        try {
            // Önce ilk thread çalışır ve bitmesi beklenir
            t1.start();
            t1.join(); // t1 bitene kadar ana programı (main) bekletir

            // Sonra ikinci thread çalışır ve bitmesi beklenir
            t2.start();
            t2.join(); // t2 bitene kadar bekler

            // En son üçüncü thread çalışır ve bitmesi beklenir
            t3.start();
            t3.join(); // t3 bitene kadar bekler

        } catch (InterruptedException e) {
            System.out.println("Thread kesintiye ugradi: " + e.getMessage());
        }

        System.out.println("Tum thread'ler sirayla calismasini tamamladi.");
    }
}
