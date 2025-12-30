package Chapter3;

import java.util.Scanner;
public class Ex3_19 {
    public static void main(String[] args){
        /*(Compute the perimeter of a triangle) Write a program that reads three edges for a triangle and
        computes the perimeter if the input is valid. Otherwise, display that the input is invalid.
        The input is valid if the sum of every pair of two edges is greater than the remaining edge.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the cordinate of each edge of the triangle" +
                "Please enter with following order_  x1, y1, x2, y2, x3, y3");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side1 = Math.pow((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)),0.5);
        double side2 = Math.pow((Math.pow(x3-x2,2)+Math.pow(y3-y2,2)),0.5);
        double side3 = Math.pow((Math.pow(x3-x1,2)+Math.pow(y3-y1,2)),0.5);

        double perimeter = side1 + side2 + side3;
        double sum1 = x1 + y1;
        double sum2 = x2 + y2;
        double sum3 = x3 + y3;

        if ((sum1 > (sum2 + sum3)) ||
                (sum2 > (sum3 + sum1)) ||
                (sum3 > (sum1 + sum2)))
            System.out.println("Input is invalid.");
        else
            System.out.println("perimeter of triangle is " + perimeter);
    }
}
