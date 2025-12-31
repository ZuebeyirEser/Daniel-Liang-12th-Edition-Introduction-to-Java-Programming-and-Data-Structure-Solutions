package Chapter6;

public class Ex6_9 {
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println("Feet    Meters  |   Meters  Feet");
        System.out.println("-------------------------------");

        for (int i = 1; i <= 10; i++) {
            double feet = i;
            double meters = footToMeter(feet);
            System.out.printf("%-7.1f %-7.3f |   ", feet, meters);

            meters = 15 + i * 5;
            feet = meterToFoot(meters);
            System.out.printf("%-7.1f %-7.3f%n", meters, feet);
        }
    }
}
