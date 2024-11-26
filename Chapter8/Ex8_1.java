package Chapter8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3−by−4 matrix row by row:");

        for (int i = 0; i < 3;i++) {
            for (int j = 0; j < 4;j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Sum of the elements at column " + i + " " + sumColumn(matrix,i));
        }



    }
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0D;
        // assuming that each array will be even length
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
