package algoritma;

public class Palindrom {
   static String[] splitString(String str) {
      String[] arr = str.split(" ");
      return arr;
   }

   static int isPalindrome(String str) {
      String[] arr = splitString(str);
      int palindromeCount = 0;

      for (String word : arr) {
         String reversed = "";

         for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
         }

         if (word.equals(reversed)) {
            palindromeCount++;
         }
      }

      return palindromeCount;
   }

   public static void main(String[] args) {
      System.out.println("Palindrom kelime sayısı = " + isPalindrome("racecar hello ama")); // 2
   }
}
