package Chapter4;

import java.util.Scanner;
public class Ex4_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter character: ");
        char inputChar;
        inputChar = input.nextLine().charAt(0);
        int unicodeValue = (int) inputChar;

        System.out.println("The character is " + inputChar + " is '" + unicodeValue + "'");


    }

}
