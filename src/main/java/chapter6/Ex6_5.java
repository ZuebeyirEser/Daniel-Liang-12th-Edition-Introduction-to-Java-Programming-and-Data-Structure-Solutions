package Chapter6;

/*
* Strategy: is swaping using array
* */

public class Ex6_5 {
    public static void main(String[] args) {
        displaySortedNumber(5,3,11);
    }
    public static void displaySortedNumber(double num1, double num2, double num3) {
        double[] sorted = {num1,num2,num3};

        if (sorted[0] > sorted[1]) {
            swap(sorted, 0, 1);
        }
        if (sorted[1] > sorted[2]) {
            swap(sorted, 1, 2);
        }
        if (sorted[0] > sorted[1]) {
            swap(sorted, 0, 1);
        }
        System.out.println("Sorted numbers: " + sorted[0] + ", " +
                sorted[1] + ", " + sorted[2]);
    }
    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
