package Chapter3;

import java.util.Scanner;
public class Ex3_12 {
    public static void main(String[] args){
        /*(Palindrome integer) Write a program that prompts the user to enter a three-digit integer and determines
         whether it is a palindrome integer. An integer is palindrome if it reads the same from right to left and
         from left to right. A negative integer is treated the same as a positive integer.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 digit integer");
        int number = input.nextInt();

        if (number < 0)
            number = Math.abs(number);

        int inverseOfNumber = 100 * (number / 100) +
                10 * ((number / 10) % 10) +
                number / 100;

        if ( number == inverseOfNumber)
            System.out.println(number + " is a palindrome ");
        else
            System.out.println(number + " is not a palindrome");




    }
}
