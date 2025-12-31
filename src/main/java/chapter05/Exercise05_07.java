package Chapter5;

import java.util.Scanner;
public class Ex5_7 {
    /*(Financial application: compute future tuition) Suppose the tuition for a university is
    $10,000 this year and increases 5% every year. In one year, the tuition will be $10,500.
    Write a program that displays the tuition in 10 years, and the total cost of four years’
    worth of tuition starting after the tenth year.*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the current year tuition fee");
        int tuitionToday = input.nextInt();

        System.out.println("Please enter the how many year later would you like to go to uni");
        int numberOfYear = input.nextInt();


        int i = 0;
        while (i < numberOfYear ) {
            tuitionToday += tuitionToday * 0.05f;
            i++;
        }

        System.out.println("Tuition fee in " + numberOfYear + " year later is " + tuitionToday);

        int j = 0, sum = 0;
        while (j < 4) {
            tuitionToday += tuitionToday * 0.05f;
            sum += tuitionToday;
            j++;
        }
        System.out.println("Total tuiton fee is " + sum);


    }
}
