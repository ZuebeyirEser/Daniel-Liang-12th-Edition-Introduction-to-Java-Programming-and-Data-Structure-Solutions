package Chapter6;

import java.util.Scanner;

public class Ex6_20 {
    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int numberOfLetters = countLetters(input);
        System.out.println("The number of letters in the string is: " + numberOfLetters);

    }
}
