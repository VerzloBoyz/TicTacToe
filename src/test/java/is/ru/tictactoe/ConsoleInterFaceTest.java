package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConsoleInterFaceTests {

  @Test
  public void testMain() {
    TicTacToe testClass = new ConsoleInterface();
    testClass.main(new String[] {"arg1", "arg2", "arg3"});
  }

}
