package Chapter3;

import java.util.Scanner;

public class Ex3_29 {
    public static void main(String[] args){
        /*(Geometry: two circles) Write a program that prompts the user to enter the center coordinates and
        radii of two circles and determines whether the second circle is inside the first or overlaps with the first,
        as shown in Figure 3.10. (Hint: cir- cle2 is inside circle1 if the distance between the two centers <= r1 − r2
        and circle2 overlaps circle1 if the distance between the two centers <= r1 + r2.
        Test your program to cover all cases.)
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter circle1’s center x-, y-coordinates, and radius:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        System.out.println("Enter circle2’s center x-, y-coordinates, and radius:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        double distanceBetweenCenters = Math.sqrt(Math.pow(x1 - x2 , 2) + Math.pow(y1 - y2 , 2));

        if (distanceBetweenCenters < r1 - r2)
            System.out.println("circle2 is inside circle1");
        else if (distanceBetweenCenters <= r1 + r2)
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");
    }
}
