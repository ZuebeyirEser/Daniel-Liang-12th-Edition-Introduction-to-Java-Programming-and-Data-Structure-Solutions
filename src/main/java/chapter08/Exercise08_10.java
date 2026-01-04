package chapter08;


public class Exercise08_10 {
    public static void main(String[] args) {
        int[][] randomMatrix = generateRandomMatrix(4);
        System.out.println("The largest index of row is " + findMaxRow(randomMatrix));
        
        System.out.println("The largest index of column is " + findMaxCol(randomMatrix));



    }

    public static int[][] generateRandomMatrix(int size) { 
        int[][] randomMatrix = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                randomMatrix[i][j] = (int)(Math.random() * 2);
                System.out.print(randomMatrix[i][j]);
            }
            System.out.println();
        }
        return randomMatrix;
    }
    public static int findMaxCol(int[][] twoDArray) {
        int[] row = new int[twoDArray.length];

        for (int i = 0; i < twoDArray.length; i++){
            for (int j = 0; j < twoDArray.length; j++) {

                row[i] += (int) (twoDArray[i][j]  *  Math.pow(10.0,twoDArray.length - j - 1));
            }
            
        }
        return indexOfMax(row);
    } 

    public static int findMaxRow(int[][] twoDArray) {
        int[] col = new int[twoDArray.length];

        for (int i = 0; i < twoDArray.length; i++){
            for (int j = 0; j < twoDArray.length; j++) {
                col[i] += (int) (twoDArray[j][i]  *  Math.pow(10.0,twoDArray.length - j - 1));
            }
        }
        return indexOfMax(col);
    } 
    public static int indexOfMax(int[] array) {
        int max = array[0];
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }
 }
