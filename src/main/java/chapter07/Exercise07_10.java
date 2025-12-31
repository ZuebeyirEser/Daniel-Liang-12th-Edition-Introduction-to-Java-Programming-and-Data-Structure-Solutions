package Chapter7;

public class Exercise07_10 {
    public static void main(String[] args) {
        double[] myArray = {1, 2, 4.2, -3, 5};
        System.out.println(indexOfSmallestElement(myArray));
    }
    public static int indexOfSmallestElement(double[] array) {
        double small = array[0];
        int indexOfSmall = 0;
        for (int i = 0; i<array.length;i++) {
            if (array[i] < small) {
                small = array[i];
                indexOfSmall = i;
            }
        }
        return indexOfSmall;
    }
}
