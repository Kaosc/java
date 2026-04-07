package oop.vize.soru1;

import java.io.File;
import java.util.Scanner;

class Soru {

    public static void main(String[] args) {
        File file = new File("e:/dev/java/vize/soru1/log.txt");

        String maxUser = "";
        int maxCount = 0;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                String[] parts = line.split("\\s+");

                String status = parts[2]; // ERROR, WARNING vs.
                String user = parts[3]; // USER=41

                if (!status.equals("ERROR"))
                    continue; // sadece ERROR'lara bak

                System.out.println("Status: " + status + ", User: " + user);

                // bu user'ın kaç ERROR'u var say
                int count = 0;
                try (Scanner sc2 = new Scanner(file)) {
                    while (sc2.hasNextLine()) {
                        String l2 = sc2.nextLine().trim();
                        String[] p2 = l2.split("\\s+");

                        if (p2[2].equals("ERROR") && p2[3].equals(user)) {
                            count++;
                        }
                    }
                }

                System.out.println("User " + user + " has " + count + " ERRORs");

                if (count > maxCount) {
                    maxCount = count;
                    maxUser = user;
                }
            }
        } catch (Exception e) {
            System.out.print(e);
        }

        System.out.println("En çok hata yapan: " + maxUser + " (" + maxCount + " hata)");
    }
}
