package Chapter6;

import java.util.Scanner;

public class Exercise07_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list1 size and contents:");

        int listOneLength = input.nextInt();
        int[] listOne = new int[listOneLength];
        for (int i = 0; i < listOne.length; i++) {
            listOne[i] = input.nextInt();
        }

        System.out.println("Enter list1 size and contents:");
        int listTwoLength = input.nextInt();
        int[] listTwo = new int[listTwoLength];

        if (equals(listOne,listTwo)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }



    }
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length;i++) {
            if (list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }
}
