package is.ru.tictactoe;

/*
* The TicTacToe class keeps our game data and makes sure the game is functioning correctly.
* The class has a char array which is our gameboard. It stores two players, Player X and Player O.
* The Boolean variable playerX keeps track of who's turn it is and then finally the class has an int variable which counts how many turns have passed.
*/

public class TicTacToe {

    private final int SIZE = 9;
    private final String EMPTY = "123456789";
    private final char X_Player = 'X';
    private final char O_Player = 'O';
    private final char NOBODY_HAS_WON = '-';
    private final char DRAW = '+';

    private char[] theGrid;
    private Boolean playerX;
    private int turns;

  /*
  * Starts the game.
  */
    TicTacToe() {
        initialize();
    }

    /*
    *Initializes an empty gameboard with the predefined boardsize, resets variables and sets Player X as the active player.
    */
    private void initialize() {
        theGrid = new char[SIZE];
        playerX = true;
        turns = 0;
        char[] emptyInputs = EMPTY.toCharArray();
        for (int i = 0; i < SIZE; i++) {
            theGrid[i] = emptyInputs[i];
        }
    }

    public Boolean reset(){
        initialize();
        return true;
    }

    /*
    *This function takes an input from the player and checks if it's a legal move. If so the grid is marked with the player's symbol.
    */
    public Boolean insertAt(int i) {
        if (!checkLegalInsert(i))
            return false;

        if (playerX)
            theGrid[i] = X_Player;

        if (!playerX)
            theGrid[i] = O_Player;

        turns++;
        playerX = !playerX;
        return true;
    }

    /*
    * This function checks whether the game is over or not. It then tells us whether there was a winner or if the game ended in a draw.
    */
    public char checkWinner() {
        if (turns < 5)
            return NOBODY_HAS_WON;

        if (theGrid[0] == X_Player && theGrid[3] == X_Player && theGrid[6] == X_Player)
            return X_Player;

        if (theGrid[1] == X_Player && theGrid[4] == X_Player && theGrid[7] == X_Player)
            return X_Player;

        if (theGrid[2] == X_Player && theGrid[5] == X_Player && theGrid[8] == X_Player)
            return X_Player;

        if (theGrid[0] == X_Player && theGrid[1] == X_Player && theGrid[2] == X_Player)
            return X_Player;

        if (theGrid[3] == X_Player && theGrid[4] == X_Player && theGrid[5] == X_Player)
            return X_Player;

        if (theGrid[6] == X_Player && theGrid[7] == X_Player && theGrid[8] == X_Player)
            return X_Player;

        if (theGrid[0] == X_Player && theGrid[4] == X_Player && theGrid[8] == X_Player)
            return X_Player;

        if (theGrid[2] == X_Player && theGrid[4] == X_Player && theGrid[6] == X_Player)
            return X_Player;

        if (theGrid[0] == O_Player && theGrid[3] == O_Player && theGrid[6] == O_Player)
            return O_Player;

        if (theGrid[1] == O_Player && theGrid[4] == O_Player && theGrid[7] == O_Player)
            return O_Player;

        if (theGrid[2] == O_Player && theGrid[5] == O_Player && theGrid[8] == O_Player)
            return O_Player;

        if (theGrid[0] == O_Player && theGrid[1] == O_Player && theGrid[2] == O_Player)
            return O_Player;

        if (theGrid[3] == O_Player && theGrid[4] == O_Player && theGrid[5] == O_Player)
            return O_Player;

        if (theGrid[6] == O_Player && theGrid[7] == O_Player && theGrid[8] == O_Player)
            return O_Player;

        if (theGrid[0] == O_Player && theGrid[4] == O_Player && theGrid[8] == O_Player)
            return O_Player;

        if (theGrid[2] == O_Player && theGrid[4] == O_Player && theGrid[6] == O_Player)
            return O_Player;

        if (turns == SIZE)
            return DRAW;

        return NOBODY_HAS_WON;
    }
    /*
    * Checks if the input index is a legal insert into the gameboard
    */
    private Boolean checkLegalInsert(int i) {
        if (i < 0 || i > SIZE)
            return false;

        if (theGrid[i] == X_Player || theGrid[i] == O_Player)
            return false;

        return true;
    }

    /*
    * Checks if the input index is out of bounds. if not the function returns the value stored in the input index.
    */
    public char getAt(int i) {
        checkOutOfBounds(i);
        return theGrid[i];
    }

    private void checkOutOfBounds(int i){
        if (i < 0 || i > SIZE - 1)
            throw new IndexOutOfBoundsException();
    }

    /*
    * Checks if the gameboard is empty or not.
    */
    public Boolean isEmpty() {
        for (char c : theGrid) {
            if (c == X_Player || c == O_Player) return false;
        }
        return true;
    }

    public int getSize() {
        return SIZE;
    }

    public String getPlayer() {
        if (playerX) return "Player 1";
        return "Player 2";
    }

    public static void main(String args[]) {
        TicTacToe testClass = new TicTacToe();
    }
}
