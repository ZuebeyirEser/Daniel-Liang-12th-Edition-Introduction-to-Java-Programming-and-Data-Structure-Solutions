package Chapter5;

public class Ex5_5 {
    public static void main(String[] args) {
        /*(Conversion from kilograms to pounds and pounds to kilograms) Write a program that
         displays the following two tables side by side:*/
        double oneKilo = 2.2;
        System.out.printf("%-10s%-10s%-5s%-10s%-10s%n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");

        for (int i = 1, j = 20;(i< 200 && j < 516); i += 2, j += 5) {
                System.out.printf("%-10d%-10.1f%-5s%-10d%-10.2f%n", i, i * oneKilo, "|", j, j / oneKilo);
        }
    }
}
