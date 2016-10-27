package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTests {
	
	@Test
	public void testGridSize() {
		TicTacToe testClass = new TicTacToe();
		assertEquals(9, testClass.getSize());
	}

	@Test
	public void testGridIsEmpty() {
		TicTacToe testClass = new TicTacToe();
		assertEquals(true, testClass.isEmpty());
	}

	@Test
	public void testCharIsEmpty() {
		TicTacToe testClass = new TicTacToe();
		assertEquals('-', testClass.getAt(5));
	}
}
