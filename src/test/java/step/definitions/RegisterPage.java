package step.definitions;

import common.BaseAbstractTest;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage extends BaseAbstractTest {
    @And("I click on the not a robot iframe checkbox")
    public void IClickOnTheNotARobotIframeCheckbox() {
        driver.findElement(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-border")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10).getSeconds())
                .until(ExpectedConditions.elementToBeSelected(driver.findElement(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-checkmark"))));
    }

    @And("I click on the register button inside the registration form")
    public void IClickOnTheRegisterButton() {
        driver.findElement(By.cssSelector("#form-validate > button")).click();
    }
}
