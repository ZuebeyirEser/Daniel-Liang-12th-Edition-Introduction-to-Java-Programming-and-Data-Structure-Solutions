package Chapter3;

import java.util.Scanner;
public class Ex3_27 {
    public static void main(String[] args){
        /*(Geometry: points in triangle?) Suppose a right triangle is placed in a plane as shown below.
         The right-angle point is placed at (0, 0), and the other two points are placed at (200, 0) and (0, 100).
         Write a program that prompts the user to enter a point with x- and y-coordinates and determines whether
         the point is inside the triangle. Here are the sample runs:*/
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point’s x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // m = (y2-y1)/(x2-x1) = (0-100)/(200-0) = -1/2
        // y-y1 = m(x-x1)
        // y - 0 = -1/2(x-200) = 100 - x/2 = y
        if (y + (x / 2) <= 100)
            System.out.println("The point is in the triangle");
        else if (x < 0 || y < 0)
            System.out.println("The point is not in the triangle");
        else
            System.out.println("The point is not in the triangle");
    }
}
