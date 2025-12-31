package Chapter7;

import java.util.Scanner;

public class Exercise07_09 {

    // Method to find the smallest element in an array
    public static double min(double[] array) {
        double minValue = array[0];  // Assume the first element is the smallest

        // Traverse the array to find the smallest value
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;  // Return the smallest value
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        // Prompt the user to enter 10 numbers
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Find and display the minimum value
        double minValue = min(numbers);
        System.out.println("The minimum value is: " + minValue);
    }
}

