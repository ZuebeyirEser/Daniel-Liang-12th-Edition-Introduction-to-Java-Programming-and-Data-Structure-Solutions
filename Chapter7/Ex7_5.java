package Chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[10];

        int count = 0;

        System.out.println("Enter 10 integer: \n More than 10 numbers are ignored");
        // put the number into array
        for (int i = 0; i < 10; i++) {
           int number = input.nextInt();

           boolean isUnique = true;

           for (int j = 0; j < count; j++) {
               if (number == myArray[j]) {
                   isUnique = false;
                   break;
               }
           }
           // if the nextInt is not unique then we  add into myArray
           if (isUnique) {
               myArray[count++] = number;
           }
        }
        System.out.println("The number of distinct numbers is " + count);
        for (int i = 0; i < count; i++) {
            System.out.print(myArray[i] + " ");
        }








    }
}
