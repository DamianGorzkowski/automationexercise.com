package com.automationexercise.tcsteps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class Tc1Steps {
    private WebDriver driver;
    private HomePage homePage;


    @Given("Launch browser")
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

    }

    @And("Navigate to url {string}")
    public void navigateToUrl(String url) {
        driver.get(url);
    }

    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        assertTrue(homePage.isVisible());
    }

    @And("Click on Signup | Login button")
    public void clickOnSignupLoginButton() {
        homePage.clickSignUpButton();
    }
}
