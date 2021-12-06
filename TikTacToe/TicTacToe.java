package TikTacToe;

// import scanner
import java.util.Scanner;

public class TicTacToe {
    public static Scanner input = new Scanner(System.in);

/* 
	 * Main Method for Final Step - Delete your main method 
	 * and uncomment this one. 
	 * Runs the game by getting input from the user, making the 
	 * appropriate moves, and prints who won or if it was a stalemate. 
	*/ 
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        TicTacToe(board);

        while (true) {
            // Prompt the first player
            play(board, 'X');

            //check if the winner is player X
            TicTacToe(board);
            if (won('X', board)) {
                System.out.println("Player X Wins!!!");
                System.exit(1);
            } else if (stalemate(board)) {
                System.out.println("Stalemate");
                System.exit(2);
            }
            /*
	        * Switches the current player from X to O, or O to X.
	        */
            // Prompt the second player
            play(board, 'O');
            TicTacToe(board);
            //check if the winner is player O
            if (won('O', board)) {
                System.out.println("Player O Wins!!!");
                System.exit(3);
            } else if (stalemate(board)) {
                System.out.println("Stalemate");
                System.exit(4);
            }
        }
    }

       /* 
	 * Instantiate board to be a 3 by 3 char array of spaces.
	 * Set player to be 'X'.
	 */
    static void TicTacToe (char[][] board) {
        System.out.println("\n-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++)
                System.out.print(board[i][j] != '\u0000' ? board[i][j] + " | " : "  | ");
            System.out.println("\n-------------");
        }
    }

    /* 
	 * If s represents a valid move, add the current player's symbol to the board and return true.
	 * Otherwise return false.
	 */

    public static void play(char[][] board, char player) {
        boolean done = false;
        //if the cell isn't taken then set done = true
        do {
            System.out.print("Enter a row for player " + player + ": ");
            //user input value - 1, for index start with0
            int row = input.nextInt() - 1;
            if(row > 2 || row < 0){
                System.out.println("out of range");
                continue;
            }
            System.out.print("Enter a column for player " + player + ": ");
             //user input value - 1, for index start with0
            int column = input.nextInt() - 1;
            if(column > 2 || column < 0){
                System.out.println("out of range");
                continue;
            }
            //check if the cell is taken
            if (board[row][column] == '\u0000') { // an empty cell
                board[row][column] = player;
                done = true;
            } else
                System.out.println("This cell is already occupied. Try a different cell");
        } while (!done);
    }

 
    /*
	 * Returns true if the current player has won the game.
	 * Three in a row, column or either diagonal.
	 * Otherwise, return false.
	 */
    public static boolean won(char ch, char[][] board) {
        // Check rows
        for (int i = 0; i < 3; i++)
            if (ch == board[i][0] && ch == board[i][1] && ch == board[i][2])
                return true;

        // Check columns
        for (int j = 0; j < 3; j++)
            if (ch == board[0][j] && ch == board[1][j] && ch == board[2][j])
                return true;

        // Check major diagonal
        if (ch == board[0][0] && ch == board[1][1] && ch == board[2][2])
            return true;

        // Check sub diagonal
        if (ch == board[0][2] && ch == board[1][1] && ch == board[2][0])
            return true;

        return false;
    }

    public static boolean stalemate(char[][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == '\u0000')
                    return false;

        return true; // All cells are now occupied
    }
}