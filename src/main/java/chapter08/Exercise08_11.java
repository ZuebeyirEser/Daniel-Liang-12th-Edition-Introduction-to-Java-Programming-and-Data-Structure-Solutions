package chapter08;

import java.util.Scanner;

public class Exercise08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 511");
        int num = input.nextInt();

        stringToHTMatrixConverter(binaryHTConverter(num));
    

   }
   public static String binaryHTConverter(int n) {
       String bin = Integer.toBinaryString(n);
       String padded = String.format("%9s", bin).replace(' ', '0');
       return padded;
   }
   public static char[][] stringToHTMatrixConverter(String number) {
       char[][] matrix = new char[3][3];
       int index = 0;

       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               matrix[i][j] = number.charAt(index++);
               if (matrix[i][j] == '0' ) {
                   matrix[i][j] = 'H';
               } else {
                   matrix[i][j] = 'T';
               } 
               System.out.print(matrix[i][j]);
           }
           System.out.println();
       }
      return matrix;
   }
}
