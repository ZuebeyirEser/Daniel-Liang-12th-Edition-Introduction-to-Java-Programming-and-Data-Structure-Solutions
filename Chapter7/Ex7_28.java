package Chapter7;

import java.util.Scanner;

public class Ex7_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter 10 integer: ");
        int[] myArray = new int[10];
        for (int i = 0; i < 10; i++){
            myArray[i] = input.nextInt();
        }
        for (int i = 0; i <myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] != myArray[j]) {
                    System.out.println(myArray[i] + " " + myArray[j]);
                }
            }
        }
    }
}
