package Chapter3;

import java.util.Scanner;
public class Ex3_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("please enter x1 y1 x2 y2 x3 y3 x4 y4 respectively");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a, b, c, d, e, f;
        a = y1 - y2;
        b = x1 - x2;
        c = y3 - y4;
        d = x3 - x4;
        e = a * x1 - b * y1;
        f = c * x2 - d * y2;

        double denominator = a*d - b*c;

        if (denominator == 0) {
            System.out.println("The two lines are parallel");
        } else {
            double x = (e*d - b*f)/denominator;
            double y = (a*f - e*c)/denominator;
            System.out.println("The intersecting point is at (" + x + "," + y + ")" );
        }


    }
}
