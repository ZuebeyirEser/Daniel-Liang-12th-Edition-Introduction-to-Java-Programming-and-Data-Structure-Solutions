package Chapter5;

public class Ex5_4 {
    /*(Conversion from miles to kilometers) Write a program that displays the table
    (note 1 mile is 1.609 kilometers):*/
    public static void main(String[] args){
        double oneMile = 1.609;

        System.out.println("Miles" + "          " + "Kilometers");
        for (int i = 1; i < 11; i++) {
            System.out.println(i + "          " + String.format("%.3f", i*oneMile));
        }

    }
}
