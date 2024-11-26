package Chapter8;

public class Ex8_4 {
    public static void main(String[] args) {
        int[][] workingHours = {
                {3, 5, 7, 2, 9, 9, 8},
                {1, 2, 6, 8, 5, 3, 7},
                {7, 0, 3, 4, 0, 5, 2},
                {2, 8, 5, 7, 4, 6, 3},
                {5, 3, 8, 0, 2, 7, 4},
                {6, 7, 4, 3, 8, 2, 5},
                {1, 4, 2, 5, 3, 6, 3},
                {3, 6, 7, 4, 2, 7, 5}
        };
        int[][] countOfWorkingHours = new int[workingHours.length][2];
        for (int i = 0; i < workingHours.length;i++) {
            countOfWorkingHours[i][0] = i;
            countOfWorkingHours[i][1] = sumOfHours(workingHours,i);
        }
        decreasingOrderBubbleSort(countOfWorkingHours);
        for (int[] e : countOfWorkingHours) {
            System.out.println("Worker " + e[0] + " got " + e[1] + "  hours.");
        }
    }
    public static void decreasingOrderBubbleSort(int[][] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j][1] > num[j + 1][1]) {
                    int[] temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }
    public static int sumOfHours(int[][] hours,int employee) {
        int count = 0;
        for (int j = 0; j < hours[employee].length; j++) {
            count += hours[employee][j];
        }
        return count;

    }
}
