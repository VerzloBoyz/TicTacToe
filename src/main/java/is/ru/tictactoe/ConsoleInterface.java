package is.ru.tictactoe;

import java.util.Scanner;

public class ConsoleInterface {

	private TicTacToe game;
	private Scanner scanner = new Scanner(System.in);

	ConsoleInterface(){

		game = new TicTacToe();
		greeting();
		printGrid();
		getInput();
		scanner.close();
	}

	private void greeting() {
		printHeader();
		System.out.println();
		System.out.println("Welcome to Tic Tac Toe.");
		System.out.println("Player 1 is X");
		System.out.println("Player 2 is O");
		System.out.println("Player 1 starts");
	}

	private void printHeader() {
		System.out.println("████████╗██╗ ██████╗    ████████╗ █████╗  ██████╗    ████████╗ ██████╗ ███████╗");
		System.out.println("╚══██╔══╝██║██╔════╝    ╚══██╔══╝██╔══██╗██╔════╝    ╚══██╔══╝██╔═══██╗██╔════╝");
		System.out.println("   ██║   ██║██║            ██║   ███████║██║            ██║   ██║   ██║█████╗  ");
		System.out.println("   ██║   ██║██║            ██║   ██╔══██║██║            ██║   ██║   ██║██╔══╝  ");
		System.out.println("   ██║   ██║╚██████╗       ██║   ██║  ██║╚██████╗       ██║   ╚██████╔╝███████╗");
		System.out.println("   ╚═╝   ╚═╝ ╚═════╝       ╚═╝   ╚═╝  ╚═╝ ╚═════╝       ╚═╝    ╚═════╝ ╚══════╝");
		System.out.println("");	
	}

	private void printGrid() {
        	System.out.println();
		System.out.println("       |       |");
		System.out.println("   " + game.getAt(0) + "   |   " + game.getAt(1) + "   |   " + game.getAt(2));
		System.out.println("       |       |");
        	System.out.println("-------|-------|-------");
		System.out.println("       |       |");
		System.out.println("   " + game.getAt(3) + "   |   " + game.getAt(4) + "   |   " + game.getAt(5));
		System.out.println("       |       |");
		System.out.println("-------|-------|-------");
		System.out.println("       |       |");
		System.out.println("   " + game.getAt(6) + "   |   " + game.getAt(7) + "   |   " + game.getAt(8));
		System.out.println("       |       |");
		System.out.println();
    }

	private void getInput() {
		System.out.print(game.getPlayer() + ": ");
		
		int choice = scanner.nextInt() - 1;

		while (!game.insertAt(choice)) {
			choice = scanner.nextInt() - 1;
		}

		if(gameEnd()) {
			return;
		}

		printGrid();
		getInput();
	}

	private Boolean gameEnd() {
		if(game.checkWinner() == 'X' || game.checkWinner() == 'O') {
			printGrid();
			System.out.println(game.checkWinner() + " HAS WON!");
			return true;
		} else if (game.checkWinner() == '+') {
			printGrid();
			System.out.println("It's a draw");
			return true;
		}

		return false;
	}

	public static void main(String args[]) {
		
        ConsoleInterface interf = new ConsoleInterface();


	}
}
