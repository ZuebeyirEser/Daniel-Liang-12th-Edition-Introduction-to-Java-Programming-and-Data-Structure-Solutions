package Chapter7;

import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enet number of sutdent");

        int[] scores = new int[input.nextInt()];
        System.out.println("Enter" + (scores.length + 1) + " scores");
        // Loop to take 4 inputs
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt(); // Store each input in the array
        }
        int bestScore = bestStudentScores(scores);

        for (int i = 0; i < scores.length; i ++) {
            int diff = bestScore - scores[i];
            String grade = switch (diff / 10) {
                case 0 -> "A";
                case 1 -> "B";
                case 2 -> "C";
                case 3 -> "D";
                default -> "F";

            };
            System.out.println("Student " + i + "'s score is " + scores[i] + " and grade is " + grade);
        }
    }
    public static int bestStudentScores(int[] array) {
        int bestScore = 0;
        for (int j : array) {
            if (j > bestScore) {
                bestScore = j;
            }
        }
        return bestScore;
    }

}
