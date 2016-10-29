package is.ru.tictactoe;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWrapper {
    static WebDriver driver;
    static String baseUrl;
    static String port;

    /**
    * This method sets up firefox driver before testing.
    */
    @BeforeClass
    public static void before() {
        driver = new ChromeDriver();
        baseUrl = "http://localhost:5000";
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void after() {
        driver.close();
    }
}