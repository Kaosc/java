package algoritma.arrays;

import uygulamalar.calculator.Operations;

public class Arrays   {  
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      System.out.println("Array length: " + arr.length);
      System.out.println("First element: " + arr[0]);
      System.out.println("Last element: " + arr[arr.length - 1]);

      Operations operations = new Operations();
      int sum = operations.add(arr[0], arr[1]);
      System.out.println("Sum of first two elements: " + sum);
   }
}
