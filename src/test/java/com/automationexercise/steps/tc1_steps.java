package com.automationexercise.steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1_steps {

    private WebDriver driver;

@Given("^([^ ]+) opened in Google Chrome")
    public void openInGoogleChrome (String url) {
    driver = new ChromeDriver();
    driver.get(url);
    }

}