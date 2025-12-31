package Chapter3;

import java.util.Scanner;
public class Ex3_9 {
    public static void main(String[] args){
    /*(Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
     consists of 10 digits: d1d2d3d4d5d6d7d8d9d10.
     The last digit, d10, is a checksum, which is calculated from the other 9 digits using the following formula:
     (d1 *1+d2 *2+d3 *3+d4 *4+d5 *5+ d6 *6+d7 *7+d8 *8+d9 *9)%11
     f the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
     Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN
     (including leading zeros). Your program should read the input as an integer.
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first 9 digit of the an ISBN integer: ");
        int firstNineDigit = input.nextInt();

        int dOne = firstNineDigit / 1_0000_0000;
        int dTwo = (firstNineDigit / 1000_0000) % 10;
        int dThree = (firstNineDigit / 1000_000) % 10;
        int dFour = (firstNineDigit / 100_000) % 10;
        int dFive = (firstNineDigit / 100_00) % 10;
        int dSix = (firstNineDigit / 1000) % 10;
        int dSeven = (firstNineDigit / 100) % 10;
        int dEight = (firstNineDigit / 10) % 10;
        int dNine = firstNineDigit % 10;

        int lastDigitOfIsbn = (dOne * 1 +
                dTwo * 2 +
                dThree * 3 +
                dFour * 4 +
                dFive * 5 +
                dSix * 6 +
                dSeven * 7 +
                dEight * 8 +
                dNine * 9) % 11;
        if (lastDigitOfIsbn == 10)
            System.out.println("The ISBN number is " + firstNineDigit + "X");
        else
            System.out.println("The ISBN number is " + firstNineDigit + lastDigitOfIsbn);

    }
}
