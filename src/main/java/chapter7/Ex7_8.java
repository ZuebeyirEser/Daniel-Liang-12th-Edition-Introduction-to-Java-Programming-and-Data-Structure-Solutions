package Chapter7;

import java.util.Scanner;

public class Ex7_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integer: ");

        int[] intArray = new int[10];
        for (int i = 0; i < 10; i++) {
            intArray[i] = input.nextInt();
        }
        System.out.println("Average is " + average(intArray));

        System.out.println("Enter 10 floating number");
        double[] doubleArray = new double[10];
        for (int i = 0; i < 10; i++) {
            doubleArray[i] = input.nextDouble();
        }
        System.out.println("Average is " + average(doubleArray));

        input.close();

    }
    public static double average(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return  sum/array.length;

    }
    public static double average(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        return  sum/array.length;
    }
}
