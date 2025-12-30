import java.util.Scanner;
public class Ex5_37 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter the integer");
		int number = input.nextInt();
		String binary = "";
		while (number>1) {
			int remainder = number%2;
			binary = remainder + binary;
			number /= 2;
		}
		System.out.println(binary);
	}
}
