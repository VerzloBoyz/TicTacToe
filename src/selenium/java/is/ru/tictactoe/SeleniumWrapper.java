package is.ru.tictactoe;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumWrapper {
    static WebDriver driver;
    static String baseUrl;
    static String port;

    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.gecko.driver", "/home/travis/build/VerzloBoyz/TicTacToe/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://tictactoe-staging-app.herokuapp.com/";
        //baseUrl = "http://localhost:5000/";
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        driver.get(baseUrl);
    }

    @AfterClass
    public static void after() {
        driver.close();
    }

    void waitForLoad(WebDriver driver) {

      new WebDriverWait(driver, 20).until((ExpectedCondition<Boolean>) wd ->
            ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }
}
