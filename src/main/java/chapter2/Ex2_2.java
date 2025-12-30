import java.util.Scanner;

public class Ex2_2 {
    /*(Compute the volume of a cylinder) Write a program that reads in the radius 
    and length of a cylinder and computes the area and volume using the following 
    formulas:
    area = radius * radius * π
    volume = area * length */
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.println("Please enter the length of the cylinder: ");
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("For given radius: "+  radius + 
        " and length: " + length + " Area of the cylinder is: "+ area +
        " and Volume of the cylinder is: "+ volume);
        input.close();  


    }
}
