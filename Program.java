import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

// public class Program {

//     static boolean isAdult(LocalDate birthday) {
//         LocalDate now = LocalDate.now();
//         Period period = Period.between(birthday, now);

//         if (period.getYears() >= 18) {
//             return true;
//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         LocalDate birthday = LocalDate.of(2000, 6, 7);
//         boolean adult = isAdult(birthday);
//         System.out.println(adult);
//     }
// }

// public class Program {
//     static String formatBirthday(String birthday) {
//         DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
//         return LocalDate.parse(birthday).format(fmt);
//     }

//     public static void main(String[] args) {
//         String date = formatBirthday("2000-06-07");
//         System.out.println(date);
//     }
// }

// public class Program {
//     static long daysBetween(String d1, String d2) {
//         LocalDate date1 = LocalDate.parse(d1);
//         LocalDate date2 = LocalDate.parse(d2);

//         return date2.toEpochDay() - date1.toEpochDay();
//     }

//     public static void main(String[] args) {
//         long days = daysBetween("2000-06-07", LocalDate.now().toString());
//         System.out.println(days);
//     }
// }

// public class Program {
//     public static void main(String[] args) {
//         File file = new File("E:/dev/java/students.txt");

//         try {
//             FileReader fr = new FileReader(file);
//             BufferedReader br = new BufferedReader(fr);

//             String line = br.readLine();

//             while (line != null) {
//                 String[] parts = line.trim().split("\\s+");

//                 String name = parts[0];
//                 int score = Integer.parseInt(parts[1]);

//                 System.out.println(name + ", " + score);
//                 line = br.readLine();
//             }

//             fr.close();
//             br.close();
//         } catch (IOException e) {
//             System.out.print(e);
//         }

//     }
// }

// public class Program {
//     public static void main(String[] args) {
//         File file = new File("E:/dev/java/output.txt");

//         if (!file.exists()) {
//             try {
//                 file.createNewFile();
//             } catch (IOException e) {
//                 System.out.print(e);
//             }
//         }

//         try {
//             FileWriter fr = new FileWriter(file);
//             BufferedWriter br = new BufferedWriter(fr);

//             for (int i = 0; i < 5; i++) {
//                 br.append(String.valueOf(i + 1));
//                 br.newLine();
//             }

//             br.close();
//         } catch (IOException e) {
//             System.out.print(e);
//         }

//     }
// }

public class Program {
    public static void main(String[] args) {
        File file = new File("E:/dev/java/students.txt");

        try {
            Scanner sc = new Scanner(file);

            int sum = 0;
            int studentCount = 0;

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                studentCount++;

                String[] parts = line.trim().replaceAll(" ", "").split(",");

                int score = Integer.parseInt(parts[1]);
                sum += score;
            }

            double avg = sum / (double) studentCount;
            System.out.print(avg);

            sc.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
