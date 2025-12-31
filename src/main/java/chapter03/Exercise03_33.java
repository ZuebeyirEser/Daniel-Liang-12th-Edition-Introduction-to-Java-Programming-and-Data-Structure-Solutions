package Chapter3;

import java.util.Scanner;
public class Ex3_33 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight and price for package 1: ");
        double w1 = input.nextDouble();
        double p1 = input.nextDouble();

        System.out.println("Enter weight and price for package 2: ");
        double w2 = input.nextDouble();
        double p2 = input.nextDouble();

        if (w1/p1 < w2/p2)
            System.out.println("Package 2 has a better price.");
        else if (w1/p1 == w2/p2)
            System.out.println(" Two packages have the same price.");
        else
            System.out.println("Package 1 has a better price.");
    }
}
