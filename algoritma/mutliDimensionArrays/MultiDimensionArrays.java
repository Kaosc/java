package algoritma.mutliDimensionArrays;

@SuppressWarnings("unused")

public class MultiDimensionArrays {

   public static void main(String[] args) {
      // Çok boyutlu diziler
      int[] s = new int[5];

      // tanımlama
      int[][] t = new int[6][2];
      int[][][] z = new int[2][2][2];

      // elemanlara erişim ve değer atama
      t[0][0] = 10;
      t[0][1] = 5;
      t[1][0] = 5;
      t[1][1] = 10;

      z[0][0][0] = 1;
      z[0][0][1] = 2;
      z[0][1][0] = 3;
      z[0][1][1] = 4;
      z[1][0][0] = 5;
      z[1][0][1] = 6;
      z[1][1][0] = 7;
      z[1][1][1] = 8;
      int a[][] = { { 2, 4 }, { 3, 5, 6 }, { 6 }, { 7, 9 } };
      int b[][][] = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

      System.out.println(t.length);
      System.out.println(z.length);
      System.out.println(a[3].length);
      System.out.println(b.length);

      /*
       * 0 1
       * 0 2 4
       * 1 3 5
       * 2 6 8
       * 3 7 9
       * 
       * * t[0][0]=10;
       * t[0][1]=5;
       * t[1][0]=5;
       * t[1][1]=10;
       */

      for (int i = 0; i < t.length; i++) {

         for (int j = 0; j < 2; j++) {

            if (i == j) {
               t[i][j] = 1;
            } else {
               t[i][j] = 0;
            }

         }
      }

      for (int i = 0; i < t.length; i++) {
         System.out.println("");
         for (int j = 0; j < 2; j++) {

            System.out.print(t[i][j] + " ");
         }
      }

      for (int i = 0; i < z.length; i++) {

         for (int j = 0; j < 2; j++) {

            for (int k = 0; k < 2; k++) {

               z[i][j][k] = 5;
            }

         }
      }

      for (int i = 0; i < z.length; i++) {
         System.out.println();
         for (int j = 0; j < 2; j++) {
            System.out.println();
            for (int k = 0; k < 2; k++) {

               System.out.print("z" + i + j + k + "=" + z[i][j][k] + " ");
            }

         }
      }

   }
}