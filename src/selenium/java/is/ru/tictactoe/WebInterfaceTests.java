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
/*
    @Test
    public void testFirstPlayer() {

      WebElement newGame = driver.findElement(By.className("new"));
      newGame.click();

      String turn = driver.findElement(By.className("turn")).getText();
      assertEquals("Player 1 make your move.", turn);
    }

    @Test
    public void testXWinner() throws InterruptedException{

      driver.navigate().refresh();

      WebElement newGame = driver.findElement(By.className("new"));
      newGame.click();

      WebElement choice = driver.findElement(By.id("0"));
      choice.click();

      choice = driver.findElement(By.id("1"));
      choice.click();

      choice = driver.findElement(By.id("3"));
      choice.click();


      choice = driver.findElement(By.id("5"));
      choice.click();

      choice = driver.findElement(By.id("6"));
      choice.click();

      String x = driver.findElement(By.className("info")).getText();
      assertEquals("X just won the game.", x);
      Thread.sleep(1000);
    }


    @Test
    public void testNewGame() throws InterruptedException{
      driver.navigate().refresh();

      WebElement newGame = driver.findElement(By.className("new"));
      newGame.click();

      String x = driver.findElement(By.className("info")).getText();
      assertEquals("", x);
      Thread.sleep(1000);
    }

    @Test
    public void testOWinner() throws InterruptedException{

      driver.navigate().refresh();

      WebElement newGame = driver.findElement(By.className("new"));
      newGame.click();

      WebElement choice = driver.findElement(By.id("0"));
      choice.click();

      choice = driver.findElement(By.id("1"));
      choice.click();

      choice = driver.findElement(By.id("5"));
      choice.click();

      choice = driver.findElement(By.id("4"));
      choice.click();

      choice = driver.findElement(By.id("8"));
      choice.click();

      choice = driver.findElement(By.id("7"));
      choice.click();

      String x = driver.findElement(By.className("info")).getText();
      assertEquals("O just won the game.", x);
      Thread.sleep(1000);
    }


    @Test
    public void testDraw() throws InterruptedException{

      driver.navigate().refresh();

      WebElement newGame = driver.findElement(By.className("new"));
      newGame.click();

      WebElement choice = driver.findElement(By.id("0"));
      choice.click();

      choice = driver.findElement(By.id("1"));
      choice.click();

      choice = driver.findElement(By.id("2"));
      choice.click();

      choice = driver.findElement(By.id("3"));
      choice.click();

      choice = driver.findElement(By.id("4"));
      choice.click();

      choice = driver.findElement(By.id("6"));
      choice.click();

      choice = driver.findElement(By.id("5"));
      choice.click();

      choice = driver.findElement(By.id("8"));
      choice.click();

      choice = driver.findElement(By.id("7"));
      choice.click();

      String x = driver.findElement(By.className("info")).getText();
      assertEquals("Draw!", x);
      Thread.sleep(1000);
    }

*/
}
