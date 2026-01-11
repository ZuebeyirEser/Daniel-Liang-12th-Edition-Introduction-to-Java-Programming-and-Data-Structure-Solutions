package chapter08;

import java.util.Arrays;

public class Exercise08_16 {
    public static void main(String[] args) {
        int[][] m = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};

        sort(m);
        System.out.println(Arrays.deepToString(m));
    }
    public static void sort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length - i- 1; j++) {
                if (m[j][0] > m[j + 1][0]) {
                    int[] temp = m[j];
                    m[j] = m[j + 1];
                    m[j + 1]= temp;
                }
                if (m[j][0] == m[j + 1][0] && m[j][1] > m[j + 1][1]) {
                        int[] temp = m[j];
                        m[j] = m[j + 1];
                        m[j + 1] = temp;
                }
            }
        }

    }
}
