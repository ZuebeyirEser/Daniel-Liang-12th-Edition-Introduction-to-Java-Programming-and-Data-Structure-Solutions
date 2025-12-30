package Chapter4;

import java.util.Scanner;
public class Ex4_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double side = input.nextDouble();

        double area = (6 * Math.pow(side,2))/(4 * Math.tan(Math.PI/6));

        System.out.printf("The area of hexagon is %4.2f", area);

    }
}

