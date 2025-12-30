import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        /*Write a program that displays the area and
        perimeter of a circle that has a radius of given by user using the following formula:
        perimeter = 2*radius*pi
        area = r^2*pi */ 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = radius*radius*3.14159;

        System.out.println("The area of the circle of radius :" + radius +" is " + area);
        input.close();
    }  
    
    
}
