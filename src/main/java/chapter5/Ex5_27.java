package Chapter5;

public class Ex5_27 {
    public static void main(String[] args) {
        int counter = 0;
        for (int year = 101;year <= 2100;year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                counter++;
                System.out.print(year + " ");
                if (counter == 9) {
                    counter = 0;
                    System.out.println();
                }

            }
        }
    }
}
