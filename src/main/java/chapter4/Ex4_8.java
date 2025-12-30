package Chapter4;

import java.util.Scanner;
public class Ex4_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code: ");
        int asciiNumber = input.nextInt();

        char character = (char)asciiNumber;

        System.out.println("The character for ASCII code " + asciiNumber + " is '" + character + "'");

    }
}
