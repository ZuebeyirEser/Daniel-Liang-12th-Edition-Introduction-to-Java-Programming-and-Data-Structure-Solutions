package Chapter8;

import java.util.Scanner;

public class Ex8_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrixFirst = new double[3][3];

        System.out.println("Enter a 3−by−3 matrix row by row:");

        for (int i = 0; i < 3;i++) {
            for (int j = 0; j < 3;j++) {
                matrixFirst[i][j] = input.nextDouble();
            }
        }

        double[][] matrixSecond = new double[3][3];

        System.out.println("Enter second 3−by−3 matrix row by row:");

        for (int i = 0; i < 3;i++) {
            for (int j = 0; j < 3;j++) {
                matrixSecond[i][j] = input.nextDouble();
            }
        }
        double[][] result = multiplyMatrix(matrixFirst,matrixSecond);
        for (double[] doubles : result) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(doubles[j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        // alternatively we can throw IllegalArgumentException but this book hasnt covered exceptions yet
        if (a[0].length != b.length) {
            System.out.println("Number of columns in first matrix must equal number of rows in second matrix: \n" +
                    "if you see this message result is wrong!");
        }
        double[][] multipliedMatrix = new double[a.length][b.length];
        double sum = 0;
        for (int i = 0; i < a.length;i++) {
            for (int j = 0;j < a.length;j++) {
                for (int k = 0;k < a.length;k++) {
                    sum += a[i][k]*b[k][j];
                }
                multipliedMatrix[i][j] = sum;
                sum = 0;
            }
        }
        return multipliedMatrix;
    }
}
