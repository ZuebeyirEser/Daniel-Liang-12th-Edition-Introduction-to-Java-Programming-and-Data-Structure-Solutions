package chapter08;

public class Exercise08_10 {
    public static void main(String[] args) {
        int[][] randomMatrix = generateRandomMatrix(4);


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
    public static void findColRow(int[][] twoDArray) {
        int[] row = new int[twoDArray.length];

        int[] col = new int[twoDArray.length];

        
        for (int i = 0; i < twoDArray.length; i++){
            for (int j = 0; j < twoDArray.length; j++) {

                row[i] = twoDArray[i][j] * Math.pow(10.0,twoDArray.length - j );
                col[i] = twoDArray[j][i] * Math.pow(10,twoDArray.length - i);
            }
        }


    } 
}
