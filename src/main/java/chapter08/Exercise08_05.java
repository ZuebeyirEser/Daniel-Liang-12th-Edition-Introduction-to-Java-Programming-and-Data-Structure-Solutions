package Chapter8;

import java.util.Stack;

public class Ex8_5 {
    public static void main(String[] args) {
        double[][] a = {{1,2,3},{4,5,6,},{2,3,4}};
        double[][] b = {{1,21,31},{4,50,6,},{20,3,4}};
        double[][] aPlusB = addMatrix(a,b);
        for (int i = 0; i < aPlusB.length; i++) {
            for (int j = 0; j < aPlusB.length; j++) {
                System.out.print(aPlusB[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static double[][] addMatrix(double[][] a, double[][] b) {
        // assuming that we are give same dimensional matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] += b[i][j];
            }
        }
        return a;
    }

}
