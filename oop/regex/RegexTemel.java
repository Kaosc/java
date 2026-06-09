package oop.finaldersler.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

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
// \d digit
// \D non-digit
// \w word character (letter, digit, underscore)
// \\ escape character - to use special characters as literals

class Example1 {
    public static void main(String[] args) {
        String metin = "Benim numaram 0532 ve onunki 0544.";

        // 1. Şablonu tanımla: 0 ile başlayan ve yan yana 4 rakam barındıran kalıp
        String sablon = "0[0-9]{3}";

        // 2. Pattern nesnesini derle
        Pattern p = Pattern.compile(sablon);

        // 3. Matcher ile metni ilişkilendir
        Matcher m = p.matcher(metin);

        // 4. Döngüyle metnin içinde eşleşen her şeyi bul
        // m.find() her bulduğunda true döner ve bir sonrakine geçer
        while (m.find()) {
            // m.group() eşleşen metnin kendisini verir (Örn: "0532")
            System.out.println("Bulunan numara bloğu: " + m.group());
        }
    }
}

class Example2 {
    public static void main(String[] args) {
        String veri = "Otoparktaki araçlar: 34ABC123, 06XYZ99 ve hatalı olan 1234XYZ";
        String sablon = "[0-9]{2}[A-Z]{3}[0-9]{3}";

        Pattern p = Pattern.compile(sablon);
        Matcher m = p.matcher(veri);

        while (m.find()) {
            System.out.println(m.group()); // 34ABC123
        }

    }

}

class Example3 {
    public static void main(String[] args) {
        String mail = "supp1ort@kaosc.dev";

        // ^ Start string
        // Must start with an any letter [a-zA-Z]
        // [a-zA-Z0-9_.]* after that can be any letter or digit along with _ and . or
        // can be empty
        // Must have @
        // [a-zA-Z0-9_.]+ Must start with at least one letter, digit, _ or .
        // Must include an .
        // [a-z]{2,4} Extention must be lowercase letter and between 2-4
        // $ - end string
        String sablon = "^[a-zA-Z][a-zA-Z0-9_.]*@[a-zA-Z0-9_.]+\\.[a-z]{2,4}$";

        Pattern p = Pattern.compile(sablon);
        Matcher m = p.matcher(mail);

        if (m.matches()) {
            System.out.println("Email is validated");
        } else {
            System.out.println("Email is not valid");
        }
    }
}

// import java.util.regex.Pattern
// import java.util.regex.Matcher

class Example4 {
    public static void main(String[] args) {
        String veri = "Personel: Ahmet_Yilmaz ID: 4502 , Personel: Mehmet.Kaya ID: 9182";
        String sablon = "([a-zA-Z_.]+) ID: ([0-9]{4})";

        Pattern p = Pattern.compile(sablon);
        Matcher m = p.matcher(veri);

        // Print names
        while (m.find()) {
            System.out.println("Personel: " + m.group(1));
        }
    }
}

public class RegexTemel {
    public static void main(String[] args) {
    }
}