package Chapter7;

import java.util.Scanner;

public class Ex7_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[10];

        System.out.println("Enter 10 number");
        for (int i = 0; i < myArray.length;i++){
            myArray[i] = input.nextInt();
        }
        bubbleSort(myArray);
        for (int e : myArray) {
            System.out.print(e + " ");
        }

    }
    public static void bubbleSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++){
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] >list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
}
