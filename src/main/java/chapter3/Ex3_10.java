package Chapter3;

import java.util.Scanner;
public class Ex3_10 {
    public static void main(String[] args){
        /*(Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question.
         *Revise the program to randomly generate an addition question with two integers less than 100.
         */
        Scanner input = new Scanner(System.in);

        int numberOne = (int)(Math.random() * 100);
        int numberTwo = (int)(Math.random() * 100);

        System.out.println("What is " + numberOne + " + " + numberTwo + " ?");
        int answer = input.nextInt();

        if (numberOne + numberTwo == answer)
            System.out.println("You are correct!");
        else
            System.out.println(numberOne + " + " + numberTwo + " should be " + (numberOne + numberTwo));
    }

}
