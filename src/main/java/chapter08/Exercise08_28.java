package chapter8;

import java.util.Scanner;

public class Ex8_28 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int[][] list1 = new int[3][3];
		System.out.println("Enter list 1:");
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				list1[i][j] = input.nextInt();	
			}
		}
		
		
		int[][] list2 = new int[3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				list2[i][j] = input.nextInt();	
			}
		}
		boolean isIdentical = false;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if (list1[i][j] == list2[i][j]) {
					isIdentical = true;
				} else {
					isIdentical = false;
				}
			}
		}

		if (isIdentical) {
			System.out.println("The two arrays are strictly identical");
		} else {
			System.out.println("The two arrays are not strictly identical");
		}
	}
}

