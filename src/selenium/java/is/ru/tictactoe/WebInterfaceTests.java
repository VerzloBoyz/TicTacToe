package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebInterfaceTests extends SeleniumWrapper {

    @Test
    public void testTitle() throws InterruptedException {

        driver.get(baseUrl);

        waitForLoad();

        assertEquals("Tic Tac Toe", driver.getTitle());
    }

    @Test
    public void testFirstPlayer() throws InterruptedException {

        driver.get(baseUrl);

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        waitForLoad();

        String turn = driver.findElement(By.className("turn")).getText();
        assertEquals("Player 1 make your move.", turn);
    }

/*
    @Test
    public void testXWinner() throws InterruptedException{

        driver.get(baseUrl);

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        Thread.sleep(2000);

        WebElement choice = driver.findElement(By.id("0"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("1"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("3"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("5"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("6"));
        choice.click();

        waitForLoad();

        String x = driver.findElement(By.className("info")).getText();
        assertEquals("X just won the game.", x);
    }

*/
    @Test
    public void testNewGame() throws InterruptedException{

        driver.get(baseUrl);

        waitForLoad();

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        waitForLoad();

        String x = driver.findElement(By.className("info")).getText();
        assertEquals("", x);
    }

    @Test
    public void testX() throws InterruptedException{

        driver.get(baseUrl);

        waitForLoad();

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        waitForLoad();

        WebElement choice = driver.findElement(By.id("0"));
        choice.click();

        waitForLoad();

        String x = driver.findElement(By.id("0")).getAttribute("class");
        assertEquals("X", x);
    }

    @Test
    public void testO() throws InterruptedException{

        driver.get(baseUrl);

        waitForLoad();

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        waitForLoad();

        WebElement choice = driver.findElement(By.id("0"));
        choice.click();

        waitForLoad();

        WebElement choiceTwo = driver.findElement(By.id("1"));
        choiceTwo.click();

        waitForLoad();

        String o = driver.findElement(By.id("1")).getAttribute("class");
        assertEquals("O", o);
    }

/*
    @Test
    public void testOWinner() throws InterruptedException{

        driver.get(baseUrl);

        waitForLoad();

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        waitForLoad();

        WebElement choice = driver.findElement(By.id("0"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("1"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("5"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("4"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("8"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("7"));
        choice.click();

        waitForLoad();

        String x = driver.findElement(By.className("info")).getText();
        assertEquals("O just won the game.", x);
    }


    @Test
    public void testDraw() throws InterruptedException{

        driver.get(baseUrl);

        waitForLoad();

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        waitForLoad();

        WebElement choice = driver.findElement(By.id("0"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("1"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("2"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("3"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("4"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("6"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("5"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("8"));
        choice.click();

        waitForLoad();

        choice = driver.findElement(By.id("7"));
        choice.click();

        waitForLoad();

        String x = driver.findElement(By.className("info")).getText();
        assertEquals("Draw!", x);
    }

*/
}
