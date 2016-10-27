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

		for (int i = 0; i < SIZE; i++) {
			theGrid[i] = EMPTY;
		}
	}

	public Boolean isEmpty() {
		for (char c : theGrid) {
			if (c != '-') {
				return false;
			}
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
