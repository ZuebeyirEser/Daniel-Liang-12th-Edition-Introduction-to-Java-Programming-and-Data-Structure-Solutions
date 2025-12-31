package Chapter5;

import java.util.Scanner;

public class Ex5_21 {
    /*
    * (Financial application: compare loans with various interest rates) Write a program that
    * lets the user enter the loan amount and loan period in number of years, and displays the
    * monthly and total payments for each interest rate starting from 5% to 8%, with an increment of 1/8.
    *
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Loan Amount:");
        double loanAmount = input.nextDouble();

        System.out.println("Number of year:");
        int year = input.nextInt();

        System.out.printf("%-25s%-25s%-20s%n", "Interest Rate ", "Montly Payment", "Total Payment");

        for (float interestRate = 5.0f; interestRate <= 8.0f; interestRate += 0.125) {
            double monthlyPayment = (loanAmount * interestRate/1200) /
                    (1 - Math.pow((1 + interestRate/1200), -12*year));
            double totalPayment = monthlyPayment * 12 * year;
            System.out.printf("%-25.3f%-25.2f%-20.2f%n", interestRate, monthlyPayment, totalPayment);

        }
    }

}
