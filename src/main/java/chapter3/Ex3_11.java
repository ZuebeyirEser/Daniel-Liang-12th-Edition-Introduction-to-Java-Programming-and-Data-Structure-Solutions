package Chapter3;

import java.util.Scanner;
public class Ex3_11 {
    public static void main(String[] args){
        /*(Find the number of days in a month) Write a program that prompts the user to enter the month and year and
         displays the number of days in the month. For example, if the user entered month 2 and year 2012,
         the program should display that February 2012 has 29 days. If the user entered month 3 and year 2015,
         the program should display that March 2015 has 31 days.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of the month: ");
        int month = input.nextInt();

        System.out.println("Please enter the year ");
        int year = input.nextInt();

        String[] months = {"", "January" , "February", "March", "April", "May", "June",
                "July", "August", "September", "October","November", "December"};

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean thirtyDayOfMonth = month % 2 == 0;
        if (isLeapYear == true && thirtyDayOfMonth == true && month == 2)
            System.out.println(months[month] + " " + year + " has 29 days");
        else if (isLeapYear == true && thirtyDayOfMonth == true)
            System.out.println(months[month] + " " + year + " has 30 days");
        else if (isLeapYear == false && month == 2)
            System.out.println(months[month] + " " + year + " has 28 days");
        else
            System.out.println(months[month] + " " + year + " has 31 days");

    }
}
