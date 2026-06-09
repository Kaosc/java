# How to switch to next line when writing to file without "\n" in Java?

In Java, you can use the `System.lineSeparator()` method to get the system-dependent line separator string. This is a more portable way to add a new line when writing to a file, as it will work correctly on different operating systems (e.g., Windows uses "\r\n", while Unix/Linux uses "\n"). Here's an example of how to use it:

```java import java.io.BufferedWriter;
import java.io.FileWriter;
public class FileWriterDemo {
    public static void main(String[] args) {
        String filePath = "example.txt";
        try (
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("First line." + System.lineSeparator());
            writer.write("Second line." + System.lineSeparator());
            writer.write("Third line.");
        } catch (Exception e) {
            e.printStackTrace();
         }
      }
}
```
In this example, `System.lineSeparator()` is used to ensure that each line is properly separated according to the operating system's conventions. This way, you don't have to worry about which newline character to use, and your code will be more portable across different platforms.


# Date functions in Java

In Java, you can use the `java.time` package, which provides a comprehensive set of classes for working with dates and times. Here are some common date functions and how to use them:
1. **Getting the current date and time:**
```java javaimport java.time.LocalDateTime;
public class CurrentDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);
    }
}
```
2. **Formatting dates:**
```java import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateFormattingDemo {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDate);
    }
}
```
3. **Parsing dates from strings:**
```java import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateParsingDemo {
    public static void main(String[] args) {
        String dateString = "2024-06-01 12:30:45";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
        System.out.println("Parsed Date and Time: " + parsedDateTime);
    }
}
```
4. **Calculating the difference between two dates:**
```java 
import java.time.LocalDateTime;
import java.time.Duration;
public class DateDifferenceDemo {
      public static void main(String[] args) {
         LocalDateTime startDateTime = LocalDateTime.of(2024, 6, 1, 12, 0);
         LocalDateTime endDateTime = LocalDateTime.of(2024, 6, 2, 14, 30);
         Duration duration = Duration.between(startDateTime, endDateTime);
         System.out.println("Duration in hours: " + duration.toHours());
      }
   }
   ```
5. **Adding or subtracting time from a date:**
```java
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class DateManipulationDemo {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime futureDateTime = currentDateTime.plus(5, ChronoUnit.DAYS);
        LocalDateTime pastDateTime = currentDateTime.minus(3, ChronoUnit.HOURS);
        System.out.println("Current Date and Time: " + currentDateTime);
        System.out.println("Future Date and Time (5 days later): " + futureDateTime);
        System.out.println("Past Date and Time (3 hours earlier): " + pastDateTime);
    }
}
```
These examples demonstrate how to work with dates and times in Java using the `java.time` package. You can perform various operations such as getting the current date and time, formatting, parsing, calculating differences, and manipulating dates easily with these classes.