package Chapter3;

import java.util.Scanner;
public class Ex3_14 {
    /*(Game: heads or tails) Write a program that lets the user guess whether the flip of a coin results in heads or tails.
     The program randomly generates an integer 0 or 1, which represents head or tail.
     The program prompts the user to enter a guess, and reports whether the guess is correct or incorrect.*/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double randomNumber = Math.random();
        if (randomNumber < 0.5)
            randomNumber = 0;
        else
            randomNumber = 1;
        System.out.println("Head or Tail ? Please enter 0 for Head and 1 for Tail");

        byte headOrTail = input.nextByte();
        if (headOrTail == 1 || headOrTail == 0)
            System.out.println((randomNumber == headOrTail)? "Your guess is correct!" :"Your guess is incorrect");
        else
            System.out.println("Invalid entry please enter 0 for Head and 1 for Tail");


    }
}
