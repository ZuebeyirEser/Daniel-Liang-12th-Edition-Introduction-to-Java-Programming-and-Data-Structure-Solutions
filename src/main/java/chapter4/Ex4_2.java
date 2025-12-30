package Chapter4;

import java.util.Scanner;
public class Ex4_2 {
    public static void main(String[] args){
        /*(Geometry: great circle distance) The great circle distance is the distance
        between two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the
        geographical latitude and longitude of two points. The great circle distance
        between the two points can be computed using the following formula:
        d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        Write a program that prompts the user to enter the latitude and longitude of
        two points on the earth in degrees and displays its great circle distance.
        The average radius of the earth is 6,371.01 km.
        Note you need to convert the degrees into radians using the Math.toRadians method
        since the Java trigonometric meth- ods use radians.
        The latitude and longitude degrees in the formula are for north and west.
        Use negative to indicate south and east degrees.*/

        Scanner input = new Scanner(System.in);

        final double RADIUSOFEARTH = 6371.01;

        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double latitude1 = input.nextDouble();
        double longitude1 = input.nextDouble();

        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double latitude2 = input.nextDouble();
        double longitude2 = input.nextDouble();

        double x1, y1, x2, y2;
        x1 = Math.toRadians(latitude1);
        y1 = Math.toRadians(longitude1);
        x2 = Math.toRadians(latitude2);
        y2 = Math.toRadians(longitude2);

        double d = RADIUSOFEARTH * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 -y2));

        System.out.println("The distance between the two points is " + d);
    }
}
