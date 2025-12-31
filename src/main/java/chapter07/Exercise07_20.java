package Chapter7;

import java.util.Scanner;

public class Exercise07_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read 10 double numbers from the user
        System.out.println("Enter 10 double numbers:");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Sort the numbers
        selectionSort(numbers);

        // Display the sorted numbers
        System.out.println("Sorted numbers in descending order:");
        for (double number : numbers) {
            System.out.print(number + " ");
        }
    }
    public static void selectionSort(double[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            // Find the minimum in the list[i..list.length−1]
            double currentMax = list[0];
            int currentMaxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (list[j] > currentMax) {
                    currentMax = list[j];
                    currentMaxIndex = j;

                }
            }
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }


    }
}
