package Chapter7;

import java.util.Scanner;


import java.util.Scanner;

public class Ex7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[100];
        int index = 0;

        System.out.println("Enter scores (end input with negative number):");

        while (true) {
            int score = input.nextInt();
            if (score < 0) {
                break;
            } else {
                if (index < scores.length) {  // Make sure we don't go out of bounds
                    scores[index] = score;
                    index++;
                }
            }
        }

        // Calculate the average of scores
        double average = sum(scores) / lastIndex(scores);
        System.out.println("Average score: " + average);

        // Print counts of scores less than, equal to, and greater than the average
        System.out.println("Number of scores less than average: " + lessThanAverage(scores, average));
        System.out.println("Number of scores equal to average: " + equalToAverage(scores, average));
        System.out.println("Number of scores greater than average: " + greaterThanAverage(scores, average));
    }

    public static double sum(int[] array) {
        double sum = 0;
        for (int i = 0; i < lastIndex(array); i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int lastIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return i;
            }
        }
        return array.length;  // Return the full length if no zeros found (all slots filled)
    }

    public static int lessThanAverage(int[] array, double target) {
        int count = 0;
        for (int i = 0; i < lastIndex(array); i++) {
            if (array[i] < target) {
                count++;
            }
        }
        return count;
    }

    public static int equalToAverage(int[] array, double target) {
        int count = 0;
        for (int i = 0; i < lastIndex(array); i++) {
            if (array[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static int greaterThanAverage(int[] array, double target) {
        int count = 0;
        for (int i = 0; i < lastIndex(array); i++) {
            if (array[i] > target) {
                count++;
            }
        }
        return count;
    }
}
