https://www.tutorialspoint.com/java/index.htm
https://quickref.me/java


## i++ vs ++i

- i++: Post-increment. The value of i is used in the expression first, and then it is incremented.
- ++i: Pre-increment. The value of i is incremented first, and then it is used in the expression.

e.g.

```java
int i = 5;
System.out.println(i++); // Output: 5 (i is used first, then incremented to 6)
System.out.println(++i); // Output: 7 (i is incremented first to 7, then used)
```

next()
İlk boşluğa kadar okur
Boşluk, tab, newline görünce durur
Sadece tek kelime/token alır
Scanner sc = new Scanner(System.in);
String veri = sc.next();

Input:
Ali Veli 123

Sonuç:
veri = "Ali"
nextLine()
Satırın tamamını okur
Enter’a basılana kadar her şeyi alır
Boşlukları da dahil eder
Scanner sc = new Scanner(System.in);
String veri = sc.nextLine();

Input:
Ali Veli 123

Sonuç:
veri = "Ali Veli 123"