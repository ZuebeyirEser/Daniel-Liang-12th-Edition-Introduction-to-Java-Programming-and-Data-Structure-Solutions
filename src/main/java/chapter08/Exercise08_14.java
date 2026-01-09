package chapter08;

import java.util.Scanner;

public class Exercise08_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the number of rows and columns of the array: ");

        int row = input.nextInt();
        int col = input.nextInt();

        System.out.println("Enter the array: ");
        double[][] a = new double[row][col];

        for (int i = 0; i < row; i++ ) {
            for (int j = 0; j < col; j++) {
                a[i][j] = input.nextDouble();
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The location of the largest element is at: " + "(" + locateLargest(a)[1] + "," + locateLargest(a)[2] + ")");

        input.close();
    }
    public static int[] locateLargest(double[][] a) {
        int[] b  = {(int)a[0][0],0,0};

        double max = 0.0;
        for (int i = 0; i < a.length; i++ ) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    b[1] = i;
                    b[2] = j;
                }
            }
        }
        return b;
    }
}
