package chapter08;

import java.util.Scanner;

public class Exercise08_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the matrix");

        int size = input.nextInt();

        byte[][] matrix = new byte[size][size];
        // construct the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (byte) (Math.random() * 2);

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
        // check the rows
        int countRow = 0; 
        for (int i = 0; i < matrix.length; i++) {
           
            if (findAllSameValueOfRow(matrix[i])) {
                countRow++;
                System.out.println("All " + matrix[i][0] +  "s on row " + i);
            }
        }
        if (countRow == 0) {
            System.out.println("No same number on a row");
        }
        // check the columns

        int countCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (findAllSameValueOfCol(matrix, i)) {
                countCol++;
                System.out.println("All " + matrix[0][i] + "s on column " + i);
            }
        }
        if (countCol == 0) {
            System.out.println("No same number on a column");
        }
        // check the diagonal

        if (findAllSameValueOfDiagonal(matrix)) {
            System.out.println("Major diagonal has " + matrix[0][0] + "s same value");
        } else {
            System.out.println("No same numbers on the major diagonal");
        }
        // check sub-diaogonal

        if (findAllSameValueOfSubDiagonal(matrix)) {
            System.out.println("Sub-diagonal has " + matrix[matrix.length - 1][0] + "s same value");
        } else {
            System.out.println("No same numbers on the sub-diagonal");
        }
        
    }

    public static boolean findAllSameValueOfRow(byte[] b) {
        boolean isSame = true;
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] != b[i + 1]) {
                isSame = false;
                break;
            } 
        }
        return isSame;
    }
    public static boolean findAllSameValueOfDiagonal(byte[][] b) {
        boolean isSame = true; 
        // assume we have 3x3 matrix
        // b[0][0] b[1][1] b[2][2]
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i][i] != b[i + 1][i + 1]) {
                isSame = false;
                break;
            }
        }
        return isSame;
    }
    public static boolean findAllSameValueOfSubDiagonal(byte[][] b) {
        boolean isSame = true;
        // assume we have 3x3 matrix
        // b[0][2] b[1][1] b[2][0]
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i][b.length - i - 1] != b[i + 1][b.length - (i + 1) - 1]) {
                isSame = false;
                break;
            }
        }
        return isSame;
    }
    public static boolean findAllSameValueOfCol(byte[][] b, int colIndex) {
        boolean isSame = true;
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i][colIndex] != b[i + 1][colIndex]) {
                isSame = false;
                break;
            }
        }
        return isSame;
    }
}
