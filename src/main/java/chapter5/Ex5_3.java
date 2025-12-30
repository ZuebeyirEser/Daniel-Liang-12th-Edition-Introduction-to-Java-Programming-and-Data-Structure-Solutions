package Chapter5;

public class Ex5_3 {
    /*Write a program that displays the follow-ing table (note 1 kilogram is 2.2 pounds
    * (note 1 mile is 1.609 kilometers)*/
    public static void main(String[] args){
        double oneKilo = 2.2;

        System.out.println("Kilograms" + "          " + "Pounds");
        for (int i = 1; i < 200; i += 2) {
            System.out.println(i + "          " + String.format("%.1f", i*oneKilo));
        }

    }
}
