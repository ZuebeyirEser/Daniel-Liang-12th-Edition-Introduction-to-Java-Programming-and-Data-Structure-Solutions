package Chapter7;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        printThing(() -> System.out.println(n));
        n = 6;
    }

    static void printThing(ThingToPrint thingToPrint) {
        thingToPrint.print();
    }
}
