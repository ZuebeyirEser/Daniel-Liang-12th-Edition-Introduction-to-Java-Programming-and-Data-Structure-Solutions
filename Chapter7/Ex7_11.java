package Chapter7;

import java.util.Scanner;

public class Ex7_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 number");
        double[] array = new double[10];
        for (int i = 0; i<10; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println("The mean is " + mean(array));
        System.out.println("The deviation is " + deviation(array));

    }
    public static double mean(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum/array.length;
    }
    public static double deviation(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.pow(array[i]-mean(array),2);
        }
        return Math.sqrt(sum/array.length-1);
    }

}
