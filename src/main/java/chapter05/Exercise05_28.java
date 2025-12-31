package Chapter5;

import java.util.Scanner;

public class Ex5_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the year
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Prompt the user to enter the first day of the year
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = input.nextInt();

        // Array of month names
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        // Array of days in each month
        int[] monthDays = getMonthDays(year);

        int currentDay = firstDay;

        for (int month = 0; month < 12; month++) {
            // Display the first day of the month
            System.out.printf("%s 1, %d is %s%n", monthNames[month], year, getDayName(currentDay));

            // Update currentDay for the next month
            currentDay = (currentDay + monthDays[month]) % 7;
        }

    }

    private static String getDayName(int currentDay) {
        String[] days = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };
        return days[currentDay];
    }

    private static int[] getMonthDays(int year) {
        return new int[] {
                31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
