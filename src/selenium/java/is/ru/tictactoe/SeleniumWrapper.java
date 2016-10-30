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
        //System.setProperty("webdriver.gecko.driver", "/home/ubuntu/Downloads/geckodriver");
        driver = new FirefoxDriver();
        //baseUrl = "https://morning-anchorage-85972.herokuapp.com/";
        baseUrl = "http://localhost:5000/";
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

    }

    @AfterClass
    public static void after() {
        driver.close();
    }
}
