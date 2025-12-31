package Chapter3;

import java.util.Scanner;

public class Ex3_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: (e.g., 2012) ");
        int year = input.nextInt();

        System.out.println("Enter month: 1−12: ");
        int month = input.nextInt();

        if (month == 1 || month == 2){
            month += 12;
            year -= 1;
        }

        System.out.println("Enter the day of the month: 1−31: ");
        int day = input.nextInt();


        int k = year % 100;
        int j = year / 100;

        String[] dayOfTheWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        int h = (day +
                26 * (month + 1) / 10 +
                k +
                k / 4 +
                j / 4 +
                5 * j) % 7;

        System.out.println("Day of the week is " + dayOfTheWeek[h]);

    }
}
