package com.automationexercise.tcsteps;

import com.automationexercise.pages.LogInPage;
import com.automationexercise.pages.UserData;
import com.automationexercise.pages.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

public class Tc3Steps {
    private WebDriver driver = WebDriverManager.getDriver();
    private LogInPage logInPage = new LogInPage(driver);
    private UserData userData = new UserData(driver);

    @When("Enter incorrect {string} address and {string}")
    public void enterCorrectEmailAddressAndPassword(String email, String password) {
        logInPage.existingUserEmailAndPasswordInput(userData.setEmail(email).setPassword(password));
    }

    @Then("Verify error 'Your email or password is incorrect!' is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        WebElement element = driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > p"));
        String text = element.getText();
        assertEquals("Your email or password is incorrect!", text);
    }
}
