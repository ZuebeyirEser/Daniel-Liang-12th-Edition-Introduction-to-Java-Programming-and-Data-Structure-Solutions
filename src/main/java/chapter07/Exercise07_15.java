package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Please enter 10 number: ");
        for (int i = 0; i<10;i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Count of unique numbers are: ");
        int[] uniqueArray = eliminateDuplicate(array);
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(" " + uniqueArray[i]);
        }






    }

    public static int[] eliminateDuplicate(int[] list) {
        int[] uniqueArray =  new int[countUnique(list)];
        int indexForUniqueArray = 0;
        for (int i = 0; i < uniqueArray.length; i++) {
            if (linearSearch(uniqueArray,list[i]) == -1) {
                uniqueArray[indexForUniqueArray] = list[i];
                indexForUniqueArray++;
            }
        }
        return uniqueArray;
    }
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++){
            if (key == list[i]){
                return i;
            }
        }
        return -1;
    }

    public static int countUnique(int[] list) {
        int uniqueCount = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < list.length; j++) {
                // in our two pointer approach we should not count if both index are the same thus
                if (i != j && list[i] == list[j]) {
                    isUnique = false; // Found a duplicate
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }
        return uniqueCount;
    }


}
