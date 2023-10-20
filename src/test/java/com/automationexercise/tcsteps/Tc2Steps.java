package com.automationexercise.tcsteps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LogInPage;
import com.automationexercise.pages.UserData;
import com.automationexercise.pages.WebDriverManager;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import static org.junit.Assert.assertEquals;

public class Tc2Steps {

    private WebDriver driver = WebDriverManager.getDriver();
    private LogInPage logInPage = new LogInPage(driver);
    private UserData userData = new UserData(driver);
    private HomePage homePage = new HomePage(driver);
    private Actions actions = new Actions(driver);

    @And("Verify 'Login to your account' is visible")
    public void verifyLogin() {
        WebElement loginText = driver.findElement(By.cssSelector(".login-form > h2"));
        String Text = loginText.getText();
        assertEquals("Login to your account", Text);
    }

    @And("Enter correct {string} address and {string}")
    public void enterCorrectEmailAddressAndPassword(String email, String password) {
        logInPage.existingUserEmailAndPasswordInput(userData.setEmail(email).setPassword(password));
    }

    @And("Click 'login' button")
    public void clickLoginButton() {
        logInPage.loginButtonSignInPageClick();
    }

    @When("Click 'Delete Account' button")
    public void clickDeleteAccountButton() {
        homePage.deleteAccountButtonClick();
        actions.moveByOffset(951, 66).click().perform();
    }

    @Then("Verify that 'ACCOUNT DELETED!' is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        WebElement element = driver.findElement(By.cssSelector("b"));
        String Text = element.getText();
        assertEquals("ACCOUNT DELETED!", Text);
    }
}
