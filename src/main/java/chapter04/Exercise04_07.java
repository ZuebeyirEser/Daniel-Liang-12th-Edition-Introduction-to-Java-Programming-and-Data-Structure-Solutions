package Chapter4;

import java.util.Scanner;
public class Ex4_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the bounded circle ");
        double r = input.nextDouble();
        // Angle increments for each corner point
        // Point 2 is on y axis which has the Pi/2 which is 90
        double angle1 = Math.toRadians(18); // 360 / 5 = 72 degrees
        double angle2 = Math.toRadians(90); // 72 * 1 = 72 degrees
        double angle3 = Math.toRadians(162); // 72 * 2 = 144 degrees
        double angle4 = Math.toRadians(234); // 72 * 3 = 216 degrees
        double angle5 = Math.toRadians(306); // 72 * 4 = 288 degrees

        double x1 = r * Math.cos(angle1);
        double y1 = r * Math.sin(angle1);

        double x2 = r * Math.cos(angle2);
        double y2 = r * Math.sin(angle2);

        double x3 = r * Math.cos(angle3);
        double y3 = r * Math.sin(angle3);

        double x4 = r * Math.cos(angle4);
        double y4 = r * Math.sin(angle4);

        double x5 = r * Math.cos(angle5);
        double y5 = r * Math.sin(angle5);

        System.out.printf("%3.2f is x1 and %3.2f is y1 \n", x1 ,y1);
        System.out.printf("%3.2f is x2 and %3.2f is y2 \n", x2 ,y2);
        System.out.printf("%3.2f is x3 and %3.2f is y3 \n", x3 ,y3);
        System.out.printf("%3.2f is x4 and %3.2f is y4 \n", x4 ,y4);
        System.out.printf("%3.2f is x5 and %3.2f is y5 \n", x5 ,y5);

    }
}
