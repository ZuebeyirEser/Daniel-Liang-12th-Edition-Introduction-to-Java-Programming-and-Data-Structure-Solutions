package Chapter6;

import java.util.Scanner;

public class Ex6_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the amount is invested");
        double investedAmount = scanner.nextDouble();

        System.out.println("annual interest rate");
        double annualInterestRate = scanner.nextDouble();


        System.out.printf("%7s %20s%n", "Years", "Future Value");
        for (int i =1; i <= 30; i++) {
            System.out.printf("%7d %20.2f%n", i, futureInvestmentValue(investedAmount, annualInterestRate / 100 / 12, i));        }
    }
    public static double futureInvestmentValue(double amount,double monthlyInterest, int year) {

        double futureInvestmentValue = amount * Math.pow(1 + (monthlyInterest), year*12);
        futureInvestmentValue = Math.round(futureInvestmentValue*100)/100.0;
        return futureInvestmentValue;
    }
}
