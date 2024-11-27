import java.util.Scanner;
import java.util.Stack;;

public class TestBooleanOperator {

	public static void main(String[] args) {
		// checks whether a number is divisible by 2 and 3, by 2 or 3, and by 2 or 3 but not both.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a digit: ");
		int number = input.nextInt();
		
		if (number % 2 == 0 && number % 3 == 0)
			System.out.println(number + " is divisible by 2 and 3");
		
		if (number % 2 == 0 || number % 3 == 0)
			System.out.println(number + " is divisible by 2 or 3");
		if (number % 2 == 0 ^ number % 3 == 0)
			System.out.println(number + "is divisible by 2 or 3, but noth both");

	}

}
