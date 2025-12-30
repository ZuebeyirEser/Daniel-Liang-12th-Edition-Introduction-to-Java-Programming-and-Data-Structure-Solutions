package Chapter5;

import java.util.Scanner;

public class Ex5_9 {
    /*Write a program that prompts the user to enter the number of students and
    each student’s name and score, and finally displays the student with the highest score
    and the student with the second-highest score. Use the next() method in the Scanner class
    to read a name rather than using the nextLine() method. Assume that the number of students
    is at least 2.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        while (numberOfStudents < 2) {
            System.out.println("Please enter a valid number of students (at least 2): ");
            numberOfStudents = input.nextInt();
        }

        int highestScore = Integer.MIN_VALUE;
        int secondHighestScore = Integer.MIN_VALUE;
        String highestScoreStudent = "";
        String secondHighestScoreStudent = "";

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter the name of student " + i + ": ");
            String studentName = input.next();

            System.out.print("Enter the score of student " + i + ": ");
            int studentScore = input.nextInt();

            // Check if the current student has a higher score than the highestScore
            // what i am trying to do here basically saving highest score values two different names so that in elseif we can re
            if (studentScore > highestScore) {
                secondHighestScore = highestScore;
                secondHighestScoreStudent = highestScoreStudent;

                highestScore = studentScore;
                highestScoreStudent = studentName;
            //If the current student's score is not greater than the highest score, check if it's greater than the second-highest score:
            } else if (studentScore > secondHighestScore) {
                secondHighestScore = studentScore;
                secondHighestScoreStudent = studentName;
            }
        }
        System.out.println("Student with the highest score: " + highestScoreStudent + " (Score: " + highestScore + ")");
        System.out.println("Student with the second-highest score: " + secondHighestScoreStudent + " (Score: " + secondHighestScore + ")");
    }
}
