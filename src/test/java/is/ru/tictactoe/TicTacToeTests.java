package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TicTacToeTests {
// The Tic Tac Toe board is a char array of size 9, starting at 0.
// The user sees a board of size 9, starting at 1.
// char array     user input
//  0 | 1 | 2     1 | 2 | 3
//  3 | 4 | 5     4 | 5 | 6
//  6 | 7 | 8     7 | 8 | 9

@Test
public void testMain() {
        TicTacToe testClass = new TicTacToe();
        testClass.main(new String[] {"arg1", "arg2", "arg3"});
}

@Test
public void testGridSize() {
        TicTacToe testClass = new TicTacToe();
        assertEquals(9, testClass.getSize());
}

@Test
public void testGridIsEmpty() {
        TicTacToe testClass = new TicTacToe();
        assertTrue(testClass.isEmpty());
        testClass.insertAt(5);
        assertFalse(testClass.isEmpty());
}

@Test
public void testCharAtIndex() {
        TicTacToe testClass = new TicTacToe();
        assertEquals('6', testClass.getAt(5));
}

@Test(expected = IndexOutOfBoundsException.class)
public void testCharAtIndexFails() {
        TicTacToe testClass = new TicTacToe();
        testClass.insertAt(3); // X
        testClass.getAt(20);
}

@Test
public void testInsertAt() {
        TicTacToe testClass = new TicTacToe();
        testClass.insertAt(3); // X
        assertTrue(testClass.insertAt(4));
        assertFalse(testClass.insertAt(20));
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

@Test
public void testCheckLegalInsert() {
        TicTacToe testClass = new TicTacToe();
        testClass.insertAt(5); // X
        assertEquals(false, testClass.insertAt(5)); // O
        assertEquals(true, testClass.insertAt(0));
        assertEquals(false, testClass.insertAt(11));
}

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

// X wins tests

@Test
public void playerXWinsInTheFirstColumn() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     X | O | O
        //  3 | 4 | 5     X |   |
        //  6 | 7 | 8     X |   |

        testClass.insertAt(0); // X
        testClass.insertAt(1); // O
        testClass.insertAt(3); // X
        testClass.insertAt(2); // O
        testClass.insertAt(6); // X

        assertEquals('X', testClass.checkWinner());
}

@Test
public void playerXWinsInTheSecondColumn() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     O | X |
        //  3 | 4 | 5     O | X |
        //  6 | 7 | 8       | X |

        testClass.insertAt(1); // X
        testClass.insertAt(0); // O
        testClass.insertAt(4); // X
        testClass.insertAt(3); // O
        testClass.insertAt(7); // X

        assertEquals('X', testClass.checkWinner());
}

@Test
public void playerXWinsInTheThirdColumn() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     O |   | X
        //  3 | 4 | 5     O |   | X
        //  6 | 7 | 8       |   | X

        testClass.insertAt(2); // X
        testClass.insertAt(0); // O
        testClass.insertAt(5); // X
        testClass.insertAt(3); // O
        testClass.insertAt(8); // X

        assertEquals('X', testClass.checkWinner());
}

@Test
public void playerXWinsInTheFirstRow() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     X | X | X
        //  3 | 4 | 5       | O | O
        //  6 | 7 | 8       |   |

        testClass.insertAt(0); // X
        testClass.insertAt(4); // O
        testClass.insertAt(1); // X
        testClass.insertAt(5); // O
        testClass.insertAt(2); // X

        assertEquals('X', testClass.checkWinner());
}

@Test
public void playerXWinsInTheSecondRow() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     O |   | O
        //  3 | 4 | 5     X | X | X
        //  6 | 7 | 8       |   |

        testClass.insertAt(3); // X
        testClass.insertAt(0); // O
        testClass.insertAt(4); // X
        testClass.insertAt(2); // O
        testClass.insertAt(5); // X

        assertEquals('X', testClass.checkWinner());
}

@Test
public void playerXWinsInTheThirdRow() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     O |   | O
        //  3 | 4 | 5       |   |
        //  6 | 7 | 8     X | X | X

        testClass.insertAt(6); // X
        testClass.insertAt(0); // O
        testClass.insertAt(7); // X
        testClass.insertAt(2); // O
        testClass.insertAt(8); // X

        assertEquals('X', testClass.checkWinner());
}

