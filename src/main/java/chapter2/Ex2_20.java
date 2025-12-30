import java.util.Scanner;

public class Ex2_20 {
    /*(Financial application: calculate interest) If you know the balance and the annual percentage interest rate,
    you can compute the interest on the next monthly payment using the following formula:
    interest = balance * (annualInterestRate/1200)
    Write a program that reads the balance and the annual percentage interest rate 
    and displays the interest for the next month. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter balance and interest rate (e.g., 5 for 5%)");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        double interest = balance * (annualInterestRate/1200);

        System.out.println("Interest amount for the next month is: " + interest);

    }
}
