package Chapter7;

import java.util.Scanner;

public class Exercise07_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list1 size and contents:");

        int listOneLength = input.nextInt();
        int[] listOne = new int[listOneLength];
        for (int i = 0; i < listOne.length; i++) {
            listOne[i] = input.nextInt();
        }

        System.out.println("Enter list2 size and contents:");
        int listTwoLength = input.nextInt();
        int[] listTwo = new int[listTwoLength];
        for (int i = 0; i < listOne.length; i++) {
            listTwo[i] = input.nextInt();
        }


        if (equals(listOne,listTwo)) {
            System.out.println("Two lists are  identical");
        } else {
            System.out.println("Two lists are not  identical");
        }
    }
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        bubbleSort(list1);
        bubbleSort(list2);
        for (int i = 0; i < list1.length;i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;

    }
    public static void bubbleSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
}
