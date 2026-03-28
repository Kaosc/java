# Java OOP Lecture Inventory (oop + oopUygulamalar)

This file summarizes methods and classes used in Java files under `oop/` and `oopUygulamalar/`.

## 1) Java/API Classes Used

### File I/O
- `File`
- `FileReader`
- `FileWriter`
- `BufferedReader`
- `BufferedWriter`
- `FileInputStream`
- `FileOutputStream`

### Input / Parsing
- `Scanner`

### Collections
- `ArrayList`
- `List`

### Core Types
- `String`
- `Integer`
- `System`

## 2) Methods Used (Grouped)

### File
- `exists()`
- `createNewFile()`
- `getPath()`
- `getName()`
- `getParent()`
- `canRead()`
- `canWrite()`
- `isFile()`
- `isDirectory()`
- `length()`

### FileReader
- `read()`
- `close()`

### FileWriter
- `write(String)`
- `write(int)`
- `append(String)`
- `close()`

### BufferedReader
- `readLine()`
- `close()`

### BufferedWriter
- `write(String)`
- `append(String)`
- `newLine()`
- `close()`

### FileInputStream / FileOutputStream
- `read()` / `write(int)`
- `read(byte[])` / `write(byte[], offset, length)`
- `close()`

### Scanner
- `hasNext()`
- `hasNextLine()`
- `hasNextInt()`
- `next()`
- `nextLine()`
- `nextInt()`
- `close()`

### String
- `split(String regex)`
- `charAt(int)`
- `length()`
- `substring(int, int)`
- `equals(String)`
- `equalsIgnoreCase(String)`
- `startsWith(String)`
- `toLowerCase()`
- `replace(String, String)`
- `trim()`

### ArrayList / List
- `add(E)`
- `size()`

### Integer
- `parseInt(String)`

### System
- `System.out.println(...)`
- `System.out.print(...)`
- `System.lineSeparator()`
- `System.in`

## 3) Main Concepts You Practiced

- File I/O architecture: `File` -> `FileReader/FileWriter` -> `BufferedReader/BufferedWriter`
- Byte stream I/O with `FileInputStream` and `FileOutputStream`
- User/file input parsing with `Scanner`
- String parsing and transformation (`split`, `trim`, `replace`, etc.)
- Recursion examples (factorial, power, permutation, reverse/digit operations)
- Static utility methods and method parameter/return usage
- Arrays and multi-dimensional array operations
- Exception handling (`throws IOException`, `try-catch`, `try-with-resources`)

## 4) Exam Focus Suggestion

If your exam is practical, prioritize:
1. Reading/writing text files with `BufferedReader` + `BufferedWriter`
2. Scanner-based input handling (`nextInt`, `nextLine`, `hasNext...`)
3. String splitting and parsing (`split`, `Integer.parseInt`)
4. Correct resource management (`close` vs. `try-with-resources`)
