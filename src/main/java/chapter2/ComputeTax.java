package Chapter2;

import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("(0-single filer, 1-married jointly or " +
				"qualifying widow(er), 2-married separately, 3-head of " + 
				"household) Enter the filing status: ");
		int status = input.nextInt();
		
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		double tax = 0;
		
		if (status == 0) {
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350)*0.15;
			else if (income <= 82250)
				tax =  8350 * 0.10 + (33950 - 8350)*0.15 + (income - 33950)*0.25;
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350)*0.15 + (82250 - 33950)*0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
			else 
				 tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
			
		}
		else if (status == 1) {
			if (income <= 16_700)
				tax = income * 0.10;
			else if (income <= 67_900)
				tax = 16700 * 0.10 + (income - 16700)*0.15;
			else if (income <= 137050)
				tax =  2 * 8350 * 0.10 + 2*(33950 - 8350)*0.15 + (income - 33950*2)*0.25;
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350)*0.15 + (82250 - 33950)*0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
			else 
				 tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;

			
		}
		else if (status == 2) {
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350)*0.15;
			else if (income <= 68525)
				tax = 8350 * 0.10 + (33950 - 8350)*0.15 + (income - 33950)*0.25;
			else if (income <= 104425)
				tax = 8350 * 0.10 + (33950 - 8350)*0.15 + (68525 - 33950)*0.25 + (income - 104425) * 0.28;
			else if (income <= 186475)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (income - 186575) * 0.33;
			else 
				 tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186575 - 104425) * 0.33 + (income - 186575) * 0.35;
			
		}
		else if (status == 3) {
			if (income <= 11950)
				tax = income * 0.10;
			else if (income <= 45500)
				tax = 8350 * 0.10 + (income - 8350)*0.15;
			else if (income <= 117450)
				tax = 8350 * 0.10 + (45500 - 8350)*0.15 + (income - 45500)*0.25;
			else if (income <= 190200)
				tax = 8350 * 0.10 + (45500 - 8350)*0.15 + (117450 - 33950)*0.25 + (income - 117450) * 0.28;
			else if (income <= 372951)
				tax = 8350 * 0.10 + (45500 - 8350)*0.15 + (117450 - 33950)*0.25 + (190200 - 117450) * 0.28 + (income - 190200) * 0.33;
			else 
				 tax = 8350 * 0.10 + (45500 - 8350) * 0.15 + (117450 - 33950) * 0.25 + (190200 - 117450) * 0.28 + (372951 - 190200) * 0.33 + (income - 372951) * 0.35;
		
			
		}
		else {
			System.out.println("Error in valid status");
			System.exit(1);
		}
		System.out.println("The tax for given yearly taxable income is: " + (int)(tax * 100) / 100.0);
	}
	

}
