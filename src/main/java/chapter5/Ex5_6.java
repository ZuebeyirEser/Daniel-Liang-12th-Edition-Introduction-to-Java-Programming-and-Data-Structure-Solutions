package Chapter5;

public class Ex5_6 {
    /*Write a program that displays the following two tables side by side:
    */
    public static void main(String[] args){
        double oneMile = 1.609;
        System.out.printf("%-10s%-10s%-5s%-10s%-10s%n", "Miles", "Kilometers", "|", "Kilometers", "Miles");

        for (int i = 1, j = 20; (i < 11 && j < 66); i++, j += 5) {
            System.out.printf("%-10d%-10.3f%-5s%-10d%-10.3f%n", i, i*oneMile, "|", j, j/oneMile);
        }
    }
}
