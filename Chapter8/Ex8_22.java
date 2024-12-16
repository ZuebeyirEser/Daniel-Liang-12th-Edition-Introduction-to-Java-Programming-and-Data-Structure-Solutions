package Chapter8;

import java.util.Random;

public class Ex8_22 {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix();


        if (checkMatrix(matrix)) {
            System.out.println("Every row and every column have an even number of 1s.");
        } else {
            System.out.println("Not every row and every column have an even number of 1s.");
        }
    }

    public static int[][] generateMatrix() {
        Random random = new Random();
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = random.nextInt(2); // Generate 0 or 1
            }
        }
        return matrix;
    }

    public static boolean checkMatrix(int[][] matrix) {
        // Check rows
        for (int i = 0; i < 6; i++) {
            if (!hasEvenOnes(matrix[i])) {
                return false;
            }
        }
        for (int j = 0; j < 6; j++) {
            int count = 0;
            for (int i = 0; i < 6; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean hasEvenOnes(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num == 1) {
                count++;
            }
        }
        return count % 2 == 0;
    }
}
