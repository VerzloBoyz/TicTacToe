package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTests {
	
	@Test
	public void ConstructorTest(){
		TicTacToe testClass = new TicTacToe();
		assertEquals(9, testClass.getSize());
	}

}
