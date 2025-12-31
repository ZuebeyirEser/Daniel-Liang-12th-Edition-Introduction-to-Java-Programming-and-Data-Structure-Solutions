package Chapter4;

import java.util.Scanner;
public class Ex4_12 {
    public static void main(String[] args){
        /*(Hex to binary) Write a program that prompts the user to enter a hex digit and
        displays its corresponding binary number in four digits. For example,
        hex digit 7 is 0111 in binary. Hex digits can be entered either in uppercase or
        lowercase. For an incorrect input, display invalid input. */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number between 0 to F");
        String numberOfInput = input.nextLine();

        int decimalValue;
        decimalValue = Integer.parseInt(numberOfInput,16);


        String[] hexToBinaryList = {"0", "1", "10", "11", "100", "101", "110", "111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

        if (decimalValue >= 0 && decimalValue < 16) {
            System.out.println("The binary number is " + hexToBinaryList[decimalValue]);
        } else {
            System.out.println("Invalid input ");
        }

    }
}
