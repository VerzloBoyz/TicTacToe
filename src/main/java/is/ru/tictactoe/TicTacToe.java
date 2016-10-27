package is.ru.tictactoe;

public class TicTacToe {
	private final int SIZE = 9;
	private final String EMPTY = "123456789";
	private final char X_Player = 'X';
	private final char O_Player = 'O';
	
	private char[] theGrid;

	private Boolean playerX = true;

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

		playerX = !playerX;
		return true;
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
	
	public static void main(String args[]) {
		TicTacToe testClass = new TicTacToe();
		System.out.print(testClass.isEmpty());
	}
}
