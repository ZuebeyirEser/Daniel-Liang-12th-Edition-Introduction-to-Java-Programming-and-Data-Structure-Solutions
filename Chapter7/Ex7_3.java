package Chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers between 1 and 100 (end input with 0):");
        // I will skip index 0 look at explaination below
        int[] numbers = new int[101];
        while (true) {
            int number = input.nextInt();
            if (number == 0) {
                break;
            }
            /*
             * Since we created new int array with length of 100
             * they all have initial value of 0
             * Assume user entered 2 2 5 5 0
             * numbers[2] will be 1
             * number 2 again
             * number[2] will be 2
             * and so on so forth
             * The reason for not updating first element of an array is 0 is not valid number we would like to asses
             * */
            if (number >= 1 && number < 101) {
                numbers[number]++;
            }
        }
        for (int i = 1; i < 101; i++) {
            // we only interested in updated array elements thus skip 0s
            if (numbers[i] > 0) {
                if (numbers[i] > 1) {
                    System.out.println(i + "occured "+ numbers[i] + "times");
                } else  {
                    System.out.println(i + "occured "+ numbers[i] + "time");
                }
            }
        }
        input.close();
    }
}
