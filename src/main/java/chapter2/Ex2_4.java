import java.util.Scanner;

public class Ex2_4 {
    /*(Convert pounds into kilograms) Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it 
    to kilograms, and displays the result. One pound is 0.454 kilogram. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a value in pounds: ");
        double pounds = input.nextDouble();

        double kilogram = pounds/0.454;

        System.out.println(pounds + " Pound(s) is corresponding to " + kilogram + " kilogram(s)");


    }
}
