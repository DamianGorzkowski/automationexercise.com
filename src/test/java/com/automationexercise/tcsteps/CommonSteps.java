package com.automationexercise.tcsteps;

import com.automationexercise.pages.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class CommonSteps {
    private WebDriver driver = WebDriverManager.getDriver();

    @Given("Launch browser")
    public void launchBrowser() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @And("Navigate to url {string}")
    public void navigateToUrl(String url) {
        driver.get(url);
    }

}
