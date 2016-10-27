package is.ru.tictactoe;

public class ConsoleInterface {

	private TicTacToe game;

	ConsoleInterface(){

		game = new TicTacToe();

		System.out.println("Welcome to Tic Tac Toe.");
        System.out.println("Player 1 is X");
        System.out.println("Player 2 is O");
        System.out.println("Player 1 starts");
	}

	public static void main(String args[]) {
		
        ConsoleInterface interf = new ConsoleInterface();
        

	}
}
