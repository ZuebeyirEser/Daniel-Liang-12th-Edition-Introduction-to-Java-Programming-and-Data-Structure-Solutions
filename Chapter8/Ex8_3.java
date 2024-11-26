package Chapter8;

public class Ex8_3 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] correctCountOfStudents = new int[answers.length][2];
        for (int i = 0; i < answers.length;i++) {
            correctCountOfStudents[i][0] = i;
            correctCountOfStudents[i][1] = correctAnswerCount(answers,keys,i);
        }
        increasingOrderbubbleSort(correctCountOfStudents);
        for (int[] result : correctCountOfStudents) {
            System.out.println("Student " + result[0] + " got " + result[1] + " correct answers.");
        }



    }
    public static void increasingOrderbubbleSort(int[][] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j][1] < num[j + 1][1]) {
                    int[] temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }
    public static int correctAnswerCount(char[][] answers,char[] keys,int studentNumber) {
        int correctCount = 0;
        for (int j = 0; j < answers[studentNumber].length; j++) {
            if (answers[studentNumber][j] == keys[j]) correctCount++;
        }

        return correctCount;
    }
}
