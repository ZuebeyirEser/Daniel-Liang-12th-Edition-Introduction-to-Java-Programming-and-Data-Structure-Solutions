import java.util.Scanner;

public class Ex2_16 {
    /*Write a program that prompts the user to enter the 
    side of a hexagon and displays its area. The formula for computing the area of a 
    hexagon is
    1.5*(3^(1/2))*s^2 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the length side of the hexagon ");
        double length = input.nextDouble();

        double area = (3*Math.pow(3,0.5)*Math.pow(length, 2))/2;

        System.out.println("The area of the hexagon is: " + area);
        
    }
}
