package Chapter3;

import java.util.Scanner;
public class Ex3_17 {
    public static void main(String[] args) {
        /*(Game: scissor, rock, paper) Write a program that plays the popular scissor– rock–paper game.
         (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
         The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
         The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating
         whether the user or the computer wins, loses, or draws.:*/
        Scanner input = new Scanner(System.in);
        int computerChoice = (int)(Math.random() * 3);

        System.out.println("scissor (0), rock (1), paper (2): ");
        int userChoice = input.nextInt();

        String[] rockScissorPaper = {"scissor", "rock", "paper"};

        if (computerChoice == 0 && userChoice ==2)
            System.out.println(" The computer is scissor. You are paper. You lost");
        else if (computerChoice == 0 && userChoice == 1)
            System.out.println(" The computer is scissor. You are rock. You won");
        else if (computerChoice == 1 && userChoice == 0)
            System.out.println(" The computer is rock. You are scissor. You lost");
        else if (computerChoice == 1 && userChoice == 2)
            System.out.println(" The computer is rock. You are paper. You won");
        else if (computerChoice == 2 && userChoice == 0)
            System.out.println(" The computer is paper. You are scissor. You won");
        else if (computerChoice == 2 && userChoice == 1)
            System.out.println(" The computer is paper. You are rock. You lost");
        else
            System.out.println(" The computer is " + rockScissorPaper[computerChoice] +
                    ". You are " + rockScissorPaper[userChoice] + " too. " +
                    " It is a draw" );






    }
}
