package is.ru.tictactoe;

import static org.junit.Assert.assertEqual;





public class WebInterfaceTests extends SeleniumWrapper {
    @Test
    public void testTitle() {
        driver.get(baseUrl);
        assertEqual("Tic Tac Toe", driver.getTitle());
    }
}