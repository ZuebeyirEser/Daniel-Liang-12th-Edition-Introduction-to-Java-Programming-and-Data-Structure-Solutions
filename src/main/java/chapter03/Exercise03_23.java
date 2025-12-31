package Chapter3;

import java.util.Scanner;
public class Ex3_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: e.g. x y ");
        double x = input.nextDouble();
        double y  = input.nextDouble();

        //Given that width of the rectangle is 10 and height is 5
        //also rectangle is centered at (0,0) cordinate.

        if (-5 <= x && x <= 5 && -2.5 <= y && y <= 2.5)
            System.out.println("The cordinate (" + x + "," + y + ")  is in the rectangle.");
        else
            System.out.println("The cordinate (" + x + "," + y + ")  is not in the rectangle.");

    }
}