@Test
public void playerXWinsInMainDiagonal() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     X |   |
        //  3 | 4 | 5       | X | O
        //  6 | 7 | 8       | O | X

        testClass.insertAt(0); // X
        testClass.insertAt(5); // O
        testClass.insertAt(4); // X
        testClass.insertAt(7); // O
        testClass.insertAt(8); // X

        assertEquals('X', testClass.checkWinner());
}

@Test
public void playerXWinsInMinorDiagonal() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2       |   | X
        //  3 | 4 | 5       | X | O
        //  6 | 7 | 8     X | O |

        testClass.insertAt(2); // X
        testClass.insertAt(5); // O
        testClass.insertAt(4); // X
        testClass.insertAt(7); // O
        testClass.insertAt(6); // X

        assertEquals('X', testClass.checkWinner());
}

// O wins tests

@Test
public void playerOWinsInTheFirstColumn() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     O | X | X
        //  3 | 4 | 5     O | X |
        //  6 | 7 | 8     O |   |

        testClass.insertAt(1); // X
        testClass.insertAt(0); // O
        testClass.insertAt(2); // X
        testClass.insertAt(3); // O
        testClass.insertAt(4); // X
        testClass.insertAt(6); // O

        assertEquals('O', testClass.checkWinner());
}

@Test
public void playerOWinsInTheSecondColumn() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     X | O | X
        //  3 | 4 | 5     X | O |
        //  6 | 7 | 8       | O |

        testClass.insertAt(0); // X
        testClass.insertAt(1); // O
        testClass.insertAt(3); // X
        testClass.insertAt(4); // O
        testClass.insertAt(2); // X
        testClass.insertAt(7); // O

        assertEquals('O', testClass.checkWinner());
}

@Test
public void playerOWinsInTheThirdColumn() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     X | X | O
        //  3 | 4 | 5       | X | O
        //  6 | 7 | 8       |   | O

        testClass.insertAt(4); // X
        testClass.insertAt(2); // O
        testClass.insertAt(0); // X
        testClass.insertAt(8); // O
        testClass.insertAt(1); // X
        testClass.insertAt(5); // O

        assertEquals('O', testClass.checkWinner());
}

@Test
public void playerOWinsInTheFirstRow() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     O | O | O
        //  3 | 4 | 5       | X | X
        //  6 | 7 | 8       |   | X

        testClass.insertAt(4); // X
        testClass.insertAt(0); // O
        testClass.insertAt(5); // X
        testClass.insertAt(1); // O
        testClass.insertAt(8); // X
        testClass.insertAt(2); // O

        assertEquals('O', testClass.checkWinner());
}

@Test
public void playerOWinsInTheSecondRow() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     X | X |
        //  3 | 4 | 5     O | O | O
        //  6 | 7 | 8     X |   |

        testClass.insertAt(0); // X
        testClass.insertAt(3); // O
        testClass.insertAt(1); // X
        testClass.insertAt(4); // O
        testClass.insertAt(6); // X
        testClass.insertAt(5); // O


        assertEquals('O', testClass.checkWinner());
}

@Test
public void playerOWinsInTheThirdRow() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     X |   | X
        //  3 | 4 | 5       | X |
        //  6 | 7 | 8     O | O | O

        testClass.insertAt(4); // X
        testClass.insertAt(6); // O
        testClass.insertAt(0); // X
        testClass.insertAt(8); // O
        testClass.insertAt(2); // X
        testClass.insertAt(7); // O

        assertEquals('O', testClass.checkWinner());
}

@Test
public void playerOWinsInMainDiagonal() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2     O |   | X
        //  3 | 4 | 5       | O | X
        //  6 | 7 | 8       | X | O

        testClass.insertAt(2); // X
        testClass.insertAt(4); // O
        testClass.insertAt(5); // X
        testClass.insertAt(8); // O
        testClass.insertAt(7); // X
        testClass.insertAt(0); // O

        assertEquals('O', testClass.checkWinner());
}

@Test
public void playerOWinsInMinorDiagonal() {
        TicTacToe testClass = new TicTacToe();

        // char array     board
        //  0 | 1 | 2       |   | O
        //  3 | 4 | 5       | O | X
        //  6 | 7 | 8     O | X | X

        testClass.insertAt(8); // X
        testClass.insertAt(4); // O
        testClass.insertAt(7); // X
        testClass.insertAt(6); // O
        testClass.insertAt(5); // X
        testClass.insertAt(2); // O

        assertEquals('O', testClass.checkWinner());
}
}
