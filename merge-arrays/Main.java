import java.util.ArrayList;
import java.util.Arrays;

public class Main {
   
   public static ArrayList<String> merge(String[] list1, String[] list2) {
      ArrayList<String> mergedList = new ArrayList<>(Arrays.asList(list1));
      ArrayList<String> mergedList2 = new ArrayList<>(Arrays.asList(list2));
      

      for (int i = 0; i < mergedList.size(); i++) {
         System.out.println("i:" + i);
         System.out.println("----------------");

         for (int j = 0; j < mergedList2.size(); j++) {
            System.out.println("j:" + j);

            if (mergedList.get(i).equals(mergedList2.get(j))) {
               mergedList2.remove(j);
            }
         }

         System.out.println("----------------");
      }

      mergedList.addAll(mergedList2);
      return mergedList;
   }

   public static void main(String[] args) {

      String[] shoppingList1 = { "milk", "bread", "egg", "butter", "sugar" };
      String[] shoppingList2 = { "milk", "Bread", "EGG", "butter", "sugar" };

      ArrayList<String> uniqShoppingList = merge(shoppingList1, shoppingList2);

      System.out.println("\nShopping List: \n");
      for (String item : uniqShoppingList) {
         System.out.println(">> " + item);
      }
      System.out.println("");
   }
}
