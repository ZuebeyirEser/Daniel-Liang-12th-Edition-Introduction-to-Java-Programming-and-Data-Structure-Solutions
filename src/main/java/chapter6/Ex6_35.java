package Chapter6;

import java.util.Scanner;

public class Ex6_35 {

    // Method to calculate the area of a pentagon
    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }

    // Main method to prompt the user for input and display the area
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side of the pentagon
        System.out.print("Enter the side length of the pentagon: ");
        double side = scanner.nextDouble();

        // Calculate and display the area
        double area = area(side);
        System.out.printf("The area of the pentagon with side length %.2f is %.2f%n", side, area);

        scanner.close();
    }
}
