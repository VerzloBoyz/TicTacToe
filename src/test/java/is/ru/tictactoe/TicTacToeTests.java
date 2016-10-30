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

    @Test
    public void testVerticalWinner() {
        TicTacToe testClass = new TicTacToe();

        testClass.insertAt(0); // X
        testClass.insertAt(1); // O
        testClass.insertAt(3); // X
        testClass.insertAt(2); // O
        testClass.insertAt(6); // X

        assertEquals('X', testClass.checkWinner());
    }

    @Test
    public void testHorizontalWinner() {
        TicTacToe testClass = new TicTacToe();

        testClass.insertAt(0); // X
        testClass.insertAt(4); // O
        testClass.insertAt(1); // X
        testClass.insertAt(3); // O
        testClass.insertAt(2); // X

        assertEquals('X', testClass.checkWinner());
    }

    @Test
    public void testDiagonalWinner() {
        TicTacToe testClass = new TicTacToe();

        testClass.insertAt(0); // X
        testClass.insertAt(5); // O
        testClass.insertAt(4); // X
        testClass.insertAt(7); // O
        testClass.insertAt(8); // X

        assertEquals('X', testClass.checkWinner());
    }

    @Test
    public void testOtherDiagonalWinner() {
        TicTacToe testClass = new TicTacToe();

        testClass.insertAt(2); // X
        testClass.insertAt(5); // O
        testClass.insertAt(4); // X
        testClass.insertAt(7); // O
        testClass.insertAt(6); // X

        assertEquals('X', testClass.checkWinner());
    }

    @Test
    public void testGetPlayer() {
        TicTacToe testClass = new TicTacToe();
        assertEquals("Player 1", testClass.getPlayer());
        testClass.insertAt(5);
        assertEquals("Player 2", testClass.getPlayer());
    }

    @Test
    public void testReset() {
        TicTacToe testClass = new TicTacToe();
        assertEquals(true, testClass.reset());
    }

    // @Test
    // public void testCheckLegalInsert() {
    //   TicTacToe testClass = new TicTacToe();
    //   testClass.insertAt(5);
    //   assertEquals(false, testClass.checkLegalInsert(5));
    // }

    @Test
    public void testNobodyWins() {
      TicTacToe testClass = new TicTacToe();
      char NOBODY_HAS_WON = '-';
      char DRAW = '+';
      testClass.insertAt(0); // X
      testClass.insertAt(3); // O
      testClass.insertAt(6); // X
      testClass.insertAt(1); // O
      assertEquals(NOBODY_HAS_WON, testClass.checkWinner());
      testClass.insertAt(7); // X
      assertEquals(NOBODY_HAS_WON, testClass.checkWinner());
      testClass.insertAt(4); // O
      testClass.insertAt(2); // X
      testClass.insertAt(8); // O
      testClass.insertAt(5); // X
      assertEquals('+', testClass.checkWinner());
    }

    @Test
    public void testWinnerXSecondCol() {
      TicTacToe testClass = new TicTacToe();

      testClass.insertAt(1); // X
      testClass.insertAt(0); // O
      testClass.insertAt(4); // X
      testClass.insertAt(3); // O
      testClass.insertAt(7); // X

      assertEquals('X', testClass.checkWinner());
    }

    @Test
    public void testWinnerXThirdCol() {

      TicTacToe testClass = new TicTacToe();

      testClass.insertAt(2); // X
      testClass.insertAt(0); // O
      testClass.insertAt(5); // X
      testClass.insertAt(3); // O
      testClass.insertAt(8); // X

      assertEquals('X', testClass.checkWinner());
    }
}
