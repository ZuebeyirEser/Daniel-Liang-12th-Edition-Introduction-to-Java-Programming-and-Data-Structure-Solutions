package Chapter5;

import java.util.Scanner;
public class Ex5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        while (numberOfStudents < 1) {
            System.out.println("Please enter a valid number of students (at least 1): ");
            numberOfStudents = input.nextInt();
        }

        int highestScore = Integer.MIN_VALUE;
        String highestScoreStudent = "";

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter the name of student " + i + ": ");
            String studentName = input.next();

            System.out.print("Enter the score of student " + i + ": ");
            int studentScore = input.nextInt();

            // Check if the current student has a higher score than the highestScore
            if (studentScore > highestScore) {
                highestScore = studentScore;
                highestScoreStudent = studentName;
            }
        }
        System.out.println("The student with the highest score is: " + highestScoreStudent);
        System.out.println("Their score is: " + highestScore);
    }
}
