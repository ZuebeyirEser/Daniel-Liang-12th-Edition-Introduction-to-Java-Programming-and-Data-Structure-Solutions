package Chapter7;

import java.util.Scanner;

public class Exercise07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values ");
        int length = input.nextInt();

        int[] myArray = new int[length];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();
        }

        if (isConsecutiveFour(myArray)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");

        }

    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 0;
        // 3 4 5 5 5 5 4 5
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                count++;
                if (count >= 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
