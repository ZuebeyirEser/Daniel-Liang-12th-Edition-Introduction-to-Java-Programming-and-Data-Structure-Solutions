import java.util.Scanner;

public class Ex2_9 {
    /*(Physics: acceleration) Average acceleration is defined as the change of velocity 
divided by the time taken to make the change, as given by the following formula:
(v1-v0)/t 
Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds, 
then displays the average acceleration. */
    public static void main(String[] args) {
        double v1, v0, t;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter v0 v1 and t");

        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();

        double a = (v1-v0)/t;

        System.out.println("The average acceleartion is: " + a);
    }
}
