package Chapter4;

import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides: ");
        int numberOfSize = input.nextInt();

        System.out.println("Enter the number of sides: ");
        double side = input.nextDouble();

        double area = (numberOfSize * Math.pow(side , 2)) / (4 * Math.tan(Math.PI/numberOfSize));
        System.out.println("The area of the polygon is " + area);
    }
}
