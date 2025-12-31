package Chapter7;

import java.util.Arrays;

public class Ex7_7 {
    public static void main(String[] args) {
        int[] myArray = new int[100];

        for (int i = 0; i < 100; i++) {
            myArray[i] = (int) (Math.random() * 10);
        }
        int[] counts = new int[10];

        for (int i = 0; i < 100; i++) {
            counts[myArray[i]]++;
        }
        System.out.println(Arrays.toString(counts));

    }
}
