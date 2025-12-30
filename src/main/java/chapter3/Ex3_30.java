package Chapter3;

import java.util.Scanner;
public class Ex3_30 {
    public static void main(String[] args){
        /*(Current time) Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the time zone :");

        int timeZoneOffset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + timeZoneOffset) % 24;

        if (currentHour > 12)
            System.out.println("Current time in the specified time zone is: " +
                    (int)(currentHour - 12) + ":" + currentMinute + ":" + currentSecond + " PM");
        else
            System.out.println("Current time in the specified time zone is: " +
                    currentHour + ":" + currentMinute + ":" + currentSecond + " AM");


    }
}
