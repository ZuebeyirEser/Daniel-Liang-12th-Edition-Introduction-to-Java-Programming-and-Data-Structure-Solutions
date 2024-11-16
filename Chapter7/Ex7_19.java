package Chapter7;

import java.util.Scanner;

public class Ex7_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the list: ");
        int[] myArray = new int[input.nextInt()];

        System.out.println("Enter the contents of the list: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();
        }
        System.out.print("The list has" + myArray.length + " integers" );
        for (int j : myArray) {
            System.out.print(" " + j);
        }
        System.out.println();
        if (isSorted(myArray)) {
            System.out.println("The list is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }

    }
    public static boolean isSorted(int[] list) {
        boolean status = false;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i]<list[i+1]) {
                status = true;
            }
        }
        return status;
    }
}
