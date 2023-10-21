package com.automationexercise.tcsteps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.assertEquals;

public class Tc4Steps {
    private WebDriver driver = WebDriverManager.getDriver();

    private Header header = new Header(driver);

    @When("Click 'Logout' button")
    public void logoutButtonCLicked() {
        header.logoutButtonClicked();
    }

    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://automationexercise.com/login", currentUrl);
    }
}
