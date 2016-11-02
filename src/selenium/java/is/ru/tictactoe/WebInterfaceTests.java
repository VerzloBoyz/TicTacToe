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
        Thread.sleep(2000);
        assertEquals("Tic Tac Toe", driver.getTitle());
    }

    @Test
    public void testFirstPlayer() throws InterruptedException {

        driver.get(baseUrl);

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        Thread.sleep(3000);

        String turn = driver.findElement(By.className("turn")).getText();
        assertEquals("Player 1 make your move.", turn);
    }

    @Test
    public void testXWinner() throws InterruptedException{

        driver.get(baseUrl);

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        Thread.sleep(3000);

        WebElement choice = driver.findElement(By.id("0"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("1"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("3"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("5"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("6"));
        choice.click();

        Thread.sleep(3000);

        String x = driver.findElement(By.className("info")).getText();
        assertEquals("X just won the game.", x);
    }


    @Test
    public void testNewGame() throws InterruptedException{

        driver.get(baseUrl);

        Thread.sleep(3000);

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        Thread.sleep(3000);

        String x = driver.findElement(By.className("info")).getText();
        assertEquals("", x);
    }

    @Test
    public void testOWinner() throws InterruptedException{

        driver.get(baseUrl);

        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        Thread.sleep(3000);

        WebElement choice = driver.findElement(By.id("0"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("1"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("5"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("4"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("8"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("7"));
        choice.click();

        Thread.sleep(3000);

        String x = driver.findElement(By.className("info")).getText();
        assertEquals("O just won the game.", x);
    }


    @Test
    public void testDraw() throws InterruptedException{

        driver.get(baseUrl);

        Thread.sleep(3000);

        WebElement newGame = driver.findElement(By.className("new"));
        newGame.click();

        Thread.sleep(3000);

        WebElement choice = driver.findElement(By.id("0"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("1"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("2"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("3"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("4"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("6"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("5"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("8"));
        choice.click();

        Thread.sleep(3000);

        choice = driver.findElement(By.id("7"));
        choice.click();

        Thread.sleep(3000);

        String x = driver.findElement(By.className("info")).getText();
        assertEquals("Draw!", x);
    }
}
