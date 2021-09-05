package step.definitions;

import common.BaseAbstractTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class HomePage extends BaseAbstractTest {

    @When("I click on the person icon")
    public void IClickOnThePersonIcon() {
        driver.findElement(By.cssSelector("body > header > div.wide-area.header-logo-cart > div > div.header-customer-content > a.icon-link.user-icon-link")).click();
    }

    @And("I click on the register button")
    public void IClickOnTheRegisterButton() {
        driver.findElement(By.cssSelector("#main > div > div.row.main-content > div > div.col-xs-6.new-users > a")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
}
