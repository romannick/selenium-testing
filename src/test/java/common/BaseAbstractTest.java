package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class BaseAbstractTest {
    protected final WebDriver driver;
    protected final Actions actions;

    public BaseAbstractTest() {
        this.driver = DriverHook.getDriver();
        this.actions = new Actions(this.driver);
    }

    protected WebElement findElementByText(String text) {
        return driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
    }
}
