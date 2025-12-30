package Chapter3;

import java.util.Scanner;

import java.util.Scanner;
public class Ex3_20 {
    public static void main(String[] args){
        /*(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to compute the wind-chill temperature.
         The formula is valid for temperatures in the range between - 58°F and 41°F and wind speed greater than or equal to 2.
         Write a program that prompts the user to enter a temperature and a wind speed.
         The program displays the wind-chill temperature if the input is valid; otherwise,
         it displays a message indicating whether the temperature and/or wind speed is invalid.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58\u00B0F and 41\u00B0F:");
        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed ( >= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        double windChillTemperatute = 35.74 + 0.6215*temperature - 35.75*Math.pow(windSpeed,0.16) + 0.4275*temperature*Math.pow(windSpeed, 0.16);

        if (-58 < temperature && temperature < 41 && windSpeed >= 2)
            System.out.println("The wind chill temperature is: " + windChillTemperatute);
        else
            System.out.println("Invalid input! ");
    }
}
