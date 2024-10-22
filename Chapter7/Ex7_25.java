package Chapter7;

import java.util.Scanner;

public class Ex7_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the numbers");

        int a,b,c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        double[] eqn = { a, b, c };
        double[] roots = new double[2];


        if (solveQuadratic(eqn,roots) == 0) {
            System.out.println("The equation has no real roots.");
        } else if (solveQuadratic(eqn,roots) == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        }


    }
    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            // Two real roots
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            return 2;
        } else if (discriminant == 0) {
            // One real root
            roots[0] = -b / (2 * a);
            return 1;
        } else {
            // No real roots
            return 0;
        }
    }
}
