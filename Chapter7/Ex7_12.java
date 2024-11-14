package Chapter7;

import java.util.Arrays;

public class Ex7_12 {
    public static void main(String[] args) {
        Integer[] myArray = {1,2,3,4,5,6,7};
        Integer[] myReversedArray = reverseArray(myArray);
        System.out.println(Arrays.toString(myReversedArray));

    }
    // Dont scare form this diamond<> symbol it just shows the type
    // we cannot pass primitive as type instead use wrapper Integer, Double etc
    // our return type is array of passed type if we pass Integer[] array then we return the same array
    public static <T> T[] reverseArray(T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            // take array first element as temp
            // temp is 1
            T temp = array[i];
            // now assign first element to the array last element
            // array[0] is array[-1]
            array[i] = array[array.length - 1 - i];
            // now assign last element of an array to tempoarary value
            // array[-1] is temp and so on so forth
            array[array.length - 1 - i] = temp;
        }
        return array;

    }
}
