package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WebInterfaceTests extends SeleniumWrapper {

    @Test
    public void testTitle() {
        driver.get(baseUrl);
        assertEquals("Tic Tac Toe", driver.getTitle());
    }
}
