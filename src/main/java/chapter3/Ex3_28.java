package Chapter3;

import java.util.Scanner;
public class Ex3_28 {
    public static void main(String[] args){
        /* Write a program that prompts the user to enter the center x-, y-coordinates, width, and height of
        two rectangles and determines whether the second rectangle is inside the first or overlaps with the first,
        as shown in Figure 3.9. Test your program to cover all cases.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Enter r1’s center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        System.out.println("Enter r2’s center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();
        // boundries of rect 1
        double left1 = x1 - w1 / 2;
        double right1 = x1 + w1 / 2;
        double top1 = y1 + h1 / 2;
        double bottom1 = y1 - h1 / 2;
        // boundries of rect 2
        double left2 = x2 - w2 / 2;
        double right2 = x2 + w2 / 2;
        double top2 = y2 + h2 / 2;
        double bottom2 = y2 - h2 / 2;

        if (left1 < right2 && right1 > left2 && top1 > bottom2 && bottom1 < top2) {
            System.out.println("The two rectangles overlap.");
        } else if (left1 <= right2 && right1 >= left2 && top1 >= bottom2 && bottom1 <= top2) {
            System.out.println("r2 is inside of r1");
        } else if (left2 <= right1 && right2 >= left1 && top2 >= bottom1 && bottom2 <= top1) {
            System.out.println("r1 is inside of r2");
        } else {
            System.out.println("r2 does not overlap r1");
        }

    }
}
// not correct answer will be back to the question
