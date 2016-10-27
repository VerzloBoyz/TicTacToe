package is.ru.tictactoe;

public class TicTacToe {
	TicTacToe() {
		theGrid = new int[SIZE];

		for (int g : theGrid) {
			g = EMPTY;
		}
	}

	private final int SIZE = 9;

	private final int EMPTY = 0;
	private final int X_Player = 1;
	private final int Y_Player = 2;
	
	private int[] theGrid;

	public int getSize() {
		return SIZE;
	}
	
	public static void main(String args[]) {
		System.out.println("Tic Tac Toe");
		System.exit(0);
	}
}
