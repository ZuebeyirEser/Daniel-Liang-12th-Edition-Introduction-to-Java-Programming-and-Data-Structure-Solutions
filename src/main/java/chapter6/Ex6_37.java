package Chapter6;

import java.util.Scanner;

public class Ex6_37 {

    public static String format(int number, int width) {
        String numStr = Integer.toString(number);
        int numLength = numStr.length();

        if (numLength >= width) {
            return numStr;
        }

        // If the number's length is less than the width, prepend '0's
        StringBuilder formattedNumber = new StringBuilder();
        for (int i = 0; i < width - numLength; i++) {
            formattedNumber.append('0');
        }
        formattedNumber.append(numStr);

        return formattedNumber.toString();
    }

    // Main method to test the format method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number and the width
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter the width: ");
        int width = input.nextInt();

        // Display the formatted number
        System.out.println("Formatted number: " + format(number, width));

        input.close();
    }
}

