package Chapter7;

public class Exercise07_13 {
    public static void main(String[] args) {
        for (int i = 0; i < 45; i++) {
            System.out.printf("%4d", getRandom(1,100,4,8,95,93));
            if ((i + 1) % 15 == 0) {
                System.out.println();
            }
        }

    }
    public static int getRandom(int start, int end, int... numbers) {
        boolean isIncluded;
        int someRandom;
        do {
            someRandom = (int) (Math.random()  * (end - start + 1)) + start ;
            isIncluded = false;
            for (int i : numbers) {
                if (i == someRandom) {
                    isIncluded = true;
                    break;
                }
            }
        } while (isIncluded);
        return someRandom;
    }
}
