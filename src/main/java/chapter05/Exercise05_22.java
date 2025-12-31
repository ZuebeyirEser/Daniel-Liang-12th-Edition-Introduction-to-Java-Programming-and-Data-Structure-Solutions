package Chapter5;

import java.util.Scanner;

public class Ex5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the loan amount:");

        double loanAmount = input.nextDouble();

        System.out.println("Enter the number of years:");
        int numberOfYears = input.nextInt();

        System.out.println("Enter the annual interest rate (in percentage):");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = numberOfYears * 12;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfPayments));

        System.out.println("Monthly Payment: $" + monthlyPayment);
        System.out.println("Total Payment: $" + (monthlyPayment * numberOfPayments));
        System.out.println();

        double balance = loanAmount;
        for (int i = 1; i <= numberOfPayments; i++) {
            double interest = balance * monthlyInterestRate;
            double principal = monthlyPayment - interest;
            balance -= principal;

            System.out.printf("%d\t\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f\n", i, interest, principal, balance);
        }
    }
}
