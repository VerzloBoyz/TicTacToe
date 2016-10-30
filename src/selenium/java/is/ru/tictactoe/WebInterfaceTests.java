package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebInterfaceTests extends SeleniumWrapper {

    @Test
    public void testTitle() throws InterruptedException {
        assertEquals("Tic Tac Toe", driver.getTitle());
    }

    @Test
    public void testFirstPlayer() {

      String turn = driver.findElement(By.className("turn")).getText();
      assertEquals("Player 1 make your move.", turn);
    }

    @Test
    public void testXWinner() throws InterruptedException{

      driver.navigate().refresh();

      WebElement newGame = driver.findElement(By.className("new"));
      newGame.click();

      WebElement one = driver.findElement(By.id("0"));
      one.click();

      WebElement two = driver.findElement(By.id("1"));
      two.click();

      WebElement three = driver.findElement(By.id("3"));
      three.click();

      WebElement four = driver.findElement(By.id("5"));
      four.click();

      WebElement five = driver.findElement(By.id("6"));
      five.click();

      String x = driver.findElement(By.className("info")).getText();

      Thread.sleep(2000);
      assertEquals("X just won the game.", x);
    }

    @Test
    public void testNewGame() throws InterruptedException{
      driver.navigate().refresh();

      WebElement newGame = driver.findElement(By.className("new"));
      newGame.click();

      String x = driver.findElement(By.className("info")).getText();
      Thread.sleep(2000);
      assertEquals("", x);
    }

    @Test
    public void testOWinner() throws InterruptedException{

      driver.navigate().refresh();

      WebElement newGame = driver.findElement(By.className("new"));
      newGame.click();

      WebElement one = driver.findElement(By.id("0"));
      one.click();

      WebElement two = driver.findElement(By.id("1"));
      two.click();

      WebElement three = driver.findElement(By.id("5"));
      three.click();

      WebElement four = driver.findElement(By.id("4"));
      four.click();

      WebElement five = driver.findElement(By.id("8"));
      five.click();

      WebElement six = driver.findElement(By.id("7"));
      six.click();

      String x = driver.findElement(By.className("info")).getText();

      Thread.sleep(2000);
      assertEquals("O just won the game.", x);
    }
}
