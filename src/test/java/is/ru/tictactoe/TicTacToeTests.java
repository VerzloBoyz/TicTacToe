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
	public void testCharAtIndex() {
		TicTacToe testClass = new TicTacToe();
		assertEquals('6', testClass.getAt(5));
		assertEquals('8', testClass.getAt(7));

		Boolean threwEx = false;

		try {
			assertEquals("20", testClass.getAt(20));
		}
		catch (IndexOutOfBoundsException ex) {
			threwEx = true;
		}
		assertEquals(true,threwEx);
	}
}
