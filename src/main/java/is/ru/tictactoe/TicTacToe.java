package is.ru.tictactoe;

public class TicTacToe {
	private final int SIZE = 9;

	private final char EMPTY = '-';
	private final char X_Player = 'X';
	private final char Y_Player = 'Y';
	
	private char[] theGrid;

	TicTacToe() {
		initialize();
	}

	private void initialize() {
		theGrid = new char[SIZE];

		for (char x : theGrid) {
			x = EMPTY;
		}
	}

	public int getSize() {
		return SIZE;
	}
	
	public static void main(String args[]) {
		System.out.println("Tic Tac Toe");
		System.exit(0);
	}
}
