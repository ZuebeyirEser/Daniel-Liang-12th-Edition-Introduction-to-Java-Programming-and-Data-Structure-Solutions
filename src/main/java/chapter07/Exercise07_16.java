package Chapter7;

import java.util.Arrays;
import java.util.Random;

public class Exercise07_16 {
    public static void main(String[] args) {
        // Generate an array of 100,000 random integers
        int[] numbers = new int[100000];
        Random random = new Random();

        // Fill the array with random integers between 0 and 1000000
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000000);
        }

        // Generate a random key to search for
        int key = random.nextInt(1000000);

        // Time linear search
        long startTime = System.nanoTime();
        int linearResult = linearSearch(numbers, key);
        long endTime = System.nanoTime();
        long linearSearchTime = endTime - startTime;

        // Sort the array for binary search
        int[] sortedNumbers = numbers.clone();
        Arrays.sort(sortedNumbers);

        // Time binary search
        startTime = System.nanoTime();
        int binaryResult = binarySearch(sortedNumbers, key);
        endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;

        // Print results
        System.out.println("Array size: 100,000");
        System.out.println("Key to search for: " + key);
        System.out.println("\nLinear Search:");
        System.out.println("Result found at index: " + linearResult);
        System.out.println("Execution time: " + linearSearchTime + " nanoseconds");
        System.out.printf("Execution time: %.3f milliseconds%n", linearSearchTime / 1_000_000.0);

        System.out.println("\nBinary Search:");
        System.out.println("Result found at index: " + binaryResult);
        System.out.println("Execution time: " + binarySearchTime + " nanoseconds");
        System.out.printf("Execution time: %.3f milliseconds%n", binarySearchTime / 1_000_000.0);
    }

    /** Linear search implementation from Listing 7.6 */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    /** Binary search implementation from Listing 7.7 */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -1;
    }
}