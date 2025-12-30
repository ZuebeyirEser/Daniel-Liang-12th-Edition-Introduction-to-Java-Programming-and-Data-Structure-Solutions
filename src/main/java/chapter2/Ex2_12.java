import java.util.Scanner;

import java.lang.Math;

public class Ex2_12 {
    /* (Physics: finding runway length) Given an airplane’s acceleration a and take-off 
    speed v, you can compute the minimum runway length needed for an airplane to 
    take off using the following formula: 
    length = (v^2)/2a 
    Write a program that prompts the user to enter v in meters/second (m/s) and 
    the acceleration a in meters/second squared (m/s2), then, displays the minimum runway length.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter take off speed: ");
        double v = input.nextDouble();

        System.out.println("Please enter airplane's acceleration: ");
        double a = input.nextDouble();

        double length = Math.pow(v,2)/(2*a);

        System.out.println("Minimum ranaway length for plane the take off is: " + length);  
        
        
    }
}
