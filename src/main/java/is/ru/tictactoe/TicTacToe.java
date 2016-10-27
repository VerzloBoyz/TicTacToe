package is.ru.tictactoe;

public class TicTacToe {
	private final int SIZE = 9;
	private final String EMPTY = "123456789";
	private final char X_Player = 'X';
	private final char O_Player = 'O';
	private final char NOBODY_HAS_WON = '-';
	private final char DRAW = '+';
	
	private char[] theGrid;

	private Boolean playerX = true;
	private int turns = 0;

	TicTacToe() {
		initialize();
	}

	private void initialize() {
		theGrid = new char[SIZE];

		char[] emptyInputs = EMPTY.toCharArray();

		for (int i = 0; i < SIZE; i++) {
			theGrid[i] = emptyInputs[i];
		}
	}

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

	private Boolean checkLegalInsert(int i) {
		if (i < 0 || i > SIZE)
			return false;

		if (theGrid[i] == X_Player || theGrid[i] == O_Player)
			return false;

		return true;
	}

	public char getAt(int i) {
		checkOutOfBounds(i);
		return theGrid[i];
	}

	private void checkOutOfBounds(int i){
		if (i < 0 || i > SIZE)
			throw new IndexOutOfBoundsException();
	}

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
		System.out.print(testClass.isEmpty());
	}
}
