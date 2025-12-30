package Chapter2;

import java.util.Scanner;

public class Ex2_17 {
    /*How cold is it outside? The temperature alone is 
    not enough to provide the answer. Other factors including wind speed, relative humidity, and sunshine play important roles in determining coldness outside. In 2001, 
    the National Weather Service (NWS) implemented the new wind-chill temperature 
    to measure the coldness using temperature and wind speed.
    t_(wc) = 35.74 + 0.6215*t_(a) - 35.75*v^0.16 + 0.4275*t_(a)*v^0.16
    where t_(a) is the outside temperature measured in degrees Fahrenheit, v is the speed 
    measured in miles per hour, and t_(wc) is the wind-chill temperature. The formula cannot 
    be used for wind speeds below 2 mph or temperatures below -58°F or above 41°F.
    Write a program that prompts the user to enter a temperature between -58°F
    and 41°F and a wind speed greater than or equal to 2 then displays the wind-chill 
    temperature.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58\u00B0F and 41\u00B0F:");
        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed ( >= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        double windChillTemperatute = 35.74 + 0.6215*temperature - 35.75*Math.pow(windSpeed,0.16) + 0.4275*temperature*Math.pow(windSpeed, 0.16);

        System.out.println("The wind chill temperature is: " + windChillTemperatute);        
    }
}
