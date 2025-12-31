package Chapter3;

import java.util.Scanner;
public class Ex3_32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points for p0, p1, and p2: ");
        double x0, y0, x1, y1, x2, y2;
        x0 = input.nextDouble();
        y0 = input.nextDouble();
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        double condition = (x1 - x0) * (y2 - y0) -
                (x2 - x0) * (y1 -y0);
        if (condition > 0)
            System.out.println("p2 is on the left side of the line");
        else if (condition == 0)
            System.out.println("p2 is on the same line");
        else
            System.out.println("p2 is on the right side of the line");

    }
}
