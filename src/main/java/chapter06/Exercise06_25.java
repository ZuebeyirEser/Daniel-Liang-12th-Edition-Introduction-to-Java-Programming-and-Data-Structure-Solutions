package Chapter6;

import java.util.Scanner;

public class Ex6_25 {

    public static String convertMillis(long millis) {
        long hours = millis / 3600000; // 1 hour = 3600000 milliseconds
        long minutes = (millis % 3600000) / 60000; // 1 minute = 60000 milliseconds
        long seconds = (millis % 60000) / 1000; // 1 second = 1000 milliseconds

        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter milliseconds
        System.out.print("Enter milliseconds: ");
        long millis = scanner.nextLong();

        // Convert and display the result
        String result = convertMillis(millis);
        System.out.println("Converted time: " + result);
    }
}

