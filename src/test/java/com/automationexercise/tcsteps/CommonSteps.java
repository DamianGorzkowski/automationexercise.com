package com.automationexercise.tcsteps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CommonSteps {
    private WebDriver driver = WebDriverManager.getDriver();
    private HomePage homePage = new HomePage(driver);

    @Given("Launch browser")
    public void launchBrowser() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @And("Navigate to url {string}")
    public void navigateToUrl(String url) {
        driver.get(url);
    }
    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        assertTrue(homePage.isVisible());
    }

    @And("Quit Driver")
    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
