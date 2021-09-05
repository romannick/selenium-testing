package common;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverHook {
    private static final String URL = "https://www.ozone.bg/";
    private static WebDriver driver;

    @Before
    public static void initialiseDriverAndProperties() {
        System.setProperty("webdriver.chrome.driver", "/Users/nikolayr/Programs/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @After
    public static void closeBrowser() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
