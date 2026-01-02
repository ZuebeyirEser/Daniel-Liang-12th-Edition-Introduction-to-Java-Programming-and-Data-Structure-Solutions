package chapter08;
import java.util.Scanner;

public class Exercise08_09 {

    public static void main(String[] args) {

        String[][] board = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
        };

        Scanner input = new Scanner(System.in);
        int count = 0;

        while (true) {

            String player = (count % 2 == 0) ? "X" : "O";

            System.out.println("Enter a row (0, 1, or 2) for player " + player);
            int row = input.nextInt();

            System.out.println("Enter a column (0, 1, or 2) for player " + player);
            int col = input.nextInt();

            if (!board[row][col].equals(" ")) {
                System.out.println("Cell already occupied. Try again.");
                continue;
            }

            board[row][col] = player;
            printBoard(board);

            String winner = checkWinner(board);
            if (!winner.equals(" ")) {
                System.out.println("Player " + winner + " wins!");
                break;
            }

            count++;
        }

        input.close();
    }

    public static void printBoard(String[][] b) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("| " + b[i][0] + " | " + b[i][1] + " | " + b[i][2] + " |");
            System.out.println("-------------");
        }
    }

    public static String checkWinner(String[][] board) {
        int n = board.length;

        // rows
        for (int i = 0; i < n; i++) {
            if (!board[i][0].equals(" ") &&
                board[i][0].equals(board[i][1]) &&
                board[i][1].equals(board[i][2])) {
                return board[i][0];
            }
        }

        // columns
        for (int j = 0; j < n; j++) {
            if (!board[0][j].equals(" ") &&
                board[0][j].equals(board[1][j]) &&
                board[1][j].equals(board[2][j])) {
                return board[0][j];
            }
        }

        // diagonals
        if (!board[0][0].equals(" ") &&
            board[0][0].equals(board[1][1]) &&
            board[1][1].equals(board[2][2])) {
            return board[0][0];
        }

        if (!board[0][2].equals(" ") &&
            board[0][2].equals(board[1][1]) &&
            board[1][1].equals(board[2][0])) {
            return board[0][2];
        }

        return " ";
    }
}

