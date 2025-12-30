package Chapter4;

import java.util.Scanner;

public class Ex4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter grade: ");
        char inputCharacter = input.nextLine().charAt(0);
        int unicodeValue = inputCharacter;

        if (unicodeValue == 65) {
            System.out.println("The numeric value for grade A is 4");
        } else if (unicodeValue == 66) {
            System.out.println("The numeric value for grade B is 3");
        } else if (unicodeValue == 67) {
            System.out.println("The numeric value for grade C is 2");
        } else if (unicodeValue == 68) {
            System.out.println("The numeric value for grade D is 1");
        } else if ( unicodeValue == 70) {
            System.out.println("The numeric value for grade F is 0");
        } else {
            System.out.println(inputCharacter + " is an invalid grade");
        }


    }
}
