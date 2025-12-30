import java.util.Scanner;

public class Ex2_3 {
    /*(Convert feet into meters) Write a program that reads a number in feet, converts it 
    to meters, and displays the result. One foot is 0.305 meter. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a feet value: ");
        double feet = input.nextDouble();

        double meter = feet/0.305;

        System.out.println(feet + " feet is " + meter + "meters");
        /*closing the input is optional */
        input.close();

    }
    
}
