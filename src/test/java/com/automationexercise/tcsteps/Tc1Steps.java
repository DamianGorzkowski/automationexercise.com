package com.automationexercise.tcsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc1Steps {
    private WebDriver driver;

    @Given("Launch browser")
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @And("Navigate to url {string}")
    public void navigateToUrl(String url) {
        driver.get(url);
    }
}
