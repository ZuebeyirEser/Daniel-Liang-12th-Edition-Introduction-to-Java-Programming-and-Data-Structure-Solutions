package Chapter3;

import java.util.Scanner;
public class Ex3_8 {
    public static void main(String[] args){
        // (Sort three integers) Write a program that prompts the user to enter three integers and
        // display the integers in non-decreasing order.
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the 3 integer so that you can ");
        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();
        double numberThree = input.nextDouble();


        if ((numberOne < numberTwo) && (numberTwo < numberThree))
            System.out.println("The non-decreasing order is " + numberOne + " >" + numberTwo + " >" + numberThree );
        else if ((numberTwo < numberOne) && (numberOne < numberThree))
            System.out.println("The non-decreasing order is " + numberTwo + " >" + numberOne + " >" + numberThree );
        else if ((numberTwo < numberThree) && (numberThree < numberOne))
            System.out.println("The non-decreasing order is " + numberTwo + " >" + numberThree + " >" + numberOne );
        else if ((numberThree < numberTwo) && (numberTwo < numberOne))
            System.out.println("The non-decreasing order is " + numberThree + " >" + numberTwo + " >" + numberOne );
        else if ((numberOne < numberThree) && (numberThree < numberTwo))
            System.out.println("The non-decreasing order is " + numberOne + " >" + numberThree + " >" + numberTwo );
        else
            System.out.println("The non-decreasing order is " + numberThree + " >" + numberOne + " >" + numberTwo );
    }
}
