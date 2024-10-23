package Chapter7;

import java.util.Scanner;

public class Ex7_26 {
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true; // All elements match
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reading the first list
        System.out.print("Enter list1 (first number indicates number of elements): ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            list1[i] = input.nextInt();
        }

        // Reading the second list
        System.out.print("Enter list2 (first number indicates number of elements): ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            list2[i] = input.nextInt();
        }

        // Display result
        if (equals(list1, list2)) {
            System.out.println("The two lists are strictly identical.");
        } else {
            System.out.println("The two lists are not strictly identical.");
        }
    }
}

