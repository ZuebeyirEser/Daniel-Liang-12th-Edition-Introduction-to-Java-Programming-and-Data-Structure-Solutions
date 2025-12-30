package Chapter7;

import java.util.Scanner;

public class Ex7_17 {
    /**
     * (Sort students) Write a program that prompts the user to enter the number of students,
     * the students’ names, and their scores and prints student names in
     * decreasing order of their scores. Assume the name is a string without spaces,
     * use the Scanner’s next() method to read a name.
     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students");
        String[] names = new String[input.nextInt()];
        int[] scores = new int[names.length];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Student " + (i + 1) + " name: ");
            names[i] = input.next();
            System.out.print("Score of " + names[i] + ":" );
            scores[i] = input.nextInt();
        }
        sortDecreasingOrder(names,scores);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }
    }
    /**This solution is exactly like a bubble sort
    * whenever adjacent values are swapped we swap String array as well */
    public static void sortDecreasingOrder(String[] name, int[] score) {
        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length - i - 1; j++) {
                if (score[j] > score[j+1]) {
                    int temp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = temp;

                    String tempName = name[j];
                    name[j] = name[j+1];
                    name[j+1] = tempName;

                }
            }
        }
    }

}
