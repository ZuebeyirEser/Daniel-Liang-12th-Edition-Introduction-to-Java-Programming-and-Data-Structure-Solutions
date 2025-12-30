package Chapter4;

import java.util.Scanner;
/*
Write a program that prompts the user to enter a lowercase or uppercase letter and displays
its corresponding number. For a nonletter input, display invalid input.*/
public class Ex4_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char inputCharacter = input.nextLine().charAt(0);
        int unicodeValue = inputCharacter;


        if (unicodeValue == 97 ||
                unicodeValue == 98 ||
                unicodeValue == 99 ||
                unicodeValue == 65 ||
                unicodeValue == 66 ||
                unicodeValue == 67) {
            System.out.println("The corresponding number is 2");
        } else if (unicodeValue == 100 ||
                unicodeValue == 101 ||
                unicodeValue == 102 ||
                unicodeValue == 68 ||
                unicodeValue == 69 ||
                unicodeValue == 70) {
            System.out.println("The corresponding number is 3");
        } else if (unicodeValue == 103 ||
                unicodeValue == 104 ||
                unicodeValue == 105 ||
                unicodeValue == 71 ||
                unicodeValue == 72 ||
                unicodeValue == 73) {
            System.out.println("The corresponding number is 4");
        } else if (unicodeValue == 106 ||
                unicodeValue == 107 ||
                unicodeValue == 108 ||
                unicodeValue == 74 ||
                unicodeValue == 75 ||
                unicodeValue == 76) {
            System.out.println("The corresponding number is 5");
        } else if (unicodeValue == 109 ||
                unicodeValue == 110 ||
                unicodeValue == 111 ||
                unicodeValue == 74 ||
                unicodeValue == 75 ||
                unicodeValue == 76) {
            System.out.println("The corresponding number is 6");
        } else if (unicodeValue == 112 ||
                unicodeValue == 113 ||
                unicodeValue == 114 ||
                unicodeValue == 115 ||
                unicodeValue == 77 ||
                unicodeValue == 78 ||
                unicodeValue == 79 ||
                unicodeValue == 80) {
            System.out.println("The corresponding number is 7");
        } else if (unicodeValue == 116 ||
                unicodeValue == 117 ||
                unicodeValue == 118 ||
                unicodeValue == 119 ||
                unicodeValue == 81 ||
                unicodeValue == 82 ||
                unicodeValue == 83 ||
                unicodeValue == 84) {
            System.out.println("The corresponding number is 8");
        }  else if (unicodeValue == 120 ||
                unicodeValue == 121 ||
                unicodeValue == 122 ||
                unicodeValue == 123 ||
                unicodeValue == 85 ||
                unicodeValue == 86 ||
                unicodeValue == 87 ||
                unicodeValue == 88) {
            System.out.println("The corresponding number is 9");
        } else {
            System.out.println(inputCharacter + " is an invalid input");
        }

    }
}
