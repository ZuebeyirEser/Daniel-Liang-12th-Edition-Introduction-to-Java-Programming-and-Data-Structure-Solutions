package Chapter5;

import java.util.Scanner;

public class Ex5_1 {
    /*(Count positive and negative numbers and compute the average of numbers)
    *Write a program that reads an unspecified number of integers,
    *  determines how many positive and negative values have been read,
    *  and computes the total and average of the input values (not counting zeros).
    *  Your program ends with the input 0.
    *  Display the average as a floating-point number.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer, the input ends if it is 0: ");
        int data = input.nextInt();
        int sum = 0;
        int numOfPositive = 0;
        int numOfNegative = 0;
        if (data == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            while (data != 0) {
                if (data < 0) {
                    numOfNegative++;
                } else {
                    numOfPositive++;
                }
                sum += data;
                System.out.println("Enter an integer, the input ends if it is 0: ");
                data = input.nextInt();
            }

        }
        double average = sum / (numOfNegative + numOfPositive);
        System.out.println(" The number of positives is  " + numOfPositive);
        System.out.println(" The number of negative is  " + numOfNegative);
        System.out.println("The total is " + sum);
        System.out.println("The total is " + sum);
        System.out.printf("The average is %.2f", average);

    }

}
