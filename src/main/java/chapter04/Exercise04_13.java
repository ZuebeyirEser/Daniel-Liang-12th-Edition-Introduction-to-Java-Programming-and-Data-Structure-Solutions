package Chapter4;

import java.util.Scanner;
public class Ex4_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char inputChar;
        inputChar = input.nextLine().charAt(0);
        int unicodeValue = inputChar;

        if (unicodeValue == 65 || unicodeValue == 69 ||
                unicodeValue == 73 || unicodeValue == 79 ||
                unicodeValue == 85 || unicodeValue == 97 ||
                unicodeValue == 101 || unicodeValue == 117 ||
                unicodeValue == 105 || unicodeValue == 111 ) {
            System.out.println(inputChar + " is a vowel");
        } else if (unicodeValue < 65 || (unicodeValue > 90 && unicodeValue <97) || unicodeValue > 122) {
            System.out.println(inputChar + " is a invalid input");
        } else {
            System.out.println(inputChar + " is a consonant");
        }


    }
}
