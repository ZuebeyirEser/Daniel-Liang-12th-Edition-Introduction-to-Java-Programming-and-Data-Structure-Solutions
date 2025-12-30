import java.util.Scanner;

public class Ex2_10 {
    /*(Science: calculating energy) Write a program that calculates the energy needed 
to heat water from an initial temperature to a final temperature. Your program 
should prompt the user to enter the amount of water in kilograms and the initial 
and final temperatures of the water. The formula to compute the energy is
Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, initial and final temperatures are in 
degrees Celsius, and energy Q is measured in joules.  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the amount of water in kg: ");
        double M = input.nextDouble();

        System.out.println("enter initial temp of the water: ");
        double initialTemperature = input.nextDouble();

        System.out.println("enter the final temp of the water: ");
        double finalTemperature = input.nextDouble();

        double Q = M*(finalTemperature - initialTemperature)*4184;

        System.out.println("The energy needed is: " + Q + "joules");


    }

}
