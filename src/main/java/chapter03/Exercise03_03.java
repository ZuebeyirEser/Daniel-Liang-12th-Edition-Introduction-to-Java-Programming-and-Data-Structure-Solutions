package Chapter3;

import java.util.Scanner;

public class Ex3_3 {
    public static void main(String[] args) {
        /*
        (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using Cramer’s rule given in Programming Exercise 1.13.
        Write a program that prompts the user to enter a, b, c, d, e, and f and displays the result.
        If ad - bc is 0, report that “The equation has no solution.”
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter enter the a, b, c, d, e, f respectively:"
                + "ax +by = e" + "cx + dy = f");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double denominator = a*d - b*c;
        if (denominator == 0 ) {
            System.out.println("This equation has no solution");
        } else {
            double x = (e*d - b*f)/denominator;
            double y = (a*f - e*c)/denominator;
            System.out.println("The x is " + x + " and y is " + y);
        }
    }
}
