package chapter08;

import java.util.Scanner;

public class Exercise08_12 {
    public static void main(String[] args) {
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208850, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your tax group: ");
        System.out.println("0 for Single filer ");
        System.out.println("1 Married jointly\n" +
                "−or qualifying widow(er)");
        System.out.println("2 for Married separately");
        System.out.println("3 for Head of household");
        int taxGroup = input.nextInt();
        System.out.println("Please enter your income: ");
        int income = input.nextInt();



        System.out.println("Tax is " + calculateTax(income, taxGroup, brackets, rates));
    }

    public static double calculateTax(double income, int taxGroup, int[][] bracket, double[] rates) {
        double tax;

        if (income <= bracket[taxGroup][0]) {
            tax = income * rates[0];
        } else if (income <= bracket[taxGroup][1]) {
            tax = bracket[taxGroup][0] * rates[0] +
                    (income - bracket[taxGroup][0]) * rates[1];
        } else if (income <= bracket[taxGroup][2]) {
            tax = bracket[taxGroup][0] * rates[0] +
                    (bracket[taxGroup][1] - bracket[taxGroup][0]) * rates[1] +
                    (income - bracket[taxGroup][1]) * rates[2];
        } else if (income <= bracket[taxGroup][3]) {
            tax = bracket[taxGroup][0] * rates[0] +
                    (bracket[taxGroup][1] - bracket[taxGroup][0]) * rates[1] +
                    (bracket[taxGroup][2] - bracket[taxGroup][1]) * rates[2] +
                    (income - bracket[taxGroup][2]) * rates[3];
        } else if (income <= bracket[taxGroup][4]) {
            tax = bracket[taxGroup][0] * rates[0] +
                    (bracket[taxGroup][1] - bracket[taxGroup][0]) * rates[1] +
                    (bracket[taxGroup][2] - bracket[taxGroup][1]) * rates[2] +
                    (bracket[taxGroup][3] - bracket[taxGroup][2]) * rates[3] +
                    (income - bracket[taxGroup][3]) * rates[4];
        } else {
            tax = bracket[taxGroup][0] * rates[0] +
                    (bracket[taxGroup][1] - bracket[taxGroup][0]) * rates[1] +
                    (bracket[taxGroup][2] - bracket[taxGroup][1]) * rates[2] +
                    (bracket[taxGroup][3] - bracket[taxGroup][2]) * rates[3] +
                    (bracket[taxGroup][4] - bracket[taxGroup][3]) * rates[4] +
                    (income - bracket[taxGroup][4]) * rates[5];
        }

        return tax;
    }
}
