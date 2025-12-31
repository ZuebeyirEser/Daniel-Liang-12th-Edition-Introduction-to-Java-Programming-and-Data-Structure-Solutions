package Chapter3;

import java.util.Scanner;

public class Ex3_5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Note 0 is Sunday, 1 for Monday and so on " +
                "Please enter the integer of the day :");
        int today = input.nextInt();

        System.out.println("Please enter number of day elapsed since today");

        int elapsedDays = input.nextInt();
        int futureElapsedDay = (today + elapsedDays) % 7;

        String[] daysOfWeek = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        if (today > 6 || today < 0) {
            System.out.println("Please provide day number between 0 and 6");
        } else {
            System.out.println("Today is :" + daysOfWeek[today] + " and future day is :" + daysOfWeek[futureElapsedDay]);
        }
    }

}
