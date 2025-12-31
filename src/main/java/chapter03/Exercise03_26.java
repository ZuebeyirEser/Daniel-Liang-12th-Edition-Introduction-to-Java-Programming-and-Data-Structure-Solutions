package Chapter3;
import java.util.Scanner;
public class Ex3_26 {
    public static void main(String[] args){
        /*Write a program that prompts the user to enter an integer and determines whether it is divisible by 5 and 6,
        whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
        */
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean d5 = number % 5 == 0;
        boolean d6 = number % 6 == 0;
        boolean d5Andd6 = d5 & d6;

        if (d5 == true & d6 == true)
            System.out.println("Is " + number + " divisible by 5 and 6 ? " + d5Andd6);

    }
}
