package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testCharAtIndexFails() {
		TicTacToe testClass = new TicTacToe();
		testClass.getAt(20);
	}

	@Test
	public void testInsertAt() {
		TicTacToe testClass = new TicTacToe();
		assertTrue(testClass.insertAt(4));
		assertFalse(testClass.insertAt(20));
	}
}
