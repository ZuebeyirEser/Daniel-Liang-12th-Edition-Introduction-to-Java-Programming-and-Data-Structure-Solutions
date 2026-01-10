package chapter08;

import java.util.Scanner;

public class Exercise08_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points that you wanna test:");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];

        System.out.println("Enter " + numberOfPoints + " points:");
        
        for (int i = 0; i < numberOfPoints; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        if (sameLine(points)) {
            System.out.println("The " + numberOfPoints + " points are on the same line");
        } else {
            System.out.println("The " + numberOfPoints + " points are not on the same line");
        }

    }
    public static boolean sameLine(double[][] points) {
        int n = points.length;
        // any given two points are in the same line
        if (n <= 2) return true;

        double x1 = points[0][0], y1 = points[0][1];
        double x2 = points[1][0], y2 = points[1][1];

        double dx = x2 - x1;
        double dy = y2 - y1;

        for (int i = 2; i < n; i++) {
            double x = points[i][0];
            double y = points[i][1];

            double cross = dx * (y - y1) -  dy * (x - x1);

            if (Math.abs(cross) > 0.0) {
                return false;
            }
        }
        return true;

    }
}
