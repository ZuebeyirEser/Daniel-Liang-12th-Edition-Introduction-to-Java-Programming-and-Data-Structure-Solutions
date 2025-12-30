import java.util.Scanner;

public class Ex2_14 {
    /*(Health application: computing BMI) Body Mass Index (BMI) is a measure of 
    health on weight. It can be calculated by taking your weight in kilograms and dividing, by the square of your height in meters. Write a program that prompts the user to 
    enter a weight in pounds and height in inches and displays the BMI. Note one pound 
    is 0.45359237 kilograms and one inch is 0.0254 meters. 
    Since We use metric system I am going to implement in meters*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your weight in kg: e.g. 80.67 ");
        double weight = input.nextDouble();

        System.out.println("Please enter your height in meters: e.g 1.80 ");
        double height = input.nextDouble();

        double BMI = weight/(Math.pow(height,2));

        System.out.println("Your BMI is: " + BMI);
    }
}
