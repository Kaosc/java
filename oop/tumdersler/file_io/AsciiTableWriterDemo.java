package oop.tumdersler.file_io;

import java.io.FileWriter;
import java.io.IOException;

public class AsciiTableWriterDemo {

   private static final String OUTPUT_PATH = "E:\\dev\\java\\oop\\texts\\YZM.txt";

   public static void main(String[] args) throws IOException {
      try (FileWriter writer = new FileWriter(OUTPUT_PATH)) {
         writer.write("ASCII\tCharacter\n");
         for (int code = 65; code <= 75; code++) {
            writer.write(code + "\t" + (char) code + "\n");
         }
      }
   }
}
