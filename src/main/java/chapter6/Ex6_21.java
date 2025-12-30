package Chapter6;

import java.util.Scanner;

public class Ex6_21 {

    public static int getNumber(char letter) {
        letter = Character.toUpperCase(letter);

        return switch (letter) {
            case 'A', 'B', 'C' -> 2;
            case 'D', 'E', 'F' -> 3;
            case 'G', 'H', 'I' -> 4;
            case 'J', 'K', 'L' -> 5;
            case 'M', 'N', 'O' -> 6;
            case 'P', 'Q', 'R', 'S' -> 7;
            case 'T', 'U', 'V' -> 8;
            case 'W', 'X', 'Y', 'Z' -> 9;
            default -> -1; // Invalid input
        };
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a phone number: ");
        String phoneNumber = input.nextLine();

        StringBuilder translatedNumber = new StringBuilder();
        for (int i = 0; i < phoneNumber.length(); i++) {
            char currentChar = phoneNumber.charAt(i);

            if (Character.isLetter(currentChar)) {
                translatedNumber.append(getNumber(currentChar));
            } else {
                translatedNumber.append(currentChar);
            }
        }
        System.out.println("The translated phone number is: " + translatedNumber);
    }
}
