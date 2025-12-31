package Chapter3;

import java.util.Scanner;
public class Ex3_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: e.g. x y ");
        double x = input.nextDouble();
        double y  = input.nextDouble();
        // Given that circle formula is x^2 + y^2 <= 100
        double circle = x * x + y * y;

        if (circle <= 100) {
            System.out.println("The cordinate (" + x + "," + y + ")  is in the circle.");
        }
        else
            System.out.println("The cordinate (" + x + "," + y + ")  is not in the circle." );

    }
}
