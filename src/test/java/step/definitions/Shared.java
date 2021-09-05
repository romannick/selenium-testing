package step.definitions;

import common.BaseAbstractTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Shared extends BaseAbstractTest {
    @Then("I should see the {string} page")
    public void IShouldSeeTheArgPage(String pageTitle) {
        Assert.assertEquals(driver.getTitle(), pageTitle);
    }

    @Then("I should see the {string} message")
    public void IShouldSeeTheArgMessage(String message) {
        findElementByText(message);
    }

    @And("I click on the {string} button")
    public void IClickOnTheArgButtonInTheLoginForm(String buttonText) {
        findElementByText(buttonText).click();
    }

    @And("I type {string} in the {string} input")
    public void IClickOnTheRegisterButton(String username, String inputId) {
        driver.findElement(By.id(inputId)).sendKeys(username);
    }

    @And("I click the {string} checkbox")
    public void IClickOnTheRegisterButton(String inputId) {
        WebElement element = driver.findElement(By.id(inputId));

        actions.click(element).perform();
    }
}
