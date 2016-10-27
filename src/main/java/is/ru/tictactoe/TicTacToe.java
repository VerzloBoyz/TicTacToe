package is.ru.tictactoe;

public class TicTacToe {
	private final int SIZE = 9;

	private final char EMPTY = '-';
	private final char X_Player = 'X';
	private final char O_Player = 'O';
	
	private char[] theGrid;

	TicTacToe() {
		initialize();
	}

	private void initialize() {
		theGrid = new char[SIZE];

		String empty = "123456789";
		char[] emptyInputs = empty.toCharArray();

		for (int i = 0; i < SIZE; i++) {
			theGrid[i] = emptyInputs[i];
		}
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
