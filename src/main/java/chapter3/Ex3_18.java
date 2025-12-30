package Chapter3;
import java.util.Scanner;
public class Ex3_18 {
    public static void main(String[] args){
        /*(Cost of shipping) A shipping company uses the following function to calculate
         the cost (in dollars) of shipping based on the weight of the package (in pounds).
         3.5,  if 0 < w <= 1
         5.5,  if 1 < w <= 3
         8.5,  if 3 < w <= 10
         10.5, if 10 < w <= 20
         Write a program that prompts the user to enter the weight of the package and displays the shipping cost.
         If the weight is negative or zero, display a message “Invalid input.”
         If the weight is greater than 20, display a message “The package cannot be shipped.”
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weight in pounds");
        double weight = input.nextDouble();

        if (weight <= 0)
            System.out.println("Invalid input");
        else if (0 < weight && weight <= 1)
            System.out.println("The cost of the shipment is 3.50 usd");
        else if (1 < weight && weight <= 3)
            System.out.println("The cost of the shipment is 5.50 usd");
        else if (3 < weight && weight <= 10)
            System.out.println("The cost of the shipment is 8.50 usd");
        else if (10 < weight && weight <= 20)
            System.out.println("The cost of the shipment is 10.50 usd");
        else
            System.out.println("The package cannot be shipped");
    }
}
