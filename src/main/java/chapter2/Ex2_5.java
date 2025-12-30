import java.util.Scanner;

public class Ex2_5 {
    /*(Financial application: calculate tips) Write a program that reads the subtotal 
    and the gratuity rate, then computes the gratuity and total. For example, if the 
    user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
    as gratuity and $11.5 as total. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the subtotal value: ");
        double subtotal = input.nextDouble();

        System.out.println("Please provide gratuity rate: e.g. 5 (implies 5 percentage)");
        double gratuity = input.nextDouble();

        double gratuityAmount = (subtotal)*(gratuity/100);
        double total = subtotal + gratuityAmount;

        System.out.println(gratuityAmount + " is the amount of tip " + total + " is the total amount that needs to be paid!");


    }
}
