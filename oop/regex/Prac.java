package oop.regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Basic regex rules:
// . (dot) any character
// [abc] a, b, c characters
// [a-z] any lowercase letter
// [A-Z] any uppercase letter
// [0-9] any digit
// {n} exactly n times
// {n,} at least n times
// {n,m} between n and m times
// ^ start of string
// $ end of string
// * zero or more times
// + one or more times
// ? zero or one time
// \d digit
// \D non-digit
// \w word character (letter, digit, underscore)
// \\ escape character - to use special characters as literals
// \\b word boundary

class Prac22 {
   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new FileReader("E:\\dev\\java\\oop\\regex\\metin.txt"));
         Pattern pt = Pattern.compile("\\b[a-zA-Z][a-zA-Z_.0-9]*@[a-zA-Z]+.[a-zA-Z]{2,4}\\b");
         String line;

         while ((line = br.readLine()) != null) {
            Matcher mc = pt.matcher(line);

            if (mc.find()) {
               System.out.println("Regex found: " + mc.group());
            }

         }

         br.close();
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}

class Prac21 {
   public static void main(String[] args) {
      String text = "12345";

      Pattern pt = Pattern.compile("[0-9]+");
      Matcher mc = pt.matcher(text);

      Boolean res = mc.matches();
      System.out.println(res);
   }
}

public class Prac {
   public static void main(String[] args) {
      String text = "support@kaosc.dev";

      Pattern pt = Pattern.compile("[a-zA-Z][_.a-zA-Z0-9]*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}");
      Matcher mc = pt.matcher(text);

      Boolean res = mc.matches();
      System.out.println(res);
   }
}
